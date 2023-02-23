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
public class Circulo extends Poligono {
    //Atributos
    private double radio;
    private final double PI = Math.PI;
    //Métodos
    public Circulo() {
        this.radio=4.3;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }  
    public Circulo (double radio, String color){
        super(color);
        this.radio=radio;
    }    
    @Override
     public String Hola(){
     return "Hola";
    }
    // Getter

    public double getPI() {
        return PI;
    }

    public double getRadio() {
        return radio;
    }
    
    //Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Métodos propios
    
    public double calcLon ( ){
         double lon = 2 * PI * radio;
         return lon;
    }
    
    public double calcVol ( ){
         double vol =  (4/3)* PI * (Math.pow(radio, PI));
         return vol;
    }    
    
    public double calcArea ( ){
         double area = PI * (Math.pow(radio, 2));
         return area;
    }

    
    
    
}
