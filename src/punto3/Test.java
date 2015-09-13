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
public class Test {
    public static void main(String[] args){
        /*Auto unAuto = new Auto();
        unAuto.setMarca("Fiat");
        unAuto.setModelo("Spazio");
        unAuto.setPatente("POO2015");
        Puerta unaPuerta = new Puerta();
        unAuto.setPuerta(unaPuerta);
        System.out.println("Marca: " + unAuto.getMarca());
        unAuto.getPuerta().setColor("ROJO");
        System.out.println("Color Puerta: " + unAuto.getPuerta().getColor());*/
        
        Cartuchera unaCartuchera = new Cartuchera();
        unaCartuchera.setCapacidadPinceles(3);
        Pincel primerPincel = new Pincel();
        primerPincel.setColor(Color.ORANGE);
        
        unaCartuchera.agregarPincel(primerPincel, 0);
        unaCartuchera.mostrarPinceles();
    }
}
