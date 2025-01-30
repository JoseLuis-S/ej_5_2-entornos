# EJ 5_2 Entornos de desarrollo

## a) Elementos del UML con mapeo a conceptos de POO
En mi diagrama UML, identifiqué varios elementos que tienen un mapeo directo a conceptos de la Programación Orientada a Objetos (POO):

Clases: Representé en UML las clases Cliente, Pedido, Producto, Pago, Tarjeta y Cheque, y las traduje directamente a clases en Kotlin.
Atributos: Definí propiedades clave para cada clase, como nombre, precio y estado.
Métodos: Implementé comportamientos como registrarPago(), calcularTotal() y agregarProducto(), reflejando la funcionalidad del sistema.
Asociaciones: Modelé la relación uno a muchos entre Cliente y Pedido, así como entre Pedido y Producto, utilizando listas en Kotlin.
Enumeraciones: Definí EstadoPedido y TipoPago como enum class para estructurar los diferentes estados y tipos de pago.

## b) Herramienta utilizada para generar el diagrama UML
Para crear el diagrama UML, utilicé LucidChart, ya que me pareció una herramienta sencilla e intuitiva.

## c) Conversión del UML a código Kotlin
Clases y atributos: Creé clases con atributos que coinciden con los tipos de datos adecuados.
Listas para asociaciones: Implementé las relaciones entre Cliente y Pedido, así como entre Pedido y Producto, con List<Pedido> y List<Producto>.
Uso de data class: Opté por data class para modelos inmutables como Producto, Tarjeta y Cheque, facilitando su manejo.
Enumeraciones: Utilicé enum class para EstadoPedido y TipoPago.
Métodos para comportamiento: Implementé métodos como registrarPago() y calcularTotal() para reflejar las operaciones del diagrama.

## UML

![Descripción de la imagen](https://raw.githubusercontent.com/JoseLuis-S/ej_5_2-entornos/main/Ejercicio5.2.png)
