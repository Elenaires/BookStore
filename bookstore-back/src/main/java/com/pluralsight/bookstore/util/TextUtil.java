package com.pluralsight.bookstore.util;

public class TextUtil {

    // replace one or more spaces with one space
    public String sanitize(String textToSanitize) {
        return textToSanitize.replaceAll("\\s+", " ");
    }
}
