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
// clase hija de vehiculo
public class Auto extends Vehiculo  {
    
    /**
     * son atributos de la clase auto
     */
    private String capacidad;
    private String comididad;
    private String descapotable;

    /**
     * constructor vacio
     */
    public Auto() {
    }

    /**
     * constructor con todos los datos de la clase Auto
     *
     * @param capacidad
     * @param comididad
     * @param descapotable
     */
    public Auto(String capacidad, String comididad, String descapotable) {
        this.capacidad = capacidad;
        this.comididad = comididad;
        this.descapotable = descapotable;
    }

    /**
     * constructor con todos sus datos y de los de la clase padre
     *
     * @param capacidad
     * @param comididad
     * @param descapotable
     * @param marca
     * @param color
     * @param modelo
     * @param placa
     */
    public Auto(String capacidad, String comididad, String descapotable, String marca, String color, String modelo, String placa) {
        super(marca, color, modelo, placa);
        this.capacidad = capacidad;
        this.comididad = comididad;
        this.descapotable = descapotable;
    }
    
}
