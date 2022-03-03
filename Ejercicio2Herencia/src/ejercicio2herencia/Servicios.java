
package ejercicio2herencia;

import java.util.ArrayList;
import java.util.Scanner;


public class Servicios {
    
    private ArrayList<Electrodomestico> electrodomestico;

    public Servicios() {
        electrodomestico = new ArrayList<>();
    }

    public ArrayList<Electrodomestico> getElectrodomestico() {
        return electrodomestico;
    }

    public void setElectrodomestico(ArrayList<Electrodomestico> electrodomestico) {
        this.electrodomestico = electrodomestico;
    }
    
    public void creacionElectrodomestico(){
        Scanner leer = new Scanner (System.in);
        String bandera;
        do {
            
            System.out.println("Quiere crear un Televisor o una Lavadora");
            String respuesta = leer.next();
            
            switch(respuesta.toLowerCase()){
                
                case "televisor":{
                    Televisor televisor = new Televisor();
                    televisor.crearTelevisor();
                    
                    televisor.mostrarProducto();
                    electrodomestico.add(televisor);
                }break;
                
                case "lavadora":{
                    Lavadora lavadora = new Lavadora();
                    lavadora.crearLavadora();
                    
                    lavadora.mostrarProducto();
                    electrodomestico.add(lavadora);
                }break;
                
                default:{
                    System.out.println("Erro de opcion");
                }break;
                
            }

            System.out.println("Quiere crear otro electrodomestico?");
            bandera = leer.next();
            System.out.println();
            
            
        } while (bandera.equalsIgnoreCase("si"));
        
        
    }
    
    public void mostrarTodosLosProductos(){
        System.out.println();
        for (Electrodomestico electrodomestico1 : electrodomestico) {
            System.out.println(electrodomestico1);
        }
    }
    
    public void precioTotal(){
        
        int precioTotal=0;
        for (Electrodomestico electrodomestico1 : electrodomestico) {
            
            precioTotal += electrodomestico1.getPrecio();
        }
        System.out.println();
        System.out.println("El precio total de todos los electrodomestico es: " + precioTotal);
    }
    
    

   
    
    
    
    
}
