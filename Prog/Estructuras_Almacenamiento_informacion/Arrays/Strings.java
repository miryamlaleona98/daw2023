/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.strings;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author miryamlaleona
 */
public class Strings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         * EJERCICIO 00 Leer una frase de máximo 80 caracteres y escribirla
         * progresivamente es decir si la frase es: “ciervo”, el programa debe
         * imprimir. c ci cie cier cierv ciervo
         *
         *
         */
//           System.out.println("Introduz una frase infeior a 80 caracteres");
//           String frase01 = scanner.nextLine();
//
//           try {
//               
//               if (frase01.length() <= 80){
//                   
//                    for (int i = 1; i <= frase01.length(); i++) {
//                System.out.println(frase01.substring(0, i));
//            }
//               }
//           } catch(Exception e){
//               System.out.println("Error: No se deben introducir palabras superiores a 80");
//            e.printStackTrace();
//           }
        /**
         * EJERCICIO 01. Dada una frase de no más de 80 caracteres hacer un
         * programa que busque cuántas mayúsculas y minúsculas tiene y lo
         * imprima.
         */
//        System.out.println("Introduzca una frase inferior a 80 caracteres");
//        String frase01 = scanner.nextLine();
//        
//        int contadorMayusculas = 0;
//        int contadorMinusculas = 0;
//        
//        Pattern patternMayus = Pattern.compile("[A-Z]");
//        Pattern patternMinus = Pattern.compile("[a-z]");
//        
//        Matcher matcherMayus = patternMayus.matcher(frase01);
//        Matcher matcherMinus = patternMinus.matcher(frase01);
//        
//        if (frase01.length() <= 80){
//            while (matcherMayus.find()){
//            contadorMayusculas++;
//            }
//            while (matcherMinus.find()){
//            contadorMinusculas++;
//            }
//        } else {
//            System.out.println("No se pueden introducir palabras superior a 80 dígitos");
//        }
//        
//        System.out.println("El número total de mayúsculas es:" + contadorMayusculas);
//        System.out.println("El número total de minúsculas es:" + contadorMinusculas);
        /**
         * EJERCICIO 02. Programa que lea una frase y una palabra y que nos diga
         * la posición de dicha palabra en la frase y sino la encuentra devuelva
         * 0
         */
        // He creado una función para permitir devolver un 0 en vez de un -1, ya que por defecto la función devuelve -1
//        System.out.println("Escribe una frase: ");
//        String frase = scanner.nextLine();
//        System.out.println("Escribe una palabra que encontrar en la frase anteriormente introducida: ");
//        String palabra = scanner.nextLine();
//        
//     int indexResult = customIndexOf(frase, palabra);
//    
//     System.out.println(indexResult);
        /**
         * EJERCICIO 03. Leer una cadena de hasta 80 caracteres y pasarla en
         * función de una variable de opción de mayúsuclas ó a minúsculas e
         * imprimir la cadena resultante.
         */
//        System.out.println("Introduce una palabra: ");
//        String mayusMinus = scanner.nextLine();
//        int opcion = 0;
//        boolean salir = false;
//
//        try {
//            if (mayusMinus.length() <= 80) {
//                do {
//                    System.out.println("Menu de opciones");
//                    System.out.println("1. Convertir a mayúsuclas");
//                    System.out.println("2. Convertir a minúsculas");
//
//                    System.out.println("Elige una de las dos opciones: ");
//                    opcion = scanner.nextInt();
//
//                    switch (opcion) {
//                        case 1:
//                            System.out.println(mayusMinus.toUpperCase());
//                            break;
//                        case 2:
//                            System.out.println(mayusMinus.toLowerCase());
//                            break;
//                        default:
//                            System.out.println("Opción no válida");
//                            break;
//
//                    }
//
//                } while (!salir);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: No se deben introducir palabras superiores a 80");
//        }
        /**
         * EJERCICIO 04. Leer una frase por teclado (inferior a 80 caracteres)
         * Construir otras dos cadenas de forma que una contenga los caracteres
         * en posición par y la otra los caracteres en posición impar
         */
