
package assignment;
                                                                       
public class rectangle extends shape {
    private double length;
    private double breadth;
    private double perimeter;
    private double area;
    
    
    rectangle(double l, double b){
    this.breadth = b;
    this.length = l;
    }

    @Override
    public void getPerimeter() {
       perimeter = 2*(breadth*length);
       System.out.println("perimeter of rectangle is :" + perimeter );
    }

    @Override
    public void getarea() {
    area = (breadth*length);
       System.out.println("area of rectangle is :" + area );
    }
    
}
