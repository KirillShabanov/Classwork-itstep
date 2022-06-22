package com.company;

public abstract class TourVoucher {

    public String type;
    private String transport;
    private boolean food;
    private int numberOfDays;
    private int priceTransport;
    private int priceFood;
    private int priceOfDay;
    private int priceVoucher;

    public TourVoucher(String transport, boolean food, int numberOfDays, int priceTransport, int priceFood, int priceOfDay, int priceVoucher) {
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.priceTransport = priceTransport;
        this.priceFood = priceFood;
        this.priceOfDay = priceOfDay;
        this.priceVoucher = priceVoucher;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getPriceTransport() {
        return priceTransport;
    }

    public void setPriceTransport(int priceTransport) {
        this.priceTransport = priceTransport;
    }

    public int getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(int priceFood) {
        this.priceFood = priceFood;
    }

    public int getPriceOfDay() {
        return priceOfDay;
    }

    public void setPriceOfDay(int priceOfDay) {
        this.priceOfDay = priceOfDay;
    }

    public int getPriceVoucher() {
        return priceVoucher;
    }

    public void setPriceVoucher(int priceVoucher) {
        this.priceVoucher = priceVoucher;
    }

    @Override
    public String toString() {
        return " Transport: "+transport+" Food : "+food+" Number of days: "+numberOfDays+" Price Transport: "+priceTransport+
                "Price Food"+priceFood+"Price number of day"+priceOfDay+"Price voucher"+priceVoucher+".";
    }

}
