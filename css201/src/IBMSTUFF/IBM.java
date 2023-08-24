/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IBMSTUFF;
import java.util.*;

/**
 *
 * @author DELL
 */
public class IBM {
    public static void main(String[] args ){
         indroduction();
        Scanner ibmStuff = new Scanner (System.in);
       /* double weight, height;
        
        System.out.println("Enter first person's information");
         System.out.print("weight (in pounds) ?");
         System.out.print("height (in inches) ?");
         weight = ibmStuff.nextDouble();
         height = ibmStuff.nextDouble();
          double Ibm = weight/(height*height)*703;
           System.out.println("The first person IBM ="+ Ibm);
           
        System.out.println("Enter second person's information");
         System.out.print("weight (in pounds) ?");
         System.out.print("height (in inches) ?");
        double  weight2 = ibmStuff.nextDouble();
        double  height2 = ibmStuff.nextDouble();
         double Ibm2 = weight2/(height2*height2)*703;
         
            System.out.println("The second person IBM ="+ Ibm2);
           double difference = Ibm-Ibm2;
           System.out.println("The difference = " + difference );*/
        
        //Another method of doing this is:..
       
        
        double bmi1 = processPerson(ibmStuff);
        double bmi2 = processPerson(ibmStuff);
        
        System.out.println("person #1 body mass index = " +bmi1);
        System.out.println("person #2 body mass index = " +bmi2);
        double difference = bmi1-bmi2;
         System.out.println("Difference = " +difference);  
    
    
    }

    public static void indroduction() {
      System.out.println("This data read in data for 2 person");
      System.out.println("and cumpute their body mass index(BMI)");
      System.out.println("and weight status.");
      System.out.println();
    }

    public static double processPerson(Scanner ibmStuff) {
        System.out.println("Enter next person's information: ");
        System.out.print("height (in inches)? ");
        double height = ibmStuff.nextDouble();
        
        System.out.print("weight (in pounds)? ");
        double weight = ibmStuff.nextDouble();
        System.out.println();
        double bmi= getBMI(height, weight);
        return bmi;
                
    }
    
    public static double getBMI(double height, double weight){
    double bmi = weight/(height*height)*703;
    return bmi;
    } 
    
}
