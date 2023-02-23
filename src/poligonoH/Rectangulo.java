/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonoH;

/**
 *
 * @author enriq
 */
public class Rectangulo extends Poligono {
//Atributos
    private double base;
    private double  altura;
//Métodos
    public Rectangulo ( ){
      base=5;
      altura=4;
    }
    
    
    public Rectangulo(double ba , double alt) {
        this.base=ba;
        this.altura=alt;
    }

    public Rectangulo(double base) {
        this.base = base;
    }   
    public Rectangulo (double ba, double alt, String color){
        super(color);
        this.base=ba;
        this.altura=alt;
    }
    
    public String Hola(){
        return "Hola";
    }
//Getter Setter

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
//toString

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
//Métodos propios
  public double calcArea (){
      double area = this.base * this.altura;
      return area;
  }  
  public double calcPer () {
    double perimetro = this.base * 2 + this.altura * 2;
    return perimetro;
  }
  
}
