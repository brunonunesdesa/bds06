package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Movie;

public class MovieDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String subTitle;
	private String synopsis;
	private Integer year;
	private String imgUrl;
	private GenreDTO genre;
	
	public MovieDTO() {
		
	}
	
	public MovieDTO(Long id, String title, String subTitle, String synopsis, Integer year, String imgUrl,
			GenreDTO genre) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.synopsis = synopsis;
		this.year = year;
		this.imgUrl = imgUrl;
		this.genre = genre;
	}
	
	public MovieDTO(Movie entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.subTitle = entity.getSubTitle();
		this.synopsis = entity.getSynopsis();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.genre = new GenreDTO(entity.getGenre());
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSubTitle() {
		return subTitle;
	}
	
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public GenreDTO getGenre() {
		return genre;
	}
	
	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}
}
