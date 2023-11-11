public class Main{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();

        empleado1.leerDatos();
        empleado1.verDatos();
    }
}

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;


    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese el número de empleado:");
        this.numeroEmpleado = scanner.nextInt();
    }

    public void verDatos() {
        System.out.println("Datos del empleado:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número de empleado: " + this.numeroEmpleado);
    }
}
