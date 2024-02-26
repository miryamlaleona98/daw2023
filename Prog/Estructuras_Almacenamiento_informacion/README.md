# ESTRUCTURAS DE ALMACENAMIENTO

Tipos según:

	* Almacenamiento
		- Almacenar varios datos del mismo tipo (arrays,listas y conjuntos)
		- Almacenr varios datos de distinto tipo (clases)

	* Capacidad de cambio
		- Su tamaño se establece en su creación (Arrays o matrices)
		- Variable (clases)

	* Orden
		- No ordenadas (arrays)
		- Ordenadas 

## Cadenas de carácteres
La forma mas hábitual de ver escrita una cadena de caracteres es como un literal de cadena --> "Hola"

En Java, los literales de cadena son en realidad instancias de la clase String. Podemos crear los literales de dos maneras: 

1. Partiendo de un literal: `String cad="Ejemplo de cadena";`
2. Utilizando el operador new y un constructor: `String cad=new String ("Ejemplo de cadena");`

### Operaciones avanzadas con cadenas de carácteres

La operación mas sencilla es la concatenación, pudiendose realizar de dos formas:
`String cad = "¡Bien"+"venido!";` `String cad="¡Bien".concat("venido!");`
De ambas formas se instancia la clase String tres veces: "Bien", "Venido" y su resultado "Bienvenido". Esta instancia la realizamos a la clase String, pudiendo así acceder a sus métodos, que en el segundo caso fue .concat().

El método String esta disponible en todas clases de Java. Su objetivo es convertir una instancia de clase a cadena de texto.
No todas instancias lo permiten, así que en estos casos solo se proporcionará información relativa a la instancia.
Se invoca automáticamente:

`Integer i1=new Integer (1223);`
`System.out.println("Número: " + i1); //"Número: 1223" `

**_int length()_**

Retorna el número entero que contiene la longitud de la cadena.

**_char charAt (int pos)_**

Retorna el carácter ubicado en la posición pasada por parámetro. Las posiciones se almacenan en char y se contabilizan desde 0 hasta -1.

**_String substring (int beginIndex, int endIndex)_**

Permite extraer una subcadena.

<img src="/Volumes/Extreme SSD/MacDown/Programación/Estructuras de almacenamiento/Teoria/subString_begin_end.png"  width="250" height="100">


**_String subcad (int beginIndex)_**

Si unicamente proporcionamos un parámetro, extraerá una cadena que comenzará en el carácter con posición beginIndez e irá hasta el final de la cadena.

**_¿Cómo convertir cadenas a número?_**

* **_valueOf()_**: se trata de un método existente en en tdoas las clases envoltorio descendientes de la clase Number (Integer, Long, Short, Float y Double).
	
`String c = "1234.5678";`
`n=Double.valueOf(c).doubleValue();`

* **_Format_**: Es un método estático de la clase string. Permite creat una cadena proyectando los argumentos en un formato específico de salida.

`float precio=3.3f;`
`String salida=string.format ("El precio es: %.2f €", precio));`

> %.2f se trata de un especificador de formato. Es una subcadena dentro de una cadena, que específica como se debe formatear un dato concreto que se pasa como argumento al método format().

**_Métodos importantes de la clase String_**

*  cad1.compareTo(cad2): Permite comparar dos cadenas entre sí lexicográficamente.
*  cad1.equals(cad2)
*  cad1.compareToIgnoreCase(cad2) cad1.equalsIgnoreCase(cad2): Funciona igual que compareTo pero ignora las mayúsuclas y minúsculas en la comparación.
*  cad1.trim(): Genera una copia de la cadena eliminando los espacios en blanco anteriores y posteriores de la cadena.
*  cad1.toLowerCase()
*  cad1.toUpperCase()
*  cad1.indexOf(cad2)
cad1.indexOf(cad2,num) : Si la cadena o carácter pasado por argumento está contenida en la cadena invocante, retorna su posición, en caso contrario retornará -1. Opcionalmente se le puede indicar la posición a partir de la cual buscar, lo cual es útil para buscar varias apariciones de una cadena dentro de otra.
* cad1.contains(cad2)
* cad1.startsWith(cad2)	
* cad1.endsWith(cad2)	
* cad1.replace(cad2,cad3)	: Generará una copia de la cadena cad1, en la que se reemplazarán todas las apariciones de cad2 por cad3. El reemplazo se hará de izquierda a derecha, por ejemplo: reemplazar "zzz" por "xx" en la cadena "zzzzz" generará "xxzz" y no "zzxx".

