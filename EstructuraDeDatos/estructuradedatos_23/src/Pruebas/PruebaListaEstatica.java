package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;

import java.util.Scanner;

/**
 * Esta pruba el funcionamiento de los metodos.
 *  @VERSION 1.0
 *  @autor Jesus
 */
public class PruebaListaEstatica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        ListaEstatica lista = new ListaEstatica(5);
        ListaEstatica lista2 = new ListaEstatica(5);
        ListaEstatica lista3 = new ListaEstatica(5);

        lista.agregar("1");
        lista.agregar("2");
        lista.agregar("3");
        lista.agregar("4");
        lista.agregar("5");

        lista2.agregar("1");
        lista2.agregar("2");
        lista2.agregar("3");
        lista2.agregar("4");
        lista2.agregar("5");

        lista3.agregar("5");
        lista3.agregar("5");
        lista3.agregar("5");
        lista3.agregar("5");
        lista3.agregar("5");


        do {
            System.out.println("""
                    1) Es igual.
                    2) Obtener.
                    3) Eliminar.
                    4) Eliminar, regresar ultimo.
                    5) Vaciar.
                    6)Contar
                    7)Invertir
                    8)buscarValores
                    
                    """);
            SalidaPorDefecto.terminal("Ingrese la opcion:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    SalidaPorDefecto.terminal("Lista 1" + "\n");
                    lista.imprimir();
                    SalidaPorDefecto.terminal("Lista 2" + "\n");
                    lista2.imprimir();
                    SalidaPorDefecto.terminal("Las listas son iguales?"+ lista.esIgual(lista2) +"\n");
                    break;
                case 2:
                    lista.imprimir();
                    SalidaPorDefecto.terminal("El objeto de la posicion 0 es: " + lista.obtener(0)+"\n" );
                    break;
                case 3:
                    lista.imprimir();
                    SalidaPorDefecto.terminal("Asi quedo despues de eliminar el objrto de la posicon 4"+ "\n");
                    lista.eliminar(4);
                    lista.imprimir();

                    break;
                case 4:
                    lista.imprimir();
                    SalidaPorDefecto.terminal("El ultimo objeto es "+ lista.eliminar()+"\n");
                    break;
                case 5:
                    lista2.imprimir();
                    SalidaPorDefecto.terminal("Vaciando lista" +"\n");
                    lista2.vaciar();
                    lista2.imprimir();
                    break;
                case 6:
                    lista3.imprimir();
                    SalidaPorDefecto.terminal("Repeticiones del 5" +"\n");
                    SalidaPorDefecto.terminal("El 5 se repitio "+lista3.contar("5")+"\n");
                case 7:
                    lista.imprimir();
                    SalidaPorDefecto.terminal("Invirtiendo"+"\n");
                    lista.invertir();
                    lista.imprimir();
                    break;
                case 8:
                    SalidaPorDefecto.terminal("Lista de posiciones del 5");
                    lista3.buscarValores("5").imprimir();


                    break;
                case 18:
                    SalidaPorDefecto.terminal("saliendo");
                    break;

                default:
                    System.out.println("No existe la opcion");


            }


        } while (opcion != 18);

    }
}


















