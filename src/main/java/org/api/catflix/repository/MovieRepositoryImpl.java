package org.api.catflix.repository;

import java.util.List;

import org.api.catflix.data.MovieDocument;
import org.api.catflix.domain.MovieFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class MovieRepositoryImpl implements MovieRepositoryCustom {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<MovieDocument> getAll(MovieFilter query) {
		Pageable pgReq = new PageRequest(query.getPage(), query.getPageCount());
		
		Query q = new Query();
		Criteria c = new Criteria();
		
//		if (!query.getCathegory().isEmpty())
//			c.andOperator(Criteria.where("cathegory").is(query.getCathegory()));
//			
//		if (!query.getGenre().isEmpty())
//			c.andOperator(Criteria.where("genre").is(query.getGenre()));
		
		if (!query.getKeyword().isEmpty())
			c.orOperator(
					Criteria.where("title").regex(query.getKeyword()),
					Criteria.where("description").regex(query.getKeyword())
					);
		
		q.addCriteria(c);
		q.with(pgReq);
		List<MovieDocument> movies = mongoTemplate.find(q, MovieDocument.class);
		return movies;
	}

}
