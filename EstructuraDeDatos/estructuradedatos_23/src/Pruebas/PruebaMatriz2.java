package Pruebas;

import com.sun.source.tree.NewArrayTree;
import entradaSalida.SalidaPorDefecto;
import estructuraNoLineal.Matriz2;
import estructuraslineales.ListaEstatica;
import utilerias.comunes.TipoColumna;
import utilerias.comunes.TipoRenglon;

public class PruebaMatriz2 {
    public static void main(String[] args) {
        Matriz2 matriz = new Matriz2(4,4,0);
       // Matriz2 matriz2 = new Matriz2(4,4,0);
        //Matriz2 matrizVacia=new Matriz2(3,3);
        //matriz.imprimirxColumna();
        //SalidaPorDefecto.terminal("\nCambiando valores;\n");
        matriz.cambiar(0,0,1);
        matriz.cambiar(0,1,2);
        matriz.cambiar(0,2,3);
        matriz.cambiar(0,3,4);
        matriz.cambiar(1,0,5);
        matriz.cambiar(1,1,6);
        matriz.cambiar(1,2,7);
        matriz.cambiar(1,3,8);
        //-------
        /*matriz2.cambiar(0,0,8);
        matriz2.cambiar(0,1,10);
        matriz2.cambiar(0,2,12);
        matriz2.cambiar(0,3,14);*/
        //matriz.imprimirxRenglon();
        //SalidaPorDefecto.terminal("\n");
        //SalidaPorDefecto.terminal("El objeto obtenido en la columna 0, renglon 0 es :"+matriz.obtener(0,0));
        //SalidaPorDefecto.terminal("Por columna\n");
        //matriz.imprimirxColumna();
        //SalidaPorDefecto.terminal("Rellenando con 2\n");
        //matriz.rellenar(2);
        //matriz.imprimirxColumna();
        //matriz.transpuesta();
        //matriz.imprimirxColumna();
        //SalidaPorDefecto.terminal("\n");
        //matriz.imprimirxColumna();
        //SalidaPorDefecto.terminal("Por renglon\n");
        //matriz.imprimirxRenglon();
        //SalidaPorDefecto.terminal("Clonando\n");
        //matriz.clonar().imprimirxRenglon();
        //matriz2=matriz.clonar();
       // SalidaPorDefecto.terminal("Matriz2\n");
        //matriz2.imprimirxColumna();
        //SalidaPorDefecto.terminal("Las matrices son iguales? "+matriz.esIgual(matriz2));
        //SalidaPorDefecto.terminal("Redefiniendo\n");
        //matriz.redefinir(matriz2);

       //matriz.imprimirxColumna();
        //SalidaPorDefecto.terminal("Vector Renglon;\n");
        //matrizVacia.vectorColumna(0,6);
        //matrizVacia.imprimirxColumna();
        //matrizVacia.vectorRenglon(1,2);
       //matrizVacia.imprimirxColumna();
        /*SalidaPorDefecto.terminal("Haciendo matriz 2 a matriz 3\n");
        Matriz2 matriz = new Matriz2(5,5,0);
        matriz.cambiar(1,1,3);
        matriz.cambiar(1,2,4);
        matriz.cambiar(2,1,2);
        matriz.cambiar(2,2,6);
        Matriz2 matriz2 = new Matriz2(5,5,0);
        matriz2.cambiar(1,1,1);
        matriz2.cambiar(1,2,2);
        matriz2.cambiar(2,1,3);
        matriz2.cambiar(2,2,4);
        Matriz2 matriz3 = new Matriz2(5,5,0);
        matriz3.cambiar(1,1,5);
        matriz3.cambiar(1,2,6);
        matriz3.cambiar(2,1,7);
        matriz3.cambiar(2,2,8);
        Matriz2 matriz4 = new Matriz2(5,5,0);
        matriz4.cambiar(1,1,9);
        matriz4.cambiar(1,2,7);
        matriz4.cambiar(2,1,4);
        matriz4.cambiar(2,2,2);
        ListaEstatica matrices = new ListaEstatica(4);
        matrices.agregar(matriz);
        matrices.agregar(matriz2);
        matrices.agregar(matriz3);
        matrices.agregar(matriz4);
        matriz.aMatriz3(matrices).imprimirPorRenglon();*/
        //SalidaPorDefecto.terminal("Columnas  totales; "+matriz.getColumnas());
        //SalidaPorDefecto.terminal("Renglones  totales; "+matriz.getRenglones());
        //ListaEstatica lista = new ListaEstatica(4);
     /*   lista.agregar(11);
        lista.agregar(12);
        lista.agregar(13);
        lista.agregar(14);
        matriz.agregarRenglon(lista);
        SalidaPorDefecto.terminal("Agregando lista por renglon\n");
        lista.imprimir();
        SalidaPorDefecto.terminal("\n");
        matriz.imprimirxRenglon();*/
        /*matriz.imprimirxRenglon();
        SalidaPorDefecto.terminal("Matriz2\n");
        matriz2.imprimirxRenglon();
        SalidaPorDefecto.terminal("Agregando matriz por columna 2 a 1\n");
        matriz.agregarMatrizXRenglon(matriz2);
        matriz.imprimirxRenglon();*/
        /*matriz.imprimirxRenglon();
        SalidaPorDefecto.terminal("A vector columna\n");
        matriz.aVectorRenglon().imprimir();*/
        /*matriz.imprimirxRenglon();
        SalidaPorDefecto.terminal("Eliminando un renglon de derecha y uno de abajo\n");
*/
        matriz.imprimirxRenglon();
        matriz.quitarRenglon(TipoRenglon.ARR);
        matriz.quitarRenglon(TipoRenglon.ABA);
        matriz.imprimirxRenglon();


        /*matriz.imprimirxRenglon();
        matriz.eliminarRenglon(0);
        SalidaPorDefecto.terminal("Eliminando el priemr renglon  \n");
        matriz.imprimirxRenglon();*/




    }
}
