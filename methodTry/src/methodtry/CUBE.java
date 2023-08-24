
package methodtry;
public class CUBE {
    int length;
    int height;
    int breath;
    public int getVolume(){
    return(length* height * breath);
    }
    CUBE(int l, int h, int b){
    System.out.println("we are in 1ST contructor");
    
     length = l;
    height = h;
    breath = b;
    
    }
   CUBE(){
        System.out.println("we are in 2ND contructor");
    length = 20;
    height = 10;
    breath = 5;
   }
}
