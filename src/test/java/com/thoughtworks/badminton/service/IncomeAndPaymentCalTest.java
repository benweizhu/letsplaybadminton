package com.thoughtworks.badminton.service;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IncomeAndPaymentCalTest {

    @Test
    public void shouldReturn0WhenTIs0XIs3() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(0, 3);
        assertThat(groundAmount, is(0));
    }

    @Test
    public void shouldReturn1WhenTIs0XIs4() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(0, 4);
        assertThat(groundAmount, is(1));
    }


    @Test
    public void shouldReturn2WhenTIs1XIs0() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(1, 0);
        assertThat(groundAmount, is(2));
    }

    @Test
    public void shouldReturn2WhenTIs1XIs5() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(1, 5);
        assertThat(groundAmount, is(2));
    }

    @Test
    public void shouldReturn3WhenTIs2XIs5() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(2, 4);
        assertThat(groundAmount, is(3));
    }

    @Test
    public void shouldReturn4WhenTIs2XIs5() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(3, 4);
        assertThat(groundAmount, is(4));
    }

    @Test
    public void shouldReturn4WhenTIs4XIs1() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(4, 1);
        assertThat(groundAmount, is(4));
    }

    @Test
    public void shouldReturn4WhenTIs4XIs5() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(4, 5);
        assertThat(groundAmount, is(4));
    }

    @Test
    public void shouldReturn2WhenTIs2XIs1() {
        IncomeAndPaymentCal incomeAndPaymentCal = new IncomeAndPaymentCal();
        int groundAmount = incomeAndPaymentCal.getGroundAmount(2, 1);
        assertThat(groundAmount, is(2));
    }
}