//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cocina cocina = new Cocina();

    Mozo mozo = new Mozo();

    Plato plato1 = new Plato("Hamburguesa", 5000, 15);
    Plato plato2 = new Plato("Papas fritas", 2500, 10);
    Plato plato3 = new Plato("Pizza", 7000, 20);

    Pedido pedido = new Pedido(5);

    pedido.agregarPlato(plato1);
    pedido.agregarPlato(plato2);
    pedido.agregarPlato(plato3);

    mozo.enviarPedidoACocina(pedido, cocina);

    cocina.mostrarEstado();
}

