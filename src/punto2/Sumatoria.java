/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author Dios salva
 */
public class Sumatoria {
    private int n;
    
    public double calcular(){
        double resultado = 0.0;
        
        for(int i=1;i<=getN();i++){
            resultado = resultado + (Math.pow(2, i)/(3 + 2*i));
        }
        
        return resultado;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
    
}
