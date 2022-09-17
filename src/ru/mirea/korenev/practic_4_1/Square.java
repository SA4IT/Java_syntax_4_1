package ru.mirea.korenev.practic_4_1;

class Square extends Rectangle{
    protected double side;
    public Square(){
        this.side = 0;
    }
    public Square(double side_temp){
        this.side = side_temp;
    }
    public Square(double width_temp, double length, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = width_temp;
        this.length = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
}
