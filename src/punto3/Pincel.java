/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.awt.Color;

/**
 *
 * @author Dios salva
 */
public class Pincel {
    private Color color;
    
    public void pintar(){
        
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Hola";
    }
}
