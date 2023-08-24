/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;
import java.util.*;

/**
 *
 * @author OPEYEMI
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Scanner ope = new Scanner(System.in);
        
       double[] a = {10,100,1000,10000,100000,1000000};
        
        double sum =0;
      for(int j =0; j<a.length; j++){  
      
        long start = System.nanoTime();
        
        for (double i=1; i<=a[j]; i++){
            
        sum += i;
        
        }
        
        long end = System.nanoTime();
        
          System.out.println("number of Meliseconds is "+(end-start));
         System.out.println("number of seconds is "+((double)end-start)/(double)1000);
        System.out.println("total sum is "+sum);
        sum=0;
      }
         
    }
    
    
}
