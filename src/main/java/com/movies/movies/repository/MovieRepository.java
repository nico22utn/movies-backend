package com.movies.movies.repository;

import com.movies.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
