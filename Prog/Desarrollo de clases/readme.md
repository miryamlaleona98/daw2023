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

### Modificadores de contenido
Son también los mismos