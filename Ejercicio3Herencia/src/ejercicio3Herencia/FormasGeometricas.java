
package ejercicio3Herencia;


public class FormasGeometricas implements calculoFormas{

    public FormasGeometricas() {
    }

     @Override
    public void areaCirculo(double radio) {
        double area = PI * Math.pow(radio, 2);
         System.out.println("El area del circulo: " + area);
    }

    @Override
    public void areaRectangulo(double base, double altura) {
        double area = base * altura;
        System.out.println("El area del rectangulo: " + area );
    }

    @Override
    public void perimetroCirculo(double diametro) {
        double perimetro = PI * diametro;
        System.out.println("El perimetro del circulo: " + perimetro);
    }

    @Override
    public void perimetroRectangulo(double base, double altura) {
        double perimetro = (base + altura)*2;
        System.out.println("El perimetro del rectangulo: " + perimetro);
    }
    
}
