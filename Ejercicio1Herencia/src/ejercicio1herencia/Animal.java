
package ejercicio1herencia;


public class Animal {
    
    protected String nombre, raza, alimento;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, String raza, String alimento, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void Alimentarse (){
        System.out.println("El animal " + raza + " se alimenta de " + alimento );
    }
    
}

//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
//Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá
//mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
//una clase Main que realice lo siguiente:
