package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraNoLineal.Matriz2;
import estructuraNoLineal.Matriz3;
import estructuraslineales.ListaEstatica;

public class PruebaMatriz3 {
    public static void main(String[] args) {
        Matriz3 matriz=new Matriz3(4,3,5,0);
        matriz.imprimirxColumna();
        matriz.cambiar( 2,2, 2,1);
        SalidaPorDefecto.terminal("Otra vez; \n");
        matriz.imprimirxColumna();
        SalidaPorDefecto.terminal("Listas... \n");
        imprimirMatrices(matriz.aMatrizez2());
    }
    public static void imprimirMatrices(ListaEstatica matrices){
        for(int cadaMatriz=0;cadaMatriz<(int) matrices.cantidad();cadaMatriz++){
            Matriz2 matriz2Temporal = (Matriz2) matrices.obtener(cadaMatriz);
            matriz2Temporal.imprimirxColumna();
            SalidaPorDefecto.terminal("\n");

        }

    }
}
