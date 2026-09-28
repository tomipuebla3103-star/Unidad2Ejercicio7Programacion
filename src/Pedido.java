public class Pedido {
    Plato[] platos;
    int numeroMesa;
    int cantidadPlatos;

    public  Pedido(int numerMesa){
        this.numeroMesa= numerMesa;
        platos=new Plato[10];
        cantidadPlatos = 0;
    }
    public void agregarPlato(Plato plato){

        if (cantidadPlatos < 10){
            platos[cantidadPlatos]= plato;
            cantidadPlatos++;
        }
    }
}
