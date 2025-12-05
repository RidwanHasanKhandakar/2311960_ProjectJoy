package com.example._311960_projectjoy.LocalSupplier;

import java.time.LocalDate;

public class ProductCatalog {
    private String productName;
    private double unit;
    private double price;
    private double mOq;
    private LocalDate leadTime;

    public ProductCatalog(String productName, double unit, double price, double mOq, LocalDate leadTime) {
        this.productName = productName;
        this.unit = unit;
        this.price = price;
        this.mOq = mOq;
        this.leadTime = leadTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getmOq() {
        return mOq;
    }

    public void setmOq(double mOq) {
        this.mOq = mOq;
    }

    public LocalDate getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(LocalDate leadTime) {
        this.leadTime = leadTime;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "productName='" + productName + '\'' +
                ", unit=" + unit +
                ", price=" + price +
                ", mOq=" + mOq +
                ", leadTime=" + leadTime +
                '}';
    }
}