//        System.out.println("Introduzca una palabra inferior a 8 carácteres");
//
//        String cadenaInicial = scanner.nextLine();
//        char cadenaPar = '\0';
//        char cadenaImpar = '\0';
//
//        try {
//            if (cadenaInicial.length() <= 80) {
//                for (int i = 0; i < cadenaInicial.length(); i++) {
//                    if (i % 2 == 0) {
//                        char caracterEnPosicion = cadenaInicial.charAt(i);
//                        cadenaPar += caracterEnPosicion;
//                        
//                    } else {
//                        cadenaImpar = cadenaInicial.charAt(i);
//                    }
//                }
//                System.out.println("Cadena de caracteres en posicion par :"+cadenaPar);
//
//            }
//        } catch (Exception e) {
//            System.out.println("Error: No se deben introducir palabras superiores a 80");
//        }
//        
        /**
         * EJERCICIO 05. Leer una frase por teclado (máximo 80) y a continuación
         * escribir cuantas vocales, consonantes y caracteres numéricos posee.
         */
//        System.out.println("Introduce una frase inferior a 80 caracteres");
//
//        String frase = scanner.nextLine();
//
//        try {
//            if (frase.length() <= 80) {
//                Pattern patternNumero = Pattern.compile("\\d");
//                Matcher matcherNumero = patternNumero.matcher(frase);
//
//                int contadorNumeros = 0;
//                while (matcherNumero.find()) {
//                    contadorNumeros++;
//                }
//                System.out.println("La frase contiene: " + contadorNumeros + " numeros");
//
//                Pattern patternVocal = Pattern.compile("[aeiouAEIOU]");
//                Matcher matcherVocal = patternVocal.matcher(frase);
//
//                int contadorVocales = 0;
//                while (matcherVocal.find()) {
//                    contadorVocales++;
//                }
//                System.out.println("La frase contiene: " + contadorVocales + " vocales");
//
//                Pattern patternConsonante = Pattern.compile("[bcdfghjklmnñqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ]");
//                Matcher matcherConsonante = patternConsonante.matcher(frase);
//
//                int contadorConsonantes = 0;
//                while (matcherConsonante.find()) {
//                    contadorConsonantes++;
//                }
//
//                System.out.println("La frase contiene: " + contadorConsonantes + " consonantes");
//
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error: No se deben introducir palabras superiores a 80");
//
//        }
        /**
         * EJERCICIO 06. Leer una frase por teclado y escribir a continuación
         * cuántas mayúsculas, minúsuclas y números contiene
         */
//        System.out.println("Escribe una frase para conocer la cantidad de mayúsuculas, minúsuclas y números que contiene: ");
//        String frase = scanner.nextLine();
//
//        try {
//            Pattern patternMayusc = Pattern.compile("[A-Z]");
//            Matcher mattcherMayusc = patternMayusc.matcher(frase);
//            
//            int contadorMayusc = 0;
//            while (mattcherMayusc.find()){
//                contadorMayusc++;
//            }
//            System.out.println("El número de mayúsculas es de: "+ contadorMayusc);
//            
//            Pattern patternMinusc = Pattern.compile("[a-z]");
//            Matcher mattcherMinusc = patternMinusc.matcher(frase);
//            
//             int contadorMinusc = 0;
//            while (mattcherMinusc.find()){
//                contadorMinusc++;
//            }
//            System.out.println("El número de minúsculas es de: "+ contadorMinusc);
//            
//             Pattern patternNum = Pattern.compile("[0-9]");
//            Matcher matcherNum = patternNum.matcher(frase);
//            
//             int contadorNum = 0;
//            while (matcherNum.find()){
//                contadorNum++;
//            }
//            System.out.println("El número de números es de: "+ contadorNum);
//                    
//        } catch (Exception e) {
//            System.out.println("Imposible realizar el recuento de mayúsculas, minúsuclas y números");
//
//        }
        /**
         * EJERCICIO 07. Leer una frase filtrándola a que todos sus carácteres
         * sean mayúsuclas, una vez filtrada y dado un número entre 1 y 10 haga
         * un cifrado de la frase (denominado cifrado CESAR) del modo siguiente,
         * si el número por ejemplo es 3, transforme la frase de manera que cada
         * carácter se transforme en 3 códigos ASCII. Ej: Frase inicial
         * PROGRAMACION --> SURJUDPDFLRQ
         */
