package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
@Entity
@Table(name = "travel")
@NamedQuery(name = "findByIdTravel",query = "select t from TravelBookingDTO t where id=:id")
@NamedQuery(name = "findByTransport",query = "select t from TravelBookingDTO t where group=:group")
public class TravelBookingDTO {
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
    @NotEmpty(message = "Please enter a valid address")
    @Size(min = 3,max = 300,message = "address should be min 3 and max 300")
    private String address;
    @NotEmpty(message = "Please select gender")
    private String gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please select the date")
    private LocalDate date;
    @NotNull(message = "Please enter a valid destination")
    @Size(min = 3,max = 30,message = "destination should be min 3 and max 30")
    private String destination;
    @NotNull(message = "Please enter a valid departure")
    @Size(min = 3,max = 30,message = "departure should be min 3 and max 30")
    private String departure;
    @NotEmpty(message = "Please confirm travel details")
    private String confirm;
    @NotEmpty(message = "Please select transportation type")
    @Pattern(regexp = "^(Bike|Bus|Car|Flight)$",message = "Please select Transportation Type")
    @Column(name = "transport_type")
    private String group;

    public TravelBookingDTO(){
        System.out.println("Created TravelBookingDTO");
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TravelBookingDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", confirm='" + confirm + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
