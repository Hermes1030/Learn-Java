package test.exam02;
// package oop.test;
// import oop.core.Square;
// Come-true class.
public class SquareTest {
    public static void main(String[] args) {
        Square squ = new Square(3, 4);
        double area = squ.getArea();
        double peri = squ.getPerimeter();
        System.out.println("area = " + area + "  peri = " + peri);
    }
}
