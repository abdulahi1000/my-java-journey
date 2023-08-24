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
public class rectangle extends shape{
    private double area;
    private double perimeter;
    private double length;
    private double breath;
    
    
   
     rectangle (double l, double b) {
        this.length = l;
        this.breath = b;
    }
    
        
    
    public void area() {
    area= (length*breath);
    System.out.println("area is" + area);
    }

    @Override
    public void perimeter() {
     perimeter = 2*(length+breath);  
     System.out.println("perimeter is" + perimeter);
    }
    
}
