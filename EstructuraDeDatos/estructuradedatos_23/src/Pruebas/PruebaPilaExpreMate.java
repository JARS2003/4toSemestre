package Pruebas;

import entradaSalida.SalidaPorDefecto;
import utilerias.matematicas.ExpresionesMatematicas;

public class PruebaPilaExpreMate {
    public static void main(String[] args) {
        SalidaPorDefecto.terminal("Ejecutando la operacion usando expresiones aritmeticas:\n ");
        SalidaPorDefecto.terminal("-+a8/*3x^4z, donde a=1,x=2,z=2: "+ ExpresionesMatematicas.evaluarPrefija("-+18/*32^42"));

    }
}
