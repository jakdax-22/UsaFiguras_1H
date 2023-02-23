
package poligonoH;


public abstract class Poligono {
    protected String color;
    public Poligono() {
        this.color = "verde";
    }
    abstract public String Hola();
    public Poligono (String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    
    
}
