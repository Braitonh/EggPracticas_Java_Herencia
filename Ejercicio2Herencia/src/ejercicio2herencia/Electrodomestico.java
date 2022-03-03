package ejercicio2herencia;

import java.util.Scanner;

public class Electrodomestico {

    protected int precio, peso;
    protected String color;
    protected char consumoEnergetico;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, int peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void comprobarConsumoEnergetico(char letra) {

        Character.toLowerCase(letra);

        switch (letra) {

            case 'a': {
                System.out.println("LETRA VALIDA");
            }
            break;

            case 'b': {
                System.out.println("LETRA VALIDA");
            }
            break;

            case 'c': {
                System.out.println("LETRA VALIDA");
            }
            break;

            case 'd': {
                System.out.println("LETRA VALIDA");
            }
            break;

            case 'e': {
                System.out.println("LETRA VALIDA");
            }
            break;

            case 'f': {
                System.out.println("LETRA VALIDA");
            }
            break;

            default: {
                
                
                this.consumoEnergetico = 'f';
                System.out.println("Letra por defecto " + this.consumoEnergetico);
            }
            break;

        }

    }

    public void comprobarColor(String color) {

        color.toLowerCase();

        switch (this.color) {

            case "blanco": {
                System.out.println("COLOR VALIDO");
            }
            break;

            case "negro": {
                System.out.println("COLOR VALIDO");
            }
            break;

            case "rojo": {
                System.out.println("COLOR VALIDO");
            }
            break;

            case "azul": {
                System.out.println("COLOR VALIDO");
            }
            break;

            case "gris": {
                System.out.println("COLOR VALIDO");
            }
            break;

            default: {
                System.out.println("Color por default blanco");
                this.color = "blanco";
            }
            break;
        }

    }

    public void crearElectrodomestico() {
        // Metodo crearElectrodomestico(): le pide la información al usuario y llena el
        //electrodoméstico, también llama los métodos para comprobar el color y el
        //consumo. Al precio se le da un valor base de $1000.

        Scanner leer = new Scanner(System.in);
        
        this.precio = 1000;

        System.out.println("ingrese el peso del electrodomestico");
        this.peso = leer.nextInt();

        System.out.println("ingrese el color del electrodomestico");
        this.color = leer.next();
        comprobarColor(color);

        System.out.println("ingrese el consumo electrico del electrodomestico");
        this.consumoEnergetico = leer.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
        

    }

    public void precioFinal() {

        switch (consumoEnergetico) {
            
            case 'a': {
                this.precio+=1000;
            }
            break;

            case 'b': {
                this.precio+=800;
            }
            break;

            case 'c': {
                this.precio+=600;
            }
            break;

            case 'd': {
                this.precio+=500;
            }
            break;

            case 'e': {
                this.precio+=300;
            }
            break;

            case 'f': {
                this.precio+=100;
            }
            break;

        }
        
        if(peso>=1 && peso<=19){
            this.precio+=100;
        }else{
            if(peso>=20 && peso<=49){
                this.precio+=500;
            }else{
                if(peso>=50 && peso<=79){
                    this.precio+=800;
                }else{
                    if(peso>=80){
                        this.precio+=1000;
                    }
                }
            }
        }
        
        

    }

    @Override
    public String toString() {
        return "Producto: " + getClass() + " PrecioFinal: " + precio + " Color: " + color + " Consumo: " + consumoEnergetico + " Peso: " + peso;
    }
    
    

}
