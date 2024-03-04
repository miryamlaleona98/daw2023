/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1_util;

import java.time.LocalDate;

/**
 *
 * @author miryamlaleona
 *
 * Validaciones para el conjunto de parámetros de la clase vehículo
 */
public class Validaciones_vehiculos {

    // Método que recibe kilometros (int), se asegura de que estos si son menores a 0 lancen un error, y sino que no suceda nada.
    public static void validarKilometros(int kilometros) {
        if (kilometros < 0) {
            throw new IllegalArgumentException("Los kilómetros no pueden ser inferiores a 0");
        }
    }

    // Construccion de fecha
    public static LocalDate construccionFecha(int dia, int mes, int anio) {
        LocalDate fecha_matriculacion = LocalDate.of(anio, mes, dia);
        return fecha_matriculacion;
    }

    // Método que recibe dia, mes y año, lo covierte a tipo fecha y lo compara con la fecha actual 
    public static void comparacionFecha(int dia, int mes, int anio) {
        LocalDate fecha_matriculacion = LocalDate.of(anio, mes, dia);

        LocalDate fecha_actual = LocalDate.now();

        if (fecha_matriculacion.compareTo(fecha_actual) > 0) {
            throw new IllegalArgumentException("La fecha de matriculación no puede ser posterior a la actual");
        }
    }
}
