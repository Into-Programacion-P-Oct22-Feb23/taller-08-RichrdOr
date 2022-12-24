/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Richa
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreJugador;
        String posicionJugador;
        int numero;
        int contador;
        int promedioEdad = 0;
        int edad;
        double estatura;
        double promedioEstatura = 0;
        String mensaje = "";

        System.out.println("Ingrese la cantidad de jugadoresque ingresara: ");
        numero = entrada.nextInt();

        for (contador = 1; contador <= numero; contador++) {
            entrada.nextLine();

            System.out.println("Ingrese el nombre del jugador:");
            nombreJugador = entrada.nextLine();

            System.out.println("Ingrese la posicion de juego del jugador:");
            posicionJugador = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            promedioEdad = promedioEdad + edad;
            promedioEstatura = promedioEstatura + estatura;
            mensaje = String.format("""
                                    %s%d. %s -%s-, edad %d, estatura %.2f
                                    """,
                    mensaje, contador, nombreJugador, posicionJugador, edad,
                    estatura);
        }
        promedioEstatura = promedioEstatura / numero;
        promedioEdad = promedioEdad / numero;
        System.out.printf("Listado de edades.%s\nPromedio de edades:%s "
                + "Promedio de estaturas:%.2f",
                mensaje,
                promedioEdad,
                promedioEstatura);
    }

}
