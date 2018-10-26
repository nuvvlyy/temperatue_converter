package com.example.temperatureconverter.model;

public class temperatue {
    private double temp;
    public temperatue(double temp) {
        this.temp = temp;
    }
    public double gettemperatue() {
        return this.temp;
    }
    public String getconverttoF() {
        return String.format("%.2f",(temp - 32)* 5/9);
    }
    public String getconverttoC() {
        return String.format("%.2f",(1.8*temp) + 32);
    }

}
