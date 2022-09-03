package com.guilherme.rsocketpatientserver.models;

public class ClinicalData {
    
    private int heartRate;
    private String bp;

    public ClinicalData(int heartRate, String bp) {
        super();
        this.heartRate = heartRate;
        this.bp = bp;
    }

    @Override
    public String toString() {
        return "Clinical [heartRate=" + heartRate + ", bp=" + bp + "]";
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

   
}