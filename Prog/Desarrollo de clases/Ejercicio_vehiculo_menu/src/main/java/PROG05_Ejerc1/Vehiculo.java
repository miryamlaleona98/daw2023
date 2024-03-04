/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG05_Ejerc1;

import java.time.LocalDate;

/**
 *
 * @author miryamlaleona
 */
public class Vehiculo {

    private String marca;
    private String matricula;
    private int kilometros;
    private String descripcion;
    private int precio;
    private String nombre_propietario;
    private String DNI;
    private LocalDate fecha_matriculacion;

    // Getters y Setters para cada uno de los atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_Propietario() {
        return nombre_propietario;
    }

    public void setNombre_Propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFecha_matriculacion() {
        return fecha_matriculacion;
    }

    public void setFecha_matriculacion(LocalDate fecha_matriculacion) {
        this.fecha_matriculacion = fecha_matriculacion;
    }

    // CONSTRUCTORES            
    // Constructor que me permita inicializar un objeto con todos los parámetros
    public Vehiculo(String marca, String matricula, int kilometros, String descripcion, int precio, String nombre_propietario, String DNI, LocalDate fecha_matriculacion) {
        this.marca = marca;
        this.matricula = matricula;
        this.kilometros = kilometros;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre_propietario = nombre_propietario;
        this.DNI = DNI;
        this.fecha_matriculacion = fecha_matriculacion;
    }

    public Vehiculo() {
    }

    // MÉTODOS
    public void actualizarKilometros(int kilometros) {
        if (kilometros >= 0) {
            this.kilometros = kilometros;
        } else {
            throw new IllegalArgumentException("No se pueden introducir datos negativos en los kilometros");
        }
    }

    // Obteniendo la fecha de matriculacion y la actual, restaremos los años para obtener el total de años matriculado
    public int totalMatriculado(LocalDate fechaMatriculacion) {
        int anio_matriculado = fechaMatriculacion.getYear();
        int anio_actual = LocalDate.now().getYear();

        int aniosTranscurridos = anio_matriculado - anio_actual;

        return aniosTranscurridos;
    }

}
