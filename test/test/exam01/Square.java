package test.exam01;
// package oop.core

public class Square extends Shapes {
    public Square(int width, int height){
        super(width, height);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width+this.height);
    }

}
