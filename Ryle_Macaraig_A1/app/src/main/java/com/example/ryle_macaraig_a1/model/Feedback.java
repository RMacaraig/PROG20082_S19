package com.example.ryle_macaraig_a1.model;

/**
 * Created by 991435278: Ryle Cheyene Macaraig
 * on 2019-06-11.
 */

//model
public class Feedback {

    String recommendation, hobbies, frequency, name, email, phoneNumber;
    Integer creditScore;

    //constructor
    public Feedback(String recommendation, String hobbies, String frequency,
                    String name, String email, String phoneNumber, Integer creditScore) {
        this.recommendation = recommendation;
        this.hobbies = hobbies;
        this.frequency = frequency;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.creditScore = creditScore;
    }

    //get and set methods
    public String getRecommendation() {
        return recommendation;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    //to string method
    @Override
    public String toString() {
        return "Feedback{" +
                "recommendation='" + recommendation + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", frequency='" + frequency + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creditScore=" + creditScore +
                '}';
    }
}
