package org.itstep;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
	// Классы-обертки
        System.out.printf("Boolean: min=%b, max=%b, range=%d. %n",Boolean.FALSE, Boolean.TRUE,1);    //булевская переменная, d-будет продставлено целое значение digital
        System.out.printf("Byte: min=%d, max=%d, range=%d. %n", Byte.MIN_VALUE,Byte.MAX_VALUE,Byte.BYTES);
        System.out.printf("Short: min=%d, max=%d, range=%d. %n", Short.MIN_VALUE,Short.MAX_VALUE,Short.BYTES);
        System.out.printf("Integer: min=%d, max=%d, range=%d. %n", Integer.MIN_VALUE,Integer.MAX_VALUE,Integer.BYTES);
        System.out.printf("Long: min=%d, max=%d, range=%d. %n", Long.MIN_VALUE,Long.MAX_VALUE,Long.BYTES);
        System.out.printf("Float: min=%f, max=%f, range=%d. %n", Float.MIN_VALUE,Float.MAX_VALUE,Float.BYTES);
        System.out.printf("Double: min=%f, max=%f, range=%d. %n", Double.MIN_VALUE,Double.MAX_VALUE,Double.BYTES);
        System.out.printf("Character: min=%c, max=%c, range=%d. %n", Character.MIN_VALUE,Character.MAX_VALUE,Character.BYTES);

        System.out.printf("Double: min=%f, max=%f, range=%d. %n ",Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN, Double.MIN_NORMAL);  // НЕ РАБОТАЕТ

    }
}
