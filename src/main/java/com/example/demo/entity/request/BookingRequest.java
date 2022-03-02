package com.example.demo.entity.request;

import com.example.demo.entity.BookingPeriod;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter

public class BookingRequest {
     @NotEmpty
    String  id;
@NotEmpty
    String  accId;
    @Valid @NotNull
    private BookingPeriod bookingPeriod;
    @NotEmpty
    private String user;

}
