public class Main{
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[50];

        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            System.out.println("Ingrese los datos para el empleado " + (i + 1) + ":");
            empleados[i].leerDatos();
        }

        System.out.println("Datos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println("--------------------------");
        }
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
