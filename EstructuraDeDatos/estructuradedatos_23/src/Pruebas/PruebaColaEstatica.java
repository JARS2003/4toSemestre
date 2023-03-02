package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ColaEstatica;

public class PruebaColaEstatica {
    public static void main(String[] args) {
        ColaEstatica colaEstatica = new ColaEstatica(5);
        colaEstatica.poner("A");
        colaEstatica.poner("B");
        colaEstatica.poner("C");
        colaEstatica.poner("D");
        colaEstatica.poner("E");
        colaEstatica.poner("F");
        colaEstatica.imprimir();
        SalidaPorDefecto.terminal("\nEliminando"+ colaEstatica.quitar()+"\n");

        SalidaPorDefecto.terminal("Eliminando"+ colaEstatica.quitar()+"\n");

        colaEstatica.imprimir();
        colaEstatica.poner("Z");
        SalidaPorDefecto.terminal("\n");

        colaEstatica.imprimir();
    }
}
