package com.example._311960_projectjoy.LocalSupplier;

public class NewInvoice {
    private String poNumber;
    private Double amount;
    private Double tax;

    public NewInvoice(String poNumber, Double amount, Double tax) {
        this.poNumber = poNumber;
        this.amount = amount;
        this.tax = tax;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "NewInvoice{" +
                "poNumber='" + poNumber + '\'' +
                ", amount=" + amount +
                ", tax=" + tax +
                '}';
    }
}
