package com.thoughtworks.badminton.service;

import com.thoughtworks.badminton.model.ActivityRecord;
import com.thoughtworks.badminton.model.SummaryRecord;

public class IncomeAndPaymentCal {

    private static final int AMOUNT_PER_GROUND = 6;
    private static final int CHARGE_PER_PEOPLE = 30;

    public SummaryRecord calculate(ActivityRecord activityRecord) {
        int peopleAmount = activityRecord.getPeopleAmount();
        int groundAmount = peopleAmount / AMOUNT_PER_GROUND;
        int remainAmount = peopleAmount % AMOUNT_PER_GROUND;
        groundAmount = getGroundAmount(groundAmount, remainAmount);

        return new SummaryRecord(activityRecord, getIncome(peopleAmount), getPayment(groundAmount));
    }

    private int getPayment(int groundAmount) {
        return 0;
    }

    private int getIncome(int peopleAmount) {
        return peopleAmount * CHARGE_PER_PEOPLE;
    }

    public int getGroundAmount(int groundAmount, int remainAmount) {
        if (groundAmount < 1 && remainAmount < 4) {
            return 0;
        } else if (groundAmount < 1 && remainAmount >= 4) {
            return 1;
        } else if (groundAmount == 1) {
            return 2;
        } else if (groundAmount > 1 && groundAmount < 4 && remainAmount >= 4) {
            return groundAmount + 1;
        } else {
            return groundAmount;
        }
    }
}
