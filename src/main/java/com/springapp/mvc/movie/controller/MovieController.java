package com.springapp.mvc.movie.controller;

import com.springapp.mvc.movie.entity.Movie;
import com.springapp.mvc.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rui.kong on 15-3-3.
 */
@Controller
@RequestMapping(value = "/movie/*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String getMovie(@PathVariable Integer id, HttpServletRequest request){
        Movie movie = movieService.findById(id);
        System.out.println(movie);
        return "/movieDetail";
    }
}
