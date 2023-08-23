/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class juego {
    
    ArrayList <jugador> jugadores = new ArrayList<>();
    revolverDeAgua R = new revolverDeAgua();
    Scanner leer = new Scanner(System.in);
    
   

    @Override
    public String toString() {
        return "juego{" + "jugadores=" + jugadores + ", R=" + R + ", leer=" + leer + '}';
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public revolverDeAgua getR() {
        return R;
    }

    public void setR(revolverDeAgua R) {
        this.R = R;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public juego() {
    }
    
    //---------------METODOS+-----------------
    
    public void agregarJugadores()
   {
       jugador J1 = new jugador(1, "Lorenzo 1", false);
       jugador J2 = new jugador(2, "Florencia 2", false);
       jugador J3 = new jugador(3, "Thiago 3", false);
       jugador J4 = new jugador(4, "Olivita 4", false);
       jugador J5 = new jugador(5, "Toribio 5", false);
       jugador J6 = new jugador(6, "Rochi 6", false);
       
       System.out.println("Indique cuántos jugadores desea agregar del 1 al 6:");
       int opc = leer.nextInt();
       
       switch(opc)
       {
           case 1: jugadores.add(J1);
           break;
           case 2: jugadores.add(J1);
                    jugadores.add(J2);
           break;
           case 3: jugadores.add(J1);
                    jugadores.add(J2);
                    jugadores.add(J3);
           break;
           case 4: jugadores.add(J1);
                    jugadores.add(J2);
                    jugadores.add(J3);
                    jugadores.add(J4);
           break;
           case 5: jugadores.add(J1);
                    jugadores.add(J2);
                    jugadores.add(J3);
                    jugadores.add(J4);
                    jugadores.add(J5);
           break;
           case 6:  jugadores.add(J1);
                    jugadores.add(J2);
                    jugadores.add(J3);
                    jugadores.add(J4);
                    jugadores.add(J5);
                    jugadores.add(J6);
            break;
           default: System.out.println("Ingresó una opción incorrecta");
                      
       }
       
   }
    
   public void ronda()
   {
      R.llenarRevolver();
      
       System.out.println(R.toString());
      
       for (jugador aux : jugadores) {
           
           aux.disparo(R);
           
           System.out.println("Disparo: "+R.toString());
           
           if (aux.disparo(R)==true) {
               System.out.println("El jugador "+aux.getNombre()+" quedó mojado");
               break;
           }
           else {System.out.println("El jugador "+aux.getNombre()+ " se salvó");}
           
           R.siguienteChorro();
           
       }
   
   
   }
    
    
    
}
