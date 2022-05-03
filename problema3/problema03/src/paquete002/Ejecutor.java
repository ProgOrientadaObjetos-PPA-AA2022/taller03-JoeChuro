/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

import paquete001.InstitucionesEducativas;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        InstitucionesEducativas ie = new InstitucionesEducativas();

        ie.establecerNombre("Unidad Educativa San Francisco de Asis");
        ie.establecerTipo("Fiscomisional");
        ie.establecerNumeroAlumnos(990);
        ie.establecerNumeroDocentes(310);
        ie.establecerNumeroSedes(1);
        ie.establecerGastos(2000);
        ie.calcularPresupuesto();

        System.out.printf("INSTITUCIONES EDUCATIVAS\n"
                + "Nombre: %s\n"
                + "Tipo: %s\n"
                + "Numero de alumnos: %d\n"
                + "Numero de docentes: %d\n"
                + "Numero de sedes: %d\n"
                + "Gastos: %.2f\n"
                + "Presupuesto: %.2f\n", 
                ie.obtenerNombre(),
                ie.obtenerTipo(),
                ie.obtenerNumeroAlumnos(),
                ie.obtenerNumeroDocentes(),
                ie.obtenerNumeroSedes(),
                ie.obtenerGastos(),
                ie.obtenerPresupuesto());
    }
}
