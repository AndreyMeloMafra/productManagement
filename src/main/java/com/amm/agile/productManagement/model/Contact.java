package com.amm.agile.productManagement.model;

import java.io.Serializable;
import java.util.List;

public class Contact implements Serializable {
    private List<Phone> phones;
    private List<Email> emails;
    private List<SocialMedia> socialMedias;
    private List<PostalAddress> postalAddresses;
}
