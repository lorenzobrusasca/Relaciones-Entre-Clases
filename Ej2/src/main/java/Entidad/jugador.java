/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.HashMap;

/**
 *
 * @author Lorenzo
 */
public class jugador {
    
    private int numJug;
    private String nombre;
    private boolean mojado;

    public revolverDeAgua getR() {
        return R;
    }

    public void setR(revolverDeAgua R) {
        this.R = R;
    }

    public jugador() {
    }

    @Override
    public String toString() {
        return "jugador{" + "numJug=" + numJug + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public jugador(int numJug, String nombre, boolean mojado) {
        this.numJug = numJug;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getNumJug() {
        return numJug;
    }

    public void setNumJug(int numJug) {
        this.numJug = numJug;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    // ------------- METODOS -----------------
    
    revolverDeAgua R = new revolverDeAgua();
    
    public boolean disparo(revolverDeAgua R)
    {
        
        R.mojar();
        
        
        if (R.mojar()==true) {
            mojado=false;
            return true;
        }
        else {return false;}
                
        
        
    }
    
    
    
}
