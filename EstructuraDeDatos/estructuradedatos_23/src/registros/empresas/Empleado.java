package registros.empresas;

import estructuraslineales.ListaEstatica;

public class Empleado {
    protected int numeroEmpleado;
    protected String nombre;
    protected int edad;
    protected ListaEstatica comisionesDelAno;
    public Empleado(int numeroEmpleado,String nombre,int edad, ListaEstatica comisionesDelAno){
        this.numeroEmpleado=numeroEmpleado;
        this.edad=edad;
        this.comisionesDelAno=comisionesDelAno;
        this.nombre=nombre;

    }
    public Empleado(int numeroEmpleado,String nombre,int edad){
        this.numeroEmpleado=numeroEmpleado;
        this.edad=edad;
        this.nombre=nombre;
        comisionesDelAno=new ListaEstatica(12);

    }
    public boolean agregarComison(double valorComision){
        int retorno=comisionesDelAno.agregar(valorComision);
        if (retorno>=0){
            return true;
        }else {
            return false;
        }
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ListaEstatica getComisionesDelAnio() {
        return comisionesDelAno;
    }

    public void setComisionesDelAno(ListaEstatica comisionesDelAno) {
        this.comisionesDelAno = comisionesDelAno;
    }

    public double obtenerPromedio(){
        double promedio =0.0;
        if ((int) comisionesDelAno.cantidad() != 0) {
            for (int cadaMes=0;cadaMes<(int)comisionesDelAno.cantidad();cadaMes++){
                promedio+=(double)comisionesDelAno.obtener(cadaMes);

            }
            promedio = promedio/(int)comisionesDelAno.cantidad();

        }
        return promedio;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +

                '}';
    }
}
