package com.ltp.workbook;

public class Record {
    private String item;
    private double revenue;
    private double cost;

    private double profit;

    public Record() {
    }

    public Record(String item, double revenue, double cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
        this.profit = Math.round(revenue - cost);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
