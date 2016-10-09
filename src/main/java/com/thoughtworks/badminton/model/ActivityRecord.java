package com.thoughtworks.badminton.model;

import java.util.Date;

public class ActivityRecord {

    private Date startDate;
    private Date endDate;
    private int peopleAmount;

    public ActivityRecord(Date startDate, Date endDate, int peopleAmount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.peopleAmount = peopleAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }
}
