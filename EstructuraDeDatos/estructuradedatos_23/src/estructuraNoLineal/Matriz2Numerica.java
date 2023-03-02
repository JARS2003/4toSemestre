package estructuraNoLineal;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstaticaNumerica;
import utilerias.comunes.Comparador;
import utilerias.comunes.TipoLogaritmo;

public class Matriz2Numerica extends Matriz2{
    public Matriz2Numerica(int renglones, int columnas) {
        super(renglones, columnas);
        rellenar(0);
    }

    public Matriz2Numerica(int renglones, int columnas, Object info) {
        super(renglones, columnas, info);
    }

    /**
     * Valida si los valores son instancias de Number
     * @param info es el objeto a validar
     * @return Regresa true si si es numero
     */
    public boolean validarNumero(Object info){
        return info instanceof Number;
    }
    /**
     * Rellena la matriz
     * @param info Es la informacion con la que se llena
     */
    public void rellenar(Object info) {
        //valida si indo es numero
        if(validarNumero(info)) {
            super.rellenar(info);
        }
    }

    /**
     * Cambia el valor de la matriz, en la poscicion de columna y renglon, por info.
     * @param renglon Es la posicion en el renglon.
     * @param columna Es la posicion en la columna.
     * @param info Es la informacion nueva.
     * @return regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean cambiar(int renglon,int columna,Object info){
        if (validarNumero(info)){
            return super.cambiar(renglon,columna,info);
        }
        return false;
    }

    /**
     * Multiplica todos los valores de la matriz, por el valor escalar.
     * @param escalar Es la valor que va a multiplicar a la matriz.
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean porEscalar(Number escalar){
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                if(obtener(cadaRenglon,cadaColumna) != null) {
                    cambiar(cadaRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() * escalar.doubleValue());
                }
            }
        }
        return true;
    }

    /**
     *Multiplica el elemento de una posición del arreglo de números (cada posición contiene un escalar) por un solo
     * elemento colocado en la posición correspondiente en la matriz, recorriéndola en
     * orden natural (renglones, columnas).
     * @param escalares Es la lista que contiene los escalares.
     * @return Regresa verdadero si se pudo hacer, falso en caso contrario.
     */
    public boolean porEscalares(ListaEstaticaNumerica escalares){
        if(validarRango(columnas,escalares.getMAXIMO()+1)){
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < (int)escalares.maximo(); cadaColumna++){
                    if(obtener(cadaRenglon,cadaColumna) != null) {
                        cambiar(cadaRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() * ((Number) escalares.obtener(cadaColumna)).doubleValue());
                    }
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Suma un escalar a la matriz.
     * @param escalar Es el valor que se va a sumar.
     * @return Regresa verdadero si se pudo hacer, falso en caso contrario.
     */
    public boolean sumarEscalar(Number escalar){
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                if(obtener(cadaRenglon,cadaColumna) != null) {
                    cambiar(cadaRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + escalar.doubleValue());
                }
            }
        }
        return true;
    }
    /**
     *Sumar el elemento de una posición del arreglo de números (cada posición contiene un escalar) sumando  un solo
     * elemento colocado en la posición correspondiente en la matriz, recorriéndola en
     * orden natural (renglones, columnas).
     * @param escalares Es la lista que contiene los escalares.
     * @return Regresa verdadero si se pudo hacer, falso en caso contrario.
     */
    public boolean sumarEscalares(ListaEstaticaNumerica escalares){
        if(validarRango(columnas,escalares.getMAXIMO()+1)){
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                    if(obtener(cadaRenglon,cadaColumna) != null) {
                        cambiar(cadaRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) escalares.obtener(cadaColumna)).doubleValue());
                    }
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Multiplica una matriz por la matriz actual.
     * @param matriz2 Es la matriz a multiplicar
     * @return Regresa la multiplicacion de las matrices, si no se pudo regresa nulo.
     */
    public boolean multiplicar(Matriz2Numerica matriz2){
        double sumatoria = 0;
        Matriz2Numerica matriz21 = new Matriz2Numerica(getRenglones(),matriz2.getColumnas());
        if((int)Comparador.comparador(getColumnas(),matriz2.getRenglones())==0){
            for (int cadaRenglon=0;cadaRenglon<getRenglones();cadaRenglon++){
                for (int cadaColumna2=0;cadaColumna2<matriz2.getColumnas();cadaColumna2++){
                    for (int cadaColumna=0;cadaColumna<getColumnas();cadaColumna++){
                        double valo1 = ((Number)obtener(cadaRenglon,cadaColumna)).doubleValue();
                        double valo2 = ((Number)matriz2.obtener(cadaColumna,cadaColumna2)).doubleValue();

                        sumatoria = sumatoria + valo1*valo2;

                    }
                    matriz21.cambiar(cadaRenglon,cadaColumna2,sumatoria);
                    sumatoria=0;

                }

            }
            redefinir(matriz21);

            return true;

        }
        return false;
    }

