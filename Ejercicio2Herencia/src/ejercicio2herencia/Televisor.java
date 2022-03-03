
package ejercicio2herencia;

import java.util.Scanner;


public class Televisor extends Electrodomestico{
    
    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, int precio, int peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        
        super.crearElectrodomestico();
        
        System.out.println("ingrese la resolucion del televisor");
        this.resolucion = leer.nextDouble();
        
        System.out.println("tiene sintonizador SI/NO");
        String respuesta = leer.next();
        
        if(respuesta.equalsIgnoreCase("si")){
            this.sintonizadorTDT = true;
        }else{
            this.sintonizadorTDT = false;
        }
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if(resolucion>40){
            precio +=   precio*0.3;
        }
        
        if(sintonizadorTDT==true){
            precio += 500;
        }
    }
    
     public void mostrarProducto(){
        precioFinal();
         System.out.println("Producto: Televisor");
        System.out.println("Precio: " + precio + "$");
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Color: " + color);
        System.out.println("Consumo: " + consumoEnergetico);
        System.out.println("resolucion: " + resolucion + " pulgadas");
    }
    
}
