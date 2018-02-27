package org.api.catflix.repository;

import org.api.catflix.data.MovieDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<MovieDocument, String>, MovieRepositoryCustom {

}
