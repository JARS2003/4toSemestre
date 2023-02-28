package arreglosUnidimensionales.interfaces;

import arreglosUnidimensionales.implementacion.Campesino;
import estructuraslineales.ListaEstatica;

/** Esta clase contiene los metodos que le necesarios para la resolucion del problema dado, para la practica 3
 * @VERSION 1.0
 * @autor Jesus Angel
 *
 */
public interface IEmpresaArroz {
    //public void promedioAnual(Campesino campesino);

    /**
     * Este metodo compara al campesino1 con el 2 para ver quien fue pero duarante el año.
     * @param campesino1 Es el campesino 1 que se compara con el campesino 2.
     * @param campesino2 Es el campesino 12 que se compara con el campesino 3.
     * @return Regresa un lista estatica con los nombres de los trabajadores, segun el año
     */
    public ListaEstatica peorTrabajo(Campesino campesino1,Campesino campesino2);


}
