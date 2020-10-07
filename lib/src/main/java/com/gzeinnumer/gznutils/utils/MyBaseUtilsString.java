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

    public static String removeFirstChar(String text) {
        if (text == null) {
            return "null";
        }
        if (text.length() == 0) {
            return "";
        }
        return text.substring(1);
    }

    public static String removeFirstCharCustomLength(String text, int count) {
        if (text == null) {
            return "null";
        }
        if (text.length() == 0) {
            return "";
        }
        return text.substring(5);
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

    public static String getNameFromUrl(String url) {
        return url.substring(url.lastIndexOf('/') + 1, url.length());
    }

    public static String removeExtension(String fileName) {
        return fileName.substring(0, fileName.lastIndexOf('.'));
    }

}
