package com.gzeinnumer.gznutils.utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class CalculateDate {
    private Calendar cal;
    private String _pattern;

    @SuppressLint("SimpleDateFormat")
    public CalculateDate(String dateInString, String _pattern) {
        this._pattern = _pattern;
        this.cal = Calendar.getInstance();
        try {
            this.cal.setTime(Objects.requireNonNull(new SimpleDateFormat(_pattern).parse(dateInString)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public CalculateDate addYear(int addYear) {
        this.cal.add(Calendar.YEAR, addYear);
        return this;
    }

    public CalculateDate addMonth(int addMonth) {
        this.cal.add(Calendar.MONTH, addMonth);
        return this;
    }

    public CalculateDate addWeek(int addWeek) {
        this.cal.add(Calendar.DAY_OF_MONTH, addWeek * 7);
        return this;
    }

    public CalculateDate addDay(int addDay) {
        this.cal.add(Calendar.DAY_OF_MONTH, addDay);
        return this;
    }

    public CalculateDate addHour(int addHour) {
        this.cal.add(Calendar.HOUR_OF_DAY, addHour);
        return this;
    }

    public CalculateDate addMinutes(int addMinutes) {
        this.cal.add(Calendar.MINUTE, addMinutes);
        return this;
    }

    @SuppressLint("SimpleDateFormat")
    public String getResult() {
        return new SimpleDateFormat(_pattern).format(cal.getTime());
    }
}
