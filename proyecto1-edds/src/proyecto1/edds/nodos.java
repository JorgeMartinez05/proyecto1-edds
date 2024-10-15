/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.edds;

/**
 *
 * @author jorge
 */
public class nodos {
     private Object dato; 
     private nodos pnext; 
    
    public nodos(){
       this.dato = null;
       this.pnext = null; 
    }
    
    public nodos(Object dato) {
        this.dato = dato;
        this.pnext = null;
    }
    

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public nodos getPnext() {
        return pnext;
    }

    public void setPnext(nodos pnext) {
        this.pnext = pnext;
    }
}
