using System;

// Abstract class
abstract class Shape
{
    
    public abstract void CalculateArea(); // abstract method

    
    public void DisplayInfo() // concrete method
    {
        Console.WriteLine("This is a shape class that contains both abstract and concrete methods.");
    }
}


class Circle : Shape
{
    private double radius;

    public Circle(double r) // constrctor
    {
        radius = r;
    }

    
    public override void CalculateArea() // override method from parent abstract class
    {
        double area = Math.PI * radius * radius;
        Console.WriteLine($"Area of Circle = {area:F2}");
    }
}


class Rectangle : Shape
{
    private double length, width;

    public Rectangle(double l, double w) // constructor
    {
        length = l;
        width = w;
    }

    
    public override void CalculateArea()
    {
        double area = length * width;
        Console.WriteLine($"Area of Rectangle = {area:F2}");
    }
}


class Program
{
    static void Main()
    {
        // Using Circle
        Shape circle = new Circle(5);
        circle.DisplayInfo(); // calling concrete method
        circle.CalculateArea(); // calling abstract method implementation

        Console.WriteLine();

        
        Shape rectangle = new Rectangle(4, 6);
        rectangle.DisplayInfo();
        rectangle.CalculateArea();
    }
}