package com.pluralsight;

import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        loadProducts();

    }

    public static void loadProducts()
    {
        File file = new File("Files/products.csv");
        try(Scanner fileScanner = new Scanner(file))
        {
            while(file)
        }

    }
}