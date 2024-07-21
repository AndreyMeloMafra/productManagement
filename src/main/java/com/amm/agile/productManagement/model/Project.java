package com.amm.agile.productManagement.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Project extends BaseInformation implements Serializable {
    @NotNull(message = ModelConstants.NOT_NULL_MESSAGE)
    private List<Story> stories;

    @Valid
    @NotNull(message = ModelConstants.NOT_NULL_MESSAGE)
    private List<Team> teams;
}
