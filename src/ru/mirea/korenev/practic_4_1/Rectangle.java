package ru.mirea.korenev.practic_4_1;

class Rectangle extends Shape{
    protected double width;

    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }

    @Override
    public double getArea() {
        double s = this.length * this.width;
        return s;
    }

    @Override
    public double getPerimeter() {
        double p = 2*(this.width + this.length);
        return p;
    }

}
