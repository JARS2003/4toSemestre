package estructuraslineales;

/**
 * Esta clase contiene los metodos de un TDA liSTA
 * @VERSION 1.0
 * @autor Clase ED
 */
public interface Lista {
    /**
     * Este metodo regresa un indicador de si la lista esta vacia.
     * @return regresa <b>true</b> si esta vacia, <b>falso</b> en caso contrario.
     */
    public boolean vacia();

    /**
     * Este metodo añade un elemento a la lista
     * @param info Es el nuevo valor a añadir
     * @return Regresa la posiscion en donde lo agrega o -1 en caso contrario.
     */
    public int agregar(Object info);

    /**
     * Este metodo imprime una lista.
     */
    public void imprimir();
    /*
    Este metodo imprime una lista en un orden inverso.
     */
    public void imprimirOI();

    /**
     * Este metodo busca un objeto dentro de una lista.
     * @param info Es el objetos que se busca.
     * @return Regresa la posicion en la que se encuentra los objetos.
     */
    public Object buscar(Object info);

    /**
     * Este metodo elimina un objeto dentro de una lista
     * @param info Es el valor que se va a eliminar
     * @return Regresa el objeto que se elimino
     */
    public Object eliminar(int indice);

    /**
     * Indica si la lista actual es igual a la lista2
     * @param lista2 Es la lista a comparar
     * @return Regresa ture si son iguales, falso en caso contrario..
     */
    public boolean esIgual(Object lista2);

    /**
     * Regresa el objeto de la posicion indice.
     * @param indice Es el que nos dice de que posicion tenemos que obtener el objeto.
     * @return Regresa el objeto segun el indice, null en caso de no encontrar el objeto en el inice indicado.
     */
    public Object obtener(int indice);
    public boolean cambiar(Object infoViejo, Object infoNuevo, int numVeces);

    /**
     * Este metodo busca dentro de un arreglo los elementos indicados por info
     * @param info Es la informacion que se busca dentro de la lista.
     * @return Regresa un arreglo con las posiciones y cada una de las ocurrencias del elemnto buscado.
     */
    public ListaEstatica buscarValores(Object info);

    /**
     * Este metodo te regresa el objeto de la ultima posicion del objeto.
     * @return Regres el objeto en la ultima posicion.
     */
    public Object eliminar(Object valor);

    /**
     * Este metodo vacio una lista.
     */
    public void vaciar();
    public void invertir();

    /**
     * Este metodo agrega al final de una lista otra lista.
     * @param lista2 Es la lista que se va agregar al final de la otra lista.
     * @return regresa verdader si se pudo agregar, falso en caso contrario.
     */
    public boolean agregarLista(Object lista2);

    /**
     * Este metodo cuena cuantas veces se repite un elemento y lo regresa
     * @param info Es el elemeto del que se quiere saber cuantas veces se repite.
     * @return Regresa la cantidad de veces repetida
     */
    public int contar(Object info);

    /**
     * Regresa el objeto de la última posición del arreglo.
     * @return Regresa la ultima posicion del arreglo.
     */
    public Object eliminar();

    /**
     * Regresar un arreglo conteniendo los elementos del arreglo
     * actual que se obtienen del arreglo de índices “listaIndices”, el cual contiene las
     * posiciones de los índices de donde se obtendrán los datos a retornar. Significa que
     * se deberán hacer dos métodos, el correspondiente en la super clase
     * @param listaIndices Contienen los indices que van ser la subLista
     * @return Regresa el arreglo con los objetos que se indicaron en lo insices.
     */
    ListaEstatica subLista(ListaEstaticaNumerica listaIndices);
    public Object verUltimo();
    public void copiarBufer(Object[] bufer);





}
