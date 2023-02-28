package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;
import estructuraslineales.ListaEstaticaNumerica;

public class PruebaListaNumerica {
    public static void main(String[] args) {
        ListaEstaticaNumerica lista1 = new ListaEstaticaNumerica(3);
        ListaEstaticaNumerica lista2 = new ListaEstaticaNumerica(3);
        ListaEstaticaNumerica lista3 = new ListaEstaticaNumerica(3);
        ListaEstaticaNumerica lista4 = new ListaEstaticaNumerica(3);
        ListaEstatica listaEstatica = new ListaEstatica(3);

        lista1.agregar(1);
        lista1.agregar(2);
        lista1.agregar(4);
        lista2.agregar(2);
        lista2.agregar(4);
        lista2.agregar(8);
        lista3.agregar(1);
        lista3.agregar(2);
        lista3.agregar(4);
        lista4.agregar(2);
        lista4.agregar(4);
        lista4.agregar(8);
        listaEstatica.agregar(lista2);
        listaEstatica.agregar(lista3);
        listaEstatica.agregar(lista4);




        lista1.imprimir();
        /*SalidoPorDefecto.terminal("---Lista2----\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Sumar lista2;\n");

        lista1.sumar(lista2);
        lista1.imprimir();
        SalidoPorDefecto.terminal("---Lista2----\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Multiplicar lista2;\n");

        lista1.multiplicar(lista2);


        lista1.aplicarPotencia(2);


        SalidoPorDefecto.terminal("---Aplicando potencia de lista2----\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        lista1.aplicarPotencia(lista2);
        lista1.imprimir();

        SalidoPorDefecto.terminal("---Aplicando producto escalar----\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        SalidoPorDefecto.terminal(lista1.productoEscalar(lista2)+"");

        SalidoPorDefecto.terminal("---Aplicando producto norma euclidaiana----\n");
        SalidoPorDefecto.terminal("---Lista2----\n");
        lista2.imprimir();

        SalidoPorDefecto.terminal(lista1.normaEuclidiana(lista2)+"");

        SalidoPorDefecto.terminal("---Aplicando producto suma escalares----\n");
        SalidoPorDefecto.terminal("lista 2\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        lista1.sumarEscalares(lista2);
        lista1.imprimir();


        SalidoPorDefecto.terminal("---Aplicando producto sumar indices----\n");
        SalidoPorDefecto.terminal("lista 2\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        SalidoPorDefecto.terminal(lista1.sumarIndices(lista2)+"");


        SalidoPorDefecto.terminal("---AplicandoSubLista----\n");
        SalidoPorDefecto.terminal("lista indices\n");
        listaIndices.imprimir();
        SalidoPorDefecto.terminal("Asi quedo la sub lista\n");
        lista1.subLista(listaIndices).imprimir();

        SalidoPorDefecto.terminal("---Aplicando linealmente dependientes----\n");
        SalidoPorDefecto.terminal("lista 2\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
      SalidoPorDefecto.terminal("Son linealmente dependientes:"+lista1.sonLinealmenteDependientes(lista2));

        SalidoPorDefecto.terminal("---Aplicando linealmente independientes----\n");
        SalidoPorDefecto.terminal("lista 2\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        SalidoPorDefecto.terminal("Son linealmente dependientes:"+lista1.sonLinealmenteIndependientes(lista2));

        SalidoPorDefecto.terminal("---Aplicando Son Ortogonales----\n");
        SalidoPorDefecto.terminal("lista 2\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        SalidoPorDefecto.terminal("Es ortogonal:"+lista1.esOrtogonal(lista2));

        SalidoPorDefecto.terminal("---Aplicando Es Paralelo----\n");
        SalidoPorDefecto.terminal("lista 2\n");
        lista2.imprimir();
        SalidoPorDefecto.terminal("Asi quedo\n");
        SalidoPorDefecto.terminal("Es paralelo:"+lista1.esParalelo(lista2));

         */
        SalidaPorDefecto.terminal("---Aplicando suma lista estatic----\n");

        SalidaPorDefecto.terminal("Asi quedo\n");
        SalidaPorDefecto.terminal("Lista estatica\n");
        SalidaPorDefecto.terminal("lista1\n");
        lista2.imprimir();
        SalidaPorDefecto.terminal("lista2\n");

        lista3.imprimir();
        SalidaPorDefecto.terminal("lista3\n");

        lista4.imprimir();
        lista1.sumarListaEstatica(listaEstatica);
        lista1.imprimir();

    }

}
