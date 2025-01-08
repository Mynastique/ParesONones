import java.util.Random;
import java.util.Scanner;
// class debe corresponder con el nombre ParesONones.java de arriba
public class ParesONones {

    public static void main (String[] args) {
        // Variable R para generar valores aleatorios
        Random r = new Random();
        // el rango incluido es 1 y 2, 3 excluido
        int ordenador = r.nextInt(1, 3);
        // para seguir el bucle si da error
        Scanner s = new Scanner(System.in);
        // Variable para almacenar el número del jugador
        int numero = 0;
        // Booleano para el valor del número (si es mayor de 2)
        boolean datoValido = false;
        // bucle para forzar introducir número válido (antes salía a código 0)
        while (!datoValido) {
            System.out.println("¿1 o 2?");
            String jugador = s.next();
            // para comprobar si es 1 o 2
            if (!jugador.equals("1") && !jugador.equals("2")) {
                System.err.println("Introduce solo los números 1 o 2");
                // esta impresión de error hace salir del bucle, recuperamos con while
            } else {
            // lo introducido por teclado (si es correcto) pasa de str a int
            numero = Integer.parseInt(jugador);
            datoValido = true;
        }
    }
    // una vez tenemos un número válido, se realiza la operación
        int suma = ordenador + numero;
        if (suma %2 == 0) {
                System.out.println("¡Pares!");
            } else {
                System.out.println("¡Nones!");
            }
        System.out.println("El ordenador dijo " + ordenador + " y el jugador " + numero);
        s.close();
    }
}