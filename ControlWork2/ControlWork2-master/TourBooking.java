package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TourBooking {

    private List<Tourist> inventory;
    private String tourist;

    public void chooseTourist(List<Tourist> inventory, String tourist) throws RuntimeException{


        Tourist temp;
        temp=ClaimDesk.defineTourist(tourist);
        if((temp!=null)&&(ClaimDesk.defineTourist(tourist).getName().toLowerCase().equals(tourist))){
            inventory.add(temp);
        }
        else throw new IllegalArgumentException("We haven't such tourist "+tourist);

    }

    public void chooseTourVoucher(List<TourVoucher> inventory,String...tours) throws RuntimeException{
        TourVoucher temp;
        for(int i=0;i<tours.length;i++){
            temp=ClaimDesk.defineTourVoucher(tours[i]);
            if((temp!=null)&&(ClaimDesk.defineTourVoucher(tours[i]).getType().toLowerCase().equals(tours[i]))){
                inventory.add(temp);
            }
            else
                throw new IllegalArgumentException("We haven't such voucher "+tours[i]);

        }
    }

}
