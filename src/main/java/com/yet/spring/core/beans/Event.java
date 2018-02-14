package com.yet.spring.core.beans;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    private int id; // Auto-generated
    private String msg; // Set in setter
    private Date date; // Set in constructor
    private DateFormat df; // Set in constructor

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
