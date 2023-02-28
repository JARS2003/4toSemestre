package estructuraslineales;

import utilerias.comunes.Comparador;

/**
 * Esta clase contiene los metodos de un TDA liSTA numerica.
 * @VERSION 1.0
 * @autor Jesus Angel.
 */
public class ListaEstaticaNumerica extends ListaEstatica {
    public ListaEstaticaNumerica(int tamanio) {
        super(tamanio);
    }

    /**
     * Valida que si se un numero
     * @param objeto1 Es el objeto que se va a validar.
     * @return Regresa verdadero si numero, falso en caso contrario.
     */
    public boolean validarNumero(Object objeto1) {
        if (objeto1 instanceof Number) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Agrega solo numeros
     * @param info Es el nuevo valor a añadir
     * @return Regresa la posicion en la que se agrego, -1 si no se pudo.
     */
    @Override
    public int agregar(Object info) {

        if (validarNumero(info)) {
            return super.agregar(info);
        } else {
            return -1;
        }

    }

    /**
     * Cambia en la posicion indice el numero info.
     * @param incice Es la podcion donde se encuentr el elemento a eliminarmodificar.
     * @param info Es la informacion que se va a cambiar.
     * @return Regresa verdadero si se cambio, falso el caso contrario.
     */

    @Override
    public boolean cambiar(int incice, Object info) {
        if (validarNumero(info)) {
            return super.cambiar(incice, info);
        }
        return false;
    }

    /**
     * Multiplicar el escalar dado por cada posición del arreglo numérico.
     * @param escalar Es el escalar, que se multiplica por cada elemento.
     * @return Regrese falso si el arreglo actual está vacío.
     */
    public boolean porEscalar(Number escalar) {
        if (vacia() == false) {
            for (int indiceNumero = 0; indiceNumero <= tope; indiceNumero++) {
                informacion[indiceNumero] = ((Number) obtener(indiceNumero)).doubleValue() * escalar.doubleValue();
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * Sumar el escalar dado a cada posición del arreglo numérico.
     * @param escalar Es el escalar, que se le suma a cada elemento.
     * @return . Regrese falso si el arreglo actual está vacío.
     */
    public boolean sumarEscalar(Number escalar) {
        if (vacia() == false) {
            for (int indiceNumero = 0; indiceNumero <= tope; indiceNumero++) {
                informacion[indiceNumero] = ((Number) obtener(indiceNumero)).doubleValue() + escalar.doubleValue();
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * Sumar la posición 1 del arreglo actual con la posición 1 de arreglo2, y así sucesivamente.
     * @param lista2 Es la lista que contiene lo que vamos a sumar.
     * @return Regrsa falso en caso de no tener las mismas dimensiones, true en caso de si haber hecho la suma.
     */
    public boolean sumar(ListaEstaticaNumerica lista2) {

        if ((int) Comparador.comparador(tope, lista2.tope) == 0) {
            for (int valorSuma = 0; valorSuma <= tope; valorSuma++) {
                informacion[valorSuma] = ((Number) obtener(valorSuma)).doubleValue() + ((Number) lista2.obtener(valorSuma)).doubleValue();
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Este metodo hace producto de posición 1 del arreglo actual por posición 1 de arreglo2, y así sucesivamente.
     * @param lista2 Es la lista que contiene los valores a multiplicar.
     * @return Regrese falso si el arreglo actual está vacío.
     */
    public boolean multiplicar(ListaEstaticaNumerica lista2) {

        if (vacia() == false) {
            if ((int) Comparador.comparador(tope, lista2.tope) == 0) {
                for (int valorSuma = 0; valorSuma <= tope; valorSuma++) {
                    informacion[valorSuma] = ((Number) obtener(valorSuma)).doubleValue() * ((Number) lista2.obtener(valorSuma)).doubleValue();
                }
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }


    }

    /**
     * Este metodo hace la operación de potencia de cada elemento del arreglo (base) por el exponente
     * pasado como arreglo, posición por posición.
     * @param escala Es el valor del exponente, que se le aplica a cada elemento.
     * @return Regresa falso si no son mismsas dimensiones, true si se pudo realizar correctamente.
     */
    public boolean aplicarPotencia(Number escala) {
        if (vacia() == false) {
            for (int valorLista = 0; valorLista <= tope; valorLista++) {
                int exponenteMultiplicador = (int) informacion[valorLista];
                for (int exponente = 1; exponente < (int)escala; exponente++) {
                    informacion[valorLista] = ((Number) obtener(valorLista)).doubleValue() * exponenteMultiplicador;
                }
            }
            return true;

        }else{
            return false;
        }
    }

    /**
     * que haga la operación de potencia de cada elemento del arreglo (base)
     * por el exponente pasado como arreglo, posición por posición.
     * @param listaEscalares Contiene el valor del exponente que se le va a aplicar al elemento.
     * @return Regresa falso si no son mismsas dimensiones, true si se pudo realizar correctamente.
     */
    public boolean aplicarPotencia(ListaEstaticaNumerica listaEscalares){
        if ((int) Comparador.comparador(tope,listaEscalares.tope)==0 && vacia()==false){
            for (int valor=0;valor<=tope;valor++){
                int exponenteMultiplicador = (int)informacion[valor];
                for (int exponente = 1; exponente < (int)listaEscalares.obtener(valor); exponente++) {
                    informacion[valor] = ((Number) obtener(valor)).doubleValue() * exponenteMultiplicador;
                }

            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * Hace la sumatoria de la multiplicacion del elemento 1 con elemnro uno de la lista2, y asi sucesivamente.
     * @param lista2 Contiene los valores que se van a ir multiplicando.
     * @return Regresa la sumatoria de todas las multiplicaciones hechas.
     */
    public double productoEscalar(ListaEstaticaNumerica lista2){
        double sumatoriaMultiplicacion=0.0;
        if ((int) Comparador.comparador(tope,lista2.tope)==0 && vacia()==false){
            for (int valor=0;valor<=tope;valor++){
                sumatoriaMultiplicacion+=((Number)obtener(valor)).doubleValue()*((Number)lista2.obtener(valor)).doubleValue();
            }
            return sumatoriaMultiplicacion;
        }else {
            return sumatoriaMultiplicacion;
        }

    }

    /**
     * Saca la magnitud / módulo / norma L2 del vector (arreglo)
     * @return Regresa la norma.
     */
    public double norma(){
        double normacuadrada = 0.0;
        for(int valor = 0; valor <= tope; valor++){
            normacuadrada += ((Number) obtener(valor)).doubleValue() * ((Number) obtener(valor)).doubleValue();
        }
        normacuadrada = Math.abs(normacuadrada);
        double norma = Math.sqrt(normacuadrada);
        return norma;
    }

    /**
     * Calcula la norma euclidiana del vector numérico AB (arreglos n dimensionales).
     * @param lista2 Conntiene los valores que representan a B.
     * @return Regresa la norma euclidiana.
     */
    public double normaEuclidiana(ListaEstaticaNumerica lista2){
        double normacuadrada = 0.0;
        if ((int) Comparador.comparador(tope,lista2.tope)==0 && vacia()==false) {
            for (int valor = 0; valor <= tope; valor++) {
                normacuadrada += (((Number) lista2.obtener(valor)).doubleValue() - ((Number) obtener(valor)).doubleValue())*(((Number) lista2.obtener(valor)).doubleValue() - ((Number) obtener(valor)).doubleValue());
            }
            normacuadrada = Math.abs(normacuadrada);
            double norma = Math.sqrt(normacuadrada);
            return norma;
        }else {
            return normacuadrada;
        }
    }

    /**
     * Suma de uno por uno un conjunto de escalares almacenados en la variable escalares al arreglo actual.
     * @param escalares Escalares es un arreglo que guarda en cada posición un escalar.
     * @return Regresa 1.0 si es verdadero, 0.0 en caso de ser falso.
     */
    public double sumarEscalares(ListaEstaticaNumerica escalares){
        if ((int) Comparador.comparador(tope,escalares.tope)==0 && vacia()==false){
            for(int numEscalar = 0; numEscalar <= escalares.tope; numEscalar++){
                for (int valor = 0; valor <= tope ; valor++){
                    informacion[valor] = ((Number)informacion[valor]).doubleValue() + ((Number) escalares.obtener(numEscalar)).doubleValue();
                }
            }
            return 1.0;
        }else {
            return 0.0;

        }
    }
    /**
     * Suma de uno por uno un conjunto de arreglos de tipo ListaEstaticaNumerica almacenados en la variable
     * listas al arreglo actual.
     * @param listas . Cada posición de listas guarda un arreglo.
     * @return Regresa 1.0 si es verdadero, 0.0 en caso de ser falso.
     */
    public double sumarListaEstatica(ListaEstatica listas){
        if((int) Comparador.comparador(tope,listas.tope)==0 && vacia()==false){
            for(int indiceListas = 0; indiceListas <= listas.tope; indiceListas++){
                if(listas.obtener(indiceListas) instanceof ListaEstaticaNumerica){
                    for(int numEscalar = 0; numEscalar <= ((ListaEstaticaNumerica) listas.obtener(indiceListas)).tope; numEscalar++){
                        for(int valListaActual = 0; valListaActual <= tope; valListaActual++){
                            informacion[valListaActual] = ((Number)informacion[valListaActual]).doubleValue() + ((Number)((ListaEstaticaNumerica) listas.obtener(indiceListas)).obtener(numEscalar)).doubleValue();
                        }
                    }
                }
            }
            return 1.0;
        }
        return 0.0;
    }

    /**
     * Suma del arreglo actual, las posiciones de él que indica el arreglo llamado listaIndices.
     * @param listaIndices Almacena las posiciones que se deben tomar del arreglo actual para hacer la suma.
     * @return Regresa la sumatoria realizada.
     */
    public double sumarIndices(ListaEstaticaNumerica listaIndices){
        double sumatoriaIndices = 0.0;
        if(vacia()==false){
            for(int indiceLista = 0; indiceLista <= listaIndices.tope; indiceLista++){
                if(obtener((int) listaIndices.obtener(indiceLista)) != null){
                    sumatoriaIndices += ((Number) obtener((int)listaIndices.obtener(indiceLista))).doubleValue();
                }
            }
            return sumatoriaIndices;
        }
        return sumatoriaIndices;
    }

    /**
     * Regresa  un arreglo conteniendo los elementos del arreglo
     * actualque se obtienen del arreglo de índices “listaIndices”, el cual contiene las
     * posiciones de los índices de donde se obtendrán los datos a retornar.
     * @param listaIndices Contienen los indices que van ser la subLista
     * @return Regresa una lista que contiene los nuevos valores.
     */
    @Override
    public ListaEstatica subLista(ListaEstaticaNumerica listaIndices) {
        ListaEstaticaNumerica listaNueva = new ListaEstaticaNumerica(listaIndices.tope+1);
        if(vacia() == false){
            for(int indiceLista = 0; indiceLista <= listaIndices.tope; indiceLista++){
                if(obtener((int) listaIndices.obtener(indiceLista)) != null){
                    if(obtener((int)listaIndices.obtener(indiceLista)) instanceof Number) {
                        Number objeto = ((Number) obtener((int) listaIndices.obtener(indiceLista))).doubleValue();
                        listaNueva.agregar(objeto);
                    }
                }
            }
            return listaNueva;
        }
        return listaNueva;
    }

    /**
     * Determina si el conjunto de arreglos pasado como argumentos (es un arreglo de arreglos
     * numéricos)  son linealmente dependientes.
     * @param listaVectores Representa V.
     * @return Regresa verdadero si son linealmente dependientes, falso en caso de no serlo.
     */

    public boolean sonLinealmenteDependientes(ListaEstatica listaVectores){
        if(listaVectores instanceof ListaEstaticaNumerica){
            ListaEstaticaNumerica listaAuxiliar = new ListaEstaticaNumerica(tope+1);
            for(int indiceLista = 0; indiceLista <= tope; indiceLista++){
                listaAuxiliar.agregar(((Number)obtener(indiceLista)).doubleValue());
            }
            listaAuxiliar.multiplicar((ListaEstaticaNumerica) listaVectores);
            double valorFinal = 0.0;
            for(int indiceNuevaLista = 0; indiceNuevaLista <= listaAuxiliar.tope; indiceNuevaLista++){
                valorFinal += ((Number)listaAuxiliar.obtener(indiceNuevaLista)).doubleValue();
            }
            return (valorFinal == 0.0);
        }
        return false;
    }

    /**
     * Determina si el conjunto de arreglos pasado como argumentos (es un arreglo de arreglos numéricos)  son linealmente independientes.
     * @param listaVectores Representa V.
     * @return Regresa verdadero si son linealmente independientes, falso en caso de no serlo.
     */
    public boolean sonLinealmenteIndependientes(ListaEstatica listaVectores){
        if(listaVectores instanceof ListaEstaticaNumerica){
            for(int lista = 0; lista <= tope; lista++){
                if(((Number) obtener(lista)).doubleValue() != 0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Determina si el arreglo actual es ortogonal al arreglo pasado como
     * argumento.
     * @param lista2 Tiene los valores necesarios para hacer la multiplicacion.
     * @return Regresa verdadero si es ortogonal, falso si no lo es.
     */
    public boolean esOrtogonal(ListaEstaticaNumerica lista2){
        return productoEscalar(lista2)==0;
    }

    /**
     *  Determina si el arreglo actual es paralelo al arreglo pasado como argumento.
     * @param lista2 Es el arreglo comparado.
     * @return Regresa verdadero si es paralelo, falso si no lo es.
     */
    public boolean esParalelo(ListaEstaticaNumerica lista2){
        if((int) Comparador.comparador(tope,lista2.tope)==0){
            double escalar = ((Number) lista2.obtener(0)).doubleValue() / ((Number) obtener(0)).doubleValue();
            for(int indiceLista = 1; indiceLista <= tope; indiceLista++){
                if((int)Comparador.comparador(escalar, ((Number) lista2.obtener(indiceLista)).doubleValue() / ((Number) obtener(indiceLista)).doubleValue()) !=0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     *  Este metodo copia una lista de double a una ListEstaticaNumerica.
     * @param bufer Es la lista que se va a copiar
     */
    public void copiarBufer(double[] bufer) {
            for (int buferIndice=0;buferIndice<MAXIMO;buferIndice++){
                agregar(bufer[buferIndice]);
            }

    }

    /**
     * Este metodo convierte una ListaEstatica numerica aun arreglo double, para asi poder leer los datos.
     * @return Regresa una lista de double.
     */
    public double[] leerArregloNum(){
        double[] arregloAuxiliar = new double[getMAXIMO()];
        for(int indiceArreglo = 0; indiceArreglo <= tope; indiceArreglo++){
            arregloAuxiliar[indiceArreglo] = ((Number) informacion[indiceArreglo]).doubleValue();
        }
        return arregloAuxiliar;
    }
    @Override
    public void invertir() {
        ListaEstaticaNumerica listaInvertida = new ListaEstaticaNumerica(getMAXIMO());
        for(int indice=0;indice<=getTope()-1;indice++){
            listaInvertida.informacion[getTope()-1-indice]=informacion[indice];

        }
        for (int indice =0;indice<=getTope()-1;indice++){
            informacion[indice]=listaInvertida.informacion[indice];
        }

    }


}


