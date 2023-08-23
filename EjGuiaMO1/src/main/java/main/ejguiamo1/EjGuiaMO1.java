/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejguiamo1;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author Lorenzo
 */
public class EjGuiaMO1 {

    public static void main(String[] args) {
        
       //public DNI(String serie, int numero)
        DNI D1 = new DNI("32153E321",36983645);
        //public Persona(String nombre, String apellido, DNI dni)
        Persona P1 = new Persona("Lorenzo","Brusasca",D1);
        
        System.out.println("Los datos de la persona ingresada son:\nPersona: "+P1.toString());
        
        
    }
}
