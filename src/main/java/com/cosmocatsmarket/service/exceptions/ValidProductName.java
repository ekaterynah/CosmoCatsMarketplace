package com.cosmocatsmarket.service.exceptions;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ProductNameValidator.class) // Link to the validator class
public @interface ValidProductName {

    // Default error message
    String message() default "Price must be positive";

    // Groups for validation
    Class<?>[] groups() default {};

    // Additional data for validation
    Class<? extends Payload>[] payload() default {};
}

