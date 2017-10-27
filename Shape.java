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
public abstract class Shape implements Comparable<Shape> {
    protected Point position;

    abstract public Point position();

    abstract public double area();

    abstract public void draw();

    //TODO:Complete this method
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Shape otherShape){
        if(this.area() == otherShape.area()){
            return 0;
        }
        if(this.area() > otherShape.area()){
            return 1;
        }
        else{
            return -1;
        }
    }

    public static Shape randomShape(){
        int random = (int)(Math.random() * 4 + 1);
        double randLength = (Math.random() * 200 + 10);
        double randHeight = (Math.random() * 200 + 10);
        double randX = (Math.random() * 1000 + 100);
        double randY = (Math.random() * 1000 + 100);
        switch (random){
            case 1:
                Ellipse e = new Ellipse(new Point(randX, randY), randLength, randHeight);
                return e;
            case 2:
                double side1RandX = (Math.random() * 1000 + 100);
                double side1randY = (Math.random() * 1000 + 100);
                double side2randX = (Math.random() * 1000 + 100);
                double side2randY = (Math.random() * 1000 + 100);
                RightTriangle t = new RightTriangle(new Point(randX, randY),
                                                    new Point(side1RandX, side1randY),
                                                    new Point(side2randX,side2randY));
                return t;
            case 3:
                Rectangle r = new Rectangle(new Point(randX, randY), randLength, randHeight);
                return r;
            //case 4:
            default:
                Square s = new Square(new Point(randX, randY), randLength);
                return s;
        }
    }
}

