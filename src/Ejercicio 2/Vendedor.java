class Vendedor extends Empleado {

    double comisionPorVenta;
    int numeroVentas;


    public Vendedor(int id, String nombre, String apellido, int horasTrabajo, double comisionPorVenta, int numeroVentas) {
        super(id, nombre, apellido, horasTrabajo);
        this.comisionPorVenta = comisionPorVenta;
        this.numeroVentas = numeroVentas;
    }


    @Override
    public double calcularSalario() {

        return comisionPorVenta * numeroVentas;
    }
}