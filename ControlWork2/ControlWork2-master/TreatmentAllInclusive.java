package com.company;

public class TreatmentAllInclusive extends TourVoucher{

    public TreatmentAllInclusive(String transport, boolean food, int numberOfDays, int priceTransport, int priceFood, int priceOfDay, int priceVoucher) {
        super(transport, food, numberOfDays, priceTransport, priceFood, priceOfDay, priceVoucher);
        this.type = "TreatmentAllInclusive";
    }

    @Override
    public String toString(){
        return "\n"+"Tour voucher type: "+type+super.toString();
    }
}
