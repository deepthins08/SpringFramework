package com.xworkz.springWebApplication.dto;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "event")
@NamedQuery(name = "findByEventType",query = "select t from EventBookingDTO t where group like:group")
@NamedQuery(name = "findByIdEvent",query = "select t from EventBookingDTO t where id=:id")
public class EventBookingDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Please enter a valid event name")
    @Size(min = 3,max = 30,message = " event name should be min 3 and max 30")
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please select the date")
    private LocalDate date;


    @DateTimeFormat(pattern = "HH:mm")
    @NotNull(message = "Please select the time")
    private LocalTime time;
    @NotNull(message = "Please enter a valid Location")
    @Size(min = 3,max = 30,message = " Location should be min 3 and max 30")
    private String location;
    @NotEmpty(message = "Please select the event type")
    @Pattern(regexp = "^(Birthday|Conference|Seminar|WorkShop|Webinar|Others)$",
            message = "Please select any Event Type")
    @Column(name = "event_type")
    private String group;
//    @NotEmpty(message = "Please enter a valid other event type")
    @Column(name = "other_event")
    private String otherEventType;


    public EventBookingDTO(){
        System.out.println("Created EventBooking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getId() {
        return id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
        if (!"Others".equals(group)) {
            this.otherEventType = null;
        }
    }

    public String getOtherEventType() {
        return otherEventType;
    }

    public void setOtherEventType(String otherEventType) {
        this.otherEventType = otherEventType;
    }

    @AssertTrue(message = "Please specify other event type")
    public boolean isOtherEventTypeValid() {
        return !"Others".equals(group) || (otherEventType != null && !otherEventType.trim().isEmpty());
    }
    @Override
    public String toString() {
        return "EventBookingDTO{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", group='" + group + '\'' +
                ", otherEventType='" + otherEventType + '\'' +
                '}';
    }
}
