package com.mycompany.ejercicios_arrays;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author miryamlaleona
 * 
 * Ejercicios disponibles en la siguiente URL
 * https://protective-preface-d77.notion.site/JAVA-Ejercicios-arrays-f89e4c58e4814fa48e95a87265bf1836
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
         * Leer un vector de 10 componentes y calcular el más grande y el más
         * pequeñp de ellos, y los lugares que ocupan
         *
         */
        int[] vectorOrden = new int[10];
        int mayor = vectorOrden[0];
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < vectorOrden.length; i++) {

            System.out.println(vectorOrden[i] = rand.nextInt(100));

            if (vectorOrden[i] > mayor) {
                mayor = vectorOrden[i];
            }
        }

        for (int i = 0; i < vectorOrden.length; i++) {
            if (vectorOrden[i] < menor) {
                menor = vectorOrden[i];
            }
        }
        System.out.println("el mayor es: " + mayor);
        System.out.println("el menor es: " + menor);

        /**
         * EJERCICIO 03
         *
         * Generar dos vectores de dimensión 10 (introducir valores aleatorios
         * entre 1 y 5) Comprobar para cada uno de los elementos del primer
         * vector cuántas veces está en el segundo Ejemplo: primero vector :
         * 3,7,2 segundo vector: 3,3,5 el resultado debe ser: elemento 1: 2
         * veces elemento 2: 0 veces elemento 3: 0 veces
         */
        // PRIMERA FORMA DE RESOLVER EL PROBLEMA. 
        int[] vectorComparacion00 = new int[10];
        int[] vectorComparacion01 = new int[10];

        // Rellenamos los dos vector con números aleatorios
        for (int i = 0; i < vectorComparacion00.length; i++) {
            System.out.println("Vectores : ");
            System.out.println(vectorComparacion00[i] = rand.nextInt(5));
            System.out.println(vectorComparacion01[i] = rand.nextInt(5));

        }

        // Inicializamos un contador
        int contadorElementoUno = 0;
        int contadorElementoDos = 0;
        int contadorElementoTres = 0;
        int contadorElementoCuatro = 0;
        int contadorElementoCinco = 0;
        int contadorElementoSeis = 0;
        int contadorElementoSiete = 0;
        int contadorElementoOcho = 0;
        int contadorElementoNueve = 0;
        int contadorElementoDiez = 0;

        // Recorremos el primer vector con un bucle for 
        for (int i = 0; i < vectorComparacion00.length; i++) {
            if (vectorComparacion00[0] == vectorComparacion01[i]) {
                contadorElementoUno++;
            }
            if (vectorComparacion00[1] == vectorComparacion01[i]) {
                contadorElementoDos++;
            }
            if (vectorComparacion00[2] == vectorComparacion01[i]) {
                contadorElementoTres++;
            }
            if (vectorComparacion00[3] == vectorComparacion01[i]) {
                contadorElementoCuatro++;
            }
            if (vectorComparacion00[4] == vectorComparacion01[i]) {
                contadorElementoCinco++;
            }
            if (vectorComparacion00[5] == vectorComparacion01[i]) {
                contadorElementoSeis++;
            }
            if (vectorComparacion00[6] == vectorComparacion01[i]) {
                contadorElementoSiete++;
            }
            if (vectorComparacion00[7] == vectorComparacion01[i]) {
                contadorElementoOcho++;
            }
            if (vectorComparacion00[8] == vectorComparacion01[i]) {
                contadorElementoNueve++;
            }
            if (vectorComparacion00[9] == vectorComparacion01[i]) {
                contadorElementoDiez++;
            }
        }
        System.out.println("El elemento uno se repite: " + contadorElementoUno);
        System.out.println("El elemento dos se repite: " + contadorElementoDos);
        System.out.println("El elemento tres se repite: " + contadorElementoTres);
        System.out.println("El elemento cuatro se repite: " + contadorElementoCuatro);
        System.out.println("El elemento cinco se repite: " + contadorElementoCinco);
        System.out.println("El elemento seis se repite: " + contadorElementoSeis);
        System.out.println("El elemento siete se repite: " + contadorElementoSiete);
        System.out.println("El elemento ocho se repite: " + contadorElementoOcho);
        System.out.println("El elemento nueve se repite: " + contadorElementoNueve);
        System.out.println("El elemento diez se repite: " + contadorElementoDiez);

        // SEGUNDA FORMA DE RESOLVER EL PROBLEMA
        int[] vectorComparacion02 = new int[10];
        int[] vectorComparacion03 = new int[10];

        // Rellenamos los dos vectores con números aleatorios entre 1 y 5
        for (int i = 0; i < vectorComparacion00.length; i++) {
            vectorComparacion02[i] = rand.nextInt(5) + 1;
            vectorComparacion03[i] = rand.nextInt(5) + 1;
        }

        // Array para almacenar los contadores de cada elemento
        int[] contadores = new int[5];

        // Contamos las apariciones de cada elemento del primer vector en el segundo vector
        // Con el primer bucle accedemos al vector i
        // Con el for anidado, compararemos elemento a elemento [i] con cada uno de los elementos de [j]
        // Es así pues que, podremos comparar y contabilizar las apariciones.
        // Lo añadimos en un array 
        for (int i = 0; i < vectorComparacion02.length; i++) {
            int elemento = vectorComparacion02[i];
            for (int j = 0; j < vectorComparacion03.length; j++) {
                if (vectorComparacion03[j] == elemento) {
                    contadores[elemento - 1]++; // Incrementamos el contador correspondiente
                }
            }
        }

        // Mostramos los resultados
        for (int i = 0; i < contadores.length; i++) {
            System.out.println("El elemento " + (i + 1) + " se repite: " + contadores[i] + " veces");
        }

        /**
         * EJERCICIO 04
         *
         * Generar una matriz de cuatro filas y cinco columnas con números
         * aleatorios entre y 100, e imprimirla
         */
        int[][] matrizCuatroPorCinco = new int[4][5];

        // Recorremos la matriz e introducimos los valores aleatorios
        for (int i = 0; i < matrizCuatroPorCinco.length; i++) {
            for (int j = 0; j < matrizCuatroPorCinco[i].length; j++) {
                matrizCuatroPorCinco[i][j] = rand.nextInt(100);
            }
        }

        // Imprimimos la matriz
        for (int i = 0; i < matrizCuatroPorCinco.length; i++) {
            for (int j = 0; j < matrizCuatroPorCinco[i].length; j++) {
                System.out.print(matrizCuatroPorCinco[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * EJERCICIO 05
         *
         * Generar una matriz de 10x10 Suma e imprime cada una de sus filas y de
         * sus columnas
         */
        int[][] matrizDiezPorDiez = new int[10][10];

        // Rellenamos la matriz con datos aleatorios
        for (int i = 0; i < matrizDiezPorDiez.length; i++) {
            for (int j = 0; j < matrizDiezPorDiez[i].length; j++) {
                matrizDiezPorDiez[i][j] = rand.nextInt(10);
            }
        }
        // Imprimimos la matriz
        for (int i = 0; i < matrizDiezPorDiez.length; i++) {
            for (int j = 0; j < matrizDiezPorDiez[i].length; j++) {
                System.out.print(matrizDiezPorDiez[i][j] + " ");
            }
            System.out.println();
        }

        // Sumatorio de las filas 
        for (int i = 0; i < matrizDiezPorDiez.length; i++) {
            int sumatorioFilas = 0;
            for (int j = 0; j < matrizDiezPorDiez[i].length; j++) {
                sumatorioFilas += matrizDiezPorDiez[i][j];
            }
            System.out.println("sumatorio fila: " + sumatorioFilas);
        }

        // Sumatorio de las columnas
        // Obtener el número de filas y columnas
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Array para almacenar el sumatorio de cada columna
        int[] sumatorioColumnas = new int[columnas];

        // Obtengo el número de filas extrayendo el primer vector de la matriz
        // Iterar sobre cada columna
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;

            // Iterar sobre cada fila en la columna actual
            for (int i = 0; i < filas; i++) {

                // Sumar el elemento en la fila i y columna j
                sumaColumna += matriz[i][j];

            }
            sumatorioColumnas[j] = sumaColumna;
        }

        // Imprimir el sumatorio de cada columna
        for (int j = 0; j < columnas; j++) {
            System.out.println("Sumatorio de la columna " + j + ": " + sumatorioColumnas[j]);
        }

        /**
         * EJERCICIO 06 
         * 
         * Generar una matriz de 3x3 Imprimir el valor más grande y
         * el mas pequeño También la posició que estos ocupan
         */
        int[][] matrizMayorMenor = new int[3][3];

        // Rellenamos la matriz con datos aleatorios
        for (int i = 0; i < matrizMayorMenor.length; i++) {
            for (int j = 0; j < matrizMayorMenor[i].length; j++) {
                matrizMayorMenor[i][j] = rand.nextInt(10);

                //System.out.print(matrizMayorMenor[i][j] + "\t");
            }
            //System.out.println();
        }
        
        
        // Con el contador contadorPosicion contabilizamos todas las posicones
        // Con posicionMayor pasaremos a contadorPosicion la ubicacion del mayor que encontremos en el recorrido
        int contadorPosicion = 0;
        int posicionMayor = 0;
        int posicionMenor = 0;
        
        // Recorreremos todos los elementos de la matriz, e iremos actualizando el mayor valor que encontremos en esta variable
        int mayorMayores = 0;
        int menorMenores = 11;
        
        for (int i = 0; i < matrizMayorMenor.length; i++) {

            for (int j = 0; j < matrizMayorMenor[i].length; j++) {
                contadorPosicion++;
                
                if (matrizMayorMenor[i][j] > mayorMayores) {
                    mayorMayores = matrizMayorMenor[i][j];
                    posicionMayor = contadorPosicion;
                }
                
                if (matrizMayorMenor[i][j] < menorMenores){
                    menorMenores = matrizMayorMenor[i][j];
                    posicionMenor = contadorPosicion;
                    
                    
                }

                System.out.print(+matrizMayorMenor[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("el mayor de todos es: " + mayorMayores);
        System.out.println("la posicion del mayor es: " + posicionMayor);
        
        System.out.println("el menor de todos es: " + menorMenores);
        System.out.println("la posicion del menor es: " + posicionMenor);
        
        
        /**
         * EJERCICIO 07 
         * 
         * Generar una matriz de 5x5 númerica
         * Pedir dos números de fila, que se deben filtrar entre 1 y 5 e intercambiar ambas filas.
         * Presentar las matrices antes y después del cambio.
         * 
         */
        
        Scanner scann = new Scanner(System.in);
        //System.out.println("Introduce las filas a intercambiar");
        //System.out.println("Fila 1: ");
        //int fila1 = scann.nextInt();
        //System.out.println("Fila 2: ");
        //int fila2 = scann.nextInt();
        
       
        int[][] matrizIntercambio = new int[5][5];
        
        System.out.println("Matriz sin modificar");
        
        // Rellenamos la matriz con datos aleatorios
        for (int i = 0; i < matrizIntercambio.length; i++) {
            for (int j = 0; j < matrizIntercambio[i].length; j++) {
                matrizIntercambio[i][j] = rand.nextInt(10);

                System.out.print(matrizIntercambio[i][j] + "\t");
            }
            System.out.println();
        }
       
        
        //int[] vectorTemporal = matrizIntercambio[fila1];
        
        //matrizIntercambio[fila1] = matrizIntercambio[fila2];
        
        //matrizIntercambio[fila2] = vectorTemporal;
        
        
        System.out.println("Matriz modificada");
        
        for (int i = 0 ; i < matrizIntercambio.length ; i++){
            for (int j = 0 ; j < matrizIntercambio[i].length ; j++){
                System.out.print(matrizIntercambio[i][j]);
            }
            System.out.println();
        }
        
        
        /**
         * EJERCICIO 08
         * 
         * Almacenar las notas de 10 alumnos (con números decimales), para cada una de las cinco asignaturas
         * Emplearemos una matriz de 10 filas (una para cada alumno) y 5 columnas (una para cada asignatura)
         * Se debe crear la matriz del tamaño adecuado con valores iniciales a 0.
         * Se irá pidiendo al usuario por teclado que nota quiere actualizar y de qué alumno. Es decir:
         * Índicame el alumno(1-10):5; Indicame la asigntarua (1-5):3; Indicame la nota: 5,6
         * Se deberá guardar en la fila y la columna correspondiente la nota 5,6
         * Después de cada cambio se imprimirá por pantalla la matriz completa
         */
        
        // Al declarar una matriz bidimensional, la primera matriz delimita las filas y la segunda matriz la largura de estas
        // En otras palabras, en primer lugar indicamos las filas y luego las columnas.
        
        double[][] matrizAlumnos = new double [5][10];
        
         // Rellenamos la matriz con doubles valor 0.0
        for (int i = 0; i < matrizAlumnos.length; i++) {
            for (int j = 0; j < matrizAlumnos[i].length; j++) {
                matrizAlumnos[i][j] = 0;

                System.out.print(matrizAlumnos[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Indica númericamente el alumno");
        int numAlumno = scann.nextInt();
        
        System.out.println("Indica númericamente la asignatura");
        int numAsignatura = scann.nextInt();
        
        System.out.println("Indica númericamente la nota del alumno");
        double notaAlumno = scann.nextDouble();
        
        matrizAlumnos[numAlumno][numAsignatura] = notaAlumno;
 
        for (int i = 0 ; i < matrizAlumnos.length ; i++){
            for (int j = 0 ; j < matrizAlumnos[i].length ; j++){
                System.out.print(matrizAlumnos[i][j] + "\t");
            }
            System.out.println();
        }
    } 
}
