/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package PROG05_Ejerc1;

import PROG05_Ejerc1_util.Validaciones_vehiculos;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author miryamlaleona
 * 
 */
public class PROG05_Tarea {

    public static void main(String[] args) {

        // CONSTRUIMOS EL OBJETO
        Vehiculo vehiculo = new Vehiculo();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Nuevo Vehículo");
            System.out.println("2. Ver Matrícula");
            System.out.println("3. Ver Número de Kilómetros");
            System.out.println("4. Actualizar Kilómetros");
            System.out.println("5. Ver años de antigüedad");
            System.out.println("6. Mostrar propietario");
            System.out.println("7. Mostrar descripción");
            System.out.println("8. Mostrar Precio");
            System.out.println("9. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Por favor, introduce el número de Kilometros del vehículo :");
                    int kilometros = scanner.nextInt();
                    scanner.nextLine();

                    // Kilometros: Introducimos un valor para los kilometros y comprobamos con un método estático si es mayor que o km
                    try {
                        Validaciones_vehiculos.validarKilometros(kilometros);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error" + e.getMessage());
                    }

                    System.out.println("Por favor, introduce la marca del vehículo :");
                    String marca = scanner.nextLine();

                    System.out.println("Por favor, introduce la matrícula del vehículo :");
                    String matricula = scanner.nextLine();

                    // Fecha de matriculación
                    System.out.println("Por favor, introduce el día de matriculación del vehículo :");
                    int dia = scanner.nextInt();

                    System.out.println("Por favor, introduce el mes de matriculación del vehículo :");
                    int mes = scanner.nextInt();

                    System.out.println("Por favor, introduce el año de matriculación del vehículo :");
                    int anio = scanner.nextInt();

                    LocalDate fecha_matriculacion = Validaciones_vehiculos.construccionFecha(dia, mes, anio);

                    try {
                        Validaciones_vehiculos.comparacionFecha(dia, mes, anio);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }

                    // INTRODUCIR LA DESCRIPCION
                    System.out.println("Por favor, introduce la descripción del vehículo");
                    String descripcion = scanner.nextLine();
                    scanner.nextLine();

                    //INTRODUCIR EL PRECIO
                    System.out.println("Por favor, introduce la precio del vehículo");
                    int precio = scanner.nextInt();

                    //Introducir nombre del propietario
                    System.out.println("Por favor, introduce el nombre del propietario del vehículo");
                    String nombre_propietario = scanner.nextLine();

                    // FALTA LO DEL DNI
                    System.out.println("Por favor, introduce el DNI del propietario del vehículo");
                    String DNI = scanner.nextLine();

                    vehiculo.setMarca(marca);
                    vehiculo.setMatricula(matricula);
                    vehiculo.setKilometros(kilometros);
                    vehiculo.setDescripcion(descripcion);
                    vehiculo.setPrecio(precio);
                    vehiculo.setNombre_Propietario(nombre_propietario);
                    vehiculo.setDNI(DNI);
                    vehiculo.setFecha_matriculacion(fecha_matriculacion);

                    //Vehiculo vehiculo = new Vehiculo(marca);
                    break;
                case 2:
                    System.out.println("Número de matrícula: " + vehiculo.getMatricula());
                    break;
                case 3:
                    System.out.println("Ver número kilómetros" + vehiculo.getKilometros());
                    break;
                case 4:
                    System.out.println("Introduce el número de kilometros: ");
                    int kilometros_actualizacion = scanner.nextInt();
                    vehiculo.actualizarKilometros(kilometros_actualizacion);
                    break;

                case 5:
                    System.out.println("Antiguedad el vehículo: ");
                    // Obtenemos la fecha de matriculacion almacenada en el objeto
                    LocalDate fechaMatriculacion = vehiculo.getFecha_matriculacion();
                    vehiculo.totalMatriculado(fechaMatriculacion);
                    break;
                case 6:
                    System.out.println("Nombre y DNI del propietario: ");
                    System.out.println("DNI: " + vehiculo.getDNI() + " ,nombre: " + vehiculo.getNombre_Propietario());
                    break;
                case 7:
                    System.out.println("Descripción, matrícula y kilometros");
                    System.out.println("Descripcion: " + vehiculo.getDescripcion());
                    System.out.println("Matrícula: " + vehiculo.getMatricula());
                    System.out.println("Kilometros: " + vehiculo.getKilometros());
                    break;
                case 8:
                    System.out.println("Precio del vehículo: " + vehiculo.getPrecio());
                    break;
                case 9:
                    System.out.println("Salir");
                    break;
                default:
                    break;
            }
        } while (opcion != 9);
        scanner.close();
    }
}
