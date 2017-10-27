/*
HEAD:
Taylor Lockhart
826000479
Acknowledgements:
 */
package com.taylor;
import java.lang.Math;

/*
 * Created by taylorlockhart on 10/27/17.
 */
public class RightTriangle extends Shape{
    private double width;
    private double height;
    Point shortSide;
    Point longSide;

    public RightTriangle(Point position, Point side1, Point side2){
        //TODO: check to make sure that it is actually a right triangle
        super.position = position;
        if(Point.dist(position, side1)>Point.dist(position,side2)){
            longSide = side1;
            shortSide = side2;
            width = Point.dist(side2, position);
            height = Point.dist(side1, position);
        }
        else{
            longSide = side2;
            shortSide = side1;
            height = Point.dist(side2, position);
            width = Point.dist(side1, position);
        }
    }

    @Override
    public double area() {

        return (width*height)/2.0;
    }
    //TODO: implement
    @Override
    public void draw(){

    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof RightTriangle)||obj == null){
            return false;
        }
        if(this.hashCode() == obj.hashCode()){
            return true;
        }
        else
            return false;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash = hash * 17 + (int)width;
        hash = hash * 14 + (int)height;
        hash = hash * 18 + (int)super.position.getX();
        hash = hash * 15 + (int)super.position.getY();
        return hash;
    }
    public Point position(){
        return super.position;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        //TODO: check to make sure right triangle invariant holds
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        //TODO: check to make sure right triangle invariant holds
        this.height = height;
    }

    public String toString(){
        return "This Right Triangle's top left corner is at "
                + super.position + ", its width is "
                + width + ", and its height is "
                + height + ".\n";
    }
}
