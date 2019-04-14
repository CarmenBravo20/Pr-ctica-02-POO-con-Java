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
    //getter and setters
    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getComididad() {
        return comididad;
    }

    public void setComididad(String comididad) {
        this.comididad = comididad;
    }

    public String getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(String descapotable) {
        this.descapotable = descapotable;
    }

    /**
     * Metodo revisar estado
     *
     * @return false
     */
    public static boolean revisarEstado() {
        return false;

    }

    /**
     * metodo lavar auto
     *
     * @return true
     */
    public static boolean lavarAuto() {
        return true;

    }

    /**
     *metodo de comprar auto
     * @return false
     */
    public static boolean comprarAuto() {
        return false;

    
}

    @Override
    public String toString() {
        return "Auto{" + "capacidad=" + capacidad + ", comididad=" + comididad + ", descapotable=" + descapotable + '}';
    }
    
}
