package com.example._311960_projectjoy.LocalSupplier;

public class CreateProfile {
    private String name;
    private String bank;
    private Integer binTin;
    private Integer tradeLicense;

    public CreateProfile(String name, String bank, Integer binTin, Integer tradeLicense) {
        this.name = name;
        this.bank = bank;
        this.binTin = binTin;
        this.tradeLicense = tradeLicense;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Integer getBinTin() {
        return binTin;
    }

    public void setBinTin(Integer binTin) {
        this.binTin = binTin;
    }

    public Integer getTradeLicense() {
        return tradeLicense;
    }

    public void setTradeLicense(Integer tradeLicense) {
        this.tradeLicense = tradeLicense;
    }

    @Override
    public String toString() {
        return "CreateProfile{" +
                "name='" + name + '\'' +
                ", bank='" + bank + '\'' +
                ", binTin=" + binTin +
                ", tradeLicense=" + tradeLicense +
                '}';
    }
}
