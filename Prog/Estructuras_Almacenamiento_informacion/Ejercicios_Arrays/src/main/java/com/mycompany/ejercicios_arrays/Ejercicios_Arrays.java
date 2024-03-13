/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicios_arrays;

import java.util.Random;

/**
 *
 * @author miryamlaleona
 */
public class Ejercicios_Arrays {

    public static void main(String[] args) {

        /**
         * EJERCICIO INICIALIZACIÓN DE UN ARRAY, RECORRERLO Y RELLENARLO UNO A
         * UNO
         */
        // Crear una matriz de 3x3 con los números del 1 al 9
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * matriz.length) + j + 1;
            }
        }

        /**
         * EJERCICIO 00
         *
         * Se generan 20 números aleatorios de tipo entero y se almacenan en un
         * vector. Hay que calcular y mostrar la media y, además, mostrar
         * cuántos números hay: 1) Superiores a la media 2) Inferiores a la
         * media 3)Iguales a la media
         */
        int[] vector = new int[20];

        Random rand = new Random();

        // Inicializamos la suma 
        int suma = 0;
        int contador = 0;

        // Con vector[i] accedemos a cada iteración sucedida dentro del vector
        for (int i = 0; i < vector.length; i++) {

            vector[i] = rand.nextInt(100);

            // Sumarizamos todos los datos del vector
            suma += vector[i];

            // Contabilizamos todas las entradas al vector, aunque ya sabemos de inicipio que seran 20
            contador++;
        }

        int media = suma / contador;

        // Números del vector superiores a la media
        // Inicializamos el contador para los números del vector que sean superiores a la media
        int contadorSuperioresMedia = 0;
        int contadorInferiorMedia = 0;
        int contadorIgualMedia = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > media) {
                contadorSuperioresMedia++;
            }
            if (vector[i] < media) {
                contadorInferiorMedia++;
            }
            if (vector[i] == media) {
                contadorIgualMedia++;
            }
        }

        System.out.println("La media de todos los numeros es: " + media + " y la cantidad total de números es: " + contador);
        System.out.println("La cantidad de números del vector que superan la media es de: " + contadorSuperioresMedia);
        System.out.println("La cantidad de números del vector que son inferiores a la media es de: " + contadorInferiorMedia);
        System.out.println("La cantidad de números del vector que son iguales a la media es de: " + contadorIgualMedia);

        /**
         * EJERCICIO 01
         *
         * Crear dos vector de dimensión 10 con números enteros aleatorios entre
         * el 1 y el 10 Construir un tercer vector, e imprimirlo, cuyos
         * componentes sean la suma de los dos anteriores
         */
        
        // Creamos los tres vectores que necesitaremos en el ejercicio
        int[] vectorInicial = new int[10];
        int[] vectorSecundario = new int[10];

        int[] vectorFinal = new int[10];

        // Rellenamos con un bucle for vectorInicial y vectorSecundario
        for (int i = 0; i < vectorInicial.length; i++) {
            vectorInicial[i] = rand.nextInt(11);
        }

        for (int i = 0; i < vectorSecundario.length; i++) {
            vectorSecundario[i] = rand.nextInt(11);
        }

        // Recorremos el vector final y hacemos el sumatorio
        for (int i = 0; i < vectorFinal.length; i++) {
            vectorFinal[i] = vectorSecundario[i] + vectorInicial[i];
            System.out.println("vectorFinal " + vectorFinal[i]);
        }
        
         /**
         * EJERCICIO 02
         *
         * Leer un vector de 10 componentes y calcular el más grande y el más pequeñp de ellos,
         * y los lugares que ocupan
         * 
         */
         
         int[] vectorOrden = new int[10];
         int mayor = vectorOrden[0];
         int menor = Integer.MAX_VALUE;
         
         for (int i = 0 ; i < vectorOrden.length ; i++){
             
             System.out.println(vectorOrden[i] = rand.nextInt(100));
                         
             if (vectorOrden[i] > mayor){
                 mayor = vectorOrden[i];
             }
         }
         
         for (int i = 0 ; i < vectorOrden.length ; i++){
              if (vectorOrden[i] < menor){
                 menor = vectorOrden[i];
             }
         }
         System.out.println("el mayor es: "+mayor);
         System.out.println("el menor es: "+menor);
         
         /**
         * EJERCICIO 03
         *  
         * Generar dos vectores de dimensión 10 (introducir valores aleatorios entre 1 y 5)
         * Comprobar para cada uno de los elementos del primer vector cuántas veces está en el segundo
         * Ejemplo: 
         * primero vector : 3,7,2 
         * segundo vector: 3,3,5 el resultado debe ser:
         * elemento 1: 2 veces
         * elemento 2: 0 veces
         * elemento 3: 0 veces
         */
         
         
    }
}
