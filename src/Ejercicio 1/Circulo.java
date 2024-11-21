class Circulo extends Figura {

    double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; 
    }

    public double getRadio() {
        return radio;
    }
    
}