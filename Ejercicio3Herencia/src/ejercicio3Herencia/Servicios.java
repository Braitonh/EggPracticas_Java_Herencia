
package ejercicio3Herencia;

import java.util.Scanner;


public class Servicios {
    
    public void procesoPrincipal(){
        Scanner leer = new Scanner(System.in);
        String bandera ;
        do {
            System.out.println("Que figura desea crear circulo/rectangulo");
            String respuesta = leer.next();
            
            switch(respuesta.toLowerCase()){
                
                case "circulo":{
                    System.out.println("Ingrese el radio del circulo");
                    double radio = leer.nextDouble();
                    
                    Circulo figura = new Circulo(radio);
                    
                    figura.areaCirculo(radio);
                    figura.perimetroCirculo(radio);
                }break;
                
                case "rectangulo":{
                    System.out.println("Ingrese la base del rectangulo");
                    double base = leer.nextDouble();
                    
                    System.out.println("Ingrese la altura del rectangulo");
                    double altura = leer.nextDouble();
                    
                    Rectangulo figura = new Rectangulo(base,altura);
                    
                    figura.areaRectangulo(base, altura);
                    figura.perimetroRectangulo(base, altura);
                    
                }break;
                
                default:{
                    System.out.println("error de opcion");
                }break;
                
            }
            
            System.out.println("Desea crear otra figura SI/NO");
            bandera = leer.next();
            
        } while (bandera.equalsIgnoreCase("si"));
        
        
    }
    
    
}
