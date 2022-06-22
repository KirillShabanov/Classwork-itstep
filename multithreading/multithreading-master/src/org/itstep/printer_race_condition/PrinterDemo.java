package org.itstep.printer_race_condition;


public class PrinterDemo {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        printer.start();

        for (int i=0; i<5; i++){
            System.out.println("Calculate: "+i);
            Thread.sleep(100);
        }

        //чтоб работало все как должно быть, смотри вниз
        synchronized (printer){
            printer.wait();
        }

        System.out.println("Beep! Total: "+printer.count);
    }
}

class Printer extends Thread{
    public int count = 0;


    @Override
    public void run() {
        synchronized (this) {
            while (count < 5) {
                System.out.println("Printing page #" + count++);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}
