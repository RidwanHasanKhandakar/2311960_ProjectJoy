package com.example._311960_projectjoy.LocalSupplier;

import java.time.LocalDate;

public class CSV {
    private LocalDate pickDate;

    public CSV(LocalDate pickDate) {
        this.pickDate = pickDate;
    }

    public LocalDate getPickDate() {
        return pickDate;
    }

    public void setPickDate(LocalDate pickDate) {
        this.pickDate = pickDate;
    }

    @Override
    public String toString() {
        return "CSV{" +
                "pickDate=" + pickDate +
                '}';
    }
}
