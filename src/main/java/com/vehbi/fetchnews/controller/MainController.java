package com.vehbi.fetchnews.controller;

import com.vehbi.fetchnews.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@Autowired
	RestTemplate restTemplate;

	@Value("${project.apikey}")
	private String API_KEY;

	private final static String BASE_URL = "https://gnews.io/api/v4";
	private final static String SEARCH = "/search?q=";
	private final static String TOKEN = "&token=";
	private final static String NUMBERS = "&max=";

	private static final Logger log = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/news/{searchTerm}/{numberOfNewsArticles}")
	public void getNumberOfNewsArticles(@PathVariable("searchTerm") String searchTerm,
										@PathVariable("numberOfNewsArticles") Integer numberOfNewsArticles) {

		String finalUrl = BASE_URL + SEARCH + searchTerm + TOKEN + API_KEY + NUMBERS + numberOfNewsArticles;

		try {
			Response response = restTemplate.getForObject(finalUrl, Response.class);
			//log.info(response.toString());
			for (int i = 0; i < numberOfNewsArticles; i++) {
				System.out.println(response.getArticles().get(i).toString());
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

	}

}
