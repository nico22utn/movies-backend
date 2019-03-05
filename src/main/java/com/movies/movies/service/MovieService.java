package com.movies.movies.service;

import com.movies.movies.model.DTOMovie;

import java.util.List;

public interface MovieService {

    public List<DTOMovie> getMovies();
    public void addOrEditMovie(DTOMovie dtoMovie);
    public void deleteMovie(Long id);

}
