package com.vehbi.fetchnews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {

	private String name;
	private String url;

	public Source() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Source{" +
				"name='" + name + '\'' +
				", url='" + url + '\'' +
				'}';
	}

}
