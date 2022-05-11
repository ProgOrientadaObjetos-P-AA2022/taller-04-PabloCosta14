/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author DELL
 */
public class problema1 {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private PromedioCalificaciones promCalificaciones;

    public problema1(String a, double c1, double c2, double c3, PromedioCalificaciones c) {
        nombreEstudiante = a;
        calificacionMateria1 = c1;
        calificacionMateria2 = c2;
        calificacionMateria3 = c3;
        promCalificaciones = c;
    }

    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c;
    }

    public void establecerCalifiacionMateria1(double c) {
        calificacionMateria1 = c;
    }

    public void establecerCalifiacionMateria2(double c) {
        calificacionMateria2 = c;
    }

    public void establecerCalifiacionMateria3(double c) {
        calificacionMateria3 = c;
    }

    public void establecerPromCalificaciones(PromedioCalificaciones c) {
        promCalificaciones = c;

    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalifiacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalifiacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalifiacionMateria3() {
        return calificacionMateria3;
    }

    public PromedioCalificaciones obtenerPromCalificaciones() {
        return promCalificaciones;
    }

    @Override
    public String toString() {
        String cadena = String.format("El nombre del estudiante %s\nLa calificacion de "
                + "materia 1 es %s\nLa calificacion de materia 2 es "
                + "%s\nLa califiacion de materia 3 es %s\nEl promedio final es de %s\n",
                obtenerNombreEstudiante(),
                obtenerCalifiacionMateria1(), obtenerCalifiacionMateria2(),
                obtenerCalifiacionMateria3(),
                obtenerPromCalificaciones().obtenerPromedio());
        return cadena;
    }

}
