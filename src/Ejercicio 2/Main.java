class Main {

    public static void main(String[] args) {

        Empleado gerente = new Gerente(33012, "Wilson", "Perez", 150, 30000000.00);
        Empleado vendedor = new Vendedor(50020,"David", "Luna", 145, 3500000, 200);


        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();

        System.out.println("Detalles del Vendedor:");
        vendedor.mostrarDetalles();
    }
}
