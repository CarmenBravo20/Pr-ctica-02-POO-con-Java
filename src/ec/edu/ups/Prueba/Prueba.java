/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Prueba;

import ec.edu.ups.Clases.Auto;
import ec.edu.ups.Clases.Camion;
import ec.edu.ups.Clases.Cliente;
import ec.edu.ups.Clases.Funcionario;

/**
 * @version 1.2
 * @since 2019
 * @author Carmen Bravo
 *
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

    }

}
