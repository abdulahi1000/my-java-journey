/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package css201;

/**
 *
 * @author DELL
 */
public class controlStatement {
    public static void main(String[] args){
    
        int a=20, b=20;
        if (a>b){
        System.out.println("A is greater than B");
        
        }
        else{
        System.out.println("A is less than B.");
        }
    
        // whileLoop
      /*  int count = 1;
        System.out.println("print number from 1 to ...");
        while(count <= 10){
        System.out.println("number " + count++);
        
        }*/
    // doWhileLoop
      /*  int num =6;
        System.out.println("print number greater than 6 upwards: ");
        do{
        System.out.println(num++);
        }
        while(num<=10);*/
        
        // continous statement 
        System.out.println("printing odd numbers:");
        for(int i=0; i<=10; i++){
        if (i%2==0)
            continue;
                System.out.println(i +"\t" );
        }
        
        // break statement 
    System.out.println("printing that will break at 8 ");
    for(int i=0; i<=10; i++ ){
    
        if (i==9)
            break;
        System.out.println("number "+i);    
    }
    
    
    }
}
