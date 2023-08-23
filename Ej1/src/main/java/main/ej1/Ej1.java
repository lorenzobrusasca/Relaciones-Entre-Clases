/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ej1;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author Lorenzo
 */
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/


public class Ej1 {
    
    
    public static void main(String[] args) {
        
        // public Persona(Perro P, String nombre, String apellido, int edad, int documento)
        Persona P1 = new Persona("Paloma","Maquez",28,38546832);
        Persona P2 = new Persona("Ivan","Molero",51,35232156);
        
        Perro Perro1 = new Perro("Firulais","Beagle","mediano",24);
        Perro Perro2 = new Perro("Chiquito","Labrador","grande",5);
        
        P1.setP(Perro1);
        P2.setP(Perro2);
        
        System.out.println(P1);
        System.out.println(P2);
        
        
    }
}
