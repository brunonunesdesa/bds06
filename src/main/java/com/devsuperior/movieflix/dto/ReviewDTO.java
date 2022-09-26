package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@NotBlank
	private String text;
	private Long movieId;
	private UserDTO user;
	
	public ReviewDTO() {
	}

	public ReviewDTO(Long id, String text, Long movieId, UserDTO user) {
		this.id = id;
		this.text = text;
		this.movieId = movieId;
		this.user = user;
	}

	public ReviewDTO(Review entity) {
		this.text = entity.getText();
		this.movieId = entity.getMovie().getId();
		this.id = entity.getId();
		this.user = new UserDTO(entity.getUser());
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
}
