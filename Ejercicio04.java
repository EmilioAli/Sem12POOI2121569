public class Main{

    public static void main(String[] args) {
        Hora horaActual = new Hora(11, 20, 50);

        System.out.println("Hora actual:");
        horaActual.visualizar();

        horaActual.avanzar();
        System.out.println("Después de avanzar:");
        horaActual.visualizar();

        horaActual.ponerACero();
        System.out.println("Después de poner a cero:");
        horaActual.visualizar();
    }
}