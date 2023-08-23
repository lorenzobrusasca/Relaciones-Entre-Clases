/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ej3;

import Entidad.baraja;

/**
 *
 * @author Lorenzo
 */
public class Ej3 {

    public static void main(String[] args) {
        
        baraja B = new baraja();
        
        System.out.println("Llena baraja");
        B.llenarBaraja();
        System.out.println("\nMuestra baraja");
        B.mostrarBaraja();
        System.out.println("\nBarajar");
        B.barajar();
        System.out.println("\nMuestra Baraja");
        B.mostrarBaraja();
        System.out.println("\nSiguiente Carta");
        B.siguienteCarta();
        B.cartasDisponibles();
        B.darCartas();
        B.cartasMonton();
        B.mostrarBarajaRest();
        
    }
}
