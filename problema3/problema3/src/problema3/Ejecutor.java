/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author DELL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 14000;
        int c = 1102158463;
        Automotor i = new Automotor(a, c);
        i.establecerValorMatricula();
        String d = "Ford";
        int z = 2015;
        Automotor i2 = new Automotor(d, z);
        i2.establecerValorMatricula();
        System.out.printf("%s\n" + "------------------------------\n" + "%s\n",
                i, i2);
    }

}
