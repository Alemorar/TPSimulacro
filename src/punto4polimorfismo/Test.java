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
public class Test {
    public static void main(String[] args){
        FiguraGeometrica figuraGeometrica = new Circulo(24.5);
        
        GestorDeFiguras gestorDeFiguras = new GestorDeFiguras();
        gestorDeFiguras.calcularArea(figuraGeometrica);
    }
    
}
