package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name="feedback")
@NamedQuery(name="findByIdFeedback",query = "select t from CustomerFeedbackDTO t where id=:id")
@NamedQuery(name="findByNameFeedback",query = "select t from CustomerFeedbackDTO t where t.name like:name")
public class CustomerFeedbackDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Please enter a valid name")
    @Size(min = 3,max = 30,message = "name should be min 3 and max 30")
    private String name;
    @NotNull(message = "Please enter a valid mobile number")
    @Min(1)
    @Max(99999999999L)
    private Long phone;
    @Email(message = "Please enter valid email")
    private String email;
    @NotEmpty(message = "Please enter a valid feedback")
    @Size(min = 3,max = 300,message = "Feedback should be min 3 and max 300")
    private String feedBack;

    private String satisfaction;

    public CustomerFeedbackDTO(){
        System.out.println("created CustomerFeedbackDTO");
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
    public int getId() {
        return id;
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

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }

    @Override
    public String toString() {
        return "CustomerFeedbackDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", feedback='" + feedBack + '\'' +
                ", satisfaction='" + satisfaction + '\'' +
                '}';
    }
}
