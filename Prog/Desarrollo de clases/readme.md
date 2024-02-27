# Modificadores de acceso: atributos, clases y métodos

## Declaración de clases

	[modificadores] class  <NombreClase> [herencia][interfaces] { // Cabecera de la clase

     // Cuerpo de la clase

     Declaración de los atributos

     Declaración de los métodos}
 
 
 	class <NombreClase> [extends <NombreSuperClase>][implements <NombreInterface1>] [[implements <NombreInterface2>] ...] 

 Modificadores de una clase [public] [final | abstract]: 
 
*  **Public**: Indica que la clase es visible y se pueden crear objetos de esa clase, desde cualquier otra. Sino se especifica este modificador, la clase sólo podrá ser utilizada desde clases que estén en el mismo paquete. Sólo puede haber una clase public(clase principal).
*  **Abstract**: Una clase abstracta no es instanciable. No es posible crear objetos de esa clase, para ello habrá que utilizar clases que hereden de ella. 
*  **Final**: Indica que no podrás crear clases que hereden de ella. Los modificadores Abstract y final son excluyentes, esto quiere decir que solo se puede utilizar uno de ellos.

## Declaración de atributos

	[modificadores] <tipo> <nombreAtributo>;
	
	[private | protected | public] [static] [final] [transient] [volatile] <tipo> <nombreAtributo>;
	
### Modificadores de acceso
* **Modificador de acceso por omisión (o de paquete)**: Sino se indica un modificador de acceso, se permitirá el acceso a este atributo desde todas las clases que estén dentro del mismo package que esta clase (la que contiene el atributo que se está declarando).
* **Public**: Cualquier clase tiene acceso a ese atributo.
* **Private**: Sólo se puede acceder al atributo desde dentro de la propia clase. El atributo estará oculto para cualquier otra zona de código fuera de la clase en la que se está declarando el atributo. 
* **Protected**: Se permitirá acceder al atributo desde cualquier subclase de la clase en la que se encuentre declarado el atributo, y también desde las clases del mismo paquete. 

### Modificadores de contenido
* **Static**: Hace que el atributo sea común para todos los objetos de una misma clase. Es decir, todas las clases compartirán ese mismo atributo con el mismo valor. El atributo será siempre el mismo para todos los objetos y tendrá un valor único independientemente de cada objeto. Es más, aunque no exista ningún objeto de esa calse, el atributo si existirá y podrá contener un valor (pues se trata de un atributo de la clase más que de un objeto).
Un ejemplo de atributo estático es un contador de clase, con el que poder llevar un control de la cantidad de veces que fue instanciada.
 
* **final**: Indica que el atributo es una constante. Su valor no podrá ser modificado a lo largo de la vida del objeto. Por convenio, se escriben en mayúsculas.

## Declaración de métodos

	[private | protected | public] [static] [abstract] [final] [native] [synchronized]

	<tipo> <nombreMétodo> ( [<lista_parametros>] )

	[throws <lista_excepciones>]

### Modificadores de acceso
Son los mismos que en el caso de los atributos (por omisión, public, private y protected) y tienen el mismo cometido (acceso al método sólo por parte de clases del mismo paquete, o por cualquier parte del programa, o sólo para la propia clase, o también para las subclases).

Los métodos privados se utilizan para relizar operaciones intermedias o auxiliares y que son utilizados por los métodos que sí forman parte de la interfaz (comprobación, adaptación de formatos, cálculos intermedios...). 

### Modificadores de contenido
Son también los mismos que en el caso de los atributos (static y final), aunque su significado no es el mismo. Hay otros aplicables solo a métodos:

* **Static**: es aquel cuya implementación es igual para todos los objetos de la clase y sólo tendra acceso a los atributos estáticos de la clase (dado que se trata de un método de clase y no de objeto, sólo podrá acceder a la información de clase y no la de un objeto en particular). Este tipo de métodos pueden ser llamados sin necesidad de tener un objeto de la clase instanciado. En cualquier caso, los objetos también admiten la invocación de los métodos estáticos de su clase y funcionaría correctamente.
Los métodos estáticos no pueden manipular atributos de instancias (objetos) sino atributos estáticos (de clase). Ejemplos de uso: incremento o decremento de contadores, operaciones genéricas relacionadas con la clase pero no utilizan atributos de instancia. Los métodos de cambio de tipo son estaticos.

