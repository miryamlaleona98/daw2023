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

<img src="images/subString_begin_end.png"  width="250" height="100">


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




