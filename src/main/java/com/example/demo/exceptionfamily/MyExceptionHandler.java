package com.example.demo.exceptionfamily;


import java.util.ArrayList;
import java.util.List;


import com.example.demo.entity.response.BookingNotFoundResponse;
import com.example.demo.entity.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(BrandServiceException.class)
    public ResponseEntity<String> brandServiceException(BrandServiceException e) {
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> validproduct(MethodArgumentNotValidException e) {
        List<String> errors = new ArrayList<>();
        e.getBindingResult().getAllErrors().forEach(i->errors.add(i.getDefaultMessage()));

        return new ResponseEntity<>(new ErrorResponse(errors), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BrandChannelException.class)
    public ResponseEntity<List<String>> validproduct(BrandChannelException e) {

        return new ResponseEntity<>(e.getErrorMessages(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> productNotFoundException(ProductNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(BookingNotFoundException.class)
    public ResponseEntity<BookingNotFoundResponse> BookingResponseException(BookingNotFoundException e) {

        return new ResponseEntity<BookingNotFoundResponse>(e.getBookingNotFoundResponse(), HttpStatus.NOT_FOUND);
    }

}
