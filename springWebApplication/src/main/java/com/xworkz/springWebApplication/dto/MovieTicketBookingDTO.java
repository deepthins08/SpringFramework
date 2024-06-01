package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class MovieTicketBookingDTO {

    @NotEmpty(message = "please select the movie name")
//    @Pattern(regexp = "^(Avengers|Black Panther|Inception|The Matrix|" +
//            "The Lord of the Rings: The Fellowship of the Ring|The Shawshank Redemption)[+-]$",
//            message = "Please select Movie Name From the list")
    private String group;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please select the date")
    private LocalDate date;
    @DateTimeFormat(pattern = "HH:mm")
    @NotNull(message = "Please select the Time")
    private LocalTime time;
    @NotNull(message = "please enter the no of movie tickets")
    @Min(1)
    @Max(10)
    private Long tickets;
    @NotEmpty(message = "Please select payment option")
    private String confirm;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Long getTickets() {
        return tickets;
    }

    public void setTickets(Long tickets) {
        this.tickets = tickets;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    @Override
    public String toString() {
        return "MovieTicketBookingDTO{" +
                "group='" + group + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", tickets='" + tickets + '\'' +
                ", confirm='" + confirm + '\'' +
                '}';
    }
}
