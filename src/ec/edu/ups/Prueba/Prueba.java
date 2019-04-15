/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Prueba;

import ec.edu.ups.Clases.Auto;
import ec.edu.ups.Clases.Camion;
import ec.edu.ups.Clases.Cliente;
import ec.edu.ups.Clases.ConsesionarioVehiculos;
import ec.edu.ups.Clases.Funcionario;
import ec.edu.ups.Clases.Persona;
import ec.edu.ups.Clases.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
//clase prueba
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***// UNIVERSIDAD POLITECNICA SALESIANA //***");
        System.out.println("***PROGRAMACION ORIENTADA A OBJETOS***");
        System.out.println("   Relaciones entre clases    ");
        
        Cliente CarlosP = new Cliente("Tarjeta", "26568948", true, "0107593873", "Carlos", "Pelaez", "3012092", 1, "Av. Las Americas");
        System.out.println("");
        System.out.println(CarlosP);
        System.out.println(CarlosP.comprar());
        System.out.println(CarlosP.revisar());
        System.out.println(CarlosP.comprar());
        System.out.println(CarlosP.vender());

        //instania de la clase fucnionario
        Funcionario AndresM = new Funcionario("Asesor", 540.80, "Area Secretarial", "Lunes a viernes", "0107593873", "Andres", "Maldonado", "3014167", 2, "Carlos Berrezueta");
        System.out.println("");
        System.out.println(AndresM);
        System.out.println(AndresM.comprar());
        System.out.println(AndresM.lavar());
        System.out.println(AndresM.revisar());
        System.out.println(AndresM.vender());

        Auto chevrolet = new Auto("5 Personas", "65% cómodo", "si", "Chevrolet", "rojo", "familiar", "ABD-2563");
        System.out.println("");
        System.out.println(chevrolet);
        System.out.println(chevrolet.comprar());
        System.out.println(chevrolet.revisar());
        System.out.println(chevrolet.vender());
        System.out.println(chevrolet.lavar());

        Camion mercedesBenz = new Camion("2 personas", 65, 2.500, "Mercedes- Benz", "Blanco", "FPN", "AFG-062");
        System.out.println("");
        System.out.println(mercedesBenz);
        System.out.println(mercedesBenz.comprar());
        System.out.println(mercedesBenz.revisar());
        System.out.println(mercedesBenz.vender());
        System.out.println(mercedesBenz.lavar());

        System.out.println("");

        
        
         //arraylist est se debe a que tenmos herencia
        List<ConsesionarioVehiculos> lista = new ArrayList<>();
        lista.add(CarlosP);
        lista.add(AndresM);
        lista.add(chevrolet);
        lista.add(mercedesBenz);

        /**
         * recorrido
         */
        for (ConsesionarioVehiculos consesionario : lista) {
            if (consesionario instanceof Auto) {
                Auto t1 = (Auto) consesionario;
                System.out.println(" Auto " + t1);
            } else if (consesionario instanceof Camion) {
                Camion t2 = (Camion) consesionario;
                System.out.println(" Camioneta " + t2);
            } else if (consesionario instanceof Funcionario) {
                Funcionario t3 = (Funcionario) consesionario;
                System.out.println(" funcionario "  + t3);
            } else if (consesionario instanceof Cliente) {
                Cliente t4 = (Cliente) consesionario;
                System.out.println(" cliente "+ t4);
            }
        }

        System.out.println("");
    
    
        /**
         * clase anonima
         */
        Vehiculo vehiculoAnonimo = new Vehiculo("Chevrolet", "Rojo", "Familiar", "AGH-859", 3, "Av.Las americas") {
            @Override
            public String gustar() {
                return this.getMarca() + " Esta marca es muy buena";
            }

        };
        
        System.out.println(vehiculoAnonimo);
        System.out.println(vehiculoAnonimo.gustar());
       

        Persona personaAnonimo = new Persona("0107593873", "Antony", "Jurado", "3012092", 4, "   Av. Las americas") {
            @Override
            public String conducir() {
                return this.getNombre()+ " esta conduciendo";
            }

        };
       
        System.out.println(personaAnonimo);
        System.out.println(personaAnonimo.conducir());
    }
    }


