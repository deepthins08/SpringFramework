package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
@Entity
@Table(name = "movie")
@NamedQuery(name = "findById",query = "select t from MovieTicketBookingDTO t where id=:id")
@NamedQuery(name="findByLocation",query = "select t from MovieTicketBookingDTO t where group like:group")
public class MovieTicketBookingDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty(message = "please select the movie name")
    @Pattern(regexp = "^(Avengers|Black Panther|Inception|The Matrix|" +
            "The Lord of the Rings: The Fellowship of the Ring|The Shawshank Redemption)$",
            message = "Please select Movie Name From the list")
    @Column(name = "movie_name")
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
    @Column(name = "no_of_tickets")
    private Long tickets;
    @NotEmpty(message = "Please select payment option")
    @Column(name = "payment")
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

    public int getId() {
        return id;
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
