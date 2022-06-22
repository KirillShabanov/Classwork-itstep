package com.company;

public class Treatment extends TourVoucher{

    public Treatment(String transport, boolean food, int numberOfDays, int priceTransport, int priceFood, int priceOfDay, int priceVoucher) {
        super(transport, food, numberOfDays, priceTransport, priceFood, priceOfDay, priceVoucher);
        this.type = "Treatment";
    }

    @Override
    public String toString(){
        return "\n"+"Tour voucher type: "+type+super.toString();
    }
}
