public class Main {
    
    public static void main(String[] args) {

        Figura circulo = new Circulo(2);

        Figura rectangulo = new Rectangulo(33, 12);

        System.out.println("El area del círculo es: " + circulo.calcularArea());
        System.out.println("El area del rectángulo es: " + rectangulo.calcularArea());
    }

}