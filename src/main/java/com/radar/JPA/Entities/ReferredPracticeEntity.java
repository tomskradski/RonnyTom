package com.radar.JPA.Entities;

import javax.persistence.*;

@Entity
public class ReferredPracticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String practiceName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String practiceContactName;
    private String practiceNumber;
    private String practiceContactNumber;
    private String officeEmail;

    protected ReferredPracticeEntity() {}

    public ReferredPracticeEntity(String practiceName, String address1, String address2, String city, String state, String zipcode, String practiceContactName, String practiceNumber, String practiceContactNumber, String officeEmail) {
        this.practiceName = practiceName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.practiceContactName = practiceContactName;
        this.practiceNumber = practiceNumber;
        this.practiceContactNumber = practiceContactNumber;
        this.officeEmail = officeEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPracticeName() {
        return practiceName;
    }

    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPracticeContactName() {
        return practiceContactName;
    }

    public void setPracticeContactName(String practiceContactName) {
        this.practiceContactName = practiceContactName;
    }

    public String getPracticeNumber() {
        return practiceNumber;
    }

    public void setPracticeNumber(String practiceNumber) {
        this.practiceNumber = practiceNumber;
    }

    public String getPracticeContactNumber() {
        return practiceContactNumber;
    }

    public void setPracticeContactNumber(String practiceContactNumber) {
        this.practiceContactNumber = practiceContactNumber;
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }
}
