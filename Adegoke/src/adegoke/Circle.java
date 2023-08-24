/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adegoke;

/**
 *
 * @author OPEYEMI
 */
public class Circle extends Shape{
       public Circle(double Radius){
        this.radius = Radius;
        }
    private double area;
    private double volume;
    private double radius;
   // final double PI = 3.142;

    
    @Override
    public void getArea(){
        area = Math.PI*(radius*radius);
        System.out.println("area of circle is " + area);
                
    }
    @Override
    public void getVolume(){
        volume = 2*Math.PI*radius;
        System.out.println("volume of circle is " + volume);
    }
 
    
}
