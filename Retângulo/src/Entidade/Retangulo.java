package Entidade;
import java.lang.Math;


public class Retangulo{
    private double width;
    private double height;
    
   
    public Retangulo() {
    }

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeigth(double height){
        this.height = height;
    }
    public double area(){
        return width * height;
    }
    public double perimetro(){
        return width + width + height + height;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));
    }
}