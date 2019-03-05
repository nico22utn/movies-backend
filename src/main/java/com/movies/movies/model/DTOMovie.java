package com.movies.movies.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode
public class DTOMovie {

    private Long id;
    private String name;
    private Date releaseYear;
}
