package com.amm.agile.productManagement.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

public class Customer implements Serializable {
    @NotBlank(message = ModelConstants.NOT_BLANK_MESSAGE)
    @Size(min = ModelConstants.CUSTOMER_NAME_MIN_LENGTH, max = ModelConstants.CUSTOMER_NAME_MAX_LENGTH, message = ModelConstants.CUSTOMER_NAME_LENGTH_MESSAGE)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Valid
    private Business business;

    @Valid
    private Contact contact;
}
