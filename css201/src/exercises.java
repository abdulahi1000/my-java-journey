
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author DELL
 */
public class exercises {
    
    public static void main(String[] args){
    // if else statements
        Scanner console = new Scanner (System.in);
       /* System.out.println("Enter your speed: ");
        int speed = console.nextInt();
        if (speed>=24 && speed<56){
            System.out.println("speed is normal");
        }
        else {
            System.out.println("The speed is abnormal");
        }*/
        
    // conversion of number to roman num.
      /*  System.out.println("Enter day month and year in just 2 digit: ");
         System.out.println("Enter day in 2 digit: ");
        int day= console.nextInt();
        System.out.println("Enter month in 2 digit: ");
        int month = console.nextInt();
        System.out.println("Enter year in 2 digit: ");
        int years = console.nextInt();
        
        
        
        int product= day*month;
        if (years==product){
            System.out.println("the data is magic");
        }
        else{
            System.out.println("the data not a magic");
        }*/
        
        //mass and weight
       /* System.out.println("Enter mass vaule in kilogram: ");
          double mass =console.nextDouble();
        double weight= mass *9.8;
        System.out.printf("Wow weight in newton = %.2f\n ", weight );
        if(weight>=1000){
        System.out.println("It's too heavy");
        }
        else if (weight <10){
        System.out.println("it's too light");
        }
        else{
        System.out.println("still normal ");
        }*/
        
        // COLOR MIXING
//       System.out.println("Enter two primary color: ");
//      
//         String color1 = console.next();
//         String color2 = console.next();
//        
//       
//                
//                if ("red".equals(color1) & "blue".equals(color2) || "blue".equals(color1) & "red".equals(color2) ){
//                System.out.println("the color mixture is purple");
//                }
//                else if("red".equals(color1) & "yellow".equals(color2) || "yellow".equals(color1) &"red".equals(color2) ){
//                 System.out.println("the color mixture is orange");
//                }
//                 else if("yellow".equals(color1) & "blue".equals(color2) || "blue".equals(color1) &color2 == "yellow" ){
//                 System.out.println("the color mixture is green");
//                }
//                 else {
//                 System.out.println("the color enter is not a primary.");
//                 }
                
       /* System.out.println("Welcome to Odusote!");
        System.out.println("Enter the number of book you have purchase:");
        int number = console.nextInt();
        
        if (number == 0){
        System.out.println("Thank you, you earn 0 point");
        }
        else if (number == 1){
     System.out.println("Congratulations, you earn 5 point");
    }
        else if (number == 2){
     System.out.println("Congratulations, you earn 15 point");
    }
        else if (number == 3){
     System.out.println("Congratulations, you earn 30 point");
    }
        else if (number >=4){
         System.out.println("Congratulations, you earn 60 point");
        }
        else{
        System.out.println("Please you have not purchase any goods from us, kindly purchase one. Thanks!");
        }*/
        
        
        
    /* System.out.println("Welcome to software company");
       double ratailsPackage = 99.0;
       System.out.println("Please enter your Quatity amount:  ");
       
       int Quatity = console.nextInt();
       
       if (Quatity>=10 & Quatity <= 19){
         System.out.println("you discount is 20%.  ");
           
         System.out.println("the total amount is " + (ratailsPackage*Quatity*0.2));
       }
       else if(Quatity>=20 & Quatity <= 49){
         System.out.println("you discount is 30%.  ");
           
         System.out.println("the total amount is $" + (ratailsPackage*Quatity*0.3));
       }
       else if(Quatity>=50 & Quatity <= 99){
         System.out.println("you discount is 40%.  ");
           
         System.out.println("the total amount is $" + (ratailsPackage*Quatity*0.4));
       }
         else if(Quatity>=100){
         System.out.println("you discount is 50%.  ");
           
         System.out.println("the total amount is $" + (ratailsPackage*Quatity*0.5));
       }
         else {
         System.out.println("you discount is 0%. ");
          System.out.println("the total amount is $" + (ratailsPackage*Quatity));
         }*/
        
                

                // arrays in java
            /*int[] arry={1,2,3,4,5};
            for (int i=0; i<5; ++i){
            System.out.println("Element in INDEX "+ i +" is "+  arry[i]);
            }
            int[] numbers= {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
            int sum = 0;
            double average;
            for(int num: numbers){
                sum +=num;
            }
            int arrayLenght=numbers.length;
            average=((double) sum/(double)arrayLenght);
            System.out.println("the sum =" +sum);
            System.out.println("the average =" + average);*/
            
        // find the largest element in an array
      /*  double[] numArray={23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
        double largest = numArray[0];
        for (double num: numArray){
        if(largest<num)
            largest = num;
        
        }
        System.out.format("Largest element = %.2f", largest);
            //adding two strings
            String[][] names ={
                {"MR", "MRS", "DR", "MIZZ"},
                {"QUDUS", "DANIEL", "ISEAC", "JELLIL"}
    };
             System.out.println();
            System.out.println(names[0][2] +" "+ names[1][1]);
            System.out.println(names[0][3] +" "+ names[1][0]);*/
    
        //adding of to two matrix
        /*    int rows = 2, columns=3;
            int[][] firstMatrix ={ {2, 3, 4}, {5, 2, 3} };
            int[][] secondMatrix ={{-4, 5, 3}, {5, 6, 3} };
            
            int[][] sumMatrix = new int[rows][columns];
            for(int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
            sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; 
            }
            }
            System.out.println("the sum of two natrix is ");
            for (int[]row : sumMatrix){
                for(int column: row){
                System.out.print(column  + " ");
                }
            System.out.println();
            }   */
        
        /*int r1=2, c1=3;
           int r2=3, c2=2;
           
           int[][] firstmat = {{3, -2, 5}, {3, 0, 4}};
           int[][] secondmat = {{2,3}, {-9, 0}, {0,4}};
           
           int[][] product = new int[r1][c2];
           
           for(int i=0; i<r1; i++){
           for(int j=0; j<c2; ++j){
           for(int k=0; k<c1; k++){
           product[i][j] = firstmat[i][k]*secondmat[k][j];
           }
           }
           }
           for(int row[] : product){
           for(int column : row){
               System.out.print(column + " ");
           
           }
           System.out.println();
           }*/
    
        // array copys
   /* int[] source= {1,2,3,4,5,6};
      int [] destination = new int[6];
      for (int i =0; i<source.length; i++){
      destination[i]=source[i];
      }
      System.out.println(Arrays.toString(destination));
      
      int[] a1={-2, 4,6,1,7,6};
      int[] a2= new int[5];
      
      int[] a3 = new int[a1.length];
      
      System.arraycopy(a1, 0, a3, 0, a1.length);
      System.out.println("the array =" + Arrays.toString(a3));
      System.arraycopy(a1, 1, a2, 2, 3);
      System.out.println("the array a2 = "+ Arrays.toString(a2));
      System.arraycopy(a3, 1, a2, 3, 2);
      System.out.println(Arrays.toString(a2));
      char[] O = {'a', 'b', 'c', 'd', 'e', 'f','g'};
      char[] N = new char[8];
      System.arraycopy(O, 1, N, 1, 7);
      //System.out.println(new String(N));*/
    
    /*   String message = "WELCOME TO JAVA!";
        System.out.println("the number of "+ message + "is " + message.length());
        System.out.println("the word in 10th position on the "+ message + "is " + message.charAt(9));
                
           String aString = "Yankari Games Reserve";
char aChar = aString.charAt(9);
System.out.println(aChar);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words with a space in between: ");
        String a= input.next();
        String b= input.next();
        String c= input.next();
        System.out.println(" 1st word = "+ a);
        System.out.println(" 2nd word = "+ b);
        System.out.println(" 3nd word = "+ c);
        
        System.out.println("Enter any 3 sentances and press enter after every one sentance: ");
        String g= input.nextLine();
        String h = input.nextLine();
        String j = input.nextLine();
        System.out.println("The first sentance is " + g);
        System.out.println("The second sentance is " + h);
        char ch = j.charAt(0);
        int nu = j.length();
        System.out.println("The third sentance is " + j + " and the firt car is " + ch + " with lenth " + nu);
        */
        
     // String manipulation
      /*  String ada = "You are very beautiful";
        String ada1 = ada.substring(4);
        System.out.println("Girls " + ada1);
        System.out.println(ada1.toUpperCase());
        String T = ada.substring(4, 12);
        String w = T.toUpperCase();
        
        System.out.println("GIRLS " + w + " "+ ada.substring(13));
        System.out.println(ada.indexOf("very"));
        System.out.println(ada.lastIndexOf("b"));
        
        String man= "Abdullahi Adebowale Adebisi";
         System.out.println(man.lastIndexOf("A"));
          System.out.println(man.contains("d"));*/
        
     
        
//        // TIME CALCULATOR
//     System.out.println("enter a number of seconds: ");
//     int sec = console.nextInt();
//     if (sec>= 60 && sec<3600){
//     System.out.println(sec/60 + " minutes " + sec%60 + " seconds ");
//     }
//     else if (sec>=3600 && sec<86400){  
//     int minutes = sec/60;
//     int hours = minutes/60;
//      System.out.println(hours + " hours " + minutes%60 + " minutes " + sec%60 + " seconds");
//     }
//     else if (sec<60){
//     System.out.println(sec + " seconds");
//     }
//     else{
//      int minutes = sec/60;
//     int hours = minutes/60;
//     int days = hours/24;
//     System.out.println(days + " days " + hours%24 + " hours " + minutes%60 + " minutes " + sec%60 + " seconds" );
//     }
//        
        // NOTE 5 QUESTIONS
       String raw = "One of Ten in Ten";
        int raw1 = raw.indexOf("e");
        String raw2 = raw.substring(0,9 );
        int raw21 = raw2.lastIndexOf('e');
        int raw3 = raw.lastIndexOf('e');
        System.out.print("the Index of 'e' in " + raw + " are: ");
        System.out.println(raw1 + " " + raw21 + " " + raw3 );
          System.out.println("===========================================\t\t" );
     /*   System.out.println("enter ANY number of seconds: ");
     long sec = console.nextLong();
     long minutes = sec/60;
     long hours = minutes/60;
     long days = hours/24;
     if (sec>= 60 && sec<3600){
     System.out.println(sec/60 + " minutes " + sec%60 + " seconds ");
     }
     else if (sec>=3600 && sec<86400){
    
      System.out.println(hours + " hours " + minutes%60 + " minutes " + sec%60 + " seconds");
     }
     else if (sec<60){
     System.out.println(sec + " seconds");
     }
     else{ 
     System.out.println(days + " days " + hours%60 + " hours " + minutes%60 + " minutes " + sec%60 + " seconds" );
     } */
          
//        int row = 2, column = 3;
// int[][] matrix = { {2, 3, 4}, {5, 6, 4} }; 
//
//    int[][] trans = new int[column][row];
//    
//    for (int i= 0; i<row ; i++){
//    for(int j=0; j<column; j++){trans[j][i]=matrix[i][j];}
//    }
//    display(matrix);
// display(trans);
// 
// 
//    char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
//   char[] copyTo = new char[4];
//   System.arraycopy(copyFrom, 5, copyTo, 0,4);
//   System.out.println(Arrays.toString(copyTo));
//System.out.println(new String(copyTo));	
//
//
//int r1 = 2, c1 = 3; 
//	int r2 = 3, c2 = 2; 
//		int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} }; 
//		int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} }; 
//	// Mutliplying Two matrices 
//	int[][] product = new int[r1][c2]; 
//	for(int i = 0; i < r1; i++) { 
//		for (int j = 0; j < c2; j++) { 
//			for (int k = 0; k < c1; k++) { 
//product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]; 
//	 } 
//  } 
//}
//// Displaying the result
//        System.out.println("Product of two matrices is: ");
//       for (int[] rows : product){
//       for (int columns : rows){
//       System.out.print(columns + " ");
//       }
//       System.out.println();
//       }

          try { 
int num = console.nextInt();
	if (num > 100) { 
		throw new Exception("Out of bound"); 
	}
} 
catch (InputMismatchException e){
	console.next();
System.out.println("Not an integer");
} 
catch (Exception e){
	System.out.println("Error: "+ e.getMessage());
} 
finally {
System.out.println("DONE");
}


 
  } 
    static void display(int[][] matrix){
        System.out.println("the matrix: ");
    for (int[] rows : matrix){
    for (int column : rows){System.out.print(column + " ");}
    System.out.println();
    }
    }

    
}
