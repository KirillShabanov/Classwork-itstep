package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class BoxWithASurprises {
    public static void main(String[] args) {
        List<Collection<String>> boxWithASurprises= new ArrayList<>();
        boxWithASurprises.add(giftsFromDad());
        boxWithASurprises.add(giftsFromMother());
        boxWithASurprises.add(giftsFromSun());
        boxWithASurprises.add(giftsFromDaughter());
        System.out.println("All gifts: " + "\n" + boxWithASurprises);


        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        String sDadBirthsDay = "14.10";
        String sMotherBirthsDay = "10.01";
        String sSunBirthsDay = "18.08";
        String sDaughterBirthsDay = "20.04";
        try {
            Date dadBirthsDay = dateFormat.parse(sDadBirthsDay);
            Date motherBirthsDay = dateFormat.parse(sMotherBirthsDay);
            Date sunBirthsDay = dateFormat.parse(sSunBirthsDay);
            Date daughterBirthsDay = dateFormat.parse(sDaughterBirthsDay);
            System.out.println();

            /**
            Date date;
            date = motherBirthsDay;
            if (date.equals(motherBirthsDay)){
                System.out.println("Happy birthday mom!");
                System.out.println("Gifts for mom: " + "\n" + "Gift from Dad: " +
                        boxWithASurprises.stream().distinct());
                System.out.println(boxWithASurprises);
            }
**/
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Collection<String> giftsFromDad(){
        Collection<String> giftFromDad = new ArrayList<>();
        String giftForMother = "Necklace";
        String giftForSun = "Bike";
        String giftForDaughter = "Toy kitchen";
        giftFromDad.add(giftForMother);
        giftFromDad.add(giftForSun);
        giftFromDad.add(giftForDaughter);
        return giftFromDad;
    }
    private static Collection<String> giftsFromMother(){
        Collection<String> giftFromMother = new ArrayList<String>();
        String giftForDad = "Spinning";
        String giftForSun = "Bike helmet";
        String giftForDaughter = "Set of children's dishes";
        giftFromMother.add(giftForDad);
        giftFromMother.add(giftForSun);
        giftFromMother.add(giftForDaughter);
        return giftFromMother;
    }
    private static Collection<String> giftsFromSun(){
        Collection<String> giftFromSun = new ArrayList<>();
        String giftForDad = "Football tickets";
        String giftForMother = "Home flower";
        String giftForDaughter = "Set of markers";
        giftFromSun.add(giftForDad);
        giftFromSun.add(giftForMother);
        giftFromSun.add(giftForDaughter);
        return giftFromSun;
    }
    private static Collection<String> giftsFromDaughter(){
        Collection<String> giftFromDaughter = new ArrayList<>();
        String giftForDad = "Beaded bracelet";
        String giftForMother = "Portrait";
        String giftForSun = "Postcard";
        giftFromDaughter.add(giftForDad);
        giftFromDaughter.add(giftForMother);
        giftFromDaughter.add(giftForSun);
        return giftFromDaughter;
    }
}
