package com.thoughtworks.badminton.model;

import java.util.Date;

public class ActivityRecord {

    private Date startDate;
    private Date endDate;
    private int amount;

    public ActivityRecord(Date startDate, Date endDate, int amount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
