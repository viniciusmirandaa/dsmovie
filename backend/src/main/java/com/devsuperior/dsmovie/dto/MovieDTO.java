package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {

	private Long id;
	private Integer count;
	private String image;
	private Double score;
	private String title;
	
	public MovieDTO() {
		
	}

	public MovieDTO(Long id, Integer count, String image, Double score, String title) {
		this.id = id;
		this.count = count;
		this.image = image;
		this.score = score;
		this.title = title;
	}
	
	public MovieDTO(Movie movie) {
		this.id = movie.getId();
		this.count = movie.getCount();
		this.image = movie.getImage();
		this.score = movie.getScore();
		this.title = movie.getTitle();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
