package estructuraNoLineal;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;
import utilerias.comunes.Comparador;
import utilerias.comunes.TipoColumna;
import utilerias.comunes.TipoRenglon;

public class Matriz2 {

        protected int renglones;
        protected int columnas;

        protected Object informacion[][];

        public Matriz2(int renglones, int columnas) {
            this.renglones = renglones;
            this.columnas = columnas;

            informacion=new Object[renglones][columnas];
        }
        public Matriz2(int renglones, int columnas, Object info) {
            this.renglones = renglones;
            this.columnas = columnas;
            informacion=new Object[renglones][columnas];
            rellenar(info);

        }

    /**
     * \Rellena los espacios con el valor de info.
     * @param info Es el valor que se va a ingresar en todos los espacios.
     */
        public void rellenar(Object info){
            //recorrer todos los renglones
            for (int cadaRenglon = 0; cadaRenglon < renglones; cadaRenglon++){
                for (int cadaColumna = 0; cadaColumna < columnas; cadaColumna++){
                    informacion[cadaRenglon][cadaColumna] = info;

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


    /**
     *Cambia el valor que esta en la posicion que indica renglon y columna por info.
     * @param renglon Es la posicion en el renglon.
     * @param columna Es la posicion en la columna.
     * @param info Es la informacion nueva.
     * @return Regresa verdadero si se pudo hacer el cambio, falso en caso contrario.
     */
        public boolean cambiar(int renglon,int columna,Object info){
            if(validarRango(renglon,renglones) && validarRango(columna,columnas)){
                informacion[renglon][columna]=info;
                return true;

            }else {
                return false;

            }
        }

    /**
     *Valida que el rango sea correcto.
     * @param indice Es el pirmer campo
     * @param limiteSuperio Es el segundo campo a comparar.
     * @return Regresa verdadero si son iguales, falso en caso contrario.
     */
        private boolean validarRango(int indice,int limiteSuperio){
            if (indice>=0 && indice<limiteSuperio){
                return true;
            }else {
                return false;

            }

        }

    /**
     *Obtiene el valor que esta en la posicion que indica renglon y columna.
     * @param renglon Es la posicion de renglones.
     * @param columna Es la posicion de columnas.
     * @return Regresa el valor de la poscion indicado, null en caso de no encontrar la posicion.
     */
        public Object obtener(int renglon,int columna){
            if(validarRango(renglon,renglones)&& validarRango(columna,columnas)){

                return informacion[renglon][columna];

            }
            return null;
        }

    /**
     *Imprime la matriz por columnas.
     */
        public void imprimirxColumna(){

            //Aqui comienza cada rebanada
            for (int cadaRenglon=0;cadaRenglon<renglones;cadaRenglon++){
                for (int cadaColumna=0;cadaColumna<columnas;cadaColumna++){
                    SalidaPorDefecto.terminal(informacion[cadaRenglon][cadaColumna]+" ");
                }
                //despues de todas las columnas, hacer salto de linea
                SalidaPorDefecto.terminal("\n");
            }
        }

    /**
     *Imprime la matriz por renglones.
     */
    public void imprimirxRenglon(){
        //Aqui comienza cada rebanada
        for (int cadaRenglon=0;cadaRenglon<renglones;cadaRenglon++){
            for (int cadaColumna=0;cadaColumna<columnas;cadaColumna++){
                SalidaPorDefecto.terminal(informacion[cadaColumna][cadaRenglon]+" ");
            }
            //despues de todas las columnas, hacer salto de linea
            SalidaPorDefecto.terminal("\n");
        }
    }

    /**
     *Hace a la matriz transpuesta
     */
    public void transpuesta(){

        Matriz2 matrizTranspuesta = new Matriz2(getRenglones(),getColumnas());
        for (int cadaRenglon=0;cadaRenglon<getRenglones();cadaRenglon++){
            for (int cadaColumna=0;cadaColumna<getColumnas();cadaColumna++){
                matrizTranspuesta.cambiar(cadaRenglon,cadaColumna,informacion[cadaColumna][cadaRenglon]);
            }

        }
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                cambiar(cadaRenglon, cadaColumna, matrizTranspuesta.informacion[cadaRenglon][cadaColumna]);
            }
        }
    }

    /**
     *Clona la matriz actual.
     * @return Regresa la clonacion de la matriz.
     */
    public Matriz2 clonar(){
        Matriz2 matrizClon = new Matriz2(getRenglones(),getColumnas());
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                matrizClon.cambiar(cadaRenglon, cadaColumna, informacion[cadaRenglon][cadaColumna]);
            }
        }
        return  matrizClon;
    }

    /**
     * Compara dos matrices para saber si son iguales.
     * @param matriz2 Es la matriz a comparar.
     * @return Regresa verdadero si son iguales, falso en caso contrario.
     */
    public boolean esIgual(Matriz2 matriz2){
        for (int cadaRenglon=0;cadaRenglon<getRenglones();cadaRenglon++){
            for (int cadaColumna=0;cadaColumna<getColumnas();cadaColumna++){
               if ((int)Comparador.comparador(obtener(cadaRenglon,cadaColumna),matriz2.obtener(cadaRenglon,cadaColumna))!=0){
                   return false;

                }
            }

        }
        return true;
    }

    /**
     *Hace un vector columna con  info
     * @param columnas Indica en que columna va el vector.
     * @param info Es el valor que se le va a dar al vector.
     * @return Regresa verdadero si se pudo hacer,falso en caso cotrario.
     */
    public boolean vectorColumna(int columnas, Object info){
        if ((int) Comparador.comparador(getColumnas(),columnas)>=0){
            for (int renglon=0;renglon<getRenglones();renglon++){
                cambiar(columnas,renglon,info);

            }
            return true;
        }
        return false;
    }

    /**
     *Hace un vrector rebglon con info.
     * @param filas Indica en que fila va el vector.
     * @param info Es el valor que se le va a dar al vector.
     * @return Regresa verdadero si se pudo hacer,falso en caso cotrario.
     */
    public boolean vectorRenglon(int filas,Object info){
        if ((int) Comparador.comparador(getColumnas(),filas)>=0){
            for (int columnas=0;columnas<getColumnas();columnas++){
                cambiar(columnas,filas,info);
            }
            return true;
        }
        return false;
    }

    /**
     * Redefine la matriz actual, con matriz2.
     * @param matriz2 Es la matriz que va a sutituri el contenido y dimension de la matriz actual.
     * @return Refrese verdadero si se pudo hacer, falso en caso contrario.
     */
    public  boolean redefinir(Matriz2 matriz2){

        new Matriz2(matriz2.getRenglones(), matriz2.getColumnas());
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                cambiar(cadaRenglon, cadaColumna, matriz2.obtener(cadaRenglon, cadaColumna));
            }
        }
        return true;
    }

    /**
     * Agrega una lista en forma de renglon.
     * @param arreglo Es el renglon que se va a gregar.
     * @return Regresa verdadero si se puedo realizar, falso en caso contrario.
     */
    public boolean agregarRenglon(ListaEstatica arreglo){
        if((int)Comparador.comparador(getRenglones(), arreglo.maximo()) >= 0){
            for(int renglon = 0; renglon <= arreglo.getTope(); renglon++){
                cambiar(renglon, 0, arreglo.obtener(renglon));
            }
            return true;
        }
        return false;
    }

    /**
     * Agrega un lista en forma de columna.
     * @param arreglo Es la columna que se va agregar.
     * @return Regresa verdadero si se puedo realizar, falso en caso contrario.
     */
    public boolean agregarColumna(ListaEstatica arreglo){
        if((int)Comparador.comparador(getRenglones(), arreglo.maximo()) >= 0){
            for(int columna = 0; columna <= arreglo.getTope(); columna++){
                cambiar(0,columna, arreglo.obtener(columna));
            }
            return true;
        }
        return false;
    }

    /**
     * Agrega los valores de matriz2 en forma de columna.
     * @param matriz2 Es la matriz de los nuevos valores
     * @return Regresa verdadero si se puedo realizar, falso en caso contrario.
     */
    public boolean agregarMatrizXColumna(Matriz2 matriz2){
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                cambiar(cadaRenglon, cadaColumna, matriz2.obtener(cadaRenglon, cadaColumna));

            }
        }
        return true;
    }

    /**
     * Agrega los valores de matriz2 en forma de renglon.
     * @param matriz2 Es la matriz de los nuevos valores
     * @return Regresa verdadero si se puedo realizar, falso en caso contrario.
     */
    public boolean agregarMatrizXRenglon(Matriz2 matriz2){
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                cambiar(cadaRenglon, cadaColumna, matriz2.obtener(cadaColumna, cadaRenglon));
            }
        }
        return true;
    }

    /**
     * Este método
     * convierte la matriz actual acomodando cada columna una debajo de otra para
     * formar un vector columna.
     *
     * @return Regresa la lista con los valores.
     */
    public ListaEstatica aVectorColumna(){
        ListaEstatica nuevaLista = new ListaEstatica(getRenglones()*getColumnas());
        for(int nuevoReng = 0; nuevoReng < getRenglones(); nuevoReng++){
            for(int nuevoCol = 0; nuevoCol < getColumnas(); nuevoCol++){
                nuevaLista.agregar(obtener(nuevoReng,nuevoCol));
            }
        }
        return nuevaLista;
    }

    /**
     * Este método
     * convierte la matriz actual acomodando cada renglón uno enseguida del otro (hacia
     * la derecha) para formar un vector renglón.
     * @return Regresa la lista con los valores.
     */
    public ListaEstatica aVectorRenglon(){
        ListaEstatica nuevaLista = new ListaEstatica(getRenglones()*getColumnas());
        for(int nuevoReng = 0; nuevoReng < getRenglones(); nuevoReng++){
            for(int nuevoCol = 0; nuevoCol < getColumnas(); nuevoCol++){
                nuevaLista.agregar(obtener(nuevoCol,nuevoReng));
            }
        }
        return nuevaLista;
    }

    /**
     * Eliminar un renglon de una tabla, en cierta posicion indicada.
     * @param renglon Es el renglon a eliminar.
     * @return Regresa verdadero si se puedo realizar, falso en caso contrario.
     */
    public boolean eliminarRenglon(int renglon){
        if(validarRango(renglon,getRenglones())){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                cambiar(cadaColumna, renglon, null);
            }
            return true;
        }
        return false;
    }
    /**
     * Eliminar una columna de una tabla, en cierta posicion indicada.
     * @param columna Es la columna a eliminar.
     * @return Regresa verdadero si se puedo realizar, falso en caso contrario.
     */
    public boolean eliminarColumna(int columna){
        if(validarRango(columna,getRenglones())){
            for(int cadaRenglon = 0; cadaRenglon < getColumnas(); cadaRenglon++){
                cambiar(columna,cadaRenglon,  null);
            }
            return true;
        }
        return false;
    }

    /**
     * Permite pasar una matriz 2D a matriz 3D
     * @param matrices Es una lista con las matrices para poder convertirla a matriz3.
     * @return Regresa la matriz3 formada.
     */
    public Matriz3 aMatriz3(ListaEstatica matrices){
        Matriz3 matriz3 = new Matriz3(getRenglones(),getColumnas(),(int) matrices.maximo());
        Matriz2 matriz2D;
        Object objeto;
        for(int cadaMatriz = 0; cadaMatriz < (int) matrices.maximo(); cadaMatriz++){
            matriz2D = (Matriz2) matrices.obtener(cadaMatriz);
            if((int)Comparador.comparador(getRenglones(), ((Matriz2) matrices.obtener(cadaMatriz)).getRenglones()) >= 0
                    && (int)Comparador.comparador(getColumnas(), ((Matriz2) matrices.obtener(cadaMatriz)).getColumnas()) >= 0){
                for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                    for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                        objeto = matriz2D.obtener(cadaRenglon,cadaColumna);
                        matriz3.cambiar(cadaRenglon,cadaColumna,cadaMatriz, objeto);
                    }
                }
            }
        }
        return matriz3;
    }

    /**
     *Eliminar una columna de una tabla, ya sea izquiera o derecha.
     * @param tipoColumna Indica en donde esta la columna, izquierda o derecha.
     * @return Regresa verdadero si se pudo hacer,falso en caso cotrario.
     */
    public boolean quitarColumna(TipoColumna tipoColumna){
        ListaEstatica nuevaLista = new ListaEstatica(getRenglones());
        if(tipoColumna==TipoColumna.DER){
            for(int cadaCol = getColumnas(); cadaCol >= 0; cadaCol--){
                for(int cadaReng = 0; cadaReng < getRenglones(); cadaReng++){
                    nuevaLista.agregar(obtener(cadaCol, cadaReng));
                }
                for(int indiceLista = 0; indiceLista < (int)nuevaLista.maximo(); indiceLista++){
                    if(nuevaLista.obtener(indiceLista) != null){
                        return eliminarRenglon(cadaCol);
                    }
                }
                nuevaLista.vaciar();
            }
        } else if (tipoColumna==TipoColumna.IZQ) {
            for(int cadaCol = 0; cadaCol < getColumnas(); cadaCol++){
                for(int cadaReng = 0; cadaReng < getRenglones(); cadaReng++){
                    nuevaLista.agregar(obtener(cadaCol, cadaReng));
                }
                for(int indiceLista = 0; indiceLista <(int) nuevaLista.maximo(); indiceLista++){
                    if(nuevaLista.obtener(indiceLista) != null){
                        return eliminarRenglon(cadaCol);
                    }
                }
                nuevaLista.vaciar();
            }

        }
        return false;
    }

    /**
     * Eliminar un renglon de una tabla, ya sea abajo o arriba.
     * @param tipoRenglon Indica donde esta el renglon, abajo o arriba.
     * @returnRegresa verdadero si se pudo hacer,falso en caso cotrario.
     */
    public boolean quitarRenglon(TipoRenglon tipoRenglon){
        ListaEstatica nuevaLista = new ListaEstatica(getRenglones());
        if(tipoRenglon==TipoRenglon.ABA){
            for(int cadaCol = getColumnas(); cadaCol >= 0; cadaCol--){
                for(int cadaReng = 0; cadaReng < getRenglones(); cadaReng++){
                    nuevaLista.agregar(obtener(cadaReng, cadaCol));
                }
                for(int indiceLista = 0; indiceLista < (int)nuevaLista.maximo(); indiceLista++){
                    if(nuevaLista.obtener(indiceLista) != null){
                        return eliminarColumna(cadaCol);
                    }
                }
                nuevaLista.vaciar();
            }
        } else if (tipoRenglon==TipoRenglon.ARR) {
            for(int cadaCol = 0; cadaCol < getColumnas(); cadaCol++){
                for(int cadaReng = 0; cadaReng < getRenglones(); cadaReng++){
                    nuevaLista.agregar(obtener(cadaReng, cadaCol));
                }
                for(int indiceLista = 0; indiceLista < (int)nuevaLista.maximo(); indiceLista++){
                    if(nuevaLista.obtener(indiceLista) != null){
                        return eliminarColumna(cadaCol);
                    }
                }
                nuevaLista.vaciar();
            }
        }
        return false;
    }


}






