package com.gzeinnumer.gznutils.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MBUtilsDate {
    public static String F_YEAR = "yyyy";

    public static String F_MONTH_NUMBER = "MM"; //01, 11
    public static String F_MONTH_NAME = "MMM"; //Jul, Jan, Jun
    public static String F_MONTH_NAME_FULL = "MMMMM"; //July, Juni

    public static String F_DATE_NO_ZERO = "d"; //01, 05, 10
    public static String F_DATE = "dd"; //01, 05, 10
    public static String F_DAY_NAME = "EEE"; //Wed Thu

    public static String F_HOUR = "HH"; //1-23
    public static String F_MINUTES = "mm"; //1-60
    public static String F_SECOND = "ss"; //1-60
    public static String F_AM_PM = "a"; //AM PM
    public static String F_ZONE = "z"; //GMT

    public static String reformatDate(String old, String[] from, String[] to, Locale locale) {
        StringBuilder patternFrom = new StringBuilder();
        for (String s : from) patternFrom.append(s);

        SimpleDateFormat format = new SimpleDateFormat(patternFrom.toString(), locale);

        Date newDate = null;
        try {
            newDate = format.parse(old);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        StringBuilder patternTo = new StringBuilder();
        for (String s : to) patternTo.append(s);

        format = new SimpleDateFormat(patternTo.toString(), locale);

        if (newDate != null) return format.format(newDate);
        else return "Date formater error";
    }

    public static String reformatDate(String old, String from, String to, Locale locale) {
        SimpleDateFormat format = new SimpleDateFormat(from, locale);

        Date newDate = null;
        try {
            newDate = format.parse(old);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        format = new SimpleDateFormat(to, locale);

        if (newDate != null) return format.format(newDate);
        else return "Date formater error";
    }

    public static String getCurrentTime(String requestFormat, Locale locale) {
        SimpleDateFormat format = new SimpleDateFormat(requestFormat, locale);//dd/MM/yyyy
        Date now = new Date();
        return format.format(now);
    }

    public static boolean checkBetween(Date dateToCheck, Date startDate, Date endDate) {
        return dateToCheck.compareTo(startDate) >= 0 && dateToCheck.compareTo(endDate) <= 0;
    }

    public static boolean checkBetween(String dateToCheck, String startDate, String endDate) {
        return dateToCheck.compareTo(startDate) >= 0 && dateToCheck.compareTo(endDate) <= 0;
    }
}
