package test.exam01;
// package oop.core.base;

public abstract class Shapes {
    public int width;
    public int height;
    public Shapes(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}
