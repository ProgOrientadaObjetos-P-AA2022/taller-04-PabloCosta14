/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author PabloCosta14
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Pablo Costa";
        double c1 = 10.00;
        double c2 = 8.00;
        double c3 = 9.00;

        problema1 ent = new problema1(c1, c2, c3);
        ent.establecerPromCalificaciones();
        
         problema1 ent2 = new problema1(nombre, c1, c2, c3);
         ent2.obtenerPromCalificaciones();
        System.out.printf("%s\n"+"------------------------------\n"+"%s\n"
                , ent,ent2);
    }

}
