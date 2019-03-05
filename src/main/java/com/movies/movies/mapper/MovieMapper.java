package com.movies.movies.mapper;

import com.movies.movies.model.DTOMovie;
import com.movies.movies.model.Movie;

import java.util.List;
import java.util.stream.Collectors;

public interface MovieMapper {

    public static DTOMovie mapEntityToDTO(Movie movie){

        DTOMovie dtoMovie = new DTOMovie();
        dtoMovie.setId(movie.getId());
        dtoMovie.setName(movie.getName());
        dtoMovie.setReleaseYear(movie.getReleaseYear());
        return dtoMovie;
    }

    public static List<DTOMovie> mapDTOS(List<Movie> movies){
        return movies.stream().map( movie -> mapEntityToDTO(movie)).collect(Collectors.toList());
    }

    public static Movie mapDTOToEntity(DTOMovie dtoMovie){
        Movie movie = new Movie();
        movie.setId(dtoMovie.getId());
        movie.setName(dtoMovie.getName());
        movie.setReleaseYear(dtoMovie.getReleaseYear());
        return movie;
    }
}
