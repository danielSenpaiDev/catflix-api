package org.api.catflix.services;

import java.lang.reflect.Type;
import java.util.List;

import org.api.catflix.data.MovieDocument;
import org.api.catflix.domain.Movie;
import org.api.catflix.domain.MovieFilter;
import org.api.catflix.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatflixService {
	@Autowired
	MovieRepository movieRepo;
	
	public List<Movie> getAll(MovieFilter filter){
		Type targetMovies = new TypeToken<List<Movie>>() {}.getType();
		ModelMapper modelMapper = new ModelMapper();
		List<MovieDocument> md = movieRepo.getAll(filter);
		List<Movie> movies = modelMapper.map(md, targetMovies);
		return movies;
	}
}
