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
public class mainClass {
    public static void main(String[] args){
    
        circle c1 = new circle(187);
      
        c1.area();
        c1.perimeter();
        
        System.out.println("=====================");
        
        rectangle r1 = new rectangle(3,4);
        r1.area();
        r1.perimeter();
        
        rectangle r2 = new rectangle(4,5);
         r2.area();
         r2.perimeter();
          
    }
}
