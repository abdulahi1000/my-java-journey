/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.assignment;



/**
 *
 * @author OPEYEMI
 *///2369
public class linearSearch {
      public static void main(String[] args) {
     int[] a ={1,2,3,4,5,6,7,8,9,10,14,16};
     int loc = 16;
//      for(int i=0; i<a.length; i++){
//      
//          if(a[i] == loc){
//          System.out.println(loc +" is present at lacation "+ (i+1));
//          
//          } 
//          else {
//          System.out.println(loc +" is not present");
//          
//          }
//      }
      
      // another method
       // best case senario =1895
        //worst case senario = 2369
//      int count =0;
//      boolean found = false;
//      long start = System.nanoTime();
//      
//      while(count<a.length && !found){
//       if (a[count] == loc){
//           found = true;
//       }
//       
//       else {
//           count++;
//          }
//      }
//      long end = System.nanoTime();
//      
//      
//       if (found){
//        System.out.println(loc +" is present at lacation "+ (count+1));
//       }
//       else{
//         System.out.println(loc +" is not present");
//       }
//       System.out.println("the time is " + (end-start) + " nano seconds");
      
      //tring with the in the algorithm
      
      
      int b[] ={65,3,2,6,78,9,0,1,35,65};
      int loca =3;
      int k =0;
      while(k<b.length  ){
          if (b[k] == loca){
          System.out.println(loca + "is a at "+ (k+1));
          break;
          }
          else{
              
          k++;
     
          }
          
      }
      
       double arr[] ={10,3,2,6,78,9,0,1,35,65,};
       
       
        
        max(arr );
        linearSearch(a,15);
        
      
      }
      
      public static void max(double[] arr){
      
          double curent =  arr[0];
          for (int i =0; i<arr.length; i++){
            if(curent < arr[i]){
                 curent = arr[i];
            }
          }
          System.out.println(curent);
      }
      
      public static void linearSearch(int[] a, int result){
      
          int loc = -1;
          int k =0;
          boolean found = false;
          while(k<a.length && loc == -1 && !found){
              if(a[k] == result){
              loc = result;
              System.out.println(result +" is the result, and its found at index " + k + " location "+ (k+1));
              found = true;
              }
              else
              {
              k++;
               }      
          }
          if (found){
          System.out.print("its found");
          }else{
          System.out.print("opps its not found");
          }
          
      
      }
}
