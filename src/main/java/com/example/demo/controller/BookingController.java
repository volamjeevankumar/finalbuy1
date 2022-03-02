package com.example.demo.controller;

import com.example.demo.entity.request.BookingRequest;
import com.example.demo.entity.response.BookingResponse;
import com.example.demo.exceptionfamily.BookingNotFoundException;
import com.example.demo.repo.BookingRepo;
import com.example.demo.service.BookingResponseService;
import com.example.demo.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class BookingController {
    @Autowired
    private final BookingService bookingService;
    @Autowired
    private final BookingRepo bookingRepo;
    @Autowired
    private BookingResponseService bookingResponseService;

    @PostMapping("booking")
    public ResponseEntity<String> createBooking(@RequestBody @Valid BookingRequest bookingRequest) {
        bookingService.mappingRequestToBooking(bookingRequest);

            return new ResponseEntity<>("booking created", HttpStatus.OK);
        }
        @GetMapping("booking/{id}")
        public BookingResponse getBookingResponse(@PathVariable String id) throws BookingNotFoundException {
            return bookingResponseService.createBookingResponse(id);


        }
}

