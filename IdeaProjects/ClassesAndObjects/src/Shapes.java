import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.lang.Math;
public class Shapes {

    static class Circle {
        double radius;
        double area;
        double pi = Math.PI;
        double circumference;
        public double PrintArea(double radius) {
            this.area = this.pi * Math.pow(radius, 2);
            return area;

        }
        public double PrintCircumference(double radius) {
            this.circumference = this.pi * 2 * radius;
            return circumference;
        }
    }
    static class Rectangle{
        double width;
        double length;
        double area;
        double perimeter;
        public double PrintArea(double width, double length){
            this.width = width;
            this.area = width*length;
            return area;
        }
        public double PrintPerim(double width, double length){
            this.perimeter = width*2+length*2;
            return perimeter;
        }
    }
    static class Trapezoid{
        double base1;
        double base2;
        double side1;
        double side2;
        double height;
        double area;
        double perimeter;
        public double PrintArea(double base1, double base2, double height){
            this.base1 = base1;
            this.area = ((base1+base2)/2) * height;
            return area;
        }
        public double PrintPerim(double base1, double base2, double side1, double side2){
            this.perimeter = base1+base2+side1+side2;
            return perimeter;
        }
        public double getSide1() {
            return base1;
        }
        public double setSide(double base1) {
            return base1;
        }
    }
    public static void main(String[] args){

        //Circle
        System.out.println("Type in the radius of your circle.");
        Scanner input = new Scanner(System.in);
        double radii = input.nextDouble();
        Circle circle1 = new Circle();
        double temp = circle1.PrintArea(radii);
        Circle circle2 = new Circle();
        double circum = circle2.PrintCircumference(radii);
        System.out.println("Area of your circle:");
        System.out.println(temp);
        System.out.println("Circumference of your circle:");
        System.out.println(circum);

        //Rectangle
        System.out.println("Type in the length of your rectangle.");
        double RectLength = input.nextDouble();
        System.out.println("Now type in the width.");
        double RectWidth = input.nextDouble();
        Rectangle rect1 = new Rectangle();
        double RectArea = rect1.PrintArea(RectWidth,RectLength);
        Rectangle rect2 = new Rectangle();
        double RectPerim = rect2.PrintPerim(RectWidth,RectLength);
        System.out.println("Area of your rectangle:");
        System.out.println(RectArea);
        System.out.println("Perimeter of your rectangle:");
        System.out.println(RectPerim);


        //Trapezoid
        System.out.println("Enter the top base, the bottom base, and the height of your trapezoid respectively. Press enter after each input.");
        double topBase = input.nextDouble();
        double bottomBase = input.nextDouble();
        double trapHeight = input.nextDouble();
        System.out.println("Now enter the two lengths of the sides for the perimeter. Press enter after each input.");
        double leftSide = input.nextDouble();
        double rightSide = input.nextDouble();
        Trapezoid trap1 = new Trapezoid();
        double TrapArea = trap1.PrintArea(topBase,bottomBase,trapHeight);
        Trapezoid trap2 = new Trapezoid();
        double TrapPerim = trap2.PrintPerim(topBase,bottomBase,leftSide,rightSide);
        System.out.println("Area of your trapezoid:");
        System.out.println(TrapArea);
        System.out.println("Perimeter of your trapezoid:");
        System.out.println(TrapPerim);
    }
}
