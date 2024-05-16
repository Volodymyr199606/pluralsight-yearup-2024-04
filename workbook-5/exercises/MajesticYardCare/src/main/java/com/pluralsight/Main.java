package com.pluralsight;

import com.pluralsight.models.Shape;
import com.pluralsight.models.Triangle;
import com.pluralsight.models.Circle;
import com.pluralsight.models.Rectangle;
import com.pluralsight.models.Square;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        // load all shapes from the file
        try (BufferedReader br = new BufferedReader(new FileReader("data/shapes.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                switch (parts[0]) {
                    case "circle":
                        shapes.add(new Circle(Integer.parseInt(parts[1])));
                        break;
                    case "rectangle":
                        shapes.add(new Rectangle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                    case "square":
                        shapes.add(new Square((int) Double.parseDouble(parts[1])));
                        break;
                    case "triangle":
                        shapes.add(new Triangle(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // then print the toString() of each shape
        for (Shape shape: shapes)
        {
            System.out.println(shape);
        }
    }
}