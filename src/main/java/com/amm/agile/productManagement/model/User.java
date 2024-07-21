package com.amm.agile.productManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable, UserDetails {
    @NotBlank(message = ModelConstants.NOT_BLANK_MESSAGE)
    @Size(min = ModelConstants.USER_NAME_MIN_LENGTH, max = ModelConstants.USER_NAME_MAX_LENGTH, message = ModelConstants.USER_NAME_LENGTH_MESSAGE)
    private String username;

    @NotBlank(message = ModelConstants.NOT_BLANK_MESSAGE)
    private String password;

    private Collection<? extends GrantedAuthority> authorities;
}
