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
public class spare extends ThreeDShape{
    private double radius;
    private double volume;
    private double perimeter;
    private double area;
    
    spare(double r){
    radius = r;
    }

    @Override
    public void getvolume() {
    //4/3pi*r3
        volume = ((4/3)*Math.PI*Math.pow(radius, 3));
        System.out.println("volume of sphare = " + volume);
    }

    @Override
    public void getPerimeter() {
     System.out.println("opps there is no volume for perimeter of sphare\n you can calculate area and volume only");  
    }

    @Override
    public void getarea() {
  //4pir2
        area = 4*Math.PI*Math.pow(radius, 2);
     System.out.println("Area of sphare = " + area); 
     
    }
    
}
