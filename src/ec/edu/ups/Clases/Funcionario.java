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
//clase hija de Persona
public  class Funcionario extends Persona {
    /**
     * son atributos de la clase funcionario
     */
    private String cargo;
    private double salario;
    private String area;
    private String horario;

    /**
     * Constructor funcionario
     */
    public Funcionario() {
    }

    /**
     * constructor de la clase funcionario con sus atributos
     * @param cargo
     * @param salario
     * @param area
     * @param horario 
     */
    
    public Funcionario(String cargo, double salario, String area, String horario) {
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }

    
      /**
     * constructor tiene sus propios atributos y el de su padre Persona
     * @param cargo
     * @param salario
     * @param area
     * @param horario
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono 
     */
    public Funcionario(String cargo, double salario, String area, String horario, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }

    /**
     * constructor de la clase funcionario con sus aributos mas de los del padre persona y mas el de sus abuelo clase consecionarioVehiculos
     * @param cargo
     * @param salario
     * @param area
     * @param horario
     * @param cedula
     * @param nombre
     * @param apellido
     * @param telefono
     * @param codigo
     * @param direccion 
     */
    public Funcionario(String cargo, double salario, String area, String horario, String cedula, String nombre, String apellido, String telefono, int codigo, String direccion) {
        super(cedula, nombre, apellido, telefono, codigo, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.area = area;
        this.horario = horario;
    }
   
    // getters  and setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

     public static boolean ingresarFuncionario() {
        return false;

    }
     
      public static boolean modificarFuncionario() {
        return false;

    }

       public static boolean eliminarFuncionario() {
        return false;

    }
    
}
