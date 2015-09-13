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
public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(radio, 2));
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
