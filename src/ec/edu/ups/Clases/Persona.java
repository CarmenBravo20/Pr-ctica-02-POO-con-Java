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
// clase hija de consesionariovehiculos
public class Persona extends ConsesionarioVehiculos {

    /**
     * atributos de la clase persona
     */
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;

    /**
     * costructor de la clase persona
     */
    public Persona() {
    }
    /**
     * constructor de la clase persona con sus atributos
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono 
     */

    public Persona(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    /**
     * constructor de la clase persona con sus atributos mas los de la clase padre(consesionarioVehivulos)
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     * @param codigo
     * @param direccion 
     */

    public Persona(String cedula, String nombre, String apellido, String telefono, int codigo, String direccion) {
        super(codigo, direccion);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
}
