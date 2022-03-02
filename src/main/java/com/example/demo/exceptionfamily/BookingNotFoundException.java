package com.example.demo.exceptionfamily;

import com.example.demo.entity.response.BookingNotFoundResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingNotFoundException extends Exception {
    private BookingNotFoundResponse bookingNotFoundResponse;

   public BookingNotFoundException(String message){
   bookingNotFoundResponse=   new BookingNotFoundResponse();
   bookingNotFoundResponse.setError(message);
   }



}
