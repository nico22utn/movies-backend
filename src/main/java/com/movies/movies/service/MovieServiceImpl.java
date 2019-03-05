package com.movies.movies.service;

import com.movies.movies.mapper.MovieMapper;
import com.movies.movies.model.DTOMovie;
import com.movies.movies.model.Movie;
import com.movies.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public List<DTOMovie> getMovies() {

        List<Movie> movies = repository.findAll();
        return MovieMapper.mapDTOS(movies);
    }

    @Override
    public void addOrEditMovie(DTOMovie dtoMovie) {

        Movie movie = new Movie();
        if(dtoMovie.getId() != null){
            movie = repository.findById(dtoMovie.getId()).get();
        }
        movie.setReleaseYear(dtoMovie.getReleaseYear());
        movie.setName(dtoMovie.getName());
        repository.save(movie);
    }

    @Override
    public void deleteMovie(Long id) {
        Movie movie = repository.findById(id).get();
        repository.delete(movie);
    }
}
