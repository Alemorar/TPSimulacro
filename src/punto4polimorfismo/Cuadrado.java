/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4polimorfismo;

/**
 *
 * @author Dios salva
 */
public class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
