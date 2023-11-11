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

