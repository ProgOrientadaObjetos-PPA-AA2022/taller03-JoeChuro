/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete001;

/**
 *
 * @author SALA I
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerNumeroHoras(double c) {
        horas = c;
    }

    public void calcularNumeroMinutos() {
        minutos = horas * 60;
    }

    public void calcularNumeroSegundos() {
        segundos = horas * 3600;
    }

    public void calcularNumeroDias() {

        dias = horas / 24;

    }

    public double obtenerNumeroHoras() {
        return horas;
    }

    public double obtenerNumeroMinutos() {
        return minutos;

    }

    public double obtenerNumeroSegundos() {
        return segundos;
    }

    public double obtenerNumeroDias() {
        return dias;
    }
}
