package com.example._311960_projectjoy.LocalSupplier;

import java.time.LocalDate;

public class POsList {
    private String status;
    private String pO;
    private LocalDate date;

    public POsList(String status, String pO, LocalDate date) {
        this.status = status;
        this.pO = pO;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getpO() {
        return pO;
    }

    public void setpO(String pO) {
        this.pO = pO;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "POsList{" +
                "status='" + status + '\'' +
                ", pO='" + pO + '\'' +
                ", date=" + date +
                '}';
    }
}
