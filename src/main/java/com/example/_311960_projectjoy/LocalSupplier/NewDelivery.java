package com.example._311960_projectjoy.LocalSupplier;

import java.time.LocalDate;

public class NewDelivery {
    private LocalDate slotTime;
    private String purchaseOrder;
    private String driverPhone;
    private String vehicleNumber;
    private String deliveryDetails;
    private int quantity;

    public NewDelivery(LocalDate slotTime, String purchaseOrder, String driverPhone, String vehicleNumber, String deliveryDetails, int quantity) {
        this.slotTime = slotTime;
        this.purchaseOrder = purchaseOrder;
        this.driverPhone = driverPhone;
        this.vehicleNumber = vehicleNumber;
        this.deliveryDetails = deliveryDetails;
        this.quantity = quantity;
    }

    public LocalDate getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(LocalDate slotTime) {
        this.slotTime = slotTime;
    }

    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDeliveryDetails() {
        return deliveryDetails;
    }

    public void setDeliveryDetails(String deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "NewDelivery{" +
                "slotTime=" + slotTime +
                ", purchaseOrder='" + purchaseOrder + '\'' +
                ", driverPhone='" + driverPhone + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", deliveryDetails='" + deliveryDetails + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
