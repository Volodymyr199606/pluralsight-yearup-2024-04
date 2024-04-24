package com.pluralsight;

public class Employee
{

    private String sku;
    private String name;
    private double price;
    private String department;

    public Product(String sku, String name, double price, String department)
    {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public String getSku()
    {
        return sku;
    }
    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getName()
    {
        return name;
    }

}