//        System.out.println(" Introduce una frase a cifrar en método CESAR");
//        String frase = scanner.nextLine();
//        
//        // Convertimos todos los carácteres de la fras a mayúsculas
//        String fraseMayus = frase.toUpperCase();
//        
//        // Convertimos la frase a número con valueOf() --> método existente en todas las clases envoltorio descendientes de la clase Number
//        Double newSentence = Double.valueOf(fraseMayus).doubleValue();
//        
//        System.out.println(newSentence);

        /**
         * EJERCICIO 08. Escribir un programa que lea códigos de personas de 8
         * carácteres de modo que los cuatro primeros seran númericos y
         * conteniedos entre 1990-1995, el quinto carácter sea solo H o M el
         * sexto el número que representa el curso 1 o 2 y los caracteres
         * séptimo y octavo pueden tener cualquier otro valor. Deben rechazarse
         * los códigos que no cumplan estas condiciones la finalización de
         * entrada de códigos se produce cuando se introduce el código
         * "00000000" Al final el programa debe sacar un informe indicando
         * cuántos hombre y mujeres hay matriculados en primer y segundo curso,
         * y cuántos códigos correctos han sido leidos
         */
        System.out.println("Introduce el código: ");

        int contadorCodigo = 0;
        int contadorHombresPrimero = 0;
        int contadorMujeresPrimero = 0;
        int contadorHombresSegundo = 0;
        int contadorMujeresSegundo = 0;

        Pattern p = Pattern.compile("199[0-5](H|M)(1|2)..");

        while (true) {
            String codigo = scanner.nextLine();

            if (codigo.equals("00000000")) {
                break;
            }

            if (codigo.length() != 8) {
                System.out.println("El código debe tener solo 8 caracteres");
                continue;
            }

            System.out.println("Verificando código: " + codigo); // Depuración

            Matcher m = p.matcher(codigo);

            if (m.matches()) {
                System.out.println("Código válido: " + codigo); // Depuración
                contadorCodigo++;

                char genero = codigo.charAt(4);
                char curso = codigo.charAt(5);

                if (genero == 'H' && curso == '1') {
                    contadorHombresPrimero++;
                } else if (genero == 'H' && curso == '2') {
                    contadorHombresSegundo++;
                } else if (genero == 'M' && curso == '1') {
                    contadorMujeresPrimero++;
                } else if (genero == 'M' && curso == '2') {
                    contadorMujeresSegundo++;
                }
            } else {
                System.out.println("Código incorrecto: " + codigo); // Depuración
                System.out.println("Matcher lookingAt: " + m.lookingAt());
                System.out.println("Matcher find: " + m.find());
            }
        }

        System.out.println("Contador de códigos válidos: " + contadorCodigo);
        System.out.println("Contador de hombres en primer curso: " + contadorHombresPrimero);
        System.out.println("Contador de mujeres en primer curso: " + contadorMujeresPrimero);
        System.out.println("Contador de hombres en segundo curso: " + contadorHombresSegundo);
        System.out.println("Contador de mujeres en segundo curso: " + contadorMujeresSegundo);

    }
    public static int customIndexOf(String frase, String palabra) {
        int index = frase.indexOf(palabra);
        return index == -1 ? 0 : index;
    }
}
