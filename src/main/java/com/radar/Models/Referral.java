package com.radar.Models;

import java.util.List;

public class Referral {

    private Long id;
    private Long referringOfficeId;
    private Long referredOfficeId;
    private Long referredPracticeId;
    private Long referredDentistId;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    private String tooth;
    private List<String> toothDetails;
    private String comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReferringOfficeId() {
        return referringOfficeId;
    }

    public void setReferringOfficeId(Long referringOfficeId) {
        this.referringOfficeId = referringOfficeId;
    }

    public Long getReferredOfficeId() {
        return referredOfficeId;
    }

    public void setReferredOfficeId(Long referredOfficeId) {
        this.referredOfficeId = referredOfficeId;
    }

    public Long getReferredPracticeId() {
        return referredPracticeId;
    }

    public void setReferredPracticeId(Long referredPracticeId) {
        this.referredPracticeId = referredPracticeId;
    }

    public Long getReferredDentistId() {
        return referredDentistId;
    }

    public void setReferredDentistId(Long referredDentistId) {
        this.referredDentistId = referredDentistId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }

    public List<String> getToothDetails() {
        return toothDetails;
    }

    public void setToothDetails(List<String> toothDetails) {
        this.toothDetails = toothDetails;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
