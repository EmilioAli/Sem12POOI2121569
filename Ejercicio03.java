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