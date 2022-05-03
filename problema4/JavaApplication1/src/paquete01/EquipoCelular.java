/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Joe
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private String tamañoPantalla;
    private double costoInicial;
    private int porcentajeIva;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionImei;
    private String informacionImei;

    public void establecerSistemaOperativo(String c){
    sistemaOperativo = c;
    }
    
    public void establecertamañoPantalla(String c) {
    tamañoPantalla = c;
    }
    
    public void establecerCostoInicial(double c){
    costoInicial = c;
    }
    
    public void establecerPorcentajeIva(int c){
    porcentajeIva = c;
    }
    
    public void establecerIvaCostoInicial(){
    ivaCostoInicial = costoInicial * porcentajeIva/100;
    }
    
    public void establecerCostoFinal(){
    costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDireccionImei(String c){
    direccionImei = c;
    }
    
    public void establecerInformacionImei(String c){
    informacionImei = c;
    }
    
    public String obtenerSistemaOperativo(){
    return sistemaOperativo;
    }
    
    public String obtenertamañoPantalla() {
    return tamañoPantalla;
    }
    
    public double obtenerCostoInicial(){
    return costoInicial;
    }
    
    public int obtenerPorcentajeIva(){
    return porcentajeIva;
    }
    
    public double obtenerIvaCostoInicial(){
    return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
    return costoFinal;
    }
    
    public String obtenerDireccionImei(){
    return direccionImei;
    }
    
    public String obtenerInformacionImei(){
    return informacionImei;
    }
}
