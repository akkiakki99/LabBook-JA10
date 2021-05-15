package com.cg.ma.service;

import java.util.List;

import com.cg.ma.exception.MovieException;
import com.cg.ma.model.MovieModel;

public interface IMovieService{

	/* Definition of addMovie method for adding the Movie */
	public MovieModel addMovie(MovieModel movie) throws MovieApplicationException;

	/* Definition of updatingMovie method for updating the Movie */
	public MovieModel updateMovie(MovieModel movie) throws MovieApplicationException;

	/* Definition of removeMovie method for removing the Movie */
	public boolean removeMovie(Long movieId) throws MovieApplicationException;

	/* Definition of viewMovie method for viewing the required Movie */
	public MovieModel viewMovieByCategory(String Category) throws MovieApplicationException;

	public MovieModel viewMovie(Long movieId) throws MovieApplicationException;

	/*
	 * Definition of viewMovies method for viewing all the Movies
	 */
	public List<MovieModel> viewAllMovies() throws MovieApplicationException;
}
