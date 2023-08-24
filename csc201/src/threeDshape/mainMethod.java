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
public class mainMethod {
    public static void main(String[] args){
     cube q1 = new cube(3.0);
        q1.getarea();
        q1.getPerimeter();
        q1.getvolume();
        System.out.println("================================");
     cuboid a1 = new cuboid(2,4,6);
        a1.getarea();
        a1.getPerimeter();
        a1.getvolume();
        
          System.out.println("================================");
          spare s1 = new spare(3);
           s1.getarea();
           s1.getvolume();
           s1.getPerimeter();
            System.out.println("================================");
            cone cn1 = new cone(6,6);
            cn1.getarea();
            cn1.getvolume();
            cn1.getPerimeter();
            
        
    }
}
