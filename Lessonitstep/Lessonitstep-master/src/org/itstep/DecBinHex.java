package org.itstep;

public class DecBinHex {
    public static void main (String [] args){
        int io=010;                                                               // восьмиричная
        int ih=0xA;                                                               // шестнадцатиричная
        int ib=0b100;                                                             // двоичная
        char c='a';
        String s="r";
        double d1=1.2e20;
        System.out.println(io);
        System.out.println(ih);
        System.out.println(ib);

        int id=2;                                                                 // десятиричная
        System.out.printf("From dec to bin. %s %n", Integer.toBinaryString(id));  // для перевода систем счисления

        System.out.println("Count Binary");
        for (int i=0; i<16; i++) System.out.println(Integer.toBinaryString(i));

        System.out.println("Convert from binary to decimal");
        s="1101";
        int numDec=Integer.parseInt(s,2);                                   //radix2- система двоичного счисления
        System.out.println(numDec);

        System.out.println("Get one digit from a binary literal");
        int numberBin = 0b0101;                                                   // убрать первую единицу в числе
        int bit=numberBin&1;
        System.out.println(bit);

        int bit1=(numberBin<<1)&1;
        System.out.println(bit1);

        System.out.println("Bitwise operations on a binary");

        System.out.println("Logical NOT");
        byte number1 = 0b0101;
        int result = ~ number1;
        String sResult=Integer.toBinaryString(result);                            // чтобы удалить лишние цифры
        sResult=sResult.substring(28);                                            // чтобы удалить лишние цифры
        System.out.println(sResult);                                              // чтобы удалить лишние цифры
        System.out.println(Integer.toBinaryString(result));

        System.out.println("Logical AND");
        number1 = 0b0101;
        byte number2 = 0b0100;
        result = number1 & number2;
        System.out.println(result);
        sResult = Integer.toBinaryString(result);
        System.out.println(sResult);

        System.out.println("Logical OR");
        number1 = 0b0101;
        number2 = 0b0100;
        result = number1 | number2;
        System.out.println(result);
        sResult = Integer.toBinaryString(result);
        System.out.println(sResult);






    }

}

class IngDec {
    public static void main (String [] args){
    int x,y;
    x = 1;
    y = x++;
    y = ++x;
    System.out.println(y);
    }
}