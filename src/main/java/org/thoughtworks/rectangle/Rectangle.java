package org.thoughtworks.rectangle;

class Rectangle{
    private final double length;
    private final double breadth;
    private Rectangle(double length, double breadth )
    {
        this.length = length;
        this.breadth = breadth;

    }

    public static Rectangle createRectangle (double length, double breadth)
    {
        return new Rectangle(length, breadth);
    }
    public static Rectangle createSquare (double side)
    {
        return new Rectangle(side, side);
    }
    public double area(){
        return (length*breadth);
    }
    public double perimeter(){
        return (2*(length+breadth));
    }

}