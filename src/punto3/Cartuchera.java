/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author Dios salva
 */
public class Cartuchera {
    private Pincel[] pinceles;
    private Compas[] compases;
    private int capacidadPinceles;
    private int capacidadCompases;
    
    
    public void agregarPincel(Pincel pincel, int posicion){
        pinceles[posicion] = pincel;
    }
    
    public void mostrarPinceles(){
        for(int i=0; i < pinceles.length;i++){
            System.out.println(pinceles[i]);
        }
    }

    

    
    
    /**
     * @return the pinceles
     */
    public Pincel[] getPinceles() {
        return pinceles;
    }

    /**
     * @param pinceles the pinceles to set
     */
    public void setPinceles(Pincel[] pinceles) {
        this.pinceles = pinceles;
    }

    /**
     * @return the capacidadPinceles
     */
    public int getCapacidadPinceles() {
        return capacidadPinceles;
    }

    /**
     * @param capacidadPinceles the capacidadPinceles to set
     */
    public void setCapacidadPinceles(int capacidadPinceles) {
        this.capacidadPinceles = capacidadPinceles;
        pinceles = new Pincel[capacidadPinceles];
    }
    
}
