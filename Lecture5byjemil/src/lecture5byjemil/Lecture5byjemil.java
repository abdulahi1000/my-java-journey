package lecture5byjemil;
import java.util.*; 
public class Lecture5byjemil {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  emi = new Scanner (System.in);
        
        int [] age = new int [5];
        String [] mad = new String [10];
        mad[0] = "shola";
        mad[1] = "tope";
        mad[2] = "tayo";
        // or like this 
        String[] mad1 ={"shola", "ade","ore", "maLIQ", "faruq", "faruq","faruq","faruq","faruq",};
        System.out.println( "this is the result for mad1 variable " + mad1[7] );
        System.out.println("and this is for " +mad[1] +" " + mad1[5]);
        
        int[] game ={ 2,34,5,6,4,45,6,67,89};
        for(int a=0;a<9; a++){
        System.out.println("element at index " + a +":  " + game[a]);
       }
         int[] gam ={ 2,34,5,6,4,45,6,67,89};
         double sum =0;
          for (int hum : gam){
              sum+=hum;
          }
        double jummy=gam.length;
        double average=sum /jummy;
        System.out.println(average);
        
    }
    
}
