package com.example.demo.entity.request;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class ProductRequest {
    @NotEmpty(message = "name cannot be empty or null")
    private String name;
    @NotEmpty(message = "brand cannot be empty or null")
    private String brand;
    @NotEmpty
    private String market;
    @NotEmpty
    private String channel;
    @NotEmpty
    private String description;
    @NotNull
    private Integer units;
    @NotNull
    private Integer price;
}