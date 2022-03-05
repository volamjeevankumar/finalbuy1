package com.example.demo.entity.request;

import com.example.demo.entity.BookingPeriod;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CustomerChoiceRequest {
    @NotEmpty(message = "accid cannot be empty")
    private String accid;
    @NotEmpty(message="buying Track cannot be empty")
    private String buyingTrack;
   @Valid @NotNull(message = "start booking period cannot be null")
    private BookingPeriod startBookingPeriod;
   @Valid @NotNull(message = "end booking period cannot be null")
    private BookingPeriod endBookingPeriod;
    @NotEmpty(message = "user cannot be empty")
    private String user;



}
