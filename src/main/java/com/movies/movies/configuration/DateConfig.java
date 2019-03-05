package com.movies.movies.configuration;

import com.movies.movies.utils.ApplicationConstants;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

@ControllerAdvice
public class DateConfig {

    /**
     * Get date request param of any controller and parse to custom format
     *
     * @param binder
     */
    @InitBinder
    public void binder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
    }
}
