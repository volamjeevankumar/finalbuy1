package com.example.demo.service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Links;
import com.example.demo.entity.Self;
import com.example.demo.entity.response.BookingResponse;
import com.example.demo.exceptionfamily.BookingNotFoundException;
import com.example.demo.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookingResponseService {
    @Autowired
    private BookingRepo bookingRepo;


    public BookingResponse createBookingResponse(String id) throws BookingNotFoundException {
        BookingResponse bookingResponse=new BookingResponse();
        Optional<Booking> entity=bookingRepo.findById(id);
        if(entity.isPresent()){
            //create booking response
         bookingResponse.setId(entity.get().getId());
            bookingResponse.setAccId(entity.get().getAccId());
            bookingResponse.setBookingSeason(entity.get().getBookingPeriod().getSeason());
            bookingResponse.setBookingYear(entity.get().getBookingPeriod().getYear());
            bookingResponse.setCreatedBy(entity.get().getCreatedBy());
            bookingResponse.setModifiedBy(entity.get().getModifiedBy());
            bookingResponse.setModifiedAt(entity.get().getModifiedAt());
           bookingResponse.setCreatedAt( entity.get().getCreatedAt());
           bookingResponse.setLinks(new Links());
           bookingResponse.getLinks().setSelf(new Self());
          bookingResponse.getLinks().getSelf().setHref( bookingResponse.getLinks().getSelf().getHref()+id);
          return bookingResponse;
        }
        else{
            //throw error
            throw new BookingNotFoundException("Booking not found with id "+id);
        }




    }

}
