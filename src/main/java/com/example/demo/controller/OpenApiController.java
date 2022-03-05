package com.example.demo.controller;

import com.example.demo.entity.response.OpenApiResponse;
import com.example.demo.service.OpenApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
@RestController
@RequiredArgsConstructor
public class  OpenApiController {
    @Autowired
    private final OpenApiService openApiService;
    @GetMapping("openapi")
    public ResponseEntity<OpenApiResponse> openApi() throws URISyntaxException {
        ResponseEntity<OpenApiResponse> a= openApiService.openApiResponseBuilder();
    return a;
    }




}
