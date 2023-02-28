package estructuraslineales;

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
                inicio = 0;

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
        return null;
    }

    @Override
    public void imprimir() {

    }

    @Override
    public Object verTope() {
        return null;
    }
}
