package com.xworkz.mvcwebapp.dto;

import org.springframework.stereotype.Component;


public class OrganDonationDTO {

   private String name;
   private String phone;
   private String group;
   private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "OrganDonationDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", group='" + group + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
