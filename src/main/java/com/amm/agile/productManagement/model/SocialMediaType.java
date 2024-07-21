package com.amm.agile.productManagement.model;

import lombok.Getter;

@Getter
public enum SocialMediaType {
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram"),
    X("X"),
    LINKEDIN("LinkedIn"),;

    private final String value;

    SocialMediaType(String value) {
        this.value = value;
    }
}
