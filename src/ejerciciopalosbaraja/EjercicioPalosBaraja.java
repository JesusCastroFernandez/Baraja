/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopalosbaraja;

/**
 *
 * @author JESUS
 */
public class EjercicioPalosBaraja {
    
    public enum PaloBaraja {OROS, COPAS, ESPADAS, BASTOS};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaloBaraja palo;
        
        System.out.println ("PALOS DE LA BARAJA ESPAÑOLA");
        System.out.println ("---------------------------");
        
        palo=PaloBaraja.OROS;
        System.out.println("Palo 1: " + palo);
        palo=PaloBaraja.COPAS;
        System.out.println("Palo 2: " + palo);
        palo=PaloBaraja.ESPADAS;
        System.out.println("Palo 3: " + palo);
        palo=PaloBaraja.BASTOS;
        System.out.println("Palo 4: " + palo);
    }
    
}
