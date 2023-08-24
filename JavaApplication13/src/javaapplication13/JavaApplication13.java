/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.io.File;
import java.util.*;
/**
 *
 * @author OPEYEMI
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
             File x = new File("C:\\Users\\OPEYEMI\\Desktop\\201 STUFF\\Doc1.txt");
        if (x.exists())
            System.out.println(x.getName() + " exist");
        
        else
             System.out.println("the file does not exist");
        
        final Formatter X; 
        try{
        X = new Formatter ("C:\\Users\\OPEYEMI\\Desktop\\ade.txt");
        System.out.println("you have created a file ");
        }catch (Exception e){
        System.out.println("you have error");
        }
    }
    
}