> String es un objeto inmutable. Disponemos de stringBuilder y StringBuffer que son mutables. StringBuffer esta pensado para aplicaciones multihilo y ocupa mas espacio. 


## Expresiones regulares
Permiten comprobar si una candena sigue o no un patrón preestablecido. Siguen cuatro reglas básicas:

	1. Indicar conjunto de símbolos fijos. Habrá excepciones con algunos símbolos que necesitarán un carácter de escape.
	2. [xyz] : Sólo uno de los símbolos podrá aparecer en el lugar donde están los carácteres. Ej: "aaa[xy]", "aaax".
	3. [a-z][A-Z][a-zA-Z]: Usando el guión y los corchetes podemos indicar que el patrón admite cualquier carácter entre la letra inicial y la final.
	4. [0-9] : Se permite la presencia de un dígito numérico entre 0 y 9.

¿Cómo indicar repeticiones?

	* "a?" : a puede aparecer 1 o 0 veces.
	* "a*" : a puede aparecer 1,n o 0 veces: "aa","aaaaaa"
	* "a+" : Otro símbolo debe aparecer al menos una vez, pudiendo repetirse cuantas veces quiera.
	* a{1,4} : {min,max} n veces min y max que un símbolo aparece.
	* a{2,} : mínimo de veces que debe aparecer el símbolo.
	* a{5} : n veces exacto que debe aparecer el símbolo.
	* Los indicadores de repetición pueden usarse tambión con corchetes: [a-z]{1,4}[0-9]+

### ¿Cómo uso las expresiones regulares?
Usando las clases Pattern y Matcher, contenidas en el paquete java.util.regex*
La clase pattern procesa la expresión regular y la "compila", mientras que matcher comprueba si la cadena sigue o no el patrón.
`Pattern p=Pattern.compile("[01]+");`
`Matcher m=p.matcher("00001010");`

