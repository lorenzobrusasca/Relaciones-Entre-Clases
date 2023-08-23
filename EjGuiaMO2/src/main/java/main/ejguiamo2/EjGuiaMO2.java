/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejguiamo2;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
/*Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.*/

public class EjGuiaMO2 {

    public static void main(String[] args) {
        
        ArrayList <Jugador> listaJug = new ArrayList<>();
        Equipo E = new Equipo();
        Jugador J1 = new Jugador("Lorenzo", "Brusasca", "Defensor", 4);
        Jugador J2 = new Jugador("Elena", "González", "Delantero", 10);
        Jugador J3 = new Jugador("Carlos", "Martínez", "Centrocampista", 8);
        Jugador J4 = new Jugador("Isabella", "Rodríguez", "Portero", 1);
        Jugador J5 = new Jugador("Mateo", "Pérez", "Mediocampista", 6);
        
        
        listaJug.add(J1);
        listaJug.add(J2);
        listaJug.add(J3);
        listaJug.add(J4);
        listaJug.add(J5);
        
        E.setJugadores(listaJug);
        
        System.out.println(E.toString());
        
    }
}
