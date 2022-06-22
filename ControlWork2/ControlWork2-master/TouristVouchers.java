package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TouristVouchers {
    /**
    3. Вывести список свободных путевок по выбранным критериям.
    Вывести список туристов, находящихся в указанное время на отдыхе. **/

    public static void main(String[] args) throws RuntimeException{
        List<TourVoucher> tourVoucher1=new ArrayList<>();
        List<TourVoucher> tourVoucher2=new ArrayList<>();

        List<Tourist> tourist1=new ArrayList<>();
        List<Tourist> tourist2=new ArrayList<>();

        TourBooking booking=new TourBooking();

        Vouchers v1= new Vouchers(tourist1,tourVoucher1);
        booking.chooseTourist(v1.getTourist(),"Кирилл");
        booking.chooseTourVoucher(v1.getTourVoucher(),"Shopping","Airplane");
        System.out.println(v1);

        Vouchers v2=new Vouchers(tourist2,tourVoucher2);
        booking.chooseTourist(v2.getTourist(),"Кристина");
        booking.chooseTourVoucher(v2.getTourVoucher(),"RelaxationAllInclusive","Airship");
        System.out.println(v2);


        System.out.println(v2);
    }
}
