package Liskov;

public abstract class FiguraBase {
    private double tamanhoDoLado;
    private double area;
    
    //Construtor
    public FiguraBase(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
        CalcularArea();
    }

    //Metodos
    public abstract void CalcularArea();
    
    //GSetters
    public double getTamanhoDoLado() {
        return this.tamanhoDoLado;
    }

    public void setTamanhoDoLado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Tamanho do Lado: "+this.getTamanhoDoLado() + ", ";
    } 
}
