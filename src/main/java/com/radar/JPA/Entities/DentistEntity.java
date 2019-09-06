package com.radar.JPA.Entities;

import javax.persistence.*;

@Entity
public class DentistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // referred offices can have many dentists assoc with them
    @ManyToOne
    @JoinColumn(name ="FK_ReferredOfficeId")
    private ReferredOfficeEntity referredOffice;

    private String title;
    private String firstname;
    private String lastname;
    private String suffux;

    protected DentistEntity() {}

    public DentistEntity(ReferredOfficeEntity referredOffice, String title, String firstname, String lastname, String suffux) {
        this.referredOffice = referredOffice;
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.suffux = suffux;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReferredOfficeEntity getReferredOffice() {
        return referredOffice;
    }

    public void setReferredOffice(ReferredOfficeEntity referredOffice) {
        this.referredOffice = referredOffice;
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
