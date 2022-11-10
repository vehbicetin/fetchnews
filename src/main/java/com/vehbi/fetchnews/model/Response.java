package com.vehbi.fetchnews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	private Integer totalArticles;
	private List<Articles> articles;

	public Response() {
	}

	public Integer getTotalArticles() {
		return totalArticles;
	}

	public void setTotalArticles(Integer totalArticles) {
		this.totalArticles = totalArticles;
	}

	public List<Articles> getArticles() {
		return articles;
	}

	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Response{" +
				"totalArticles=" + totalArticles +
				", articles=" + articles +
				'}';
	}

}
