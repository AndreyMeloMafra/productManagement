package com.amm.agile.productManagement.model;

import lombok.Getter;

@Getter
public enum Status {
    IN_PROGRESS("Em progresso"),
    COMPLETED("Concluído"),
    ON_HOLD("Em espera"),
    CANCELLED("Cancelado");

    private final String value;

    Status(String value) {
        this.value = value;
    }
}
