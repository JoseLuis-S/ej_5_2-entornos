enum class EstadoPedido {
    PENDIENTE_DE_PAGO, ENVIADO, SIN_ENVIAR, PENDIENTE_DE_ENVIO
}

enum class TipoPago {
    TARJETA, EFECTIVO, CHEQUE
}

data class Producto(
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val stock: Int
) {
    fun actualizarStock(cantidad: Int) {
        // Lógica para actualizar stock
    }
}

data class Cliente(
    val nombre: String,
    val pedidos: MutableList<Pedido> = mutableListOf()
) {
    fun realizaPedido(pedido: Pedido) {
        pedidos.add(pedido)
    }
}

data class Pedido(
    val numero: Int,
    val descripcion: String,
    val precio: Double,
    val stock: Double,
    var estado: EstadoPedido,
    val productos: MutableList<Producto> = mutableListOf()
) {
    fun agregarProducto(producto: Producto, cantidad: Int) {
        productos.add(producto)
        // Lógica para manejar cantidad y stock
    }

    fun calcularTotal(): Double {
        return productos.sumOf { it.precio }
    }

    fun actualizarEstado(nuevoEstado: EstadoPedido) {
        estado = nuevoEstado
    }
}

data class Pago(
    val metodo: TipoPago,
    val cantidad: Double
) {
    fun registrarPago() {
        // Lógica para registrar el pago
    }
}

data class Tarjeta(
    val nombre: String,
    val fechaCaducidad: String,
    val tipoTarjeta: String
)

data class Cheque(
    val nombre: String,
    val banco: String
)
