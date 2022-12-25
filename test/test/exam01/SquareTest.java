// Come-true class
package test.exam01;

// package oop.test;
// import oop.core.Square;
public class SquareTest {
    public static void main(String[] args) {
        Square squ = new Square(3, 4);
        double area = squ.getArea();
        double peri = squ.getPerimeter();
        System.out.println("area = " + area + "  peri = " + peri);
        System.out.println(squ.height);
        System.out.println(squ.width);

    }
}
