/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.Scanner;

/**
 *
 * @author Dios salva
 */
public class ArregloNumeros {
    private int[] arreglo;
    
    public void cargarNumeros(){
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i < getArreglo().length;i++){
            System.out.println("Ingrese el valor en la posición " + i +": ");
            int valor = scanner.nextInt();
            cargarNumero(valor, i);
        }
    }
    
    public void cargarNumero(int numero, int indice){
        arreglo[indice] = numero;
    }
    
    public void crearArreglo(int dimension){
        arreglo = new int[dimension];
    }
    
    public void mostrarArreglo(){
        for(int i=0; i < arreglo.length; i++){
            System.out.println("Valor en la posición "+i+ " = "+arreglo[i]);
        }
    }
    
    

    /**
     * @return the arreglo
     */
    public int[] getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
            
}
