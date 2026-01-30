package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class DateFormatter {

    public String formatDate(String inputDate) {

        if (inputDate == null) {
            throw new IllegalArgumentException("Invalid date");
        }

        try {
            DateTimeFormatter inputFormat =
                    DateTimeFormatter.ofPattern("uuuu-MM-dd")
                            .withResolverStyle(ResolverStyle.STRICT);

            DateTimeFormatter outputFormat =
                    DateTimeFormatter.ofPattern("dd-MM-uuuu");

            LocalDate date = LocalDate.parse(inputDate, inputFormat);
            return date.format(outputFormat);

        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date");
        }
    }
}
