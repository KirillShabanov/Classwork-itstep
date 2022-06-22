package com.company;

public class Excursions extends TourVoucher{

    public Excursions(String transport, boolean food, int numberOfDays, int priceTransport, int priceFood, int priceOfDay, int priceVoucher) {
        super(transport, food, numberOfDays, priceTransport, priceFood, priceOfDay, priceVoucher);
        this.type = "Excursions";
    }

    @Override
    public String toString(){
        return "\n"+"Tour voucher type: "+type+super.toString();
    }
}
