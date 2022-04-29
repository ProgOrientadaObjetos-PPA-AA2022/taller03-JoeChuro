/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

import paquete001.EquivalenteHora;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        EquivalenteHora eq = new EquivalenteHora();

        eq.establecerNumeroHoras(12);
        eq.calcularNumeroMinutos();
        eq.calcularNumeroSegundos();
        eq.calcularNumeroDias();

        System.out.printf("Transformar Horas\n\nHoras: %.2f\n"
                + "Minutos: %.2f\nSegundos: %.2f\n"
                + "Dias: %.2f\n", eq.obtenerNumeroHoras(),
                eq.obtenerNumeroMinutos(),
                eq.obtenerNumeroSegundos(),
                eq.obtenerNumeroDias());
    }

}
