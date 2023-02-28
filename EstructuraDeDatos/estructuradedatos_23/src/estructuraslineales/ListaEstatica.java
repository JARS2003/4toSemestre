package estructuraslineales;

import entradaSalida.SalidaPorDefecto;

/**
 *
 *Esta clase implemento los metodos de Lista.
 *@VERSION 1.0
 *@autor Clase ED
 *
 */
public class ListaEstatica implements VectorLista {
    protected int tope;
    protected int MAXIMO;
    protected Object informacion[];

    public ListaEstatica(int tamanio) {
        MAXIMO = tamanio;
        informacion = new Object[tamanio];
        tope = -1;
    }

    public Object[] getInformacion() {
        return informacion;
    }

    @Override
    public boolean vacia() {
        if (tope == -1) {
            return true;

        } else {
            return false;
        }
    }
    public int getMAXIMO() {
        return MAXIMO;
    }
    @Override
    public int agregar(Object info) {
        if (llena() == false) {
            tope += 1;
            informacion[tope] = info;
            return tope;
        } else {
            return -1;
        }
    }

    @Override
    public void imprimir() {
        for (int celda = tope; celda >= 0; celda--) {
            SalidaPorDefecto.terminal(informacion[celda] + "\n");
        }

    }

    @Override
    public void imprimirOI() {
        for (int celda = tope; celda >= 0; celda++) {
            SalidaPorDefecto.terminal(informacion[celda] + "\n");
        }

    }

    @Override
    public Object buscar(Object info) {
        int posicion = 0;
        while (posicion <= tope && info.toString().equalsIgnoreCase(informacion[posicion].toString()) == false) {
            posicion++;
        }
            if (posicion > tope) {
                return -1;
            } else {
                return posicion;
            }

    }
    @Override
    public Object eliminar(int indice) {
        if (indice >= 0 && indice<=tope) {//si esta
            Object eliminado = informacion[indice];
            tope--;
            for (int movs = indice; movs <= tope; movs++) {
                informacion[movs] = informacion[movs + 1];

            }
            return eliminado;
        }
        return false;
    }

    @Override
    public boolean llena() {
        if (tope == (MAXIMO - 1)) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public Object maximo() {//regresa el tsmsño msximo
        return MAXIMO;
    }

    @Override
    public Object cantidad() {//regresa la cantidad de elemnetos existentes en el arreglo
        return tope+1;
    }

    @Override
    public boolean esIgual(Object lista2) {
        if ((lista2 instanceof ListaEstatica) && (this.maximo() == ((ListaEstatica) lista2).maximo())) {
            for (int comparador = 0; comparador <= (Integer) this.maximo() - 1; comparador++) {
                ListaEstatica lista2Estatica = (ListaEstatica) lista2;
                if (!(informacion[comparador].toString().equalsIgnoreCase(lista2Estatica.getInformacion()[comparador].toString()))) {//Si no son iguales, regresa falso
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    @Override
    public Object obtener(int indice) {
        if (validarRnago(indice)) {//Valida que exista el inice dentro de la lista
            return informacion[indice];
        }
        return null;
    }
    private boolean validarRnago(int indice){
        if(indice>=0 && indice<=tope){
            return true;
        }
        return false;
    }

    @Override
    public boolean cambiar(Object infoViejo, Object infoNuevo, int numVeces) {
        if (numVeces<=tope ){
            for (int cambiador=0;cambiador<numVeces;cambiador++){
                int posicon=(int)buscar(infoViejo);
                if (posicon>-1)
                    informacion[posicon]=infoNuevo;
                }
            return true;

        }
        return false;
    }

    @Override
    public boolean cambiar(int indice, Object info) {
        if (indice<=tope && indice>=0){
            informacion[indice]=info;

        }
        return false;
    }

    @Override
    public boolean cambiarListaEstatica(ListaEstatica indicesBusqueda, ListaEstatica infosNuevos) {

        return false;
    }



    @Override
    public ListaEstatica buscarValores(Object info) {

        ListaEstatica listaInfo =new ListaEstatica(contar(info));
        for (int indice=0;indice<=tope;indice++){
            if(informacion[indice].toString().equalsIgnoreCase(info.toString())){
                listaInfo.agregar(indice);
            }
        }
        return listaInfo;
    }

    @Override
    public Object eliminar(Object valor) {
        int posicion = (Integer)buscar(valor);
        if(posicion>=0){ // si esta
            Object eliminado = informacion[posicion];
            tope--;
            for(int movs = tope; movs > posicion; movs--){
                informacion[movs] = informacion[movs+1];
            }
            return eliminado;
        }else { // no esta
            return null;
        }
    }

    @Override
    public Object eliminar() {
        if (vacia()==false){
            Object respaldo = informacion[tope];
            tope=tope-1;
            return respaldo;
        }

        return null ;
    }

    @Override
    public void vaciar() {
       tope=-1;

    }

    @Override
    public void invertir() {
        ListaEstatica listaInvertida = new ListaEstatica(getMAXIMO());
            for(int indice=0;indice<=getTope()-1;indice++){
                listaInvertida.informacion[getTope()-1-indice]=informacion[indice];

            }
            for (int indice =0;indice<=getTope()-1;indice++){
                informacion[indice]=listaInvertida.informacion[indice];
            }

    }

    @Override
    public boolean agregarLista(Object lista2) {
        return false;
    }

    @Override
    public int contar(Object info) {
        int contador=0;
        for (int indice=0;indice<=tope;indice++){
            if (info.toString().equalsIgnoreCase(informacion[indice].toString())){
                contador++;
            }
        }
        return contador;
    }
    @Override
    public ListaEstatica subLista(ListaEstaticaNumerica listaIndices) {
        ListaEstatica listaNueva = new ListaEstatica(listaIndices.tope+1);
        if(vacia() == false){
            for(int indiceLista = 0; indiceLista <= listaIndices.tope; indiceLista++){
                if(obtener((int) listaIndices.obtener(indiceLista)) != null){
                    Object objeto = (obtener((int)listaIndices.obtener(indiceLista)));
                    listaNueva.agregar(objeto);
                }
            }
            return listaNueva;
        }
        return listaNueva;
    }

    @Override
    public Object verUltimo() {
        if (vacia()==false){
            return informacion[tope];

        }else {
            return null;
        }
    }
    @Override
    public void copiarBufer(Object[] bufer) {

            for (int buferIndice=0;buferIndice<MAXIMO;buferIndice++){
                agregar(bufer[buferIndice]);
            }

    }
    public Object[] leerArreglo(){
        Object[] arregloAuxiliar = new Object[MAXIMO];
        for(int indiceArreglo = 0; indiceArreglo <= tope; indiceArreglo++){
            arregloAuxiliar[indiceArreglo] = informacion[indiceArreglo];
        }
        return arregloAuxiliar;
    }

    public int getTope() {
        return tope;
    }
}




