
package assignment;

import threeDshape.cube;

public class MainShape {
    public static void main(String[] args){
    circle c1 = new circle(2.0);
    
    c1.getPerimeter();
    
    c1.getarea();
    System.out.println("to change the value of radius");
    
    c1.setRadius(3.0);
    c1.getPerimeter();
    c1.getarea();
    
    System.out.println("====================================");
    
    rectangle r1 = new rectangle(2,5);
    r1.getPerimeter();
    
    r1.getarea();
    System.out.println("====================================");
     
    }
}
