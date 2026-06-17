package com.example.spring_mticket.service;
import com.example.spring_mticket.entity.Movie;
import com.example.spring_mticket.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(
            MovieRepository movieRepository) {

        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {

        return movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie) {

        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {

        movieRepository.deleteById(id);
    }

    public Movie getMovie(Long id) {

        return movieRepository.findById(id)
                .orElse(null);
    }

	public Object getMovieById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addMovie(com.example.spring_mticket.model.Movie movie) {
		// TODO Auto-generated method stub
		
	}
}