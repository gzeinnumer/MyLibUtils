package com.gzeinnumer.gznutils.utils;

public class MyBaseUtilsString {

    public static String removeLastChar(String text) {
        if (text == null) {
            return "null";
        }
        if (text.length() == 0) {
            return "";
        }
        return text.substring(0, text.length() - 1);
    }

    public static String removeLastCharCustomLength(String text, int count) {
        if (text == null) {
            return "null";
        }
        if (text.length() == 0) {
            return "";
        }
        return text.substring(0, text.length() - count);
    }

    public static String removeAllSimbol(String text, String replaceWith) {
        if (text == null) {
            return "null";
        }
        if (replaceWith == null) {
            return "null";
        }
        if (text.length() == 0) {
            return "";
        }
        return text.replaceAll("[^a-zA-Z0-9]", replaceWith);
    }

    public static String removeSpesificSimbol(String text, String replaceWith, String... symbols) {
        if (text == null) {
            return "null";
        }
        if (text.length() == 0) {
            return "";
        }
        if (replaceWith == null) {
            return "null";
        }
        if (symbols == null) {
            return "null";
        }
        for (String d : symbols) {
            text = text.replace(d, replaceWith);
        }
        return text;
    }
}
