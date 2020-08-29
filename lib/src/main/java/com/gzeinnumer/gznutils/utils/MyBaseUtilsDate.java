package com.gzeinnumer.gznutils.utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBaseUtilsDate {
    public static String F_YEAR="yyyy";

    public static String F_MONTH_NUMBER="MM"; //01, 11
    public static String F_MONTH_NAME="MMM"; //Jul, Jan, Jun
    public static String F_MONTH_NAME_FULL="MMMMM"; //July, Juni

    public static String F_DATE_NO_ZERO="d"; //01, 05, 10
    public static String F_DATE="dd"; //01, 05, 10
    public static String F_DAY_NAME="EEE"; //Wed Thu

    public static String F_HOUR="HH"; //1-23
    public static String F_MINUTES="mm"; //1-60
    public static String F_SECOND="ss"; //1-60
    public static String F_AM_PM="a"; //AM PM
    public static String F_ZONE="z"; //GMT

    @SuppressLint("SimpleDateFormat")
    public static String reformatDate(String old, String[] from, String[] to){
        StringBuilder patternFrom = new StringBuilder();
        for (String s : from) patternFrom.append(s);

        SimpleDateFormat format = new SimpleDateFormat(patternFrom.toString());

        Date newDate = null;
        try { newDate = format.parse(old); }
        catch (ParseException e) { e.printStackTrace(); }

        StringBuilder patternTo = new StringBuilder();
        for (String s : to) patternTo.append(s);

        format = new SimpleDateFormat(patternTo.toString());

        if (newDate != null) return format.format(newDate);
        else return "Date formater error";
    }

    @SuppressLint("SimpleDateFormat")
    public static String reformatDate(String old, String from, String to){
        SimpleDateFormat format = new SimpleDateFormat(from);

        Date newDate = null;
        try { newDate = format.parse(old); }
        catch (ParseException e) { e.printStackTrace(); }

        format = new SimpleDateFormat(to);

        if (newDate != null) return format.format(newDate);
        else return "Date formater error";
    }

    @SuppressLint("SimpleDateFormat")
    public static String getCurrentTime(String requestFormat){
        SimpleDateFormat format = new SimpleDateFormat(requestFormat);//dd/MM/yyyy
        Date now = new Date();
        String strDate = format.format(now);
        return strDate;
    }
}
