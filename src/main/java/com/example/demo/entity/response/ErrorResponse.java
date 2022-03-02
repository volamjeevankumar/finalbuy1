package com.example.demo.entity.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@AllArgsConstructor
@Getter
public class ErrorResponse {
   private List<String> errors;



}
