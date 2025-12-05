package com.example._311960_projectjoy.LocalSupplier;

import java.time.LocalDate;

public class RFQsList {
    private String rfq;
    private LocalDate leadTime;
    private Double price;
    private String note;

    public RFQsList(String rfq, LocalDate leadTime, Double price, String note) {
        this.rfq = rfq;
        this.leadTime = leadTime;
        this.price = price;
        this.note = note;
    }

    public String getRfq() {
        return rfq;
    }

    public void setRfq(String rfq) {
        this.rfq = rfq;
    }

    public LocalDate getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(LocalDate leadTime) {
        this.leadTime = leadTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "RFQsList{" +
                "rfq='" + rfq + '\'' +
                ", leadTime=" + leadTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
