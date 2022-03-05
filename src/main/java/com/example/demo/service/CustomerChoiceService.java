package com.example.demo.service;

import com.example.demo.entity.CustomerChoice;
import com.example.demo.entity.request.CustomerChoiceRequest;
import com.example.demo.entity.response.CustomerChoiceResponse;
import com.example.demo.repo.CustomerChoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class CustomerChoiceService {

    @Autowired
    private CustomerChoiceRepo customerChoiceRepo;


    public CustomerChoiceResponse buildCustomerChoiceResponse(CustomerChoiceRequest
                                                                      customerChoiceRequest) {
        CustomerChoiceResponse customerChoiceResponse;
        CustomerChoice customerChoiceToBeSaved = new CustomerChoice();
        LocalDateTime time = LocalDateTime.now();

        customerChoiceToBeSaved.setAccid(customerChoiceRequest.getAccid());
        customerChoiceToBeSaved.setBuyingTrack(customerChoiceRequest.getBuyingTrack());
        customerChoiceToBeSaved.setStartBookingPeriod(customerChoiceRequest.getStartBookingPeriod());
        customerChoiceToBeSaved.setEndBookingPeriod(customerChoiceRequest.getEndBookingPeriod());
        customerChoiceToBeSaved.setModifiedBy(customerChoiceRequest.getUser());
        customerChoiceToBeSaved.setModifiedAt(time);

        CustomerChoice customerChoiceFromDb = customerChoiceRepo.findCustomerChoicebyCombination(customerChoiceRequest.getAccid(),
                customerChoiceRequest.getStartBookingPeriod().getSeason(),
                customerChoiceRequest.getStartBookingPeriod().getYear());

        if (Objects.isNull(customerChoiceFromDb)) {
            customerChoiceToBeSaved.setCreatedAt(time);
            customerChoiceToBeSaved.setCreatedBy(customerChoiceRequest.getUser());
        } else {
            customerChoiceToBeSaved.setCreatedAt(customerChoiceFromDb.getCreatedAt());
            customerChoiceToBeSaved.setCreatedBy(customerChoiceFromDb.getCreatedBy());
            customerChoiceToBeSaved.setId(customerChoiceFromDb.getId());
        }

        CustomerChoice savedCustomerChoice = customerChoiceRepo.save(customerChoiceToBeSaved);
        customerChoiceResponse = getCustomerChoiceResponse(savedCustomerChoice);

        return customerChoiceResponse;
    }

    private CustomerChoiceResponse getCustomerChoiceResponse(CustomerChoice customerChoice) {
        CustomerChoiceResponse customerChoiceResponse = new CustomerChoiceResponse();
        customerChoiceResponse.setAccid(customerChoice.getAccid());
        customerChoiceResponse.setBuyingTrack(customerChoice.getBuyingTrack());
        customerChoiceResponse.setStartBookingPeriodSeason(customerChoice.getStartBookingPeriod().getSeason());
        customerChoiceResponse.setStartBookingPeriodYear(customerChoice.getStartBookingPeriod().getYear().toString());
        customerChoiceResponse.setEndBookingPeriodSeason(customerChoice.getEndBookingPeriod().getSeason());
        customerChoiceResponse.setEndBookingPeriodYear(customerChoice.getEndBookingPeriod().getYear().toString());
        customerChoiceResponse.setCreatedBy(customerChoice.getCreatedBy());
        customerChoiceResponse.setCreatedAt(customerChoice.getCreatedAt());
        customerChoiceResponse.setModifiedBy(customerChoice.getModifiedBy());
        customerChoiceResponse.setModifiedAt(customerChoice.getModifiedAt());
        customerChoiceResponse.setId(customerChoice.getId());
        return customerChoiceResponse;
    }

}




