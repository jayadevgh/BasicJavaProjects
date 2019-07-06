import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class Shapes2 {
    public static void RectanglePrism(double length, double width, double height){
        System.out.print("Volume of rectangular prism: ");
        System.out.println(length*width*height);
    }public static void Cube(double side){
        System.out.print("Volume of cube: ");
        System.out.println(Math.pow(side,3));
    }public static void Cylinder(double radius, double height){
        System.out.print("Volume of cylinder: ");
        System.out.println(Math.PI*Math.pow(radius,2)*height);
    }public static void Cone(double radius, double height) {
        System.out.print("Volume of cone: ");
        System.out.println(Math.PI * Math.pow(radius,2) * height/3);
    }public static void RectangularPyramid(double length, double width, double height){
        System.out.print("Volume of rectangular pyramid: ");
        System.out.println((length*width*height/3));
    }public static void Octahedron(double side){
        System.out.print("Volume of octahedron: ");
        System.out.println((Math.sqrt(2)/3)*Math.pow(side,3));
    }
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three side lengths of the rectangular prism.");
        double rectLength = input.nextDouble();
        double rectWidth = input.nextDouble();
        double rectHeight = input.nextDouble();
        RectanglePrism(rectLength,rectWidth,rectHeight);
        System.out.println("Enter the side length for the cube.");
        double cubeSide = input.nextDouble();
        Cube(cubeSide);
        System.out.println("Enter the radius and the height for the cylinder.");
        double cylinRadius = input.nextDouble();
        double cylinHeight = input.nextDouble();
        Cylinder(cylinRadius,cylinHeight);
        System.out.println("Enter the radius and the height for the cone.");
        double coneRadius = input.nextDouble();
        double coneHeight = input.nextDouble();
        Cone(coneRadius,coneHeight);
        System.out.println("Enter the three side lengths of the rectangular pyramid.");
        double pyLength = input.nextDouble();
        double pyWidth = input.nextDouble();
        double pyHeight = input.nextDouble();
        RectangularPyramid(pyLength,pyWidth,pyHeight);
        System.out.println("Enter the three side lengths of the rectangular prism.");
        double octaSide = input.nextDouble();
        Octahedron(octaSide);

         */
        Random rand1 = new Random();
        rand1.doubles();

    }
}
