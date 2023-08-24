
package javaapplication1;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
       Scanner habas = new Scanner(System.in);
     
       
       /*System.out.println("Enter the number of pakage: ");
       int qaun = habas.nextInt();
       // qaun = quantity
       
       if (qaun >=10 & qaun<20){
       System.out.println("you have 20% discount ");
       System.out.println("your total amount is $" + (qaun*99*0.2));
       }
       else if (qaun>=20 & qaun <=49){
        System.out.println("you have 30% discount ");
       System.out.println("your total amount is $" + (qaun*99*0.3));
       }
       else if (qaun>=50 & qaun<100){
        System.out.println("you have 40% discount ");
       System.out.println("your total amount is $" + (qaun*99*0.4));
       }
       else if (qaun>=100 ){
        System.out.println("you have 50% discount ");
       System.out.println("your total amount is $" + (qaun*99*0.5));
       }
       else{
       System.out.println("you dont have any discount");
       System.out.println("your total amount is $" + (qaun*99));
       }*/
       
        //time calculator
       System.out.println("enter any number of seconds: ");
       long sec = habas.nextLong();
       
       
       long minute = sec/60;
       long hours = minute/60;
       long day = hours/24;
       
       if (sec>= 60 & sec<3600){
       System.out.println(minute +" minutes " + sec%60 + " seconds");
       }
       else if (sec>= 3600 & sec<86400){
       System.out.println(hours + " hours " + minute%60 + " minutes " + sec%60 + " seconds ");
       }
       else if (sec>=86400){
       System.out.println(day + " days " + hours%24 + " hours " + minute%60 + " minutes " + sec%60 + 
               " seconds");
       }
       else{
       System.out.println(sec + "seconds");
       }
        
    }
    
}
