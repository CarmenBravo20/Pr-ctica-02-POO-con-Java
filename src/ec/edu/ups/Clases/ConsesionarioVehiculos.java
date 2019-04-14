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
//clase abuelo
public class ConsesionarioVehiculos {
  
    /**
     * atributos de la lase consesionarioVehiculos
     */
     private int codigo;
     private String direccion;

     /**
      * constructor de  la clase consesionarioVehiculo
      */
    public ConsesionarioVehiculos() {
    }

    /**
     * constructor de la clase consesionarioVehiculos con sus atributos
     * @param codigo
     * @param direccion 
     */
    public ConsesionarioVehiculos(int codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
    }
         //getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ConsesionarioVehiculos{" + "codigo=" + codigo + ", direccion=" + direccion + '}';
    }

  
}
