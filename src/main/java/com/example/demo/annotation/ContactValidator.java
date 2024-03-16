package com.example.demo.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactValidator implements ConstraintValidator<ContactValidation, String> {
	public boolean isValid(String colorName, ConstraintValidatorContext cxt) {
		return colorName.startsWith("99");
	}
}
