package arreglosUnidimensionales.implementacion;

import arreglosUnidimensionales.interfaces.ICampesino;
import estructuraslineales.ListaEstatica;

public class Campesino implements ICampesino {
    protected  String nombre;

    protected ListaEstatica anio1;
    protected ListaEstatica anio2;
    protected ListaEstatica anio3;
    protected ListaEstatica anio4;

    public Campesino(String nombre, ListaEstatica anio1, ListaEstatica anio2, ListaEstatica anio3, ListaEstatica anio4) {
        this.nombre = nombre;
        this.anio1 = anio1;
        this.anio2 = anio2;
        this.anio3 = anio3;
        this.anio4 = anio4;
    }

    @Override
    public double promedioAnual(ListaEstatica listaEstatica){
        double promedio=0;
        if((int)listaEstatica.cantidad()!=0){
            for (int mes=0;mes<(int)listaEstatica.cantidad();mes++){
                promedio +=(double) listaEstatica.obtener(mes);

            }
            promedio=promedio/(int)listaEstatica.cantidad();
        }
        return promedio;

    }

    @Override
    public int toneladasMayoresPromedioAnual(ListaEstatica listaEstatica) {
        int cantidad =0;
        for (int mes=0;mes<(int)listaEstatica.cantidad();mes++){
            if((double)listaEstatica.obtener(mes)>promedioAnual(listaEstatica)){
                cantidad++;
            }


        }
        return cantidad;

    }



    @Override
    public int menosToneladaMes(ListaEstatica listaEstatica) {
        double menor=0;
        for (int mes=0;mes<(int)listaEstatica.cantidad();mes++){
            if (menor==0){
                menor=(double) listaEstatica.obtener(mes);
            }
        }
        return (int)listaEstatica.buscar(menor)+1;

    }



    @Override
    public double toneladasUltimoMes(ListaEstatica listaEstatica) {
        return (double) listaEstatica.obtener(11);

    }

    @Override
    public double toneladasTrimestre(ListaEstatica listaEstatica) {
        double trimestre=0.0;
        for (int mes=3;mes<6;mes++){
            trimestre+=(double)listaEstatica.obtener(mes);
        }
        return trimestre;

    }

    @Override
    public int mayorDividendo(ListaEstatica listaEstatica1, ListaEstatica listaEstatica2, ListaEstatica listaEstatica3, ListaEstatica listaEstatica4) {
        ListaEstatica mesesDividendo=new ListaEstatica(12);
        for (int meses=0;meses<(int)listaEstatica1.cantidad();meses++){
            double suma=(double) listaEstatica1.obtener(meses) +(double) listaEstatica2.obtener(meses)+(double) listaEstatica3.obtener(meses)+(double) listaEstatica4.obtener(meses);
            mesesDividendo.agregar(suma);
        }
        double mayor=0.0;
        for(int dividenndos=0;dividenndos<(int) mesesDividendo.cantidad();dividenndos++){
            if((double)mesesDividendo.obtener(dividenndos)>mayor){
                mayor=(double)mesesDividendo.obtener(dividenndos);
            }
        }
        return (int) mesesDividendo.buscar(mayor)+1;
    }

    @Override
    public String mayorProduccion(ListaEstatica listaEstatica1, ListaEstatica listaEstatica2, ListaEstatica listaEstatica3, ListaEstatica listaEstatica4) {
        String estacion=" ";
        double primavera=0;
        double verano=0;
        double otonio=0;
        double invierno=0;

        ListaEstatica produccionTemporada = new ListaEstatica(4);
        for (int mes=2;mes<5;mes++){
            primavera=primavera+(double)listaEstatica1.obtener(mes)+(double)listaEstatica2.obtener(mes)+
                    (double)listaEstatica3.obtener(mes)+(double)listaEstatica4.obtener(mes);


        }
        for (int mes=5;mes<8;mes++){
            verano=verano+(double)listaEstatica1.obtener(mes)+(double)listaEstatica2.obtener(mes)+
                    (double)listaEstatica3.obtener(mes)+(double)listaEstatica4.obtener(mes);

        }
        for (int mes=8;mes<11;mes++){
            otonio=otonio+(double)listaEstatica1.obtener(mes)+(double)listaEstatica2.obtener(mes)+
                    (double)listaEstatica3.obtener(mes)+(double)listaEstatica4.obtener(mes);

        }
        for (int mes=0;mes<2;mes++){
            invierno=invierno+(double)listaEstatica1.obtener(mes)+(double)listaEstatica2.obtener(mes)+
                    (double)listaEstatica3.obtener(mes)+(double)listaEstatica4.obtener(mes);

        }
        invierno=invierno+(double)listaEstatica1.obtener(11)+(double)listaEstatica2.obtener(11)+
                (double)listaEstatica3.obtener(11)+(double)listaEstatica4.obtener(11);
        produccionTemporada.agregar(primavera);
        produccionTemporada.agregar(verano);
        produccionTemporada.agregar(otonio);
        produccionTemporada.agregar(invierno);
        double mayor=0;
        for (int estacionProduccion=0;estacionProduccion<(int) produccionTemporada.cantidad();estacionProduccion++){
            if((double)produccionTemporada.obtener(estacionProduccion)>mayor){
                mayor=(double)produccionTemporada.obtener(estacionProduccion);
            }
        }
        int opcion=(int) produccionTemporada.buscar(mayor);

        switch (opcion){
            case 0:
                 estacion="Primavera";

                break;
            case 1:
                estacion="Verano";

                break;
            case 2:
                estacion="Otonio";

                break;
            case 3:
                estacion="Invierno";

                break;
        }
        return estacion;
    }


}
