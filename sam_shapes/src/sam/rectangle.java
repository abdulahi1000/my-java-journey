
package sam;

public class rectangle extends Sam {
    
    private double length;
    private double  breadth;
    private double perimeter;
    private double area;
    
    rectangle (double l, double b){
    this.breadth = b;
    this.length =l;
    }

    rectangle(double d) {
        
    }

    
    @Override
    public void getperimeter() {
        perimeter = 2 * (breadth*length);
        System.out.println("perimeter of a rectangle is :" + perimeter);
    }

    @Override
    public void getarea() {
        area = (breadth*length);
        System.out.println("area of a rectangle is :" + area);
        
    }
    
}

