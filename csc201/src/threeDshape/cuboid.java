/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeDshape;

/**
 *
 * @author OPEYEMI
 */
public class cuboid extends ThreeDShape {
    private double perimeter;
    private double Length;
    private double Width;
    private double Height;
    private double volume;
    private double area;
    
    cuboid(double a, double b, double c){
        this.Length = a;
        this.Width = b;
        this.Height = c;
    }
    
    @Override
    public void getvolume() {
      volume = (Length*Width*Height);
       System.out.println("the volume of cuboid = " + volume);
    }

    @Override
    public void getPerimeter() {
        perimeter =( 4*(Length+(2*Width)+Height));
        System.out.println("the perimeter of cuboid = " + perimeter);
    }

    @Override
    public void getarea() {
     area = (2*((Length*Width) + (Width*Height) + (Length*Height)));
     System.out.println("the AREA of cuboid = " + area);
    }
    
}
