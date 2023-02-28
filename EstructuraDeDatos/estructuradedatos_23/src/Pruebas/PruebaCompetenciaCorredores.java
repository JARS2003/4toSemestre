package Pruebas;

import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;
import registros.CompetenciasAtleticas.ControlCompetenciasAtleticas;
import registros.CompetenciasAtleticas.Corredor;
import registros.CompetenciasAtleticas.EventoCompetencia;

public class PruebaCompetenciaCorredores {
    public static void main(String[] args) {
        ControlCompetenciasAtleticas competencias = new ControlCompetenciasAtleticas(4,3,5);
        competencias.agregarAnio(1980);
        competencias.agregarAnio(2000);
        competencias.agregarAnio(2005);
        competencias.agregarAnio(2019);
        Corredor corredor1 =new Corredor(101,"Pepe",20,"Mexicano");
        Corredor corredor2 =new Corredor(201,"Lencho",20,"Mexicano");
        Corredor corredor3 =new Corredor(301,"Jelipe",20,"Salvadoreño");
        competencias.agregarCorredor(corredor1);
        competencias.agregarCorredor(corredor2);
        competencias.agregarCorredor(corredor3);

        EventoCompetencia evento1 = new EventoCompetencia("Viva la vida","Chiciccon");
        EventoCompetencia evento2 = new EventoCompetencia("Viva la x","xvc");

        competencias.agregarEvento(evento1);
        competencias.agregarEvento(evento2);
        competencias.agregarKilometros(1980,101,"Viva la vida",44.0);
        competencias.agregarKilometros(2000,201,"Viva la vida",444.0);
        competencias.agregarKilometros(2005,301,"Viva la vida",555.0);

        competencias.imprimirDatosCompetencia();
        //Invocación a preguntas comunes:
        //Indicar los kilómetros recorridos de Lencho en "Viva la vida"
        //en los años 2000, 2005, 2019, 2020
        ListaEstatica aniosPedidosCorredor=new ListaEstatica(3);
        aniosPedidosCorredor.agregar(2000); //si existe
        aniosPedidosCorredor.agregar(2019); //si existe
        aniosPedidosCorredor.agregar(2020); //no existe
        aniosPedidosCorredor.agregar(1980); //no existe
        aniosPedidosCorredor.agregar(2029); //no existe
        aniosPedidosCorredor.agregar(2030); //no existe
        double kmsPedidos=competencias.kmXCorredorXEvento(201,
                "Viva la vida", aniosPedidosCorredor);
        SalidaPorDefecto.terminal("La salida acumulada de kms de "+
                "la solicitud es: " + kmsPedidos);




    }
}
