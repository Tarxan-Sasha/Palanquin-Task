package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorListWithoutR implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate ld1, LocalDate ld2) {
        return ld2.getMonthValue() - ld1.getMonthValue();
    }
}
