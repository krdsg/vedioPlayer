package com.springapp.mvc.movie.dao;

import com.springapp.mvc.common.BaseDAO;
import com.springapp.mvc.movie.entity.Movie;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * Created by rui.kong on 15-3-3.
 */
@Repository
public class MovieDao extends BaseDAO{

    public Movie findById(int id) throws SQLException{
        return (Movie)super.queryForObject("Movie.findById", id);
    }
}
