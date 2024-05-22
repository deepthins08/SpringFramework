package com.xworkz.springwebapp.dto;

public class MatrimonyDTO {

    private String name;
    private int age;
    private String gender;
    private String status;
    private String religion;
    private String qualification;
    private String looking;


    public MatrimonyDTO(){
        System.out.println("Created MatrimonyDTO");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getLooking() {
        return looking;
    }

    public void setLooking(String looking) {
        this.looking = looking;
    }

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                ", religion='" + religion + '\'' +
                ", qualification='" + qualification + '\'' +
                ", looking='" + looking + '\'' +
                '}';
    }
}
