package Ejemplo1;

// Definición de una clase derivada
public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
