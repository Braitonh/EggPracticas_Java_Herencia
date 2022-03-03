package ejercicio2herencia;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, int peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        Scanner leer = new Scanner(System.in);

        super.crearElectrodomestico();
        System.out.println("ingrese la carga de la lavadora");
        this.carga = leer.nextInt();

    }

    @Override
    public void precioFinal() {

        super.precioFinal();
        
        if (carga > 30) {
            precio += 500;
        }

    }

    public void mostrarProducto() {
        precioFinal();
        System.out.println("Producto: Lavadora");
        System.out.println("Precio: " + precio + "$");
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Color: " + color);
        System.out.println("Consumo: " + consumoEnergetico);
        System.out.println("Carga: " + carga + " Kg");
    }

}
