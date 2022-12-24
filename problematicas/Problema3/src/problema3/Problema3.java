/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author Richa
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fa = 20;
        double ce = 0;
        int contador;
        String cadena = "";
        cadena = cadena + "F°\tC°\n";

        for (contador = 1; contador <= 20; contador ++) {
            ce = (fa - 32) * 5/9;
            cadena = String.format("%s%.2f\t%.2f\n", 
                    cadena,
                    fa, 
                    ce);
            
            fa += 4;
        }
        System.out.println(cadena);
    }
    
}
