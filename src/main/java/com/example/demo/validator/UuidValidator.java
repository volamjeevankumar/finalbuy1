package com.example.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UuidValidator implements ConstraintValidator<ValidUuid, UUID> {
    private final String regex = "^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$"; // the regex

    @Override
    public void initialize(ValidUuid validUuid) {
        List<List<Integer>> inputList=new ArrayList<>();
        inputList.clear();
    }

    @Override
    public boolean isValid(UUID uuid, ConstraintValidatorContext cxt) {
        return uuid.toString().matches(this.regex);
    }
}
