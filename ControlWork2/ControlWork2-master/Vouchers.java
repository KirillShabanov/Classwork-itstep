package com.company;

import java.util.List;

public class Vouchers {

    private List<Tourist> tourists;
    private List<TourVoucher> tourVouchers;

    public Vouchers(List<Tourist> tourists, List<TourVoucher> tourVouchers) {
        this.tourists = tourists;
        this.tourVouchers = tourVouchers;
    }

    public List<Tourist> getTourist() {
        return tourists;
    }

    public void setTourists(List<Tourist> tourists) {
        this.tourists = tourists;
    }

    public List<TourVoucher> getTourVoucher() {
        return tourVouchers;
    }

    public void setTourVouchers(List<TourVoucher> tourVouchers) {
        this.tourVouchers = tourVouchers;
    }

    @Override
    public String toString(){
        StringBuilder touristDescription=new StringBuilder(tourists.get(0).toString());
        if(!tourVouchers.isEmpty()){
            touristDescription.append("\n"+tourists.get(0).getName()+"s tours:");
            for(TourVoucher tourVoucher:tourVouchers){
                touristDescription.append(new StringBuilder(tourVoucher.toString()));
            }
        }
        return new String(touristDescription);
    }
}
