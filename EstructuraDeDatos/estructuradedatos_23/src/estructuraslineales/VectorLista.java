package estructuraslineales;

/**
 * Esta clase tiene metodos de un TDA Lista.
 * @VERSION 1.0
 * @autor Jesus
 */
public interface VectorLista extends Lista {
    public boolean llena();
    /**
     * Este metodo indica el  tamaño maximo que tiene un arreglo.
     * @return Regresa el tamaño del arreglo.
     */
    public Object maximo();

    /**
     * Este metodo indica la cantidad de objetos que tiene un arreglo.
     * @return Regresa el total de objetos que tiene el arreglo.
     */
    public Object cantidad();

    /**
     * Este metodo cambia el elemento que se encuentra en la posicion indece por info.
     * @param indice Es la podcion donde se encuentr el elemento a eliminarmodificar.
     * @param info Es la informacion que se va a cambiar.
     * @return
     */
    public boolean cambiar(int indice, Object info);

    /**
     * Modifica el elemnto del arreglo actual en las posiciones de indicesBusqueda por el contenido de infosNuevos
     * @param indicesBusqueda Indica en que posicion se modificara el elemento de la lista actual por el nuevo.
     * @param infosNuevos Es la informacion que va a sustituir a la informacion vieja.
     * @return
     */
    public boolean cambiarListaEstatica(ListaEstatica indicesBusqueda,ListaEstatica infosNuevos);


}
