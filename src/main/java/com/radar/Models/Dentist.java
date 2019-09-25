package com.radar.Models;

import com.radar.JPA.Entities.ReferredPracticeEntity;

public class Dentist {

    private Long id;private ReferredPracticeEntity referredPracticeEntity;
    private String title;
    private String firstname;
    private String lastname;
    private String suffux;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReferredPracticeEntity getReferredPracticeEntity() {
        return referredPracticeEntity;
    }

    public void setReferredPracticeEntity(ReferredPracticeEntity referredPracticeEntity) {
        this.referredPracticeEntity = referredPracticeEntity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSuffux() {
        return suffux;
    }

    public void setSuffux(String suffux) {
        this.suffux = suffux;
    }
}
