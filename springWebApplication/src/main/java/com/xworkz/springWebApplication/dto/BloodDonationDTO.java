package com.xworkz.springWebApplication.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BloodDonationDTO {

    private String name;
    private Long phone;
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String gender;
    private String address;
    private String confirm;
    private String group;
    private String lastDonated;

    public BloodDonationDTO(){
        System.out.println("Created BloodDonationDTO");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLastDonated() {
        return lastDonated;
    }

    public void setLastDonated(String lastDonated) {
        this.lastDonated = lastDonated;
    }

    @Override
    public String toString() {
        return "BloodDonationDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", confirm='" + confirm + '\'' +
                ", group='" + group + '\'' +
                ", lastDonated='" + lastDonated + '\'' +
                '}';
    }
}
