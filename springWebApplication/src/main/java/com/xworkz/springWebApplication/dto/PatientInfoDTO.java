package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PatientInfoDTO {

    @NotNull(message = "Please enter a valid name")
    @Size(min = 3,max = 30,message = "name should be min 3 and max 30")
    private String name;
    @Email(message = "Please enter valid email")
    private String email;
    @NotNull(message = "Please enter a valid mobile number")
    @Min(1)
    @Max(99999999999L)
    private Long phone;
    @NotEmpty(message = "Please enter a valid address")
    @Size(min = 3,max = 300,message = "address should be min 3 and max 300")
    private String address;
    @NotNull(message = "Please enter a valid Medical History")
    @Size(min = 3,max = 30,message = "Medical History should be min 3 and max 30")
    private String history;
    @NotNull(message = "Please enter a valid Physician name")
    @Size(min = 3,max = 30,message = "Physician name should be min 3 and max 30")
    private String physician;
    @NotEmpty(message = "Please confirm your details")
    private String confirm;
    @NotEmpty(message = "Please select gender")
    private String gender;

    public PatientInfoDTO(){
        System.out.println("Created PatientInfoDTO");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PatientInfoDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", history='" + history + '\'' +
                ", physician='" + physician + '\'' +
                ", confirm='" + confirm + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
