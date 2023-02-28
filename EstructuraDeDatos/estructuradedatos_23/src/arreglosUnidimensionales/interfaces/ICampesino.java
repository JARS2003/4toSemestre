package arreglosUnidimensionales.interfaces;

import arreglosUnidimensionales.implementacion.Campesino;
import estructuraslineales.ListaEstatica;

/**
 *Esta clase solo contiene el metodo para sacar el promedio por anio del trabajador
 * @VERSION 1.0
 * @autor Jesus Angel
 */
public interface ICampesino {
    /**
     * Este metodo regresa el promedio de los valores que contiene la lista, en este caso 12, representando un año.
     * @param listaEstatica Es un lista estatica con las toneladas producidas por mes
     * @return regresa el promedio de toneladas por año.
     */
    public double promedioAnual(ListaEstatica listaEstatica);

    /**
     * Este promedio se encarga de ver cuantos meses soobrepasan el promedio anual.
     * @param listaEstatica Es un lista estatica con las toneladas producidas por año.
     * @return Regresa la cantidad de meses que son mas grandes al promedio.
     */
    public int toneladasMayoresPromedioAnual(ListaEstatica listaEstatica);

    /**
     * Este metodo se encarga de obtener el mes que menos produccion tuvo en el ano.
     * @param listaEstatica Es un lista estatica con las toneladas producidas por año.
     * @return Regrea el mes que produjo menos toneladas por año.
     */

    public int menosToneladaMes(ListaEstatica listaEstatica);

    /**
     * Este metodo regresa las toneladas del ultimo mes del año.
     * @param listaEstatica Es un lista estatica con las toneladas producidas por año.
     * @return Regresa las toneladas del ultimo mes del año.
     */

    public double toneladasUltimoMes(ListaEstatica listaEstatica);

    /**
     * Este metodo suma las toneladas que se encuentran en el segundo trimestre del año.
     * @param listaEstatica
     * @return Regresa las toneladas que se hicieron en els egundo trimestre de año.
     */

    public double toneladasTrimestre(ListaEstatica listaEstatica);

    /**Este metodo recibe la produccion de los 4 años para obtener en que mes se gana un mayor dividendo para los trabajadores.
     *
     * @param listaEstatica Es un lista estatica con las toneladas producidas por el año 1.
     * @param listaEstatica2 Es un lista estatica con las toneladas producidas por el año 2.
     * @param listaEstatica3 Es un lista estatica con las toneladas producidas por el año 3.
     * @param listaEstatica4 Es un lista estatica con las toneladas producidas por el año 4.
     * @return Regresa el mes en el que los trabajadores ganan mas divideindo.
     */
    public int mayorDividendo(ListaEstatica listaEstatica,ListaEstatica listaEstatica2,ListaEstatica listaEstatica3,ListaEstatica listaEstatica4);

    /**
     *Este metodo recibe la produccion de los 4 años para obtener la epoca en la que mas produccion hay.
     * @param listaEstatica Es un lista estatica con las toneladas producidas por el año 1.
     * @param listaEstatica2 Es un lista estatica con las toneladas producidas por el año 2.
     * @param listaEstatica3 Es un lista estatica con las toneladas producidas por el año 3.
     * @param listaEstatica4 Es un lista estatica con las toneladas producidas por el año 4.
     * @return Regresa la epoca en la que mas se producen toneladas.
     */
    public String mayorProduccion(ListaEstatica listaEstatica,ListaEstatica listaEstatica2,ListaEstatica listaEstatica3,ListaEstatica listaEstatica4);

}
