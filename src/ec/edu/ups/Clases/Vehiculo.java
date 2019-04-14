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
public  class Vehiculo extends ConsesionarioVehiculos{

    /**
     * atributos de la clase vehiculos
     */
    private String marca;
    private String color;
    private String modelo;
    private String placa;

    /**
     * Constructor de la clase vehiculo
     */
    public Vehiculo() {
    }
    /**
     * constructor de la clase vehiculo con sus atributos 
     * @param marca
     * @param color
     * @param modelo
     * @param placa 
     */

    public Vehiculo(String marca, String color, String modelo, String placa) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
    }

    /**
     * constructor de la clase vehiculos con sus atributos mas los atriutos de la clase padre (consecionarioVehiculos)
     * @param marca
     * @param color
     * @param modelo
     * @param placa
     * @param codigo
     * @param direccion 
     */
    public Vehiculo(String marca, String color, String modelo, String placa, int codigo, String direccion) {
        super(codigo, direccion);
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    //getters and setters
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

      public static void comprar() {
        

    }
     
      public static void vender() {
        

    }

       public static boolean garanterizarVehiculo() {
        return false;

    }
}
