/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author DELL
 */
public class Instituto {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;

    public Instituto(double c, int d) {
        nombre = "Jose";
        apellido = "Montero";
        sueldoBasico = c;
        cedula = d;

    }

    public Instituto(String c, String d) {
        nombre = c;
        apellido = d;
        sueldoBasico = 90;
        cedula = 1150648574;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldoBasico = c;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);

    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("El nombre del profesor es %s\nEl apellido es "
                + " %s\nEl sueldo basico es "
                + "%s\nLa cedula es %s\nEl sueldo total es "
                + "%s\n",
                obtenerNombre(),
                obtenerApellido(), obtenerSueldoBasico(),
                obtenerCedula(),
                obtenerSueldoTotal());
        return cadena;
    }
}
