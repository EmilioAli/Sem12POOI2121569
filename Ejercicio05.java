public class Main{
    public static void main(String[] args) {
        // Crear un objeto de la clase Cadena
        Cadena miCadena = new Cadena("Lista de Ejercicios");

        // Visualizar la cadena y su longitud
        miCadena.visualizar();

        // Obtener y visualizar un carácter en una posición específica
        int indice = 3;
        char caracterEnPosicion = miCadena.caracter(indice);

        if (caracterEnPosicion != -1) {
            System.out.println("Carácter en la posición " + indice + ": " + caracterEnPosicion);
        } else {
            System.out.println("La posición " + indice + " está fuera del rango.");
        }
    }
}