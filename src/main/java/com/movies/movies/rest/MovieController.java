package com.movies.movies.rest;

import com.movies.movies.model.DTOMovie;
import com.movies.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/movies")
@RestController
@CrossOrigin
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public ResponseEntity<List<DTOMovie>> getMovies(){

        List<DTOMovie> dtoMovies = movieService.getMovies();
        return ResponseEntity.ok(dtoMovies);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public ResponseEntity addMovie(DTOMovie dtoMovie){
        movieService.addOrEditMovie(dtoMovie);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/edit")
    public ResponseEntity editMovie(DTOMovie dtoMovie) throws Exception {

        Optional.ofNullable(dtoMovie.getId()).orElseThrow(() -> new Exception("Error. Id no especificado."));
        movieService.addOrEditMovie(dtoMovie);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/delete")
    public ResponseEntity deleteMovie(@RequestParam Long id){

        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }
}
