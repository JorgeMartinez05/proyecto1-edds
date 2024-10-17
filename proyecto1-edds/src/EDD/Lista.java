/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author jorge
 */
public class Lista {
    private Nodo pFirst;
    private int size; 
    
   
    public Lista() {
        this.pFirst = null;
        this.size = 0; 
    }
    
    // get y set para los atrubutos

    public Nodo getpFirst() {
        return pFirst;
    }

    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    //Primitivas
    
    // Verficar si la lista es vacia
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
    //Destructor
    public void eliminar(){
        pFirst = null;
        size = 0;
    }
    
}
