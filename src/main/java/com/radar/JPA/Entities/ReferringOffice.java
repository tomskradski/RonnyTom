package com.radar.JPA.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReferringOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String officeName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    protected ReferringOffice() {}

    public ReferringOffice(String officeName, String address1, String address2, String city, String state, String zipcode, String officeContactName, String officeNumber, String officeContactNumber, String officeEmail) {
        this.officeName = officeName;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.officeContactName = officeContactName;
        this.officeNumber = officeNumber;
        this.officeContactNumber = officeContactNumber;
        this.officeEmail = officeEmail;
    }


    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
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

    public String getOfficeContactName() {
        return officeContactName;
    }

    public void setOfficeContactName(String officeContactName) {
        this.officeContactName = officeContactName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeContactNumber() {
        return officeContactNumber;
    }

    public void setOfficeContactNumber(String officeContactNumber) {
        this.officeContactNumber = officeContactNumber;
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }

    private String officeContactName;
    private String officeNumber;
    private String officeContactNumber;
    private String officeEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

