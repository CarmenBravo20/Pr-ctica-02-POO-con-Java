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
public final class Cliente extends Persona  {

    /**
     * son atributos de la clase cliente
     */
    private String formaPago;
    private String ruc;
    private boolean frecuente;

    /**
     * constructor de la clase cliente
     */
    public Cliente() {
    }

    /**
     * constructor de la clase cliente con sus atributos
     * @param formaPago
     * @param ruc
     * @param frecuente 
     */
    public Cliente(String formaPago, String ruc, boolean frecuente) {
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }
    /**
     * constructor de la clase cliente con sus atributos mas los atriutos de la clase padre (persona)
     * @param formaPago
     * @param ruc
     * @param frecuente
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono 
     */

    public Cliente(String formaPago, String ruc, boolean frecuente, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }

    /**
     * constructor de la clase cliente con sus atributos mas los atriutos de la clase padre (persona) y mas los de la clase abuelo (consesionariovehiculos)
     * @param formaPago
     * @param ruc
     * @param frecuente
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     * @param codigo
     * @param direccion 
     */
    public Cliente(String formaPago, String ruc, boolean frecuente, String cedula, String nombre, String apellido, String telefono, int codigo, String direccion) {
        super(cedula, nombre, apellido, telefono, codigo, direccion);
        this.formaPago = formaPago;
        this.ruc = ruc;
        this.frecuente = frecuente;
    }
  
       //getters and setters
    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public boolean isFrecuente() {
        return frecuente;
    }

    public void setFrecuente(boolean frecuente) {
        this.frecuente = frecuente;
    }

     public static boolean ingresarCliente() {
        return false;

    }
     
      public static boolean modificarCliente() {
        return false;

    }

       public static boolean eliminarCliente() {
        return false;

    }

    @Override
    public String toString() {
        return "Cliente{" + "formaPago=" + formaPago + ", ruc=" + ruc + ", frecuente=" + frecuente + '}';
    }


}