* **Final**: Se trata de un método que no permite ser sobreescrito por las clases descendientes de la clase a la que pertenece el método.
* **Native**: es utilizado para señalar que un método ha sido implementado en código nativo.
* **Abstract**: es un método que no tiene implementación. La implementación será realizada en las clases descendietnes. Un método solo puede ser declarado como abstract si se encuenta dentro de una clase abstract
* **Synchronized**: El entorno de ejecución obligará a que cuando un proceso esté ejecutando este método, el resto de procesos que tengan que llamar a ese mismo método deberán esperar a que el otro proceso termine.

### Sobrecarga de métodos
Java permite declarar en una misma clase varias versiones del mismo método con el mismo nombbre. La forma que tendrá el compilador de distinguir entre varios métodos que tengan el mismo nombre será mediante la lista de parámetros del método.

### Referencia this
Consiste en una referencia al objeto actual. 
Dado qeu this es una referencia a la propia clases en la que te encuentras en este momento, puedes acceder a sus atributps mediante el operador (this.nombreAtributo).

	void establecerX (int x)
	{
     this.x= x;
	}

## Constructores
Un constructor es un método que tiene el mismo nombre que la clase a la que pertenece y que no devuelve ningún valor tras su ejecución. Su función es la de proporcionar el mecanismo de creación de instancias de la clase. 
Para crear el objeto, es necesario realizar una llamada a un método constructor de la clase a la que pertenece ese objeto. Ese proceso se realiza mediante la utilización del operador new. 
Es posible realizar sobrecarga de métodos constructores.
Es necesario que toda clase tenga al menos un constructor. Si no se define ningún constructor en la clase, el compilador creará por nosotros un constructor por defecto vacío que se encarga de inicializar todos los atributos a sus valores por defecto.

 	public Punto (int x, int y)
	{
     this.x= x;

     this.y= y;

     cantidadPuntos++;  // Suponiendo que tengamos un atributo estático cantidadPuntos
	}
	
Utilización del constructor: 
	
	Punto p1;
	p1= new Punto (10, 7); 
	
> La estructura de los constructores es similar a la de cualquier método, con las excepciones de que no tiene tipo de dato devuelto (no devuelve ningún valor) y que el nombre del método constructor debe ser obligatoriamente el nombre de la clase.

#### Constructores de copia
Un constructor copia es un método constructor que recibe como parámetro una referencia al objeto cuyo contenido se desea copiar. Este método revisa cada uno de los atributos del objeto recibido como parámetro y se copian todos sus valores en los atributos del objeto que se está creando.

	public Punto (Punto p)
	{
     this.x= p.obtenerX();

     this.y= p.obtenerY();
	}
	
	Punto p1, p2;
	p1= new Punto (10, 7);
	p2= new Punto (p1);
	
#### Destrucción de objetos
Cuando un objeto deja de ser utilizado, los recursos usados por él deberían ser liberados para que puedan volver a ser utilizados por otros procesos. De esto se encarga el recolector de basura. Busca periódicamente objetos que yo no son referenciados y los marca para ser eliminados.
En java podemos utilizar el método finalize() para hacer esto mismo manualmente.

### Empaquetado de clases 
Un paquete consiste en un conjunto de clases relacionadas entre sí y agrupadas bajo un mismo nombre. Normalmente se encuentran en un mismo paquete todas aquellas clases que forman una biblioteca o que reúnen algún tipo de característica común.
Los paquetes se organizan jerárquicamente de manera similiar a lo que encontrariamos en una estructura de carpetas Por ejemplo las clases básicas del lenguaje se encuentran en el paquete java.lang, las clases de entrada/salida las podrás encontrar en el paquete java.io y en el paquete java.math podrás observar algunas clases para trabajar con números grandes y de gran precisión.

Para acceder a cualquier clase de un paquete:
`paquete_raiz.subpaquete1.subpaquete2. ... .subpaquete_n.NombreClas`

Si quisieramos utilizar varias clases del paquete, simplemente utilizaremos "*" (importamos todas las clases del paquete).
Al inicio de clada clase se debe indicar al paquete que esta misma pertenece:
	
	package paqueteEjemplo;
	class claseEjemplo {
   	...
	} 
	
