package com.lucasl36.cursojavacompleto.entities;

/**
 *
 * @author Lucas Lopes
 */
public class Rectangle {
    
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        return width*height;
    }   
    
    public double Perimeter() {
        return (2*width)+(2*height);
    }
    
    public double Diagonal() {
        return Math.sqrt(Math.pow(height, 2)+Math.pow(width, 2));
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
    
}
