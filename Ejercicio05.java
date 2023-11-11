public class Main{
    public static void main(String[] args) {
        Cadena miCadena = new Cadena("Lista de Ejercicios");
        
        miCadena.visualizar();
        
        int indice = 3;
        char caracterEnPosicion = miCadena.caracter(indice);

        if (caracterEnPosicion != -1) {
            System.out.println("Carácter en la posición " + indice + ": " + caracterEnPosicion);
        } else {
            System.out.println("La posición " + indice + " está fuera del rango.");
        }
    }
}

public class Cadena {
    private int longitud;
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
        this.longitud = cadena.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public char caracter(int i) {
        if (i >= 0 && i < longitud) {
            return cadena.charAt(i);
        } else {
            return (char) -1;
        }
    }

    public void visualizar() {
        System.out.println("Cadena: " + cadena);
        System.out.println("Longitud: " + longitud);
    }
}
