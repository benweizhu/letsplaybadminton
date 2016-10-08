package com.thoughtworks.badminton.parser;

import com.thoughtworks.badminton.exception.FormatException;
import com.thoughtworks.badminton.model.ActivityRecord;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityRecordParser {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private static final String SPACE_SYMBOL = " ";
    public static final String WAVE_SYMBOL = "~";

    public ActivityRecord parse(String input) throws FormatException {
        String[] fields = input.split(SPACE_SYMBOL);
        String date = fields[0];
        String[] startAndEndHour = fields[1].split(WAVE_SYMBOL);
        int amount = Integer.valueOf(fields[2]);
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse(date + SPACE_SYMBOL + startAndEndHour[0]);
            endDate = dateFormat.parse(date + SPACE_SYMBOL + startAndEndHour[1]);
        } catch (ParseException e) {
            throw new FormatException("Date format exception");
        }
        return new ActivityRecord(startDate, endDate, amount);
    }
}
