/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adegoke;
import java.util.Arrays;

/**
 *
 * @author OPEYEMI
 */
public class Main {
    public static void arrayPassing(double[] arr){
        for(int i=0; i<arr.length;i++){
        
        System.out.print(arr[i] + ";");
        }
    
    }
    public static void main(String[] args){
    
//        Circle c1 = new Circle(6.0);
//        c1.getArea();
//        c1.getVolume();
        
        arrayPassing(new double[]{1.2,46,58,79});
        System.out.println();
        arrayPassing(new double[]{2,3,4,5,6,9});
        
    
    }
}
