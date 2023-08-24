/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.qaudratic;

/**
 *
 * @author OPEYEMI
 */
public class main {
    public static void main (String[] args){
    
//        quadratic q1 = new quadratic(3,4.68,1.68);
//        q1.getQuadratic();
//         quadratic q2 = new quadratic(1,2,3);
//        q2.getQuadratic();
        
         double a =3;
    double b = 4.68;
  double c = 1.68;
  
   
        
        double B = ((b*b)-(4*a*c));
       
        
        if (B<0){
            double x = (-b/(2*a));
            double y = Math.sqrt(-B)/(2*a);
            
            System.out.print(("x1 = ")+ x +"-i" + y );
            System.out.println(("\tx2 = ")+x +"+i" + y );
        
        }else{
            
        System.out.print("x1 = "+((-b + Math.sqrt(B))/(2*a)) );
        System.out.println("\tx2 = "+((-b - Math.sqrt(B))/(2*a)) );
        
        }
    
    
    }
}
