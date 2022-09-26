package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository repository;
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	AuthService authService;
	
	public ReviewDTO save(ReviewDTO dto) {
		Review entity = new Review();
		CopyDTOToEntity(dto, entity);
		entity = repository.save(entity);
		return new ReviewDTO(entity);
	}
	
	private void CopyDTOToEntity(ReviewDTO dto, Review entity) {
		entity.setText(dto.getText());
		Movie movie = movieRepository.getOne(dto.getMovieId());
		entity.setMovie(movie);
		entity.setUser(authService.authenticated());
	}

}
