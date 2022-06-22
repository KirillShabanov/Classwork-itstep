package home.org;

public class homeWork1Path2 {
    public static void main(String[] args) {
        /*
         1. Загадать однозначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную.
         Пусть загаданное число в 10-тичной система счисления равняется 6.
         6=  6|_2
            -6  3|_2
            (0)-2 (1)   =0b110
               (1)

         6=0x6
         */
        System.out.println("Convert from decimal to binary");
        System.out.println(Integer.toBinaryString(6));

        System.out.println("Convert from decimal to hexadecimal");
        System.out.println(Integer.toHexString(6));


        /* 2. Загадать двузначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную.
           Пусть загаданное число в 10-тичной система счисления равняется 29.

           29=  29|_2
               -28  14|_2
               (1) -14  7|_2
                   (0) -6  3|_2
                      (1) -2 (1)  =0b11101
                          (1)

           29= 29|_16
              -16 (1) =0x1D
             (13=D)
        */

        System.out.println("Convert from decimal to binary");
        System.out.println(Integer.toBinaryString(29));

        System.out.println("Convert from decimal to hexadecimal");
        System.out.println(Integer.toHexString(29));

        /* 3. Загадать 3-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        Пусть загаданное число в двоичной системе счисления равняется 0b111001011.

        0b111001011=0*2Math.pow(11)+0*2Math.pow(10)+0*2Math.pow(9)+1*2Math.pow(8)+1*2Math.pow(7)+
        +1*2Math.pow(6)+0*2Math.pow(5)+0*2Math.pow(4)+1*2Math.pow(3)+0*2Math.pow(2)+1*2Math.pow(1)+
        +1*2Math.pow(0)=459

        Для перевода из Bin в Hex требуется промежуточный шаг- перевод в Dec.

        459= 459|_16
            -458  28|_16  = 0x1CB
           (11=B)-16  (1)
                (12=C)
        */

        System.out.println("Convert from binary to decimal");
        String i = "111001011";
        int numDec = Integer.parseInt(i,2);
        System.out.println(Integer.parseInt(String.valueOf(numDec)));

        System.out.println("Convert from binary to hexadecimal");
        i = "111001011";
        int numHex=Integer.parseInt(i,2);
        System.out.println(Integer.toHexString(numHex));

        /* 4. Загадать 6-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        Пусть загаданное число в двоичной системе счисления равняется 101101.

        0b101101=1*2Math.pow(5)+0*2Math.pow(4)+1*2Math.pow(3)+1*2Math.pow(2)+0*2Math.pow(1)+1*2Math.pow(0)=45

        Для перевода из Bin в Hex требуется промежуточный шаг- перевод в Dec.

        45= 45|_16
           -32 (2) =0x2D
          (13=D)
        */
        System.out.println("Convert from binary to decimal");
        String i1 = "101101";
        int numDec1 = Integer.parseInt(i1,2);
        System.out.println(Integer.parseInt(String.valueOf(numDec1)));

        System.out.println("Convert from binary to hexadecimal");
        i1 = "101101";
        int numHex1=Integer.parseInt(i1,2);
        System.out.println(Integer.toHexString(numHex1));


        /* 5. Загадать 2-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        Пусть загаданное число в 16-ричной системе счисления равняется 0x4C.

        76= 76|_2
           -76  38|_2
           (0) -38  19|_2
               (0) -18  9|_2
                   (1) -8  4|_2
                       (1)-4  2|_2
                          (0)-2 (1) =0b1001100
                             (0)

        Для перевода из Hex в Bin требуется промежуточный шаг- перевод в Dec.

        0x4C=4*16Math.pow(1)+12*16Math.pow(0)=64+12=76

        */
        int ih=0x4C;
        System.out.printf("From Hex to Bin. %s %n", Integer.toBinaryString(ih));

        ih=0x4C;
        System.out.printf("From Hex to Dec. %s %n", Integer.parseInt(String.valueOf(ih),10));

        /* 6. Загадать 4-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        Пусть загаданное число в 16-ричной системе счисления равняется 0x26ED.

        9965= 9965|__2_
             -9964 4982|__2_
              (1) -4982 2491|__2_
                   (0) -2490 1245|_2_
                        (1) -1244 622|_2_
                             (1) -622 311|_2_
                                  (0)-310 155|_2_
                                      (1)-154  77|_2_
                                          (1) -76 38 |_2_
                                              (1)-38  19 |_2_
                                                 (0) -18   9 |_2_
                                                     (1)  -8   4 |_2_
                                                          (1) -4   2 |_2_
                                                              (0) -2  (1) = 10011011101101
                                                                  (0)


        Для перевода из Hex в Bin требуется промежуточный шаг- перевод в Dec.

        0x26ED=2*16Math.pow(3)+6*16Math.pow(2)+14*16Math.pow(1)+13*16Math.pow(0)=8192+1536+224+13=9965

        */
        ih=0x26ED;
        System.out.printf("From Hex to Bin. %s %n", Integer.toBinaryString(ih));

        ih=0x26ED;
        System.out.printf("From Hex to Dec. %s %n", Integer.parseInt(String.valueOf(ih),10));

    }

}
