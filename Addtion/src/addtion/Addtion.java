/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtion;
import javax.swing.JOptionPane;

public class Addtion {

    public static void main(String[] args) {
        String FirstName =
        JOptionPane.showInputDialog("Enter first integer");
         String secondName =
        JOptionPane.showInputDialog("Enter Second integer");
         
         int num1 = Integer.parseInt(FirstName);
         int num2 = Integer.parseInt(secondName);
         int sum = num1+num2;
         
       JOptionPane.showMessageDialog( null,"the sum is " + sum, "the sum of the two numbers ", JOptionPane.PLAIN_MESSAGE); 
    }
    
}
