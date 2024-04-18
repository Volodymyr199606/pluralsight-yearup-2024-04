package com.pluralsight;

import java.util.Scanner;

public class ForLoop {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        forLoop();
    }

    public static void forLoop() throws InterruptedException {
        for (int counter = 10; counter >= 1; counter--) {
            System.out.println(counter);
            Thread.sleep(1000);
        }
        System.out.println("LAUNCH !");
    }
}