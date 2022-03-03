
package ejercicio3Herencia;


public class Circulo extends FormasGeometricas{
    
    
    private double radio;

    public Circulo() {
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