Otras construcciones adicionales:
	* [^abc] : ^ tras [ Negación. La expresión admitirá lo contrario a "acb".
	
	* ^[01]+$ : ^ delante de [ indica el comienzo de línea o entrada. El símbolo $ indica fin de línea.
	* "." : Simboliza cualquier carácter.
	* "\\d" : Un dígito númerico. Equivale a [0-9]
	* "\\D" : Cualquier cosa excepto un dígito númerico. [^0-9]
	* "\\s" : Un espacio en blanco
	* "\\S" : Cualquier cosa excepto un espacio en blanco
	* "\\w" : Cualquier carácter que podrías encontrar en una palabra. [a-zA-Z_0-9]

### Uso de los paréntesis
Permiten indicar repeticiones para un conjunto de símbolos, por ejemplo (#[01]){2,3}. En este caso, la expresión #[01] admitirá cadenas como #0 o #1, teniendo que repetirse la secuencia entre 2 y 3 veces. Admitiría: #0#1 o #0#1#0.

Los paréntesis sirven también para definir grupos:
`Pattern p=Pattern.compile("([XY]?)([0-9]{1,9})([A-Za-z])");`
`Matcher m=p.matcher("X123456789Z Y00110011M 999999T");`
`while (m.find()){    System.out.println("Letra inicial (opcional):"+m.group(1));
System.out.println("Número:"+m.group(2));
System.out.println("Letra NIF:"+m.group(3));
}`

Usando el método group() podemos obtener por separado el texto contenido en cada uno de los grupos. El primer grupo es el 1, y no el 0. Si se usa group(0) se obtiene una cadena con toda la coincidnecia en la cadena.
Se usa el método find(), que buscará una a una, cada una de las ocurrencias del patrón.

### Secuencias de escape
Alunos carácteres son reservados, por lo que utilizaremos las secuencias de escape.
Cuando queramos introducir en nuestro patrón un {, deberemos hacerlo de la siguiente manera: \\{
La **excepción son las comillas**, que sencillamente su secuencia de escape es con una barra \"

## Creación de Arrays
Los arrays permiten almacenar una colección de objetos o datos del mismo tipo.
`int [] n; //declaración del array tipo[] nombre`
`n = new int[10] //Creación del array reservando para el un espacio en memoria nombre=new tipo[dimension]`
`int[] m = new int[10] // declaración y creacion en un mismo lugar`

### Arrays unidimensionales
Existen tres ámbitos de uso importante de los arrays:

**1. Modificación de una posición del array**

Se especifica entre corchetes la posición a modificar después del nombre del array
`int[] Numeros=new int[3]; // Array de 3 números (posiciones del 0 al 2).`
`Numeros[0]=99; // Primera posición del array.`
`Numeros[1]=120; // Segunda posición del array.`
`Numeros[2]=33; // Tercera y última posición del array.`

**2. Acceso a una posición del array**
Acceder a un dato ya existente dentro del array, indicando la ubicación exacta y array.
`int suma=Numeros[0] + Numeros[1] + Numeros[2];`

> Los arrays, como objetos que son en Java, disponen de una propiedad pública denominada length, la cual nos permite conocer su tamaño. `System.out.println("Longitud del array: "+Numeros.length); `

**3. Paso de parámetros**
Para pasar como argumento un array a una función o método, esta debe tener en su definición un parámetro declarado como array.

	int sumaarray (int[] j) {
		int suma=0;

        for (int i=0; i<j.length;i++)

            suma=suma+j[i];

        return suma;
       } 

En este método se pasa como argumento un array númerico, sobre el cual se calcula la suma de todos los números que contiene. 

**_CUIDADO:_** En java las variables se pasan por copia a los métodos, es decir, cuando se pasa una variable a un método, y se realiza una modificación de su valor en dicho método, el valor de la variable en el método desde el que se ha realizado la invocación no se modifica. Pero esto no pasa con los arrays. Cuando se modifica el valor de uno de los elementos del array, si que cambia su valor de forma definitiva. 
public static void main(String[] args) {

     int j=0; int[] i=new int(1);  i[0]=0;

     modificaArray(j,i); 

     System.out.println(j+"-"+i[0]);  /* Mostrará por pantalla "0–1", puesto que el contenido del array es   

          modificado en la función, y aunque la variable j también se modifica, se modifica una copia de la misma,

          dejando el original intacto */ } 

	int modificaArray(int j, int[] i); {

     j++; int[0]++;  /* Modificación de los valores de la variable, solo afectará al array, no a j */}

#### Inicialización de arrays

Es habitual crear un array a través de un método que lo cree y rellene: 

	static int[] ArrayConNumerosConsecutivos (int totalNumeros) {

        int[] r=new int[totalNumeros];

        for (int i=0;i<totalNumeros;i++) r[i]=i;

        return r; }
En caso de conocer las series que conformaran el array: 
	`int[] array = {10, 20, 30};`

	String[] diassemana= {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
	
Cuando se trata de un array de objetos, se ha de tener en cuenta que, el valor inicial de los elementos del array de objetos será null. En otras palabras, crear un array de objetos no significa que se han creado las instancias de los objetos. Hay que crear, para cada poisición del array, el objeto del tipo correspondiente con el operador new. 
`StringBuilder[] j=new StringBuilderStringBuilder[10];`
`for (int i=0; i<j.length;i++) System.out.println("Valor" +i + "="+j[i]); // Imprimirá null para los 10 valores.`

Para solucionar este problema podemos optar por lo siguiente, crear para cada posición del array una instancia del objeto:
`StringBuilder[] j=new StringBuilder[10];`
`for (int i=0; i<j.length;i++) j[i]=new StringBuilder("cadena "+i);`

### Arrays multidimensionales
`int[][] a2d=new int[4][5];`
> tipo [][] nombre = new tipo[filas][columnas];

Para asignar un valor a una posición concreta de la matriz multidimensional simplemente debemos poner su nombre y posición: `a2d[0][0]=3;`
`int suma=a2d[0][0]+a2d[0][1]+a2d[0][2]+a2d[0][3]+a2d[0][4];`

Los arrays multidimensionales también pueden ser utilizados como parámetro en los métodos:

	static int sumaarray2d(int[][] a2d) {

        int suma = 0;

        for (int i1 = 0; i1 < a2d.length; i1++) 

            for (int i2 = 0; i2 < a2d[i1].length; i2++)  suma += a2d[i1][i2];

        return suma;
    }
    
[Ejercicios arrays multidimensionales](https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?codigo=98&punto=&inicio=20)

#### Inicialización de arrays multidimensionales

	int[][] inicializarArray (int n, int m)

	{

     int[][] ret=new int[n][m];

     for (int i=0;i<n;i++)

          for (int j=0;j<m;j++)

               ret[i][j]=n*m;

     return ret;

	}
	
	int[][] a2d={{0,1,2},{3,4,5},{6,7,8},{9,10,11}};

	int[][][] a3d={{{0,1},{2,3}},{{0,1},{2,3}}};


