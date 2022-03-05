package com.example.demo.entity.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class CustomerChoiceResponse {
private String id;
    private String accid;
    private String buyingTrack;
    private String startBookingPeriodSeason;
    private String startBookingPeriodYear;
    private String endBookingPeriodSeason;
    private String endBookingPeriodYear;
    private String createdBy;
    private String modifiedBy;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
