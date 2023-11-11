public class Main{
    public static void main(String[] args) {
        Hora hora1 = new Hora(5, 30, 45);
        Hora hora2 = new Hora(3, 15, 20);
        Hora resultado = new Hora();

        System.out.println("Hora 1:");
        hora1.mostrarHora();

        System.out.println("Hora 2:");
        hora2.mostrarHora();

        resultado.sumarHoras(hora1);
        resultado.sumarHoras(hora2);

        System.out.println("Resultado de la suma:");
        resultado.mostrarHora();
        
    }
}





