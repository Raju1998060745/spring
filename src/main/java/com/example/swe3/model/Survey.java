package com.example.swe3.model;

import java.util.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "surveys", schema = "public")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name="lastname" , nullable = false)
    private String lastName;

    @Column(name = "streetaddress", nullable = false)
    private String streetAddress;

    @Column(name ="city", nullable = false)
    private String city;

    @Column(name ="state", nullable = false)
    private String state;

    @Column(name ="zip", nullable = false)
    private String zip;

    @Column(name ="phonenumber", nullable = false)
    private String phoneNumber;

    @Column(name ="email" , nullable = false)
    private String email;

    @Column(name ="likedmost", nullable = false)
    private String likedMost;

    @Column(name="interestsource", nullable = false)
    private String interestSource;

    @Column(name="recommendlikelihood", nullable = false)
    private String recommendLikelihood;

    @Column(name = "additionalcomments")
    private String additionalComments;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLikedMost() {
        return likedMost;
    }

    public void setLikedMost(String likedMost) {
        this.likedMost = likedMost;
    }

    public String getInterestSource() {
        return interestSource;
    }

    public void setInterestSource(String interestSource) {
        this.interestSource = interestSource;
    }

    public String getRecommendLikelihood() {
        return recommendLikelihood;
    }

    public void setRecommendLikelihood(String recommendLikelihood) {
        this.recommendLikelihood = recommendLikelihood;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }
}