    /**
     * Suma una matriz, a la matriz actual.
     * @param matriz2 Es la matriz a multiplicar
     * @return Regresa verdadero si se pudo hacer, falso en caso contrario.
     */
    public boolean sumar(Matriz2Numerica matriz2){
        if((int)Comparador.comparador(getColumnas(),matriz2.getColumnas())==0  && (int)Comparador.comparador(getRenglones(),matriz2.getRenglones())==0){
            for(int cadaRenglon = 0; cadaRenglon < matriz2.getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < matriz2.getColumnas(); cadaColumna++){
                    if(obtener(cadaRenglon,cadaColumna) != null) {
                        cambiar(cadaRenglon, cadaColumna, (((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) matriz2.obtener(cadaRenglon, cadaColumna)).doubleValue()));
                    }
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Este metodo le aplica la potencia que indica escalar a los valores de la matriz.
     * @param escalar Es la potencia
     * @return Regresa verdadero si se pudo hacer, falso en caso contrario.
     */
    public boolean aplicarPotencia(Number escalar){
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                if(obtener(cadaRenglon,cadaColumna) != null) {
                    cambiar(cadaRenglon, cadaColumna, Math.pow(((Number) obtener(cadaRenglon, cadaColumna)).doubleValue(), escalar.doubleValue()));
                }
            }
        }
        return true;
    }

    /**
     * Aplicar el logaritmo (elemento por elemento) a la matriz
     * @param tipoLogaritmo Indica si es base 10,2 o  natural
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
   public boolean aplicarLogaritmo(TipoLogaritmo tipoLogaritmo){
        if(!existeValorCero()){
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                    double info = ((Number)obtener(cadaRenglon, cadaColumna)).doubleValue();
                    if(tipoLogaritmo == TipoLogaritmo.BASE10){
                        cambiar(cadaRenglon, cadaColumna, Math.log10(info));
                    } else if(tipoLogaritmo == TipoLogaritmo.NATURAL){
                        cambiar(cadaRenglon, cadaColumna, Math.log(info));
                    } else {
                        cambiar(cadaRenglon, cadaColumna, (Math.log(info) / Math.log(2)));
                    }
                }
            }
            return true;
        }
        return false;
    }
    public boolean existeValorCero(){
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                if(((Number)obtener(cadaRenglon, cadaColumna)).doubleValue() == 0){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *Genera una matriz diagonal con el valor proporcionado
     * @param contenido Es el valor de la diagonal
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean matrizDiagonal(Number contenido){
        if((int)Comparador.comparador(getRenglones(), getColumnas()) == 0){
            rellenar(0);
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                    if(cadaColumna == cadaRenglon){
                        cambiar(cadaRenglon,cadaColumna, contenido);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Determina si la matriz es una matriz triangular superior:
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean esDiagonalSuperior(){
        if((int)Comparador.comparador(getRenglones(), getColumnas()) == 0){
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna <= cadaRenglon; cadaColumna++){
                    if(cadaRenglon == cadaColumna){
                        if(((Number)obtener(cadaRenglon, cadaColumna)).doubleValue() == 0){
                            return false;
                        }
                    } else if((int)obtener(cadaRenglon, cadaColumna) != 0){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Determina si la matriz es una matriz triangular inferior
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean esDiagonalInferior(){
        if((int)Comparador.comparador(getRenglones(), getColumnas()) == 0){
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = cadaRenglon; cadaColumna < getColumnas(); cadaColumna++){
                    if(cadaRenglon == cadaColumna){
                        if(((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() == 0){
                            return false;
                        }
                    } else if((int) obtener(cadaRenglon, cadaColumna) != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Determinar la potencia de una matriz. boolean potencia
     * @param exponente Es la potencia a la que se va a elevar la matriz.
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean potencia(int exponente){
        Matriz2Numerica matrizAuxiliar = clonar();
        if(getRenglones() == getColumnas()){
            for(int cadaExponente = 1; cadaExponente < exponente; cadaExponente++){
                multiplicar(matrizAuxiliar);
            }
            return true;
        }
        return false;
    }
    public Matriz2Numerica clonar(){
        Matriz2Numerica matrizClon = new Matriz2Numerica(getRenglones(),getColumnas());
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                matrizClon.cambiar(cadaRenglon, cadaColumna, informacion[cadaRenglon][cadaColumna]);
            }
        }
        return  matrizClon;
    }
    public  boolean redefinir(Matriz2Numerica matriz2){

        columnas = matriz2.getColumnas();
        renglones = matriz2.getRenglones();
        informacion = new Object[renglones][columnas];
        for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                informacion[cadaRenglon][cadaColumna] = matriz2.obtener(cadaRenglon, cadaColumna);
            }
        }
        return true;
    }

    /**
     * Si es par suma de dos en dos las columnas, si es impar, suma de dos en dos las columnas dejando intacta la columna de en medio
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean doblarColumnas() {
        int mitad = Math.ceilDiv(getColumnas(), 2);
        Matriz2Numerica matrizAuxiliar = new Matriz2Numerica(getRenglones(), mitad);
        int nuevaColumna = 0;
        if(mitad%2 == 0){
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna = cadaColumna+2){
                    matrizAuxiliar.cambiar(cadaRenglon, nuevaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) obtener(cadaRenglon, cadaColumna+1)).doubleValue());
                    nuevaColumna++;
                }
                nuevaColumna = 0;
            }
        } else {
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = 0; cadaColumna < mitad-1; cadaColumna = cadaColumna+2){
                    matrizAuxiliar.cambiar(cadaRenglon, nuevaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) obtener(cadaRenglon, cadaColumna+1)).doubleValue());
                    nuevaColumna++;
                }
                nuevaColumna = 0;
            }
            // agrega la columna del medio
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = mitad-1; cadaColumna < mitad; cadaColumna++){
                    matrizAuxiliar.cambiar(cadaRenglon, Math.ceilDiv(mitad-1, 2), ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue());
                }
            }
            // agrega las sumas de las columnas despues del medio
            int otraColumna = Math.ceilDiv(mitad,2);
            for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon++){
                for(int cadaColumna = mitad; cadaColumna < getColumnas(); cadaColumna = cadaColumna+2){
                    matrizAuxiliar.cambiar(cadaRenglon, otraColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) obtener(cadaRenglon, cadaColumna+1)).doubleValue());
                    otraColumna++;
                }
                otraColumna = Math.ceilDiv(mitad, 2);
            }
        }
        redefinir(matrizAuxiliar);
        return true;
    }

    /**
     * Si es par suma de dos en dos las filas, si es impar, suma de dos en dos las filas dejando intacta la fila de en medio
     * @return Regresa verdadero si se pudo, falso en caso contrario.
     */
    public boolean doblarRenglones() {
        int mitad = Math.ceilDiv(getRenglones(), 2);
        Matriz2Numerica matrizAuxiliar = new Matriz2Numerica(mitad, getColumnas());
        int nuevoRenglon = 0;
        if (mitad % 2 == 0) {
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                for(int cadaRenglon = 0; cadaRenglon < getRenglones(); cadaRenglon=cadaRenglon+2){
                    matrizAuxiliar.cambiar(nuevoRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) obtener(cadaRenglon+1, cadaColumna)).doubleValue());
                    nuevoRenglon++;
                }
                nuevoRenglon = 0;
            }
        } else {
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                for(int cadaRenglon = 0; cadaRenglon < mitad-1; cadaRenglon=cadaRenglon+2){
                    matrizAuxiliar.cambiar(nuevoRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) obtener(cadaRenglon+1, cadaColumna)).doubleValue());
                    nuevoRenglon++;
                }
                nuevoRenglon = 0;
            }
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                for(int cadaRenglon = mitad-1; cadaRenglon < mitad; cadaRenglon++){
                    matrizAuxiliar.cambiar(Math.ceilDiv(mitad-1, 2), cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue());
                }
            }
            int otroRenglon = Math.ceilDiv(mitad,2);
            for(int cadaColumna = 0; cadaColumna < getColumnas(); cadaColumna++){
                for(int cadaRenglon = mitad; cadaRenglon < getRenglones(); cadaRenglon=cadaRenglon+2){
                    matrizAuxiliar.cambiar(otroRenglon, cadaColumna, ((Number) obtener(cadaRenglon, cadaColumna)).doubleValue() + ((Number) obtener(cadaRenglon+1, cadaColumna)).doubleValue());
                    otroRenglon++;
                }
                otroRenglon = Math.ceilDiv(mitad, 2);
            }
        }
        redefinir(matrizAuxiliar);
        return false;
    }

}
