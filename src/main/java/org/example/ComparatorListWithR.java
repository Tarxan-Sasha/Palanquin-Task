package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorListWithR implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate ld1, LocalDate ld2){
        return ld1.getMonthValue() - ld2.getMonthValue();
    }
}
