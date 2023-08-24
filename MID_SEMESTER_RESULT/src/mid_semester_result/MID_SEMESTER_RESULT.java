/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid_semester_result;
import java.util.*;

/**
 *
 * @author DELL
 */
public class MID_SEMESTER_RESULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner console  = new Scanner(System.in);
      //  boolean studentNum;
        int num=2;
          System.out.println("MID SEMESTER RESULT");
        System.out.println("FIRST TECHNICAL UNIVERSITY, IBADAN. ");
         System.out.println("Enter your name: ");
         String name = console.next();        
          System.out.println("NAME: " + name);
           System.out.println("Enter your matric no: ");
         int matric = console.nextInt();
          System.out.println("MATRIC NO: " + matric);
        
      
       do{ 
      System.out.println("Enter your CSC203 Grade");
        int csc203 =  console.nextInt();
        System.out.println("Enter your CSE203 Grade");
        int cse203 = console.nextInt();
         System.out.println("Enter your MTH201 Grade");
        int mth201 = console.nextInt();
         System.out.println("Enter your PHY291 Grade");
        int phy291 = console.nextInt();
        
       System.out.println("Enter your FRE201 Grade");
        int fre201 = console.nextInt();
        
        double Average = (cse203+csc203+mth201+phy291+fre201)/5;
        System.out.println("the Average is "+Average);
     
        if (Average >= 70){
        System.out.println("congratulations you got A");
        }
        else if (Average >=60 & Average <=69){
        System.out.println("congratulations you got B");
        }
          else if (Average >=50 & Average <=59){
        System.out.println("congratulations you got C");
        }
          else if (Average >=45 & Average <=49){
        System.out.println("congratulations you got D");
        }
          else if (Average <=40 & Average >=44){
        System.out.println("congratulations you got E");
        }
          else {
        System.out.println("congratulations you got F");
        }
        
        if (Average >=40){
        System.out.println("Remark: PASSED");
        }
        else{
          System.out.println("Remark: FAILED");
        }
       // System.out.println("any more student");
    // studentNum = console.nextBoolean();
      
       }while(num >0);
    }
    
}
