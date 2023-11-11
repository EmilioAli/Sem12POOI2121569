public class Main {
    public static void main(String[] args) {
        EmpleadoLaboratorio empleado1 = new EmpleadoLaboratorio("Ana", 3000, "Investigación");
        RepresentanteVentas empleado2 = new RepresentanteVentas("Carlos", 2500, "Zona B");
        GerenteFarmacia empleado3 = new GerenteFarmacia("Laura", 5000, "Ventas");

        SupervisorEmpleado supervisor = new SupervisorEmpleado();
        DepartamentoRecursosHumanos rrhh = new DepartamentoRecursosHumanos();
        SUNAT sunat = new SUNAT();

        supervisor.accederInformacionEmpleado(empleado1);
        rrhh.accederInformacionEmpleado(empleado2);
        sunat.accederInformacionEmpleado(empleado3);
    }
  }

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void despedir() {
        System.out.println("El empleado " + nombre + " ha sido despedido.");
    }

    public void promover() {
        System.out.println("El empleado " + nombre + " ha sido promovido.");
    }

    public void darDeAlta() {
        System.out.println("El empleado " + nombre + " ha sido dado de alta.");
    }

    public void jubilar() {
        System.out.println("El empleado " + nombre + " se ha jubilado.");
    }

    public void calcularAumentoSalarial(double porcentaje) {
        salario += salario * (porcentaje / 100);
        System.out.println("Aumento salarial aplicado a " + nombre + ": " + porcentaje + "%");
    }

    public double calcularPrima() {
        return 0.0;
    }
}

public class EmpleadoLaboratorio extends Empleado {
    private String area;

    public EmpleadoLaboratorio(String nombre, double salario, String area) {
        super(nombre, salario);
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        return salario + calcularPrima();
    }

    @Override
    public double calcularPrima() {
        return area.equals("Investigación") ? salario * 0.15 : 0.0;
    }
}

public class RepresentanteVentas extends Empleado {
    private String zonaVentas;

    public RepresentanteVentas(String nombre, double salario, String zonaVentas) {
        super(nombre, salario);
        this.zonaVentas = zonaVentas;
    }

    @Override
    public double calcularSalario() {
        return salario + calcularPrima();
    }

    @Override
    public double calcularPrima() {
        return zonaVentas.equals("Zona A") ? salario * 0.1 : 0.0;
    }
}

public class GerenteFarmacia extends Empleado {
    private String departamento;

    public GerenteFarmacia(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario() {
        return salario + calcularPrima();
    }

    @Override
    public double calcularPrima() {
        return departamento.equals("Ventas") ? salario * 0.2 : 0.0;
    }
}

public class SupervisorEmpleado {
    public void accederInformacionEmpleado(Empleado empleado) {
        System.out.println("Acceso como supervisor: " + empleado.nombre);
        System.out.println("Salario: " + empleado.calcularSalario());
    }
}

public class DepartamentoRecursosHumanos {
    public void accederInformacionEmpleado(Empleado empleado) {
        System.out.println("Acceso desde RRHH: " + empleado.nombre);
        System.out.println("Salario: " + empleado.calcularSalario());
    }
}

public class SUNAT {
    public void accederInformacionEmpleado(Empleado empleado) {
        System.out.println("Acceso desde SUNAT: " + empleado.nombre);
        System.out.println("Salario: " + empleado.calcularSalario());
    }
}
