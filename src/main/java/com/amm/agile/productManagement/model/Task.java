package com.amm.agile.productManagement.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class Task extends BaseInformation implements Serializable {
    @NotNull(message = ModelConstants.NOT_NULL_MESSAGE)
    @Valid
    private User assignedTo;
}
