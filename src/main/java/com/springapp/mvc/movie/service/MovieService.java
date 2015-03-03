package com.springapp.mvc.movie.service;

import com.springapp.mvc.movie.dao.MovieDao;
import com.springapp.mvc.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rui.kong on 15-3-3.
 */
@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public Movie findById(int id){
        try{
            return movieDao.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
