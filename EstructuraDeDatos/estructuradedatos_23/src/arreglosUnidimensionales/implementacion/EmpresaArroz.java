package arreglosUnidimensionales.implementacion;

import arreglosUnidimensionales.interfaces.IEmpresaArroz;
import estructuraslineales.ListaEstatica;


public class EmpresaArroz implements IEmpresaArroz {

    protected String nombre;
    protected ListaEstatica campesinos;
    public EmpresaArroz(String nombre){
        campesinos=new ListaEstatica(2);
        this.nombre=nombre;
    }











    @Override
    public ListaEstatica peorTrabajo(Campesino campesino1,Campesino campesino2) {
        ListaEstatica peorTrabajador=new ListaEstatica(4);
        if(campesino1.promedioAnual(campesino1.anio1)>campesino2.promedioAnual(campesino2.anio1)){
            peorTrabajador.agregar(campesino2.nombre);
        }else {
            peorTrabajador.agregar(campesino1.nombre);

        }
        if(campesino1.promedioAnual(campesino1.anio2)>campesino2.promedioAnual(campesino2.anio2)){
            peorTrabajador.agregar(campesino2.nombre);
        }else {
            peorTrabajador.agregar(campesino1.nombre);

        }
        if(campesino1.promedioAnual(campesino1.anio3)>campesino2.promedioAnual(campesino2.anio3)){
            peorTrabajador.agregar(campesino2.nombre);
        }else {
            peorTrabajador.agregar(campesino1.nombre);

        }
        if(campesino1.promedioAnual(campesino1.anio4)>campesino2.promedioAnual(campesino2.anio4)){
            peorTrabajador.agregar(campesino2.nombre);
        }else {
            peorTrabajador.agregar(campesino1.nombre);

        }
        return peorTrabajador;




    }


}
