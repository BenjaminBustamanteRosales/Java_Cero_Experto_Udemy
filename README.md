# Java: De Cero a Experto

Este repositorio contiene mis prácticas, apuntes y código fuente del curso "Java: De Cero a Experto".

**Lenguaje:** Java

**Entorno de Desarrollo (IDE):** IntelliJ IDEA

El objetivo de este proyecto es documentar mi proceso de aprendizaje, desde los fundamentos básicos de la programación hasta conceptos más avanzados en Java, guardando un registro de todos los ejercicios prácticos.

Dentro de la carpeta `src` se encuentran distintas aplicaciones estructuradas para dominar los fundamentos del lenguaje, incluyendo:

## Fundamentos: variables y tipos de datos

* **Variables:** Declaración, inicialización y asignación de variables.
* **TipoVar:** Uso de `var` y la inferencia de tipos en variables locales.
* **TiposDatos:** Recorrido por los tipos de datos primitivos (`int`, `double`, `boolean`, `char`, etc.).
* **ReglasNombresVariables:** Reglas y buenas prácticas para nombrar variables correctamente.
* **LeeTiposDatos:** Lectura de distintos tipos de datos ingresados por el usuario.

## Entrada y salida por consola

* **ManejoConsola:** Entrada y salida de datos por consola.
* **CaracteresEspeciales:** Uso de secuencias de escape (`\n`, `\t`, `\"`, etc.) en la salida de texto.
* **NumerosAleatorios:** Generación de números aleatorios.

## Operadores y lógica

* **OperadorTernario:** Uso del operador ternario como alternativa compacta al `if-else`.
* **DeterminarMayorDeDosNums:** Comparación de dos números para determinar cuál es el mayor.
* **ValorDentroRango:** Verificación de si un valor se encuentra dentro de un rango determinado.
* **Calculadora:** Calculadora básica con operaciones aritméticas.

## Cadenas de texto (String)

* **ConcatenacionCadenas:** Distintas formas de unir cadenas de texto.
* **CadenasIndices:** Acceso a caracteres de una cadena mediante índices.
* **BusquedaDeSubCadena:** Búsqueda de subcadenas dentro de un texto.
* **FormateoCadenas:** Formateo de texto con `printf` y `String.format`.

## Funciones y estructuras de datos

* **Funciones:** Definición y llamada de métodos.
* **FuncionSumar:** Ejemplo práctico de función que recibe parámetros y retorna un resultado.
* **Arrays:** Declaración, recorrido y manipulación de arreglos.

## Clases y objetos

* **DetalleDeUnaPersona:** Programa que muestra la información detallada de una persona.
* **DetalleLibro:** Programa que muestra la información detallada de un libro.

## Programación orientada a objetos: paquetes y herencia

Ejercicios organizados en paquetes dentro de `src`, donde una clase de prueba (con `main`) usa las clases de otro paquete:

* **persona/Persona:** Clase que modela a una persona con sus atributos y métodos, ahora ubicada en su propio paquete.
* **PruebaPersona/PruebaPersona:** Clase de prueba que importa `Persona` desde otro paquete y crea objetos a partir de ella.
* **aritmetica/Aritmetica:** Clase con operaciones aritméticas reutilizables desde otras clases.
* **Prueba/PruebaAritmetica:** Clase de prueba que crea un objeto de `Aritmetica` y utiliza sus métodos.
* **animales/Animal:** Clase de animales para practicar herencia entre clases.
* **JavaBeans:** Clase que sigue el estándar JavaBean (atributos privados con sus métodos `get` y `set`).
* **ventas (paquete):** Clases del dominio de ventas, organizadas en su propio paquete.
* **PruebaVentas (paquete):** Clase de prueba que crea objetos del paquete `ventas` y los utiliza.

## Manejo de errores

* **Excepciones:** Manejo de excepciones con `try-catch` para controlar errores en tiempo de ejecución.

## Aplicaciones y ejercicios prácticos

* **GeneradorDeEmail:** Lógica para construir direcciones de correo corporativas a partir de datos de usuarios.
* **GeneradorDeIdUnico:** Algoritmo para la creación de identificadores únicos alfanuméricos.
* **SistemaDeEmpleados:** Gestión de datos, variables y tipos de datos asociados a trabajadores.
* **SistemaDeReservaDeHoteles:** Ejercicio práctico de entrada y salida de datos por consola para reservas.
* **SistemaReservaHotel:** Variante del sistema de reservas de hotel.
* **TiendaEnLinea:** Estructura básica para el manejo de variables de inventario, productos y clientes.
* **TiendaOnline:** Otra versión de tienda en línea con manejo de productos y clientes.
* **SistemaDeAutentificacion:** Validación de credenciales de usuario (usuario y contraseña).
* **SistemaDescuentosVIP:** Cálculo de descuentos según la categoría del cliente.
* **SistemaPrestamoLibros:** Gestión básica del préstamo de libros.
* **AppCajeroAutomatico:** Simulación de un cajero automático (consultas, depósitos y retiros).
* **RecetasDeCocina:** Ejercicio que representa una receta con sus ingredientes y pasos.
* **SaludYFitness:** Ejercicio de cálculos y datos relacionados con salud y fitness.