package com.movies.movies.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "movie")
@Data
@EqualsAndHashCode
public class Movie implements Serializable {

    @Id @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private Date releaseYear;
}
