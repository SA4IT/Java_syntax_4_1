package ru.mirea.korenev.practic_4_1;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
       double s = 3.14 * Math.pow(this.radius,2);
       return s;
    }

    @Override
    public double getPerimeter() {
       double p = 2 * 3.14 * this.radius;
       return p;
    }
}
