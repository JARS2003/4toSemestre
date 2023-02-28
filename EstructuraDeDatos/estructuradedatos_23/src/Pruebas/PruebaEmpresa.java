package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;
import registros.empresas.Empleado;
import registros.empresas.Empresa;

public class PruebaEmpresa {
    public static void main(String[] args) {
        Empresa emprea = new Empresa("Patitio SA",5);
        ListaEstatica comisiones = new ListaEstatica(4);
        comisiones.agregar(400.2);
        comisiones.agregar(701.2);
        comisiones.agregar(80.2);
        comisiones.agregar(4.2);

        Empleado empleado1=new Empleado(101,"Pedro",30,comisiones);


        ListaEstatica comisiones2 = new ListaEstatica(4);
        comisiones2.agregar(900.3);
        comisiones2.agregar(10.2);
        comisiones2.agregar(498.1);


        Empleado empleado2=new Empleado(201,"Rosa",31,comisiones2);
        emprea.agregarEmpleado(empleado1);
        emprea.agregarEmpleado(empleado2);

        emprea.imprimirDatosEmpresa();
        SalidaPorDefecto.terminal("\n");
        emprea.impromirDatosEmpresaDetalle();
        SalidaPorDefecto.terminal("El promedio de comisiones de Pedro es: "+ emprea.obtenerPromedioEmpleado(empleado1));
    }
}
