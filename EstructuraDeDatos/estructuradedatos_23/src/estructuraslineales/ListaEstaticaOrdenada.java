package estructuraslineales;

import utilerias.comunes.Comparador;
import utilerias.comunes.TipoOrden;

/**
 * Esta clase sobre escribe metodos de Lista y listaEstatica, pero para listas ordenadas.
 *  @VERSION 1.0
 *  @autor Clase ED
 */
public class ListaEstaticaOrdenada extends ListaEstatica {
    TipoOrden orden;

    public ListaEstaticaOrdenada(int tamanio, TipoOrden orden) {

        super(tamanio);
        this.orden = orden;
    }

    public void setOrden(TipoOrden orden) {
        this.orden = orden;
    }


    @Override
    public int agregar(Object info) {

        if (llena() == false) {
            int posicion = (int) buscar(info);
            if (posicion < 0) {
                tope++;
                posicion = posicion * (-1);
                posicion--;
                for (int movs = tope; movs >= posicion + 1; movs--) {
                    informacion[movs] = informacion[movs - 1];
                }
                informacion[posicion] = info;
                return posicion;
            } else {
                return -1;
            }
        }
        return -1;
    }


    @Override
    public Object buscar(Object info) {
        int posicion = 0;
        if (orden == TipoOrden.INC) {
            while ((int) Comparador.comparador(posicion, tope) <= 0 && (int) Comparador.comparador(info, informacion[posicion]) > 0) {
                posicion++;
            }
            if ((int) Comparador.comparador(posicion, tope) > 0 || (int) Comparador.comparador(info, informacion[posicion]) < 0) {
                return (posicion + 1) * (-1);
            } else {
                return posicion + 1;
            }

        } else if (orden == TipoOrden.DEC) {
            while ((int) Comparador.comparador(posicion, tope) <= 0 && (int) Comparador.comparador(info, informacion[posicion]) < 0) {
                posicion++;
            }
            if ((int) Comparador.comparador(posicion, tope) > 0 || (int) Comparador.comparador(info, informacion[posicion]) > 0) {
                return (posicion + 1) * (-1);
            } else {
                return posicion + 1;
            }
        }
        return null;
    }


    @Override
    public boolean cambiar(Object valorViejo, Object valorNuevo, int numeroOcurrencia) {
        if (numeroOcurrencia == 1) {
            int indice = (int) buscar(valorViejo);
            if (indice > 0) {
                indice--;
            }
            eliminar(valorViejo);
            agregar(valorNuevo);
            return true;
        }
        return false;

    }

    @Override
    public Object eliminar(Object valor) {
        int posicion = (int) buscar(valor);
        if (posicion > 0) {
            posicion--;
            Object respaldo = informacion[posicion];
            tope = tope - 1;
            for (int movs = posicion; movs <= tope; movs++) {
                informacion[movs] = informacion[movs + 1];

            }
            return respaldo;
        }
        return null;
    }


    @Override

    public boolean cambiar(int indice, Object info) {
        if (indice <= tope) {
            eliminar(indice);
            agregar(info);
            return true;
        }
        return false;

    }


    @Override
    public boolean agregarLista(Object lista2) {
        if(lista2 instanceof ListaEstaticaOrdenada){
            for(int indice = 0; indice <= MAXIMO-1; indice++){
                agregar(((ListaEstaticaOrdenada) lista2).obtener(indice));
            }
            return true;
        }
        return false;

    }

    @Override
    public void invertir() {
        ListaEstaticaOrdenada listaInversa = new ListaEstaticaOrdenada(getMAXIMO(), TipoOrden.DEC);
        for (int indInver = 0; indInver < (int) getMAXIMO(); indInver++) {
            listaInversa.agregar(obtener(indInver));
        }
        vaciar();
        if (orden == TipoOrden.INC) {
            setOrden(TipoOrden.DEC);
            for (int indDec = 0; indDec < (int) maximo(); indDec++) {
                agregar(listaInversa.obtener(indDec));
            }
        } else if (orden == TipoOrden.DEC) {
            setOrden(TipoOrden.INC);
            for (int indDec = 0; indDec < (int) maximo(); indDec++) {
                agregar(listaInversa.obtener(indDec));
            }


        }


    }

    public TipoOrden getOrden() {
        return orden;
    }

    /**
     * Desordena el arreglo
     * @return regresa la lista con el arreglo desordenado
     */
    public ListaEstatica arregloDesordenado() {
        ListaEstatica listaDesordenada = new ListaEstatica((int) maximo());
        for (int mitad1 = tope; mitad1 > tope / 2; mitad1--) {
            listaDesordenada.agregar(obtener(mitad1));
        }
        for (int mitad2 = 0; mitad2 < tope / 2 + 1; mitad2++) {
            listaDesordenada.agregar(obtener(mitad2));
        }
        return listaDesordenada;

    }
    /**
     * Indica si la lista2 (que es otro arreglo ordenado) es una sublista o subconjunto
     * de la lista actual.
     * @param lista2 Es la lista a comparar
     * @return Regresa true si si es sub lista
     */
    public boolean esSubLista(Lista lista2) {
        if (lista2 instanceof ListaEstaticaOrdenada) {
            Object objeto1SubLista = ((ListaEstaticaOrdenada) lista2).obtener(0);
            int posicionListaOriginal = (int) buscar(objeto1SubLista) - 1;
            for (int indice = 0; indice < ((ListaEstaticaOrdenada) lista2).tope; indice++) {
                if ((int) Comparador.comparador(obtener(posicionListaOriginal), ((ListaEstaticaOrdenada) lista2).obtener(indice)) != 0) {
                    return false;
                }
                posicionListaOriginal++;
            }
            return true;
        }
        return false;


    }
    /**
     * Debe cambiar los elementos de lista2 que se encuentren en la lista
     * actual con los elementos de la lista2Nuevos. Cada elemento de lista2 coincide en
     * posición con su nuevo valor a cambiar en lista2Nuebos
     * @param lista2 Es la lista con indices a buscar
     * @param lista2Nueva son los objetos que tiene que insertar
     * @return regresa true si si cambia la lista
     */
    public boolean cambiarLista(Lista lista2, Lista lista2Nueva) {
        if(lista2 instanceof ListaEstatica && lista2Nueva instanceof ListaEstatica){
            for(int indice =  0; indice < ((ListaEstatica) lista2).getMAXIMO(); indice++){
                if((int)Comparador.comparador(((ListaEstatica) lista2).obtener(indice), obtener((int)buscar(((ListaEstatica) lista2).obtener(indice))-1)) == 0){
                    cambiar(obtener((int)buscar(((ListaEstatica) lista2).obtener(indice))-1), ((ListaEstatica) lista2Nueva).obtener(indice), 1 );
                }
            }
            return true;
        }
        return false;
    }
    /**
     * Retiene los objetos de lista 2 que esten  en la lista principal y son los que deja en la lista principal
     * @param lista2 es la lista con los objetos a retener
     * @return regresa true si si tiene objetos iguales
     */
    public boolean retenerLista(Lista lista2) {
        if (lista2 instanceof ListaEstatica) {
            for (int indice = 0; indice < ((ListaEstatica) lista2).MAXIMO; indice++) {
                if ((int) Comparador.comparador(((ListaEstatica) lista2).obtener(indice), obtener((int) buscar(((ListaEstatica) lista2).obtener(indice)) - 1)) == 0) {
                    eliminar((int) buscar(((ListaEstatica) lista2).obtener(indice)) );
                }
            }
            return true;
        }


        return false;
    }
}
