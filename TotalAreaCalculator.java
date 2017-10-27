package com.taylor;

/*
 * Created by taylorlockhart on 10/27/17.
 */
public class TotalAreaCalculator {
    public static double calculate(Shape[] shapes){
        double totalArea = 0;
        for (Shape s: shapes){
            totalArea += s.area();
        }
        return totalArea;
    }

}
