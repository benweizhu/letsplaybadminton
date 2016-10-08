package com.thoughtworks.badminton.service;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BadmintonCalTest {
    @Test
    public void shouldReturnExampleOutput() {
        String input = "2016-06-02 20:00~22:00 7\n" +
                "2016-06-03 09:00~12:00 14\n" +
                "2016-06-04 14:00~17:00 22\n" +
                "2016-06-05 19:00~22:00 3\n" +
                "2016-06-06 12:00~15:00 15\n" +
                "2016-06-07 15:00~17:00 12\n" +
                "2016-06-08 10:00~13:00 19\n" +
                "2016-06-09 16:00~18:00 16\n" +
                "2016-06-10 20:00~22:00 5\n" +
                "2016-06-11 13:00~15:00 11\n";
        BadmintonCal badmintonCal = new BadmintonCal();

        String output = badmintonCal.generateSummary(input);

        assertThat(output, is("[Summary]\n\n" +
                "2016-06-02 20:00~22:00 +210 -240 -30\n" +
                "2016-06-03 09:00~12:00 +420 -180 +240\n" +
                "2016-06-04 14:00~17:00 +660 -600 +60\n" +
                "2016-06-05 19:00~22:00 +0 -0 0\n" +
                "2016-06-06 12:00~15:00 +450 -300 +150\n" +
                "2016-06-07 15:00~17:00 +360 -200 +160\n" +
                "2016-06-08 10:00~13:00 +570 -330 +240\n" +
                "2016-06-09 16:00~18:00 +480 -300 +180\n" +
                "2016-06-10 20:00~22:00 +150 -120 +30\n" +
                "2016-06-11 13:00~15:00 +330 -200 +130\n" +
                "Total Income: 3630\n" +
                "Total Payment: 2470\n" +
                "Profit: 1160"));
    }
}