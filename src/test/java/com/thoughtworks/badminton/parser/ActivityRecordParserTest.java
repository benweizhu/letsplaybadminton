package com.thoughtworks.badminton.parser;

import com.thoughtworks.badminton.exception.FormatException;
import com.thoughtworks.badminton.model.ActivityRecord;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ActivityRecordParserTest {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Test
    public void shouldParseActivityRecordSuccessfully() throws FormatException, ParseException {
        ActivityRecordParser activityRecordParser = new ActivityRecordParser();
        ActivityRecord activityRecord = activityRecordParser.parse("2016-06-02 20:00~22:00 7");
        assertThat(activityRecord.getPeopleAmount(), is(7));
        assertThat(activityRecord.getStartDate(), is(dateFormat.parse("2016-06-02 20:00")));
        assertThat(activityRecord.getEndDate(), is(dateFormat.parse("2016-06-02 22:00")));
    }

    @Test(expected = FormatException.class)
    public void shouldThrowFormatException() throws FormatException, ParseException {
        ActivityRecordParser activityRecordParser = new ActivityRecordParser();
        activityRecordParser.parse("2016-06-02 20:aa~22:00 7");
    }
}