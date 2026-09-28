public class Mozo {

    public void enviarPedidoACocina(Pedido pedido, Cocina cocina) {

        System.out.println(
                "Mozo enviando pedido de la mesa "
                        + pedido.numeroMesa + " a cocina..."
        );

        cocina.recibirComanda(pedido);
    }
}
