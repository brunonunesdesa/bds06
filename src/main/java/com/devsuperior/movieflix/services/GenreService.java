package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;

@Service
public class GenreService {

	@Autowired
	GenreRepository repository;
	
	public Page<GenreDTO> findAll(Pageable pageable){
		Page<Genre> page = repository.findAll(pageable);
		return page.map(x -> new GenreDTO(x));
	}
}
