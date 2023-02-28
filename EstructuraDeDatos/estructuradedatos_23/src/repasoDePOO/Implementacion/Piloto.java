package repasoDePOO.Implementacion;


public class Piloto {
    String nombre;
    String licencia;

    public Piloto(String nombre, String licencia){
        this.nombre=nombre;
        this.licencia = licencia;

    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", licencia='" + licencia + '\'' +
                '}';
    }
}
