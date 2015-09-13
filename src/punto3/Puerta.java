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
public class Puerta {
    private String color;
    private String forma;

    public Puerta() {
    }

    public Puerta(String color, String forma) {
        this.color = color;
        this.forma = forma;
    }
    
   
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the forma
     */
    public String getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(String forma) {
        this.forma = forma;
    }
    
}
