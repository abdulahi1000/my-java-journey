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
public class quadratic {
    
    //-b +/-sqrt(b2-4ac)/2a
    
    private double a;
    private double b;
    private double c;
    quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getQuadratic(){
        
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
