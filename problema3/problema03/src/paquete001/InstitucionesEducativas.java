/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete001;

/**
 *
 * @author SALA I
 */
public class InstitucionesEducativas {

    private String nombre;
    private String tipo;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastos;
    private double presupuesto;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipo(String c) {
        tipo = c;
    }

    public void establecerNumeroAlumnos(int c) {
        numeroAlumnos = c;
    }

    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }

    public void establecerNumeroSedes(int c) {
        numeroAlumnos = c;
    }

    public void establecerGastos(double c) {
        gastos = c;
    }

    public void calcularPresupuesto(double c) {
        presupuesto = numeroAlumnos * gastos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroAlumnos;
    }

    public double obtenerGastos() {
        return gastos;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
