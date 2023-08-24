/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeDshape;

/**
 *
 * @author OPEYEMI
 */
public class cone extends ThreeDShape{
    private double area;
    private double volume;
    private double perimeter;
    private double radius;
    private double height;
    
    cone(double r, double h){
        radius = r;
        height = h;
    
    }

    @Override
    public void getvolume() {
      //pir2*h/3 
        
        volume = Math.PI*(radius*radius)*(height/3);
        System.out.println("the volume of cone = " + volume);
        
    }

    @Override
    public void getPerimeter() {
       //(1/3)*pi*r2*h
        perimeter =( (Math.PI*Math.pow(radius, 2)*height)/3);
        System.out.println("the perimeter of cone = " + perimeter);
    }

    @Override
    public void getarea() {
        // pir(r+root(h2+r2))
        double a = Math.pow(height, 2)*Math.pow(radius, 2);
       area = Math.PI*radius*(radius+Math.sqrt(a));
       System.out.println("the area of cone = " + area);
    }
    
}
