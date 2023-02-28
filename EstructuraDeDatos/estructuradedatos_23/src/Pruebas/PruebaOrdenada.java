package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstaticaOrdenada;
import utilerias.comunes.TipoOrden;

public class PruebaOrdenada {
    public static void main(String[] args) {
        ListaEstaticaOrdenada listaEstaticaOrdenada = new  ListaEstaticaOrdenada(6,TipoOrden.DEC);
        ListaEstaticaOrdenada listaEstaticaOrdenada2 = new  ListaEstaticaOrdenada(10,TipoOrden.DEC);
        ListaEstaticaOrdenada listaEstaticaOrdenada3 =new  ListaEstaticaOrdenada(3,TipoOrden.DEC);
        //ListaEstaticaOrdenada listaEstaticaOrdenada4 =new  ListaEstaticaOrdenada(6,TipoOrden.DEC);

        SalidaPorDefecto.terminal("Primer metodo 1: \n");
        listaEstaticaOrdenada.agregar(1);
        listaEstaticaOrdenada.agregar(2);
        listaEstaticaOrdenada.agregar(3);
        listaEstaticaOrdenada.agregar(5);
        listaEstaticaOrdenada.agregar(6);
        listaEstaticaOrdenada.agregar(7);
        listaEstaticaOrdenada2.agregar(9);
        listaEstaticaOrdenada2.agregar(0);
        listaEstaticaOrdenada3.agregar(1);
        listaEstaticaOrdenada3.agregar(2);
        listaEstaticaOrdenada3.agregar(3);
        listaEstaticaOrdenada.imprimir();

/*
        SalidoPorDefecto.terminal("------------------------------\n");
        SalidoPorDefecto.terminal("Buscando 4:\n");
        SalidoPorDefecto.terminal(listaEstaticaOrdenada.buscar(4)+"\n");
        SalidoPorDefecto.terminal("------------------------------\n");

        listaEstaticaOrdenada.cambiar(1,4,1);
        SalidoPorDefecto.terminal("Cambiando 1 por el 4:\n");
        listaEstaticaOrdenada.imprimir();
        SalidoPorDefecto.terminal("------------------------------\n");
        SalidoPorDefecto.terminal("Eliminando  el 7:\n");
        listaEstaticaOrdenada.eliminar("7");
        listaEstaticaOrdenada.imprimir();
        SalidoPorDefecto.terminal("------------------------------\n");
        SalidoPorDefecto.terminal("Cambiando el valor de la posicion 5 por el valor 7:\n");
        listaEstaticaOrdenada.cambiar(0,7);
        listaEstaticaOrdenada.imprimir();
        SalidoPorDefecto.terminal("------------------------------\n");
        */
        listaEstaticaOrdenada.invertir();
        SalidaPorDefecto.terminal("Invirtiendo\n");

        listaEstaticaOrdenada.agregarLista(listaEstaticaOrdenada2);
        listaEstaticaOrdenada.imprimir();
        SalidaPorDefecto.terminal("Desordenado\n");
        listaEstaticaOrdenada.arregloDesordenado().imprimir();

        SalidaPorDefecto.terminal("Sublista esta lista:\n");
        listaEstaticaOrdenada3.imprimir();
        SalidaPorDefecto.terminal("Es sublista"+" "+listaEstaticaOrdenada.esSubLista(listaEstaticaOrdenada3)+"\n");
        ListaEstaticaOrdenada lista1 = new  ListaEstaticaOrdenada(3,TipoOrden.DEC);
        ListaEstaticaOrdenada lista2 = new  ListaEstaticaOrdenada(3,TipoOrden.DEC);
        ListaEstaticaOrdenada lista3=new  ListaEstaticaOrdenada(3,TipoOrden.DEC);
        lista1.agregar(2);
        lista1.agregar(3);
        lista1.agregar(4);
        lista2.agregar(2);
        lista2.agregar(3);
        lista2.agregar(4);
        lista3.agregar(111);
        lista3.agregar(222);
        lista3.agregar(333);
        lista1.imprimir();
        SalidaPorDefecto.terminal("cambiandoLista;\n");
        lista1.imprimir();
        lista1.cambiarLista(lista2,lista3);
        SalidaPorDefecto.terminal("ya cambio\n");
        lista1.imprimir();
        ListaEstaticaOrdenada lista4=new  ListaEstaticaOrdenada(3,TipoOrden.DEC);
        lista4.agregar(2);
        lista4.agregar(3);
        lista4.agregar(5);
        listaEstaticaOrdenada.imprimir();


        SalidaPorDefecto.terminal("reteniendo lista 1\n");
        listaEstaticaOrdenada.retenerLista(lista4);

        SalidaPorDefecto.terminal("Despues de retener queda asi:\n");
        listaEstaticaOrdenada.imprimir();

















    }
}
