package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()
    {
        // Question 1:
        // declare variables here

        double bobSalary = 800;
        double garySalary = 900;

        // code the logic to the problem here
        double highestSalary = Math.max(bobSalary, garySalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The highest salary is: $" + highestSalary);
        System.out.println("-----------------------");
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here

        double carPryce = 500;
        double truckPrice = 600;


        // code the logic to the problem here
        double smallestValey = Math.min(carPryce, truckPrice );


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The smallest vallue is: " + smallestValey);
        System.out.println("-----------------------");
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here

        double radius = 7.25;


        // code the logic to the problem here

        double area = Math.PI * radius * radius;


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Area of the circle is: " + area );
        System.out.println("-----------------------");
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here

        double root = 5.0;

        // code the logic to the problem here
        double squareRoot = Math.sqrt(root);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Square root of " + root + " is: " + squareRoot );
        System.out.println("-----------------------");
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here

        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;


        // code the logic to the problem here
        double distance = Math.sqrt(Math.pow(x2- x1, 2) + Math.pow(y2 -y1,2));


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The distance between (5,10) and (85, 50) is: " + distance);
        System.out.println("-----------------------");

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here

        double notAbsoluteValue = -3.8;


        // code the logic to the problem here
        double absoluteValue = Math.abs(notAbsoluteValue);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Absolute value of: " + notAbsoluteValue + " is " + absoluteValue);
        System.out.println("-----------------------");
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here


        // code the logic to the problem here

        int lowEdge = 100;
        int highEdge = 200;
        int highEdgeTemp = highEdge - lowEdge ;

        double SeedValue = Math.random();
        int random = (int)((SeedValue  * highEdgeTemp)+lowEdge);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random number between 0 and 1  is " + random);
        System.out.println("-----------------------");




    }
}