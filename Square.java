package com.taylor;

/*
 * Created by taylorlockhart on 10/27/17.
 */
public class Square extends Shape {
    private double sidelength;

    public Square(Point position, double length){
        super.position = position;
        this.sidelength = length;
    }
    @Override
    public double area() {
        return Math.pow(sidelength, 2.0);
    }
    //TODO: implement
    @Override
    public void draw(){

    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)||obj == null){
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
        hash = hash * 17 + (int)sidelength;
        hash = hash * 18 + (int)super.position.getX();
        hash = hash * 15 + (int)super.position.getY();
        return hash;
    }

    public Point position(){
        return super.position;
    }

    public double getSidelength() {
        return sidelength;
    }

    public void setSidelength(double sidelength) {
        this.sidelength = sidelength;
    }

    public String toString(){
        return "This square's top left corner is at "
                + super.position + ", its side length is "
                + sidelength + ".\n";
    }

}
