/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import javax.swing.JOptionPane;
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
     public Nodo insertarInicio(Object dato){
        
        Nodo pNew = new Nodo();
        pNew.setDato(dato);
       
        if (isEmpty()) {   
            pFirst = pNew;
        } else{
            pNew.setPnext(pFirst);
            pFirst = pNew;
        }
        size++;
        return pNew;
    }
    


    //Metodo para añadir al final
    public void insertarFinal(Object dato){
        Nodo pNew = new Nodo(dato);
        if(isEmpty()){
            pFirst = pNew;
        }else{
            Nodo aux = pFirst;
            while (aux.getPnext() != null){
                aux = aux.getPnext();
            }
            aux.setPnext(pNew);
        }
        size++;
    }
    
    public void mostrar(){
        if (!isEmpty()){
            Nodo aux = pFirst;
            String expresion = "";
            while(aux != null){
               expresion = expresion + aux.getDato().toString() + "\n";
               aux = aux.getPnext();
            }
            JOptionPane.showMessageDialog(null,expresion);
            
        }else{
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }
    
    //Funcion para eliminar al inicio
    public boolean eliminarInicio(){
        if(!isEmpty()){
            pFirst = pFirst.getPnext();
            size--;
            return true;
        }else{
            return false;
        }
    }
    
    /**
     *
     */
    public void eliminarFinal(){
        if(!isEmpty()){
            if (getSize()==1) {
                eliminar();
            }else{
                Nodo pointer = getpFirst();
                while(pointer.getPnext() != null && pointer.getPnext().getPnext()!= null){
                    pointer = pointer.getPnext();
                }
                pointer.setPnext(null);
            }
            size --;
        }  
    }
    
       // Funcion para buscar un elemento en la lista
    public boolean buscar(Object referencia){
        Nodo aux = pFirst;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getDato()){ 
                encontrado = true;
            }
            else{
                aux = aux.getPnext();
            }
        }
        return encontrado;
    }
}
