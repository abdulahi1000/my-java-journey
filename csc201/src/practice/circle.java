/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author OPEYEMI
 */
public class circle extends shape {
    private double area;
    private double perimeter;
    private final double PI = 3.142;
    private double radius;

circle(double r){
    this.radius = r;
}    
    
    @Override
    public void area() {
       area = (PI*radius*radius);
       area = PI*Math.pow(radius, 2);
       System.out.println("area of circle is " + area);
    }

    @Override
    public void perimeter() {
        perimeter =(2*PI*radius);
        System.out.println("perimeter of circle is " + perimeter);
       
    }
    
}
