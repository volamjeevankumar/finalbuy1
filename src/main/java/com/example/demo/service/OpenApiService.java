package com.example.demo.service;

import com.example.demo.entity.response.OpenApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

@Component
public class OpenApiService {
    @Autowired
    private RestTemplate restTemplate;
public  ResponseEntity<OpenApiResponse> openApiResponseBuilder() throws URISyntaxException {
    URI url=new URI("https://archive.org/metadata/TheAdventuresOfTomSawyer_201303");

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> httpEntity = new HttpEntity<>("some body", headers);
     ResponseEntity<OpenApiResponse> a=restTemplate.exchange(url, HttpMethod.GET, httpEntity, OpenApiResponse.class);
return a;

}




}
