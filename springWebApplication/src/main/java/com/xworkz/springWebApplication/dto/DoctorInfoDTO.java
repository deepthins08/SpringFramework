package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;
@Entity
@Table(name="doctor")
@NamedQuery(name = "findByHospital",query = "select t from DoctorInfoDTO t where hospital=:hospital")
@NamedQuery(name = "findByIdHospital",query = "select t from DoctorInfoDTO t where id=:id")
public class DoctorInfoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Please enter a name")
    @Size(min = 3,max = 30,message = "Name should be min3 and max 30")
    private String name;
    @NotNull(message = "Please enter phone")
    @Min(1)
    @Max(9999999999L)
    private Long phone;
    @Email(message = "Please enter valid email")
    private String email;
    @NotEmpty(message = "Please select gender")
    private String gender;
    @NotEmpty(message = "Please select Experience")
    @Pattern(regexp = "^(0-2|2-4|4-6|6-8|8-10|10-15|15-20)$", message = "Please select Experience")
    @Column(name = "experience")
    private String group;
    @NotNull(message = "Please enter a Hospital name")
    @Size(min = 3,max = 30,message = "Hospital name should be min3 and max 30")
    private String hospital;
    @NotNull(message = "Please enter your specialization")
    @Size(min = 3,max = 30,message = "specialization should be min3 and max 30")
    private String specialization;

    public DoctorInfoDTO(){
        System.out.println("Created DoctorInfoDTO");
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "DoctorInfoDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", group='" + group + '\'' +
                ", hospital='" + hospital + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
