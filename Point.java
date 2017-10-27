/*
HEAD:
Taylor Lockhart
826000479
Acknowledgements:
 */
package com.taylor;

/*
 * Created by taylorlockhart on 10/27/17.
 */
public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double dist(Point p1, Point p2){
        return Math.pow((Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p2.getY(),2)),0.5);
    }

}
