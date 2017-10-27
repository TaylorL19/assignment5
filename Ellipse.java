package com.taylor;

/*
 * Created by taylorlockhart on 10/27/17.
 */
public class Ellipse extends Shape {
    private double width;
    private double height;

    public Ellipse(Point position, double width, double height){
        super.position = position;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * width * height;
    }
    //TODO: implement
    @Override
    public void draw(){

    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ellipse)||obj == null){
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
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "This ellipse's top left corner is at "
                + super.position + ", its width is "
                + width + ", and its height is "
                + height + ".\n";
    }
}
