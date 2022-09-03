package com.guilherme.rsocketpatientserver.models;

public class Claim {
    
    private float amount;
    private String service;
    
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public Claim(float amount, String service) {
        this.amount = amount;
        this.service = service;
    }


}
