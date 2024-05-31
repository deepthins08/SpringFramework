package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class CustomerDTO {

    @NotNull(message = "Please provide valid name")
    @Size(min=3,max = 30,message = "name should be min 3 and max 30")
    private String name;
    @NotNull(message = "Please provide valid number")
    @Min(1)
    @Max(9999999999L)
    private Long phone;
    @Email(message = "please provide valid email")
    private String email;
    @NotEmpty(message = "Please choose a gender")
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date date;
    @NotEmpty(message = "Please Check the confirm box")
    private String confirm;

    @NotNull(message = "Please provide valid name")
    @Size(min=3,max = 300,message = "name should be min 3 and max 30")
    private String address;

    public CustomerDTO(){
        System.out.println("Created CustomerDTO");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", confirm='" + confirm + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
