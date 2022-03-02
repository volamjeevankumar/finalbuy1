package com.example.demo.entity.response;

import com.example.demo.entity.BookingPeriod;
import com.example.demo.entity.Links;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class BookingResponse {
    private String id;
    private String accId;
    private String bookingSeason;
    private Integer bookingYear;
    private String createdBy;
    private String modifiedBy;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Links links;


}
