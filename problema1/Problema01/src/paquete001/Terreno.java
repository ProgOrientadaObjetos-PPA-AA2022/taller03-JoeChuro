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

    private double ancho;
    private double largo;
    private double valorMetro;
    private double valorArea;
    private double costo_terreno;

    public void establecerAnchoTerreno(double c) {
        ancho = c;
    }

    public void establecerLargoTerreno(double c) {
        largo = c;
    }

    public void establecerValorMetro(double c) {
        valorMetro = c;
    }

    public void calcularArea() {
        valorArea = ancho * largo;

    }

    public void calcularCostoTerreno() {
        costo_terreno = valorArea * valorMetro;

    }

    public double obtenerAnchoTerreno() {
        return ancho;
    }

    public double obtenerLargoTerreno() {
        return largo;
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
