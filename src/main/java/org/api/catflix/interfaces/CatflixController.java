package org.api.catflix.interfaces;

import java.util.List;

import org.api.catflix.domain.Movie;
import org.api.catflix.domain.MovieFilter;
import org.api.catflix.services.CatflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CatflixController {

	@Autowired
	CatflixService catflixService;
	
	public CatflixController(CatflixService catflixService) {
		this.catflixService=catflixService;
	}
	
	@RequestMapping(value="/getMovies", method=RequestMethod.POST)
	public List<Movie> getAllMovies(@RequestBody MovieFilter movieFilter) {
		return catflixService.getAll(movieFilter);
	}
	
	@RequestMapping(value="/saveMovie", method=RequestMethod.POST)
	public boolean saveMovie(@RequestBody Movie movie) {
		return catflixService.saveMovie(movie);
	}
}
