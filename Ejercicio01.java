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

import java.util.Scanner;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public void sumarHoras(Hora otraHora) {
        this.horas += otraHora.horas;
        this.minutos += otraHora.minutos;
        this.segundos += otraHora.segundos;

        if (this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos++;
        }

        if (this.minutos >= 60) {
            this.minutos -= 60;
            this.horas++;
        }
    }
}



