public abstract class Empleado {
    int id;
    String nombre;
    String apellido;
    int horasTrabajo;
    
    public Empleado(int id, String nombre, String apellido, int horasTrabajo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasTrabajo = horasTrabajo;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Identificacion: " + id + "\n" +
        "Nombre: " + nombre + "\n" + 
        "Apellido: " + apellido + "\n" +
        "Horas trabajadas: " + horasTrabajo + "\n" + 
        "Salario: " + calcularSalario());
    }
}



