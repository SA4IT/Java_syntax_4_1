package ru.mirea.korenev.practic_4_1;

public abstract class Shape {
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        this.color = "noun";
        this.filled = false;
    }
    protected String color;
    protected boolean filled;

   public  String getColor(){
       return  color;
   };
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
       return filled;
    }
    abstract double getArea();
    abstract double getPerimeter();


}
