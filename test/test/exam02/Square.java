package test.exam02;
// package oop.core

public class Square implements Shapes{
    public double width;
    public double height;

    public Square(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.height+this.width)*2;
    }
}
