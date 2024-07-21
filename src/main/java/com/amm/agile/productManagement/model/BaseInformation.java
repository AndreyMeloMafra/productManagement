package com.amm.agile.productManagement.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseInformation implements Serializable {
    @NotBlank(message = ModelConstants.NOT_BLANK_MESSAGE)
    @Size(max = ModelConstants.MAX_NAME_LENGTH, message = ModelConstants.MAX_NAME_LENGTH_MESSAGE)
    private String name;

    @NotBlank(message = ModelConstants.NOT_BLANK_MESSAGE)
    @Size(max = ModelConstants.MAX_DESCRIPTION_LENGTH, message = ModelConstants.MAX_DESCRIPTION_LENGTH_MESSAGE)
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Pattern(regexp = ModelConstants.DATE_PATTERN, message = ModelConstants.DATE_PATTERN_MESSAGE)
    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Pattern(regexp = ModelConstants.DATE_PATTERN, message = ModelConstants.DATE_PATTERN_MESSAGE)
    private String endDate;

    @NotBlank(message = ModelConstants.NOT_BLANK_MESSAGE)
    @Pattern(regexp = ModelConstants.STATUS_PATTERN, message = ModelConstants.STATUS_PATTERN_MESSAGE)
    private Status status = Status.ON_HOLD;
}
