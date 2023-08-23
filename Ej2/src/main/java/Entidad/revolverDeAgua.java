/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Lorenzo
 */
public class revolverDeAgua {
    
    private int posActual, posAgua;

    public revolverDeAgua() {
    }

    public revolverDeAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "revolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
    
    // ------------------METODOS-----------------------------
    
    Random random = new Random();
    
    public void llenarRevolver()
    {
    
        posActual = random.nextInt(5)+1;
        posAgua = random.nextInt(5)+1;
        System.out.println("Posición Actual: "+posActual+"Posición Agua: "+posAgua+"\n");
        
    }
    
    public boolean mojar()
    {
        if (posAgua==posActual) {
            return true;
        }
        else {return false;}
    
        
        
    }
    
    public void siguienteChorro()
    {
        if (posActual==1||posActual==2||posActual==3||posActual==4) {
            posActual = posActual +1;
        }
        else{
            if (posActual==5) {
                posActual = 1;
            }
                }
    
    }
    
}
