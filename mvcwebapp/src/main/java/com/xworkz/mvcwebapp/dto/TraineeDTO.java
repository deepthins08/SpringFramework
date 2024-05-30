package com.xworkz.mvcwebapp.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

public class TraineeDTO {

    @NotNull(message = "Please enter a valid name")
    @Size(min = 3,max = 30,message = "Name should be min 3 and max is 30")
    private String name;
    @Max(9999999999L)
    @Min(1)
    @NotNull(message = "Please enter a mobile number")
    private Long phone;


    @NotEmpty(message = "Please enter Year of Pass out")
    private String yop;
    @NotNull(message = "Please select any qualification")
    @Pattern(regexp = "^(BA|BCOM|BCA|BE|BSC|MCA|MTech|MBA)$",message = "Please select Qualification")
    private String qualification;
    @NotEmpty(message = "Please select the option from checkbox")
    private String back;

    public TraineeDTO(){
        System.out.println("created TraineeDTO");
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

    public String getYop() {
        return yop;
    }

    public void setYop(String yop) {
        this.yop = yop;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "TraineeDTO{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", yop='" + yop + '\'' +
                ", qualification='" + qualification + '\'' +
                ", back='" + back + '\'' +
                '}';
    }
}
