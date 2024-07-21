package com.amm.agile.productManagement.model;

public class ModelConstants {
    public static final String NOT_NULL_MESSAGE = "O campo não pode ser nulo";
    public static final String NOT_BLANK_MESSAGE = "O campo não pode ser vazio";
    public static final int MAX_NAME_LENGTH = 32;
    public static final String MAX_NAME_LENGTH_MESSAGE = "O nome do projeto deve ter no máximo 32 caracteres" ;
    public static final int MAX_DESCRIPTION_LENGTH = 256;
    public static final String MAX_DESCRIPTION_LENGTH_MESSAGE = "A descrição do projeto deve ter no máximo 256 caracteres";
    public static final String DATE_PATTERN = "^\\d{2}-\\d{2}-\\d{4}$";
    public static final String DATE_PATTERN_MESSAGE = "A data deve estar no formato dd-MM-yyyy";
    public static final String STATUS_PATTERN = "IN_PROGRESS|COMPLETED|ON_HOLD|CANCELLED";
    public static final String STATUS_PATTERN_MESSAGE = "O status deve ser IN_PROGRESS, COMPLETED, ON_HOLD ou CANCELLED";
    public static final int CUSTOMER_NAME_MIN_LENGTH = 1;
    public static final int CUSTOMER_NAME_MAX_LENGTH = 64;
    public static final String CUSTOMER_NAME_LENGTH_MESSAGE = "O nome do cliente deve ter entre 1 e 32 caracteres";
    public static final int BUSINESS_NAME_MIN_LENGTH = 1;
    public static final int BUSINESS_NAME_MAX_LENGTH = 64;
    public static final String BUSINESS_NAME_LENGTH_MESSAGE = "O nome da empresa deve ter entre 1 e 32 caracteres";
    public static final int USER_NAME_MIN_LENGTH = 1;
    public static final int USER_NAME_MAX_LENGTH = 32;
    public static final String USER_NAME_LENGTH_MESSAGE = "O nome do usuário deve ter entre 1 e 32 caracteres";
}