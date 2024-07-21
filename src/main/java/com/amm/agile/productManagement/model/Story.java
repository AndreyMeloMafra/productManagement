package com.amm.agile.productManagement.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

public class Story extends BaseInformation implements Serializable {
    @NotNull(message = ModelConstants.NOT_NULL_MESSAGE)
    private List<Task> tasks;

    @Valid
    @NotNull(message = ModelConstants.NOT_NULL_MESSAGE)
    private Team team;
}
