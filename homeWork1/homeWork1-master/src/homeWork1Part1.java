public class homeWork1Part1 {

    public static void main (String [] args){
        //1. Записать инструкцию, которая присваивает переменной x значение 1,5.
        double x=1.5;
        System.out.println(x);

        //2. Написать инструкцию, которая присваивает переменной sum нулевое значение.
        int sum=0;
        System.out.println(sum);

        //3. Записать инструкцию, которая увеличивает на единицу значение переменной n.
        int n=3;
        int i=--n;
        System.out.println(i);

        //4. Записать инструкцию, которая уменьшает на два значение переменной counter.
        int counter=5;
        int j=counter-2;
        System.out.println(j);

        //5. Написать инструкцию вычисления среднего арифметического переменных x1 и x2.
        int x1=3;
        int x2=4;
        double k=(x1+x2)/2.;
        System.out.println(k);

        //6. Записать в виде инструкции присваивания формулу вычисления значения функции у = –2,7x^3 + 0,23x^2 – 1,4.
        int x_1=2;
        double y_1=-2.7*Math.pow(x_1,3)+0.23*Math.pow(x_1,2)-1.4;
        System.out.println(y_1);

        //7. Написать инструкцию, которая увеличивает значение переменной x на величину, находящуюся в переменной dx.
        double dx=2.;
        double x_2=3.;
        double l=x_2+dx;
        System.out.println(l);


        //8. (!!один фунт 453,59237г !!) Записать в виде инструкции присваивания формулу пересчета веса из фунтов в килограммы (один фунт — 405,9 г ).
        double massPound=1;
        double massKilogram=massPound*0.45359237;
        System.out.println(massKilogram);


        //9. Записать в виде инструкции присваивания формулу пересчета расстояния из километров в версты (одна верста — 1066,8 м).
        double kilometr=1;
        double versta=kilometr/(1066.8/1000);
        System.out.println(versta);

        //10. Записать в виде инструкции присваивания формулу вычисления площади прямоугольника.
        int a=4;
        int b=3;
        int square1=a*b;
        System.out.println(square1);

           int d=5;
           double degreesAlpha=1.2875;
           double square2=0.5*Math.pow(d,2)*Math.sin(degreesAlpha);
        System.out.println(square2);


        //11. Записать в виде инструкции присваивания формулу вычисления площади треугольника: s= a⋅h/2
        int baseLength=5;
        int heightOfTheTriangle=10;
        int squareTriangle=baseLength*heightOfTheTriangle/2;
        System.out.println(squareTriangle);

        //12. Записать в виде инструкции присваивания формулу вычисления площади трапеции: s = (a+b)⋅h/2;
        int trapezoidLength=5;
        int trapezoidWidth=3;
        double heightOfTheTrapezoid=3.5;
        double squareTrapezoid=(trapezoidLength+trapezoidWidth)*heightOfTheTrapezoid/2;
        System.out.println(squareTrapezoid);

        //13. Записать в виде инструкции присваивания формулу вычисления площади круга: s=π⋅r^2.
        int r=10;
        double squareCircle=Math.PI*Math.pow(r,2);
        System.out.println(squareCircle);

        //14. Записать в виде инструкции присваивания формулы вычисления площади поверхности и объема цилиндра.
        int radiusCylinder=6;
        int heightOfTheCylinder=4;
        double squareCylinderSurface=2*Math.PI*Math.pow(radiusCylinder,2)+2*Math.PI*radiusCylinder*heightOfTheCylinder;
        double volumeCylinder=Math.PI*Math.pow(radiusCylinder,2)*heightOfTheCylinder;
        System.out.println(squareCylinderSurface);
        System.out.println(volumeCylinder);

        //15. Записать в виде инструкции присваивания формулу вычисления объема параллелепипеда.
        int lengthParallelepiped=9;
        int widthParallelepiped=6;
        int heightOfTheParallelepiped=3;
        int volumeParallelepiped=lengthParallelepiped*widthParallelepiped*heightOfTheParallelepiped;
        System.out.println(volumeParallelepiped);

        //16. Объявить необходимые переменные и записать в виде инструкции присваивания формулы вычисления объема и площади поверхности шара.
        int radiusSphere=10;
        double volumeSphere=4*Math.PI*Math.pow(radiusSphere,3)/3;
        double squareSphere=4*Math.PI*Math.pow(radiusSphere,2);
        System.out.println(volumeSphere);
        System.out.println(squareSphere);

        //17. Записать в виде инструкции присваивания формулу вычисления объема цилиндра.
        /*
        int radiusCylinder;
        int heightOfTheCylinder;
        double volumeCylinder=Math.PI*Math.pow(radiusCylinder,2)*heightOfTheCylinder;
        System.out.println(volumeCylinder);
        */

        //18. Записать в виде инструкции присваивания формулу вычисления объема полого цилиндра.
        int radiusCylinder1=12;
        int radiusCylinder2=10;
        int heightOfTheCylinder1=5;
        double volumeCylinder1=Math.PI*(Math.pow(radiusCylinder1,2)-Math.pow(radiusCylinder2,2))*heightOfTheCylinder1;
        System.out.println(volumeCylinder1);

        //19. Записать в виде инструкции присваивания формулу вычисления объема конуса.
        int radiusCone=5;
        int heightOfTheCone=7;
        double volumeCone=Math.PI*Math.pow(radiusCone,2)*heightOfTheCone/3;
        System.out.println(volumeCone);

        //20. Записать в виде инструкции присваивания формулу пересчета температуры из градусов Фаренгейта в градусы Цельсия: C = 5/9(F-32).
        double f=40.;
        //double fahrenheit;
        //fahrenheit=f;
        double celsia;
        celsia = 5*(f-32)/9;
        System.out.println(celsia);

        //21. Записать в виде инструкции присваивания формулу для вычисления тока по известным значениям напряжения и сопротивления электрической цепи.
        int U=3;
        int R=5;
        int I=U/R;
        System.out.println(I);

        //22. Записать в виде инструкции присваивания формулу вычисления сопротивления электрической цепи, состоящей из двух параллельно соединенных резисторов
        int resistorResistance1=8;
        int resistorResistante2=8;
        double circuitResistance=resistorResistance1*resistorResistante2/(resistorResistance1+resistorResistante2);
        System.out.println(circuitResistance);


    }
}
