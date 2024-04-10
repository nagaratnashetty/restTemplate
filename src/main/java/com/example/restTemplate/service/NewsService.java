package com.example.restTemplate.service;

import com.example.restTemplate.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    RestTemplate restTemplate;

    String baseUrl = "https://newsapi.org/v2/top-headlines?country=";
    public Object getNews(String countryCode,
                          String apiKey) {
        String url = prepareUrl(countryCode, apiKey);
        NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
        return response;
    }

    private String prepareUrl(String countryCode, String apiKey) {
        return baseUrl + countryCode + '&' + "apiKey=" + apiKey;
    }
}