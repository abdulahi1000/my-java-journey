/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjavacode;
import java.util.*;

 

/**
 *
 * @author DELL
 */
public class grade_help {
    

    
    public static void main(String[] args)
              
      {
    int maths, physics, chemistry, english, computersc;
    double finalscore;
    Scanner marks = new Scanner(System.in);
    boolean result;


    do
      {
        System.out.println("Enter Marks for maths: ");
        maths = marks.nextInt();
        System.out.println("Enter Marks for Chemistry: ");
        chemistry = marks.nextInt();
        System.out.println("Enter Marks for Physics: ");
        physics = marks.nextInt();
        System.out.println("Enter Marks for English: ");
        english = marks.nextInt();
        System.out.println("Enter Marks for computer Science: ");
        computersc = marks.nextInt();
        finalscore = (maths+english+physics+chemistry +computersc) /5;

          if (finalscore > 90)
        {
          System.out.println("Excellent");
        }
        else if (finalscore >80)
        {
          System.out.println("Very Good");
        }
        else if (finalscore > 60) {
            System.out.println("Good");

          }
        else if (finalscore > 40)
          {
            System.out.println("Average");
          }
         else
          {
            System.out.println("Poor");
          }
                System.out.println("Any more Students? (true or false)");
         result = marks.nextBoolean();

    }while (result);

  }
}





