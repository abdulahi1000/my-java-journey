/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author OPEYEMI
 */
public class circle extends shape {
    private final double PI = 3.142;
    private double radius;
    private double area, perimeter;
    circle(double radius){
    this.radius = radius;
    
    }
  public void getPerimeter(){
      this.perimeter = (PI*PI*radius);
      System.out.println("perimeter =" + perimeter);
  
  }  
  public void getarea(){
  this.area = PI*radius*radius;
  this.area = PI* Math.pow(radius, 2.0);//to use raisedtopower
  System.out.println("area = " + area);
  }
  
  public void setRadius(double r){
  this.radius = r;
  }
  
}
