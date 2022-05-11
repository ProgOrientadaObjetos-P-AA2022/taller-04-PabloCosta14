/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author DELL
 */
public class PromedioCalificaciones {

    private double c1;
    private double c2;
    private double c3;
    private double prom;

    public PromedioCalificaciones(double a, double b, double c) {
        c1 = a;
        c2 = b;
        c3 = c;
    }

    public void establecerPromedio() {
        prom = (c1 + c2 + c3) / 3;

    }

    public double obtenerPromedio() {

        return prom;
    }
}
