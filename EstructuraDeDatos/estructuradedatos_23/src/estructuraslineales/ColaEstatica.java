package estructuraslineales;

import entradaSalida.SalidaPorDefecto;

public class ColaEstatica implements  Lote{
    protected int MAXIMO;
    protected int inicio;
    protected int fin;
    protected Object informacion[];

    public ColaEstatica(int tamanio) {
        MAXIMO = tamanio;
        inicio = -1;
        fin = -1;
       informacion = new Object[MAXIMO];
    }

    @Override
    public boolean lleno() {
        if ((inicio==0 && fin==MAXIMO-1) || fin==(inicio-1)){
            return true;
        }
        return false;
    }

    @Override
    public boolean vacio() {
        if (inicio==-1){
            return true;
        }
        return false;
    }

    @Override
    public boolean poner(Object info) {
        if (!lleno()) {
            if (vacio()) {//a)
                inicio = 0;
                fin = 0;

            } else if (fin==(MAXIMO-1)) {//d)
                fin=0;

            }else {//b) y c)
                fin++;
            }
            informacion[fin] = info;
            return true;
        }//e)
        return false;

    }

    @Override
    public Object quitar() {
        if (! vacio()){
            Object respaldo;
            respaldo = informacion[inicio];
            if(inicio ==fin){//e)
                inicio=-1;
                fin=-1;

            } else if (inicio==MAXIMO-1) {//d)
                inicio =0;

            }else {//b),c)
                inicio++;
            }
            return respaldo;
        }
        //a)Esta vacio
        return null;


    }

    @Override
    public void imprimir() {
        if (!vacio()) {
            if (inicio <= fin) {
                for (int indice = inicio; indice <= fin; indice++) {
                    SalidaPorDefecto.terminal(informacion[indice] + "");
                }
            }else {
                for (int indice = inicio; indice < MAXIMO; indice++) {
                    SalidaPorDefecto.terminal(informacion[indice] + "");
                }
                for (int indice = 0; indice <= fin; indice++) {
                    SalidaPorDefecto.terminal(informacion[indice] + "");
                }
            }

        }
    }

    @Override
    public Object verTope() {
        if (! vacio()){
            return informacion[fin];
        }

        return null;
    }
    public Object verInicio(){
        if (! vacio()){
            return informacion[inicio];

        }
        return null;
    }
}
