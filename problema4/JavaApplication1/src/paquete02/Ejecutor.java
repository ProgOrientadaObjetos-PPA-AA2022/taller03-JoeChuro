/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.EquipoCelular;

/**
 *
 * @author Joe
 */
public class Ejecutor {

    public static void main(String[] args) {

        EquipoCelular ec = new EquipoCelular();

        ec.establecerSistemaOperativo("IOS");
        ec.establecertamañoPantalla("6,5 pulgadas");
        ec.establecerCostoInicial(1300);
        ec.establecerPorcentajeIva(12);
        ec.establecerIvaCostoInicial();
        ec.establecerCostoFinal();
        ec.establecerDireccionImei("IMEI123:09y255OP54");
        ec.establecerInformacionImei("9c8x98xv76554p");

        System.out.printf("\tFACTURA\n\n"
                + "Sistema operativo: %s\n"
                + "Tamaño pantalla: %s\n"
                + "Costo Inicial: %.2f\n"
                + "Porcentaje Iva: %d\n"
                + "Costo Iva: %.2f\n"
                + "Costo Final: %.2f\n"
                + "Direccion IMEI: %S\n"
                + "Informacion IMEI: %s\n",
                ec.obtenerSistemaOperativo(),
                ec.obtenertamañoPantalla(),
                ec.obtenerCostoInicial(),
                ec.obtenerPorcentajeIva(),
                ec.obtenerIvaCostoInicial(),
                ec.obtenerCostoFinal(),
                ec.obtenerDireccionImei(),
                ec.obtenerInformacionImei());
    }
}
