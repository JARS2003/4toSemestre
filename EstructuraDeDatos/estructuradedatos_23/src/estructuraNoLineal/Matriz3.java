package estructuraNoLineal;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;

public class Matriz3 {
    protected int renglones;
    protected int columnas;
    protected int profundidad;
    protected Object informacion[][][];

    public Matriz3(int renglones, int columnas, int profundidad) {
        this.renglones = renglones;
        this.columnas = columnas;
        this.profundidad = profundidad;

        informacion=new Object[renglones][columnas][profundidad];
    }
    public Matriz3(int renglones, int columnas, int profundidad, Object info) {
        this.renglones = renglones;
        this.columnas = columnas;
        this.profundidad = profundidad;
        informacion=new Object[renglones][columnas][profundidad];
        rellenar(info);

    }

    public void rellenar(Object info){
        //recorrer todos los renglones
        for (int cadaRenglon = 0; cadaRenglon < renglones; cadaRenglon++){
            for (int cadaColumna = 0; cadaColumna < columnas; cadaColumna++){
                for (int cadaProfundidad = 0; cadaProfundidad < profundidad; cadaProfundidad++){
                    informacion[cadaRenglon][cadaColumna][cadaProfundidad] = info;
                }
            }
        }
    }

    public int getRenglones() {
        return renglones;
    }

    public void setRenglones(int renglones) {
        this.renglones = renglones;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    public boolean cambiar(int renglon,int columna,int prof,Object info){
        if(validarRango(renglon,renglones)==true
                && validarRango(columna,columnas)==true
                && validarRango(prof,profundidad)==true){
            informacion[renglon][columna][prof]=info;
            return true;

        }else {
            return false;

        }
    }
    private boolean validarRango(int indice,int limiteSuperio){
        if (indice>=0 && indice<limiteSuperio){
            return true;
        }else {
            return false;

        }

    }
    public Object obtener(int renglon,int columna,int prof){
        if(validarRango(renglon,renglones)==true
                && validarRango(columna,columnas)==true
                && validarRango(prof,profundidad)==true){

            return informacion[renglon][columna][prof];

        }
        return null;
    }
    public void imprimirxColumna(){
        //Lo trataremos como rebanadas, donde cada rebanada es una columna
        for (int cadaRebanada =0;cadaRebanada<columnas;cadaRebanada++){
            //Aqui comienza cada rebanada
            for (int cadaRenglon=0;cadaRenglon<renglones;cadaRenglon++){
                for (int cadaColumna=0;cadaColumna<profundidad;cadaColumna++){
                    SalidaPorDefecto.terminal(informacion[cadaRenglon][cadaRebanada][cadaColumna]+" ");

                }
                //despues de todas las columnas, hacer salto de linea
                SalidaPorDefecto.terminal("\n");
            }
            //Despues de todos los renglones
            SalidaPorDefecto.terminal("\n");

        }

    }
    //Gaurdar en una matriz de dos dimensiones de la actual.
    public ListaEstatica aMatrizez2(){
        ListaEstatica matrices2 = new ListaEstatica(columnas);
        //Obtener cada rebanada(Que es una matriz 20)
        for (int cadaRebanada=0;cadaRebanada<columnas;cadaRebanada++) {//columna
            Matriz2 matriz2Temporal = new Matriz2(renglones,profundidad);
            for (int renglon=0;renglon<renglones;renglon++){
                for (int profCal=0;profCal<profundidad;profCal++){
                    //llenaar matriz 2
                    matriz2Temporal.cambiar(renglon,profCal,informacion[renglon][cadaRebanada][profCal]);
                }
            }
            //Despues de procesar la matriz2 interna
           matrices2.agregar(matriz2Temporal);
        }
        return matrices2;
    }
    public void imprimirPorRenglon() {
        //se tratara como rebanadas, donde cada rebanada es una columna
        for (int cadaRebanada = 0; cadaRebanada < renglones; cadaRebanada++) {
            //aqui comienza cada rebanada
            for (int cadaRenglon = 0; cadaRenglon < columnas; cadaRenglon++) {

                for (int cadaColumna = 0; cadaColumna < profundidad; cadaColumna++) {
                    SalidaPorDefecto.terminal(informacion[cadaRenglon][cadaColumna][cadaRebanada] + " ");
                }
                //despues de cada columna se hace el salto de linea
                SalidaPorDefecto.terminal("\n");
            }
            //despues de todos los renglones de cada rebanada se hace otro salto de linea
            SalidaPorDefecto.terminal("\n");
        }
    }


}
