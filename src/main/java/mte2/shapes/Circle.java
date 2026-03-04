// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Circle.java
package mte2.shapes;

 public class Circle implements Shape {
    
     private final double radius;
    
     public Circle(double radius) {    this.radius = radius;    }

     double pi = 3.141;
       
    

     @Override
     public double area(){
            return pi * radius * radius;
        }
     @Override
     public double perimeter(){
        return 2 * pi * radius;

    //@Override
    //public String toString() {
    //    return "" + radius + " " + perimeter;
    //}
     }

    public static void main(String[] args) {
        Circle c = new Circle(5);
     System.out.println(c);

    }
}
