package repasoDePOO.Implementacion;


public class Vuelo  {
    protected String aereopuertoDestino;
    protected String aereopuertoOrigen;
    protected String nombreDestino;
    protected String nombreOrigen;
    protected String paisOrigen;
    protected String paisDestino;

    protected Piloto piloto;
    protected Avion avion;

    public Vuelo(Aeropuerto origen, Aeropuerto destino){
        aereopuertoDestino=destino.ciudad;
        aereopuertoOrigen=origen.ciudad;
        nombreOrigen=origen.nombre;
        nombreDestino=destino.nombre;
        paisDestino=destino.pais;
        paisOrigen=origen.pais;


    }

    @Override
    public String toString() {
        return "Aeropuerto por origen:"+ aereopuertoOrigen+ " " +"Con el nombre de: "+ nombreOrigen;

    }


    public String destinoString() {
        return "Aeropuerto por destino:"+ aereopuertoDestino + " " +"Con el nombre de: "+ nombreDestino;

    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
