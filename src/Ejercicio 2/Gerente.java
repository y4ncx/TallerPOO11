class Gerente extends Empleado {

    double salarioBase;


    public Gerente(int id, String nombre, String apellido, int horasTrabajo, double salarioBase) {
        super(id, nombre, apellido, horasTrabajo);
        this.salarioBase = salarioBase;
    }


    @Override
    public double calcularSalario() {

        return salarioBase;
    }
}