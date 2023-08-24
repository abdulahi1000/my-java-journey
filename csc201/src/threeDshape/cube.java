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
public class cube extends ThreeDShape {
    private double area;
    private double perimeter;
    private double egde;
    private double volume;
    
    
    
 cube(double e){
     egde = e;
 }

    @Override
 public void getvolume(){
  volume = egde*egde*egde;
  System.out.println("the volume of cube = "+ volume);
 }

    @Override
    public void getarea() {
        double faceArea = (egde*egde);
     area = (6*faceArea);
     System.out.println("the area of cube = "+ area);
    }

    @Override
    public void getPerimeter() {
         perimeter = 12*egde;
         System.out.println("the perimeter of cube = "+ perimeter);
    }
}
