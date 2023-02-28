package repasoDePOO.Implementacion;


import repasoDePOO.Interfaces.IFuncionesRequeridas;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionesRequridas implements IFuncionesRequeridas {
    ArrayList <Avion> aviones;
    ArrayList <Vuelo> vuelos;
    ArrayList <Aeropuerto> aeropuertos;
    ArrayList <Piloto> pilotos;
    Scanner sc;


    public FuncionesRequridas(){
        aviones = new ArrayList<>();
        vuelos = new ArrayList<>();
        aeropuertos = new ArrayList<>();
        pilotos = new ArrayList<>();
        sc =new Scanner(System.in);

    }



    @Override
    public void altaAviones() {
        System.out.println("""
                Ingrese el tipo de avion:
                1) Carga, Pasajeros, Militar, Recreación, Excursión.
                """);
         String tipoDeAvion= sc.nextLine();
         //-----------------------
        System.out.println("Ingrese la matricula del avion:");
         int matricula = sc.nextInt();
        //-----------------------
        System.out.println("Ingrese el fabricante del avion: ");
        String fabricante = sc.nextLine();
        //-----------------------
        System.out.println("Ingrese el modelo del avion:");
        String modelo = sc.nextLine();
        //-----------------------
        System.out.println("Ingrese la capacidad del avion:");
        String capacidad = sc.nextLine();
        //-----------------------
        System.out.println("Ingrese la autonomia del avion:");
        String autonomia = sc.next();
        //-----------------------
        System.out.println("Ingrese el fabricante del avion:");
        //-----------------------
        System.out.println("Ingrese la decha de vuelo del avion:");
        String fechaDeVuelo = sc.next();
        //-----------------------

        Avion avion = new Avion(tipoDeAvion,matricula,fabricante,modelo,capacidad,autonomia,fechaDeVuelo);
        avion.setPiloto(regresaPiloto());
        System.out.println("Se realizo correctamente");
        aviones.add(avion);


    }

    @Override
    public void consultaTipoAvion() {
        System.out.println("""
                Ingrese el tipo de avion, para buscar:
                1) Carga, Pasajeros, Militar, Recreación, Excursión.
                """);

        String tipoAvion = sc.nextLine();
        for (Avion avion:aviones) {
            if (avion.tipoDeAvion.equals(tipoAvion)){
                System.out.println(avion);
            }

        }


    }


    @Override
    public void altaPiloto() {
        System.out.println("Ingrrese el nombre del piloto");
        String nombre = sc.nextLine();
        System.out.println("""
                Ingrese el tipo de licencia:
                1) Carga, Pasajeros, Militar, Recreación, Excursión.
                """);
        String licencia = sc.nextLine();
        Piloto piloto = new Piloto(nombre,licencia);

        pilotos.add(piloto);

    }
    public Piloto regresaPiloto() {
        System.out.println("Ingrrese el nombre del piloto");
        String nombre = sc.nextLine();
        System.out.println("""
                Ingrese el tipo de licencia:
                1) Carga, Pasajeros, Militar, Recreación, Excursión.
                """);
        String licencia = sc.nextLine();
        Piloto piloto = new Piloto(nombre,licencia);

        return piloto;

    }



    @Override
    public void creaAeropuerto() {
        System.out.println("Ingrese la ciudad:");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese el pais:");
        String pais = sc.nextLine();
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();
        Aeropuerto aeropuerto = new Aeropuerto(ciudad,pais,nombre);
        aeropuertos.add(aeropuerto);


    }
    public Aeropuerto regresarAeropuerto() {
        System.out.println("Ingrese la ciudad:");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese el pais:");
        String pais = sc.nextLine();
        System.out.println("Ingrese el nombre:");
        String nombre = sc.nextLine();
        Aeropuerto aeropuerto = new Aeropuerto(ciudad,pais,nombre);
        return aeropuerto;


    }



    @Override
    public void consultaAereopuertoCiudad() {
        System.out.println("Ingrese la ciudad a la que pertenece el aeropuerto, para buscar");

        String ciudad = sc.nextLine();
        for (Aeropuerto aeropuerto:aeropuertos) {
            if (aeropuerto.ciudad.equals(ciudad)){
                System.out.println(aeropuerto);
            }

        }

    }
    @Override
    public void creaVuelo() {

        Vuelo vuelo1 = new Vuelo(regresarAeropuerto(),regresarAeropuerto());
        vuelo1.setPiloto(regresaPiloto());
        for (Avion matricula:aviones) {
            System.out.println("Aviones disponibles");
            System.out.println(matricula.matricula);

        }
        int matricula = sc.nextInt();
        vuelo1.avion.matricula= matricula;


    }



    @Override
    public void consultaDestinoOrigenVuelo() {
        System.out.println("Ingrese la ciudad");
        String ciudad = sc.nextLine();
        for (Vuelo vuelo:vuelos) {
            if (vuelo.aereopuertoOrigen.equals(ciudad)){
                System.out.println(vuelo);
            }else if (vuelo.aereopuertoDestino.equals(ciudad)){
                System.out.println(vuelo.destinoString());
            }else {
                System.out.println("No se encontro");
            }

        }



    }
    //-------------------------



    }
