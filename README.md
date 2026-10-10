<img width="480" height="220" alt="WhatsApp Image 2026-09-28 at 16 44 28" src="https://github.com/user-attachments/assets/3004b28e-c062-45d8-ac83-adfeb87f7a2d" />

 Gestión de Pedidos en un Restaurante

 Descripción
Este proyecto consiste en un sistema en Java que permite gestionar los pedidos de un restaurante. El mozo toma el pedido del cliente y lo envía a la cocina para que los platos sean preparados.

 Clases
- **Plato:** contiene el nombre, el precio y el tiempo estimado de preparación de cada plato.
- **Pedido:** guarda una lista de platos y el número de mesa correspondiente.
- **Cocina:** recibe las comandas mediante el método `recibirComanda(Pedido pedido)` y las registra en una cola de pedidos pendientes.
- **Mozo:** se encarga de enviar los pedidos a la cocina mediante el método `enviarPedidoACocina(Pedido pedido, Cocina cocina)`.

 Funcionamiento
En el `main` se crean los objetos `Cocina` y `Mozo`. Luego, se arma un pedido con varios platos y se envía a la cocina. Finalmente, se muestra por consola el estado de los pedidos pendientes.

 Recorrido del mensaje
1. El programa crea la cocina y el mozo.
2. Se crean los platos con sus respectivos datos.
3. Se arma un pedido con una lista de platos y el número de mesa.
4. El mozo llama al método `enviarPedidoACocina()` y pasa el pedido y la cocina como parámetros.
5. El mozo se comunica con la cocina, que recibe el pedido mediante `recibirComanda()`.
6. La cocina agrega el pedido a su cola de pendientes.
7. Finalmente, se muestra por consola la información del pedido registrado.

 Objetivo
Practicar la comunicación entre objetos en Java, el uso de listas y colas, el envío de objetos como parámetros y la colaboración entre distintas clases para gestionar pedidos.
