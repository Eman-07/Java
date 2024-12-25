package com.example.tableview;

import java.io.Serializable;

public class Data implements Serializable {
    private String name;
    private double unitsCount;
    private final int unitPrice = 5;
    private double bill;

    public Data(String name, double unitsCount) {
        this.name = name;
        this.unitsCount = unitsCount;
    }

    public Data(){
        this.name = "";
        this.unitsCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitsCount() {
        return unitsCount;
    }

    public void setUnitsCount(double unitsCount) {
        this.unitsCount = unitsCount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
    public double getBill(){
        return (unitsCount * unitPrice);
    }
}
