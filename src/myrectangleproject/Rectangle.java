/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myrectangleproject;

/**
 *
 * @author user-pc
 */
public class Rectangle {
    
    private double length; //declaring length attribute
    private double width; //declaring width attribute
    private double area; //declaring area attribute
    private double perimeter; //declaring perimeter attribute
    
    //Default constructor for Rectangle
    public Rectangle()
    {
        
    }
    
    //Master constructor for Rectangle
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    //below are the getter and setter methods for the class attributes
    public double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getArea() 
    {
        return area;
    }

    public void setArea(double area) 
    {
        this.area = area;
    }

    public double getPerimeter() 
    {
        return perimeter;
    }

    public void setPerimeter(double perimeter) 
    {
        this.perimeter = perimeter;
    }
    
    public void getArea(double l, double w)
    {
        setArea(l*w);
    }
    
    public void getPerimeter(double l, double w)
    {
        setPerimeter(2*(l+w));
    }
    
    
}
