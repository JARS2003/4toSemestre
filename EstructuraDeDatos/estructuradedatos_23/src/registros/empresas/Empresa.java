package registros.empresas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;

public class Empresa {
    protected String nombre;
    protected ListaEstatica empleados;

    public Empresa(String nombre,int cantidadEmpleado) {
        this.nombre = nombre;
        empleados=new ListaEstatica(cantidadEmpleado);

    }
    public boolean agregarEmpleado(Empleado objetoEmpleado){
        int retornoEmpleado = (Integer)empleados.buscar(objetoEmpleado);
        if (retornoEmpleado==-1){//Se puede agregar
            int retornoPosiscionE = empleados.agregar(objetoEmpleado);
            if (retornoPosiscionE>=0){
                return true;

            }else {//No se puede agregar
                return false;
            }


        }else {
            return false;
        }
    }
    public void imprimirDatosEmpresa(){
        SalidaPorDefecto.terminal("Los datos de la empresa son: "+nombre+"son \n");
        empleados.imprimir();

    }
    public void impromirDatosEmpresaDetalle(){
        SalidaPorDefecto.terminal("Los datos de la empresa son: "+nombre+"son \n");
        for (int cadaEmpleado=0;cadaEmpleado<(int)empleados.cantidad();cadaEmpleado++){
            Empleado empleadoTemporal=(Empleado)empleados.obtener(cadaEmpleado);
            SalidaPorDefecto.terminal(empleadoTemporal.getNombre()+"("+ empleadoTemporal.numeroEmpleado+") \n");
            SalidaPorDefecto.terminal("Sus comisiones son: \n");
            empleadoTemporal.getComisionesDelAnio().imprimir();
            SalidaPorDefecto.terminal("\n"); //empleado lo ponga separado
        }

    }
    public Double obtenerPromedioEmpleado(Empleado objetoEmpleado){
        int posicionempleado=(int)empleados.buscar(objetoEmpleado);
        if (posicionempleado==-1){
            return null;
        }else {
            Empleado empleadoTemporal=(Empleado) empleados.obtener(posicionempleado);
            return empleadoTemporal.obtenerPromedio();
        }
    }

}
