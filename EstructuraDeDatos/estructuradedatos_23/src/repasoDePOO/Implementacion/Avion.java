package repasoDePOO.Implementacion;


public class Avion  {
    protected String tipoDeAvion;
    protected int matricula;
    protected String fabricante;
    protected String modelo;
    protected String capacidad;
    protected String autonomia;
    protected String fechaDeVuelo;
    protected Piloto piloto;
    public Avion(String tipoDeAvion, int matricula,String fabricante,String modelo,String capacidad, String autonomia, String fechaDeVuelo){
        this.tipoDeAvion = tipoDeAvion;
        this.matricula = matricula;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.autonomia = autonomia;
        this.fechaDeVuelo =fechaDeVuelo;


    }

    @Override
    public String toString() {
        return "La matricula del avion es: " + matricula + "El modelo es: "+ modelo;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
