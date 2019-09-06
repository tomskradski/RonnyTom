package com.radar.JPA.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferralEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    protected ReferralEntity() {}

    public ReferralEntity(String firstName, String lastName){
        this. firstName = firstName;
        this.lastName = lastName;
    }


}
