package com.mahim.learningjava17.synchronization;

public class Table {
    public synchronized void printTable(int n,String str) {
        for (int i = 1; i <= 5 ; i++) {
            System.out.printf("%s %d = %d \n", str, i, i*n);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred in thread");
            }
        }
    }
}
