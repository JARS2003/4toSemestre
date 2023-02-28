package registros.CompetenciasAtleticas;

import entradaSalida.SalidaPorDefecto;
import estructuraNoLineal.Matriz3;
import estructuraslineales.ListaEstatica;

public class ControlCompetenciasAtleticas {
    protected Matriz3 kmRecorridos;
    protected ListaEstatica anios;
    protected ListaEstatica corredores;
    protected ListaEstatica eventosCpmpetencias;
    public ControlCompetenciasAtleticas(int numAnios,int numCorredores,int numEventosCompetencias){
        kmRecorridos=new Matriz3(numAnios,numCorredores,numEventosCompetencias);
        anios = new ListaEstatica(numAnios);
        corredores = new ListaEstatica(numCorredores);
        eventosCpmpetencias = new ListaEstatica(numEventosCompetencias);
        kmRecorridos.rellenar(0.0);

    }
    public boolean agregarAnio(int anio){
        int indiceAnio = (int)anios.buscar(anio);
        if(indiceAnio == -1){
            int retorno=anios.agregar(anio);
            return retorno != -1;
        }else{
            return false;
        }


    }
    public boolean agregarCorredor(Corredor corredor){
        int indiceCorredor=(int)corredores.buscar(corredor);
        if (indiceCorredor==-1){
            int retorno = corredores.agregar(corredor);
            if(retorno==-1){
                return false;
            }else {
                return true;
            }


        }else {
            return false;
        }

    }
    public boolean agregarEvento(EventoCompetencia evento){
        int indiceEvento=(int)eventosCpmpetencias.buscar(evento);
        if (indiceEvento==-1){
            int retorno = eventosCpmpetencias.agregar(evento);
            if(retorno==-1){
                return false;
            }else {
                return true;
            }


        }else {
            return false;
        }

    }
    public boolean agregarKilometros(int anio,int numCorredor,String nomEvento, double kilometro) {
        ListaEstatica listaIndices = buscarIndicesCuboKms(anio, numCorredor, nomEvento);
        if (listaIndices != null) {
            return kmRecorridos.cambiar((int) listaIndices.obtener(0), (int) listaIndices.obtener(1), (int) listaIndices.obtener(2), kilometro);
        } else {
            return false;

        }
    }
    private ListaEstatica buscarIndicesCuboKms(int anio,int numCorredor,String evento){
        int indiceAnio = (int)anios.buscar(anio);
        int indiceCorredor = (int)corredores.buscar(numCorredor);
        int indiceEvento = (int)eventosCpmpetencias.buscar(evento);
        if (indiceAnio>=0 && indiceCorredor>=0 && indiceEvento>=0){
            ListaEstatica listaIndices = new ListaEstatica(3);
            listaIndices.agregar(indiceAnio);
            listaIndices.agregar(indiceCorredor);
            listaIndices.agregar(indiceEvento);
            return listaIndices;
        }else {
            return null;

        }

    }
    public void imprimirAnio(){
        SalidaPorDefecto.terminal("Anios\n");
        anios.imprimir();
    }
    public void imprimirCorredor(){
        SalidaPorDefecto.terminal("Corredor\n");
        corredores.imprimir();
    }
    public void imprimirEventos(){
        SalidaPorDefecto.terminal("Eventos\n");
        eventosCpmpetencias.imprimir();
    }
    public void imprimirKilometrosRecorridos(){
        SalidaPorDefecto.terminal("Kilometros\n");
        kmRecorridos.imprimirxColumna();
    }
    public void imprimirDatosCompetencia(){
        imprimirAnio();
        imprimirCorredor();
        imprimirEventos();
        imprimirKilometrosRecorridos();
    }
    //Indicar los reccoridos de Lencho "Viva la vida"
    //en los años 2000,2005,2019,2020
    //Indicar los kilometros reccoridos por lencho en 2005.
    //
    public double kmXCorredorXEvento(int numCorredor,String evento,ListaEstatica aniosPedidos){
        double kmsAcumulado=0.0;
        for (int cadaAnio=0;cadaAnio<(int) anios.cantidad();cadaAnio++){
            int anioPedido=(int) aniosPedidos.obtener(cadaAnio);
            double kmsIndividual=kmXCorredorXEventoXAnio(numCorredor,evento,anioPedido);
            if (kmsIndividual>=0){
                kmsAcumulado=kmsAcumulado+kmsIndividual;
                return kmsAcumulado;

            }
        }
        return kmsAcumulado;

    }
    public double kmXCorredorXEventoXAnio(int numCorredor,String evento,int anio){
        ListaEstatica listaIndices=buscarIndicesCuboKms(anio,numCorredor,evento);
        if (listaIndices!=null){
            return (double) kmRecorridos.obtener((int)listaIndices.obtener(0),(int)listaIndices.obtener(1),(int)listaIndices.obtener(2));

        }else {
            return -1.0;
        }

    }
}
