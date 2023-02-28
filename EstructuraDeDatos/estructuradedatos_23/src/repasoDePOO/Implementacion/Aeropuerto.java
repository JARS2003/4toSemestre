package repasoDePOO.Implementacion;



import java.util.ArrayList;


public class Aeropuerto  {
    protected String ciudad;
    protected String pais;

    protected String nombre;

    public Aeropuerto(String ciudad, String pais,String nombre){
        this.ciudad=ciudad;
        this.pais=pais;
        this.nombre=nombre;

    }
    @Override
    public String toString() {
        return "Aeropuerto de la ciudad de:"+ ciudad+ " " +"Con el nombre de: "+ nombre;

    }



}
