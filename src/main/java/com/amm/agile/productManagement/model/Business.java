package com.amm.agile.productManagement.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class Business implements Serializable {
    @Size(min = ModelConstants.BUSINESS_NAME_MIN_LENGTH, max = ModelConstants.BUSINESS_NAME_MAX_LENGTH, message = ModelConstants.BUSINESS_NAME_LENGTH_MESSAGE)
    private String name;

    @Valid
    private Contact contact;
}
