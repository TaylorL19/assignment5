/*
HEAD:
Taylor Lockhart
826000479
Acknowledgements:
 */
package com.taylor;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Shape[] randomShapes(int n){
        //TODO: Fix this to work with normal arrays
        Shape[] shapes = new Shape[n];
        for(int i = 0; i < n; i++){
            shapes[i] = Shape.randomShape();
        }
        return shapes;
    }

    //TODO: Add filenotfound Exception handler
    public static Shape[] fileInputShapes (String infile){ //throws FileNotFoundException{
        Scanner inFile = new Scanner(infile);
        int numShapes = 0;

        Shape[] shapes = new Shape[numShapes];
        //TODO: finish this function


        return shapes;
    }

    public static void main(String[] args) throws InvalidArgumentException {
        try{
            if(args.length != 2){
                String[] errors = {"Incorrect usage\n",
                                   "The first argument should be R or S\n",
                                   "If the first argument is R, the second argument is an int\n",
                                   "If the first argument is S, the second argument is a filename\n"};
                throw new InvalidArgumentException(errors);
            }
        }
        catch (InvalidArgumentException e){
            System.out.print(e.getMessage());
        }
        Shape[] shapes = new Shape[0];
        switch (args[0]){
            case "R":
                shapes = randomShapes(Integer.parseInt(args[1]));
                break;
            case "S":
                shapes = fileInputShapes(args[1]);
                break;
        }
        for (Shape s: shapes){
            System.out.println(s.toString());
        }
        System.out.println("The total area is: " + TotalAreaCalculator.calculate(shapes) + ".");
    }
}
