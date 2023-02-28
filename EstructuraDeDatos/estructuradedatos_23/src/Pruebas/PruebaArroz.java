package Pruebas;

import arreglosUnidimensionales.implementacion.Campesino;
import arreglosUnidimensionales.implementacion.EmpresaArroz;

import entradaSalida.EntradaPorDefecto;
import entradaSalida.SalidaPorDefecto;
import estructuraslineales.ListaEstatica;

public class PruebaArroz {
    public static void main(String[] args) {
        ListaEstatica listaEstatica1=new ListaEstatica(12);
        listaEstatica1.agregar(1.0);
        listaEstatica1.agregar(2.0);
        listaEstatica1.agregar(3.0);
        listaEstatica1.agregar(4.0);
        listaEstatica1.agregar(5.0);
        listaEstatica1.agregar(6.0);
        listaEstatica1.agregar(7.0);
        listaEstatica1.agregar(8.0);
        listaEstatica1.agregar(9.0);
        listaEstatica1.agregar(10.0);
        listaEstatica1.agregar(11.0);
        listaEstatica1.agregar(12.0);
        ListaEstatica listaEstatica2=new ListaEstatica(12);
        listaEstatica2.agregar(12.0);
        listaEstatica2.agregar(1.0);
        listaEstatica2.agregar(10.0);
        listaEstatica2.agregar(9.0);
        listaEstatica2.agregar(8.0);
        listaEstatica2.agregar(7.0);
        listaEstatica2.agregar(6.0);
        listaEstatica2.agregar(5.0);
        listaEstatica2.agregar(4.0);
        listaEstatica2.agregar(3.0);
        listaEstatica2.agregar(2.0);
        listaEstatica2.agregar(1.0);

        ListaEstatica listaEstatica3=new ListaEstatica(12);
        listaEstatica3.agregar(11.0);
        listaEstatica3.agregar(12.0);
        listaEstatica3.agregar(13.0);
        listaEstatica3.agregar(14.0);
        listaEstatica3.agregar(15.0);
        listaEstatica3.agregar(16.0);
        listaEstatica3.agregar(17.0);
        listaEstatica3.agregar(18.0);
        listaEstatica3.agregar(19.0);
        listaEstatica3.agregar(20.0);
        listaEstatica3.agregar(21.0);
        listaEstatica3.agregar(22.0);

        ListaEstatica listaEstatica4=new ListaEstatica(12);
        listaEstatica4.agregar(22.0);
        listaEstatica4.agregar(21.0);
        listaEstatica4.agregar(20.0);
        listaEstatica4.agregar(19.0);
        listaEstatica4.agregar(18.0);
        listaEstatica4.agregar(17.0);
        listaEstatica4.agregar(16.0);
        listaEstatica4.agregar(15.0);
        listaEstatica4.agregar(14.0);
        listaEstatica4.agregar(13.0);
        listaEstatica4.agregar(12.0);
        listaEstatica4.agregar(11.0);

        Campesino campesino1 =new Campesino("JESUS",listaEstatica1,listaEstatica2,listaEstatica3,listaEstatica4);

        ListaEstatica listaEstatica11= new ListaEstatica(12);
        listaEstatica11.agregar(12.0);
        listaEstatica11.agregar(1.0);
        listaEstatica11.agregar(10.0);
        listaEstatica11.agregar(9.0);
        listaEstatica11.agregar(8.0);
        listaEstatica11.agregar(7.0);
        listaEstatica11.agregar(6.0);
        listaEstatica11.agregar(5.0);
        listaEstatica11.agregar(4.0);
        listaEstatica11.agregar(3.0);
        listaEstatica11.agregar(2.0);
        listaEstatica11.agregar(1.0);

        ListaEstatica listaEstatica22 = new ListaEstatica(12);
        listaEstatica22.agregar(1.0);
        listaEstatica22.agregar(2.0);
        listaEstatica22.agregar(3.0);
        listaEstatica22.agregar(4.0);
        listaEstatica22.agregar(5.0);
        listaEstatica22.agregar(6.0);
        listaEstatica22.agregar(7.0);
        listaEstatica22.agregar(8.0);
        listaEstatica22.agregar(9.0);
        listaEstatica22.agregar(10.0);
        listaEstatica22.agregar(11.0);
        listaEstatica22.agregar(12.0);

        ListaEstatica listaEstatica33 =new ListaEstatica(12);
        listaEstatica33.agregar(22.0);
        listaEstatica33.agregar(21.0);
        listaEstatica33.agregar(20.0);
        listaEstatica33.agregar(19.0);
        listaEstatica33.agregar(18.0);
        listaEstatica33.agregar(17.0);
        listaEstatica33.agregar(16.0);
        listaEstatica33.agregar(15.0);
        listaEstatica33.agregar(14.0);
        listaEstatica33.agregar(13.0);
        listaEstatica33.agregar(12.0);
        listaEstatica33.agregar(11.0);

        ListaEstatica listaEstatica44 = new ListaEstatica(12);
        listaEstatica44.agregar(11.0);
        listaEstatica44.agregar(12.0);
        listaEstatica44.agregar(13.0);
        listaEstatica44.agregar(14.0);
        listaEstatica44.agregar(15.0);
        listaEstatica44.agregar(16.0);
        listaEstatica44.agregar(17.0);
        listaEstatica44.agregar(18.0);
        listaEstatica44.agregar(19.0);
        listaEstatica44.agregar(20.0);
        listaEstatica44.agregar(21.0);
        listaEstatica44.agregar(22.0);


        Campesino campesino2 =new Campesino("JESUS",listaEstatica11,listaEstatica22,listaEstatica33,listaEstatica44);
        EmpresaArroz empresaArroz =new EmpresaArroz("JARS");







        SalidaPorDefecto.terminal("""
                 1) El promedio anual de toneladas por campesino.
                 2) ¿Cuántos meses tuvieron toneladas mayores al promedio anual del campesino X?.
                 3) ¿Cuál fue el mes que obtuvo menos toneladas por cada año del campesino X?.
                 4) ¿Cuántas toneladas se obtuvieron el último mes de cada año del campesino X?.
                 5) ¿Cuántas toneladas se obtuvieron en el segundo trimestre de cada año del
                campesino X?.
                 6) ¿Qué campesino ha realizado peor su trabajo en cada año?.
                 7) ¿Qué mes es el que produce mayores dividendos a los campesinos?
                 8)¿Qué época del año (primavera, verano, otoño o invierno) genera mayor ganancia
                   en producción?
                 """);

            int opcion=EntradaPorDefecto.consolaDouble().intValue();
            switch (opcion) {
                case 1:
                    SalidaPorDefecto.terminal("Promedio del primer anio del trabajador 1:"+   campesino1.promedioAnual(listaEstatica1));


                    break;
                case 2:
                    SalidaPorDefecto.terminal("Cantidad de meses por arriba del promedio, del campesino1, en segundo anio : "+ campesino1.toneladasMayoresPromedioAnual(listaEstatica2));

                    break;
                case 3:
                    SalidaPorDefecto.terminal("Mes que obtuveo menos en el anio3, del campesino 2 ->mes: "+ campesino1.menosToneladaMes(listaEstatica33));

                    break;
                case 4:
                    SalidaPorDefecto.terminal("El ultimo mes del anio 4 del campesion uno es: "+ campesino1.toneladasUltimoMes(listaEstatica44));

                    break;
                case 5:
                    SalidaPorDefecto.terminal("El total de toneladas en el segundo trimestre, del trabajador 2 "+campesino2.toneladasTrimestre(listaEstatica11) );
                    ;

                    break;
                case 6:
                    SalidaPorDefecto.terminal("Peor trabajador por anio\n");
                    empresaArroz.peorTrabajo(campesino1,campesino2).imprimir();

                    break;
                case 7:
                    SalidaPorDefecto.terminal("El mes que mas le genera al campesino 1 es el mes->"+ campesino1.mayorDividendo(listaEstatica1,listaEstatica2,listaEstatica3,listaEstatica4));
                    break;
                case 8:
                    SalidaPorDefecto.terminal("La temporada del anio que mas le genera al trabajador 2 es->" +campesino2.mayorProduccion(listaEstatica11,listaEstatica22,listaEstatica33,listaEstatica44));
                    break;
                default:
                    System.out.println("No existe la opcion");


            }
        }
    }

