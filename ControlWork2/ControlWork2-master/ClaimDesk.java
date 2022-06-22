package com.company;

import java.util.HashMap;
import java.util.Map;

public class ClaimDesk {

    public static Tourist defineTourist (String name){

        Map<String, Tourist> tourists = new HashMap<>();

        tourists.put("Кирилл", new Tourist("Кирилл","Шабанов", 32));
        tourists.put("Кристина", new Tourist("Кристина","Шабанова", 31));
        tourists.put("Василиса", new Tourist("Василиса","Шабанова", 3));
        tourists.put("Виктория", new Tourist("Виктория","Шабанова", 52));

        return tourists.get(name);
    }

    public static TourVoucher defineTourVoucher (String tourVoucher){

        Map<String, TourVoucher> tourVouchers = new HashMap<>();

        tourVouchers.put("Relaxation", new Relaxation("Airplane",true ,10 , 100, 50,50
                ,1000));
        tourVouchers.put("RelaxationAllInclusive", new RelaxationAllInclusive("Cruise",true ,15 , 150,
                75, 75, 1500));
        tourVouchers.put("Excursion", new Excursions("Train", false, 3, 25,
                0, 15, 150));
        tourVouchers.put("ExcursionAllInclusive", new ExcursionAllInclusive("Bus", true, 5,
                30, 15, 15, 150));
        tourVouchers.put("Shopping", new Shopping("Horse", false, 2, 5,
                0, 5, 50));
        tourVouchers.put("ShoppingAllInclusive", new ShoppingAllInclusive("Rickshaw", true, 3,
                30, 15, 10, 75));
        tourVouchers.put("Treatment", new Treatment("Bicycle", true, 21, 0,
                300, 250, 1570));
        tourVouchers.put("TreatmentAllInclusive", new TreatmentAllInclusive("Airship", true, 30,
                250, 530, 320, 1750));

        return tourVouchers.get(tourVoucher);
    }

}
