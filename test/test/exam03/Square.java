package test.exam03;
// package oop.haut
public class Square implements Shape {
    public float w;
    public float h;

    public Square(int w,int h){
        this.w = w;
        this.h = h;
    }

    @Override
    public float getA() {
        return this.w*this.h;
    }

    @Override
    public float getP() {
        return 2*(this.w+this.h);
    }
}
