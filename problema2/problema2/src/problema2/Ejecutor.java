/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

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
        double a = 120.00;
        int c = 1102158463;
        Instituto i = new Instituto(a, c);
        i.establecerSueldoTotal();
        String d = "Miguel";
        String z = "Ramirez";
        Instituto i2 = new Instituto(d, z);
        i2.establecerSueldoTotal();
         System.out.printf("%s\n" + "------------------------------\n" + "%s\n",
                i, i2);
        
    }

}
