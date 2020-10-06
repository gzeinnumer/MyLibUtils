package com.gzeinnumer.gznutils.utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class CalculateDate {
    Calendar cal;
    private String pattern;

    @SuppressLint("SimpleDateFormat")
    public CalculateDate(String dateInString, String pattern) {
        this.pattern = pattern;
        cal = Calendar.getInstance();
        try {
            cal.setTime(Objects.requireNonNull(new SimpleDateFormat(pattern).parse(dateInString)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public CalculateDate addYear(int addYear) {
        cal.add(Calendar.YEAR, addYear);
        return this;
    }

    public CalculateDate addMonth(int addMonth) {
        cal.add(Calendar.MONTH, addMonth);
        return this;
    }

    public CalculateDate addWeek(int addWeek) {
        cal.add(Calendar.DAY_OF_MONTH, addWeek * 7);
        return this;
    }

    public CalculateDate addDay(int addDay) {
        cal.add(Calendar.DAY_OF_MONTH, addDay);
        return this;
    }

    public CalculateDate addHour(int addHour) {
        cal.add(Calendar.HOUR_OF_DAY, addHour);
        return this;
    }

    public CalculateDate addMinutes(int addMinutes) {
        cal.add(Calendar.MINUTE, addMinutes);
        return this;
    }

    @SuppressLint("SimpleDateFormat")
    public String getResult() {
        return new SimpleDateFormat(pattern).format(cal.getTime());
    }
}
