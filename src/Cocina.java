public class Cocina {
    Pedido[] pedidosPendientes;
    int cantidadPedidos;

    public Cocina() {
        pedidosPendientes = new Pedido[10];
        cantidadPedidos = 0;
    }

    public void recibirComanda(Pedido pedido) {

        if (cantidadPedidos < 10) {
            pedidosPendientes[cantidadPedidos] = pedido;
            cantidadPedidos++;

            System.out.println(
                    "Pedido de la mesa " + pedido.numeroMesa
                            + " recibido en cocina."
            );
        } else {
            System.out.println("La cocina está llena.");
        }
    }

    public void mostrarEstado() {

        System.out.println();
        System.out.println("===== ESTADO DE LA COCINA =====");

        if (cantidadPedidos == 0) {
            System.out.println("No hay pedidos pendientes.");
        } else {

            for (int i = 0; i < cantidadPedidos; i++) {

                Pedido pedido = pedidosPendientes[i];

                System.out.println(
                        "Pedido pendiente - Mesa "
                                + pedido.numeroMesa
                );

                for (int j = 0; j < pedido.cantidadPlatos; j++) {

                    System.out.println(
                            "  - " + pedido.platos[j].nombre
                    );
                }
            }
        }
    }
}
