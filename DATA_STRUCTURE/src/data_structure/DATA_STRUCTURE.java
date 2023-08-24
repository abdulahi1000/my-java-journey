/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;
import java.util.Arrays;

/**
 *
 * @author OPEYEMI
 */
public class DATA_STRUCTURE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OBJECT ARE REFRENCE
        //newnode.next = head. to add node from the front
        //head.next.next.next.next=newnodw. to add node from the back
        byvalue();
        byreference();
    }
 
   public static void byvalue(){
    int x= 5;
   
    int y=x;
    System.out.println(x+ " " + y);
    x=10;
    System.out.println(x+ " " + y);
    } 
   public static void byreference(){
   int[] x ={1,2,5,7,9};
   int[] y= x;
   System.out.println(Arrays.toString(x) +" " +Arrays.toString(y));
   
   x[0] = 10;
   x[1] = 12;
   x[2] = 13;
   System.out.println(Arrays.toString(x) +" " +Arrays.toString(y));
   
   }
   
   
}
 
