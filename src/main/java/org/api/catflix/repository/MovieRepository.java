package org.api.catflix.repository;

import org.api.catflix.data.MovieDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<MovieDocument, String>, MovieRepositoryCustom {

}
