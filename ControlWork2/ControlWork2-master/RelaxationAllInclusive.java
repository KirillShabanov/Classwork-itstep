package com.company;

public class RelaxationAllInclusive extends TourVoucher{

    public RelaxationAllInclusive(String transport, boolean food, int numberOfDays, int priceTransport, int priceFood, int priceOfDay, int priceVoucher) {
        super(transport, food, numberOfDays, priceTransport, priceFood, priceOfDay, priceVoucher);
        this.type = "RelaxationAllInclusive";
    }

    @Override
    public String toString(){
        return "\n"+"Tour voucher type: "+type+super.toString();
    }
}
