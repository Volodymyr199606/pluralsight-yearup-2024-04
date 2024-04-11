package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate

        // declare variables
        double priceOfChocolate = 2.99;
        double myMoney = 20;
        int quantityOfChocolateBought = 4;
        double totalCost;
        double changeGiven;

        // write the logic
        totalCost = priceOfChocolate * quantityOfChocolateBought;
        changeGiven = myMoney - totalCost;

        // display output

        System.out.println();
        System.out.println("Chocolate bar: $ " + priceOfChocolate);
        System.out.println("Quantity: " + quantityOfChocolateBought);
        System.out.println("-----------------------");
        System.out.println("Total: $ " + totalCost);
        System.out.println("Paid: $" + myMoney);
        System.out.println("Chage given : $ " + changeGiven);



    }

    public static void question2()
    {
        // calculate the diametr of a circle



    }

}

