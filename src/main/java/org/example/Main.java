package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023, 3, 21);
        LocalDate date2 = LocalDate.of(2020, 2, 1);
        LocalDate date3 = LocalDate.of(2033, 1, 16);
        LocalDate date4 = LocalDate.of(2036, 4, 3);
        LocalDate date5 = LocalDate.of(2000, 5, 23);
        LocalDate date6 = LocalDate.of(2024, 6, 13);
        LocalDate date7 = LocalDate.of(2025, 9, 16);
        LocalDate date7_2 = LocalDate.of(2025, 9, 4);
        LocalDate date8 = LocalDate.of(2019, 8, 5);
        LocalDate date9 = LocalDate.of(2015, 7, 29);
        LocalDate date10 = LocalDate.of(2020, 10, 31);
        LocalDate date11 = LocalDate.of(2016, 12, 12);
        LocalDate date12 = LocalDate.of(2011, 11, 11);

        List<LocalDate> dates = new ArrayList<>();
        Collections.addAll(dates, date1, date2, date3, date4, date5, date6, date7, date7_2, date8, date9, date10, date11, date12);

        DateSorter dateSorter = new DateSorter();
        System.out.println(dateSorter.sortDates(dates));
    }
}