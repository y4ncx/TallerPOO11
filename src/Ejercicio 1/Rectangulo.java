class Rectangulo extends Figura {
    
    double largo;
    double ancho;
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }


    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

}
