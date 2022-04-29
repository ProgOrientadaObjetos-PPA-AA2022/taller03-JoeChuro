/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

import paquete001.Terreno;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        // TODO code application logic here
        Terreno tr = new Terreno();
        
        tr.establecerAnchoTerreno(20);
        tr.establecerLargoTerreno(10);
        tr.establecerValorMetro(100);
        tr.calcularArea();
        tr.calcularCostoTerreno();
    
    System.out.printf("  Calcudor de Terreno\n\nAncho del Terreno: %.2f\n"
            + "Largo del Terreno: %.2f\nValor del Metro: %.2f\n"
            + "Area del Terreno: %.2f\n\nCosto del terreno: %.2f\n", 
            tr.obtenerAnchoTerreno(),
            tr.obtenerLargoTerreno(),
            tr.obtenerValorMetro(),
            tr.obtenerArea(),
            tr.obtenerCostoTerreno());
    }
    
}

