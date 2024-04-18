package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        // instance
        CelPhone myPhone = new CelPhone();



        // userPrompt

        System.out.println("Please enter your information below: ");
        System.out.print("What is Serial number: ? ");
        int serialNumber = userInput.nextInt();

        userInput.nextLine();

        System.out.print("What model is the phone: ? ");
        String model = userInput.nextLine();

        System.out.print("Who is the Carrier: ? ");
        String carrier = userInput.nextLine();

        System.out.print("What is the Phone Number: ? ");
        String phoneNumber = userInput.nextLine();

        System.out.print("Device owner: ?  ");
        String owner = userInput.nextLine();



        // setters

        myPhone.setSerialNumber(serialNumber);
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);
        myPhone.getCarrier();


        // display

        System.out.println("\nPhone Information: ");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Model: " + model);
        System.out.println("Carrier: " + carrier);
        System.out.println("PhoneNumber: "+ phoneNumber);
        System.out.println("Owner: " + owner);

    }

}




