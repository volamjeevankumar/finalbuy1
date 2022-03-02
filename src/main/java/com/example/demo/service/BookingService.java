package com.example.demo.service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.request.BookingRequest;
import com.example.demo.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    public void mappingRequestToBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking();
        Optional<Booking> bookingOfId =bookingRepo.findById(bookingRequest.getId());

        booking.setId(bookingRequest.getId());
        booking.setAccId(bookingRequest.getAccId());
        booking.setBookingPeriod(bookingRequest.getBookingPeriod());
        booking.setModifiedBy(bookingRequest.getUser());
        booking.setModifiedAt(LocalDateTime.now());
            if(bookingOfId.isPresent()){
            booking.setCreatedBy(bookingOfId.get().getCreatedBy());
            booking.setCreatedAt(bookingOfId.get().getCreatedAt());
            }
        else{
            booking.setCreatedBy(bookingRequest.getUser());
            booking.setCreatedAt(LocalDateTime.now());}
        bookingRepo.save(booking);


    }


}