/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete001;

/**
 *
 * @author SALA I
 */
public class Terreno {

    private double anchoTerreno;
    private double largoTerreno;
    private double valorMetro;
    private double valorArea;
    private double costo_terreno;

    public void establecerAnchoTerreno(double c) {
        anchoTerreno = c;
    }

    public void establecerLargoTerreno(double c) {
        largoTerreno = c;
    }

    public void establecerValorMetro(double c) {
        valorMetro = c;
    }

    public void calcularArea() {
        valorArea = anchoTerreno * largoTerreno;

    }

    public void calcularCostoTerreno() {
        costo_terreno = valorArea * valorMetro;

    }

    public double obtenerAnchoTerreno() {
        return anchoTerreno;
    }

    public double obtenerLargoTerreno() {
        return largoTerreno;
    }

    public double obtenerValorMetro() {
        return valorMetro;
    }

    public double obtenerArea() {
        return valorArea;
    
    }
    
    public double obtenerCostoTerreno() {
        return costo_terreno;
    }
}
