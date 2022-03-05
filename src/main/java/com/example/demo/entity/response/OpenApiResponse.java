package com.example.demo.entity.response;

import com.example.demo.entity.Files;
import com.example.demo.entity.Metadata;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter

public class OpenApiResponse {
private String created;
private String d1;
private String d2;
private String dir;
private List<Files> files;
private Metadata metadata;


}
