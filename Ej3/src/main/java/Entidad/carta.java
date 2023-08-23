/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Lorenzo
 */
public class carta {
    
    private int num;
    private String palo;

    @Override
    public String toString() {
        return "carta{" + "num=" + num + ", palo=" + palo + '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public carta(int num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public carta() {
    }
    
}
