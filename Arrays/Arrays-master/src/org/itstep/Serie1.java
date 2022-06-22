package org.itstep;

public class Serie1 {
    public static void main(String[] args) {
        // x-2/6*x^2+(2*5)/(6*9)*x^3-
        double sum=0, x=0.5, eps=1e-10,a=x;
        int num=1;
        while(Math.abs(a)>eps){
            sum+=a;
            num++;
            a*=-x*(3*num-4)/(3*num);
        }
        double res=3*Math.pow(1+x,1./3)-3;
        System.out.printf("calc: %f, comp: %f%n", sum,res);
    }
}
