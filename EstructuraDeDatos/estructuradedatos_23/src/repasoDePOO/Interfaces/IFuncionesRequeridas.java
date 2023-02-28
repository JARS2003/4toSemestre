package repasoDePOO.Interfaces;

import repasoDePOO.Implementacion.Aeropuerto;
import repasoDePOO.Implementacion.Avion;
import repasoDePOO.Implementacion.Piloto;
import repasoDePOO.Implementacion.Vuelo;

public interface IFuncionesRequeridas {
    public void altaAviones();
    //public void creaAviones();

    public void consultaTipoAvion();


    //------------------------------
    public void altaPiloto();

    //------------------------------------------------
    public void creaAeropuerto();
    public void consultaAereopuertoCiudad();
    //-----------------------------------------------


    public void creaVuelo();

    public void consultaDestinoOrigenVuelo();
    //-------------------------



}

