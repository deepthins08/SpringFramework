package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.Date;

public class BloodDonationDTO {

    @NotNull(message = "Please enter a valid name")
    @Size(min = 3,max = 30,message = "name should be min 3 and max 30")
    private String name;
    @NotNull(message = "Please enter a valid mobile number")
    @Max(99999999999L)
    @Min(1)
    private Long phone;
    @Email(message = "Please enter valid email")
    private String email;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please select the date")
    private LocalDate date;
    @NotEmpty(message = "Please select gender")
    private String gender;
    @NotEmpty(message = "Please enter a valid address")
    @Size(min = 3,max = 300,message = "address should be min 3 and max 300")
    private String address;
    @NotEmpty(message = "Please confirm your details")
    private String confirm;
    @NotEmpty(message = "Please select blood group type")
    @Pattern(regexp = "^(A|B|AB|O)[+-]$", message = "Please select any blood group")
    private String group;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastDonated;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public Date getLastDonated() {
        return lastDonated;
    }

    public void setLastDonated(Date lastDonated) {
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
