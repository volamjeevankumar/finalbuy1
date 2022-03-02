package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BookingPeriod {
    @NotEmpty(message = "season cannot be empty or null")
    private String season;
   @NotNull(message = "year cannot be empty or null")
    private Integer year;
}
