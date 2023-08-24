/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author DELL
 */
public class CGPA {
    public static void main(String[] args){
    
        int MTH101, CSC101, PHY101, CHM101, PHY107, CHM103, LIB101, EVS101, FRN101, SER101;
        Scanner  score = new Scanner (System.in);
        double scores;
        
        
    
        
        
            System.out.println("Enter your MTH101 score:");
            MTH101 = score.nextInt();
             System.out.println("Enter your CSC101 score:");
            CSC101 = score.nextInt();
             System.out.println("Enter your PHY101 score:");
            PHY101 = score.nextInt();
             System.out.println("Enter your CHM101 score:");
            CHM101 = score.nextInt();
             System.out.println("Enter your LIB101 score:");
            LIB101 = score.nextInt();
             System.out.println("Enter your EVS101 score:");
            EVS101 = score.nextInt();
             System.out.println("Enter your FRN101 score:");
            FRN101 = score.nextInt();
             System.out.println("Enter your SER101 score:");
            SER101 = score.nextInt();
             System.out.println("Enter your CHM103 score:");
            CHM103 = score.nextInt();
             System.out.println("Enter your PHY107 score:");
            PHY107 = score.nextInt();
            
            if (MTH101 >= 70 && CSC101 >=70 && PHY101>=70 && CHM101>=70 && LIB101 >=70 && EVS101>=70 && FRN101>=70 && SER101>=70 && CHM103 >=70 && PHY107>=70){
                System.out.println("A");
            }
            else if (MTH101 >= 60 & CSC101 >=60 & PHY101>=60 & CHM101>=60 & LIB101 >=60 & EVS101>=60 & FRN101>=60 & SER101>=60 & CHM103 >=60 & PHY107>=60){
                System.out.println("B");
            }
             else if (MTH101 >= 50 & CSC101 >=50 & PHY101>=50 & CHM101>=50 & LIB101 >=50 & EVS101>=50 & FRN101>=50 & SER101>=50 & CHM103 >=50 & PHY107>=50){
                System.out.println("C");
            }
             else if (MTH101 >= 45 & CSC101 >=45 & PHY101>=45 & CHM101>=45 & LIB101 >=45 & EVS101>=45 & FRN101>=45 & SER101>=45 & CHM103 >=45 & PHY107>=45){
                System.out.println("D");
            }
             else if (MTH101 >= 40 & CSC101 >=40 & PHY101>=40 & CHM101>=40 & LIB101 >=40 & EVS101>=40 & FRN101>=40 & SER101>=40 & CHM103 >=40 & PHY107>=40){
                System.out.println("E");
            }
             else {
                System.out.println("F");
            }
            
            
            
            
        
    }
}
