package com.amm.agile.productManagement.model;

import jakarta.validation.Valid;

import java.io.Serializable;

public class Team implements Serializable {
    @Valid
    private User productOwner;

    @Valid
    private User leader;
}
