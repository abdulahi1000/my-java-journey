/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade_mark;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Grade_mark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int english, french, computer, mth, evs;
      double finalscore;
      Scanner marks = new Scanner (System.in);
      boolean result;
      
      
      
      do
      {
      System.out.println("Enter Marks for math: ");
      mth = marks.nextInt();
       System.out.println("Enter Marks forcomputer: ");
      computer = marks.nextInt();
       System.out.println("Enter Marks for evs: ");
      evs = marks.nextInt();
       System.out.println("Enter Marks for english: ");
     english = marks.nextInt();
       System.out.println("Enter Marks for french: ");
     french = marks.nextInt();
     
     finalscore = (english + french + evs + mth+ computer)/5;
     
     if (finalscore > 90)
     {
     System.out.println("Excellent");
     }
        else if (finalscore >80)
        {
        System.out.println("Very Good");
        }
        else if (finalscore > 60)
        {
         System.out.println("Good");
        }
          else if (finalscore > 40)
        {
         System.out.println("Average");
        }
          else if (finalscore > 30)
        {
         System.out.println("Poor");
        }
          else if (finalscore > 20)
          {
          System.out.println("faild");
          }
           else
          {
          System.out.println("you did not attend class at all");
          }
            System.out.println("Any other student? true or false");
        result = marks.nextBoolean();
      }while (result);
      
      
    }
    
}
