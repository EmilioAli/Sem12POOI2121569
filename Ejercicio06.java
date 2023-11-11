import java.util.ArrayList;
import java.util.List;

class LAN {
    private List<Nodo> nodos;
    private String topologia;
    private int tamanoPaquete;

    public LAN() {
        nodos = new ArrayList<>();
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void quitarNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public void configurarRed(String topologia) {
        this.topologia = topologia;
    }

    public void especificarTamanoPaquete(int tamano) {
        this.tamanoPaquete = tamano;
    }

    public List<Nodo> enumerarNodos() {
        return nodos;
    }

    public void enviarPaquete(Nodo origen, Nodo destino, String mensaje) {
        System.out.println("Enviando paquete desde " + origen.getNombre() +
                " a " + destino.getNombre() + ": " + mensaje);
    }

    public void difundirPaquete(Nodo origen, String mensaje) {

        System.out.println("Difundiendo paquete desde " + origen.getNombre() +
                " a todos los nodos: " + mensaje);
    }

    public void realizarEstadisticas() {
        System.out.println("Realizando estadísticas de la LAN");
    }
}

class Nodo {
    private String nombre;
    private String tipo;

    public Nodo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}

public class Main {
    public static void main(String[] args) {
        LAN red = new LAN();

        Nodo nodo1 = new Nodo("PC1", "Computadora");
        Nodo nodo2 = new Nodo("Impresora1", "Impresora");

        red.agregarNodo(nodo1);
        red.agregarNodo(nodo2);

        red.enumerarNodos().forEach(nodo -> System.out.println("Nodo: " + nodo.getNombre()));

        red.enviarPaquete(nodo1, nodo2, "Enviado con exito");

        red.realizarEstadisticas();
    }
}