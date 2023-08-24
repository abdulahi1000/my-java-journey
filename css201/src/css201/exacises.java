/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package css201;
import java.util.*;

/**
 *
 * @author DELL
 */
public class exacises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner console = new Scanner (System.in);
         
         String aString = "Row row row your boat..";
boolean b = aString.contains("i"); 
System.out.println(b);

         
         
       int age;
       
        System.out.println("Enter your age: ");
        
         age = console.nextInt();
                       
           System.out.println("Enter your name: ");
           String name = console.nextLine();
           
              System.out.println("You be 40 in the next " + (40-age)+ " Years. MR/MRS " + name);
              
     // addition of three numbers.
             int a, b, c;
              System.out.print("Please Enter the three numbers: ");
              a = console.nextInt();
              b = console.nextInt();
              c = console.nextInt();
              
              System.out.println("The sum is "+ (a+b+c));
                
        
    }
    
    // Another method mathod of adding numbers  

    /**
     *
     * @param console
     * @return
     */
   
        public static int readSum3 (Scanner console){
        
        console = new Scanner (System.in);
        System.out.print("type 3 numbers: ");
             int num1 = console.nextInt();
              int num2 = console.nextInt();
               int num3 = console.nextInt();
             
        return num1 + num2 +num3 ;
    
    
    }
    
}
