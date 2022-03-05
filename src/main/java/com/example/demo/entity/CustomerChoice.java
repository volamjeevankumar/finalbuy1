package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document
public class CustomerChoice {
private String id;
    private String accid;
    private String buyingTrack;
    private BookingPeriod startBookingPeriod;
    private BookingPeriod endBookingPeriod;
    private String createdBy;
    private String modifiedBy;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;



}
