package com.thoughtworks.badminton.model;

public class SummaryRecord {

    private ActivityRecord activityRecord;
    private int income;
    private int payment;

    public SummaryRecord(ActivityRecord activityRecord, int income, int payment) {
        this.activityRecord = activityRecord;
        this.income = income;
        this.payment = payment;
    }

    public ActivityRecord getActivityRecord() {
        return activityRecord;
    }

    public void setActivityRecord(ActivityRecord activityRecord) {
        this.activityRecord = activityRecord;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
