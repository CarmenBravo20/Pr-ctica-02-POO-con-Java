/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
public  class Camion extends Vehiculo  {

    /**
     * son atributos de la clase camion
     */
    private String espacio;
    private double carga;
    private double pesoTara;

    /**
     * costructor de la clase camion
     */
    public Camion() {
    }
    /**
     * constructor de la clase camion con sus atributos
     * @param espacio
     * @param carga
     * @param pesoTara 
     */

    public Camion(String espacio, double carga, double pesoTara) {
        this.espacio = espacio;
        this.carga = carga;
        this.pesoTara = pesoTara;
    }

    /**
     * constructor de la clase camion con sus atributos mas el del su padre vehiculo
     * @param espacio
     * @param carga
     * @param pesoTara
     * @param marca
     * @param color
     * @param modelo
     * @param placa 
     */
    public Camion(String espacio, double carga, double pesoTara, String marca, String color, String modelo, String placa) {
        super(marca, color, modelo, placa);
        this.espacio = espacio;
        this.carga = carga;
        this.pesoTara = pesoTara;
    }
}