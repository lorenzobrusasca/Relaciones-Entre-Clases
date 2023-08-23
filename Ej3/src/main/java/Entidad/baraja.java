/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class baraja {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <carta> baraja = new ArrayList<>();
        ArrayList <carta> cartasEntreg = new ArrayList<>();

    public baraja() {
    }

    public ArrayList<carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "baraja{" + "baraja=" + baraja + '}';
    }
        
    
    // --------------- METODOS -------------------------
    
    public void llenarBaraja()
    {
        
        
        for (int i = 1; i < 13; i++) {
         
            carta C = new carta();
            
            if (i!=8&&i!=9) {
            C.setNum(i);
            C.setPalo("espadas");
            baraja.add(C);
            }
             
        }
        
           for (int i = 1; i < 13; i++) {
         
            carta C = new carta();
            
            if (i!=8&&i!=9) {
            C.setNum(i);
            C.setPalo("bastos");
            baraja.add(C);
            }
             
        }
           
              for (int i = 1; i < 13; i++) {
         
            carta C = new carta();
            
            if (i!=8&&i!=9) {
            C.setNum(i);
            C.setPalo("oros");
            baraja.add(C);
            }
             
        }
              
                 for (int i = 1; i < 13; i++) {
         
            carta C = new carta();
            
            if (i!=8&&i!=9) {
            C.setNum(i);
            C.setPalo("copas");
            baraja.add(C);
            }
             
        }
        
    
    
    }
            
            
    public void mostrarBaraja()
    {
    
        for (carta aux : baraja) {
            
            System.out.println(aux.toString());
                        
        }
    
    }
    
    
    public void barajar()
    {
        
        Collections.shuffle(baraja);
    
    }
    
    public carta siguienteCarta()
    {
        int cont=0;
        String opc="S";
        carta C = new carta();
          
        while(opc.equalsIgnoreCase("S")){
            
            System.out.println("Contador = "+cont);
            
             System.out.println("Presione S para la siguiente carta o F para finalizar");
        opc = leer.next();
        
          if (opc.equalsIgnoreCase("s")&&cont<40) {
            C = baraja.get(cont);
              System.out.println(baraja.get(cont));
              
              cartasEntreg.add(C);
              baraja.remove(C);
              cont = cont-1;
          }
          else if (opc.equalsIgnoreCase("F")&&cont<40) {
              C=null;  
              break;
            }
          else if (cont>=40) {
                System.out.println("Se terminó la baraja");
                C=null;
                break;
            }
          
            cont++;
            
        }
        
               
          
          return C;
          
          
        
    }
    
    public void cartasDisponibles()
    {
        System.out.println("Cartas disponibles: "+baraja.size());
    
    }
    
    public void darCartas()
    {   
        int num;
        int cont;
        
        System.out.println("Indique el número de cartas solicitadas:");
        num = leer.nextInt();
        cont = num-num;
        int cuenta=0;
        
       while (baraja.size()>=num&&cuenta!=num)
       {
           
            System.out.println("Carta:"+baraja.get(cont));
            cartasEntreg.add(baraja.get(cont));
            baraja.remove(cont);
            cuenta++;
       }       
       
        if (num>baraja.size()) {
            System.out.println("No hay dicha cantidad de cartas en la baraja");
        }
        
        
        
        
                
        
        
        
    }
    
    public void cartasMonton()
    {
        if (cartasEntreg.size()>0) {
        
            System.out.println("\nCartas monton:");
        for (carta aux : cartasEntreg) {
            System.out.println(aux.toString());
        }
    
        }
        else {System.out.println("No ha salido ninguna carta");}
        
        
        
    }
    
    public void mostrarBarajaRest()
    {
        System.out.println("\nMuestra resto de baraja");
        for (carta aux : baraja) {
            System.out.println(aux.toString());
        }
    
    }
        
}
