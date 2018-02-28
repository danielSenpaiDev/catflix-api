package org.api.catflix.repository;

import java.util.List;

import org.api.catflix.data.MovieDocument;
import org.api.catflix.domain.MovieFilter;

public interface MovieRepositoryCustom {
	List<MovieDocument> findAllMovies(MovieFilter query);
}
