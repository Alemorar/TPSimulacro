/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Dios salva
 */
public class Test {
    public static void main(String[] args){
        Sumatoria unaSumatoria = new Sumatoria();
        unaSumatoria.setN(7);
        BigDecimal numeroDosDecimales = new BigDecimal(unaSumatoria.calcular());
        numeroDosDecimales.setScale(3, RoundingMode.HALF_UP);
        System.out.println("El resultado de la sumatoria es: "+unaSumatoria.calcular());
        System.out.println("El resultado de la sumatoria es: "+numeroDosDecimales);
    }
}
