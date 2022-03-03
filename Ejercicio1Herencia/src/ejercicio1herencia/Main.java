
package ejercicio1herencia;


public class Main {

   
    public static void main(String[] args) {
        
        Animal perro = new Animal("pedro", "caniche", "pollo", 10);
        perro.Alimentarse();
        
        Perro perro1 = new Perro("oscar", "salchicha", "humano", 15);
        perro1.Alimentarse();
        
        Gato gato = new Gato("michi", "egipcio", "pescado", 100);
        gato.Alimentarse();
        
        Caballo caballo = new Caballo("philips", "real", "sal", 500);
        caballo.Alimentarse();
        
    }
    
}
