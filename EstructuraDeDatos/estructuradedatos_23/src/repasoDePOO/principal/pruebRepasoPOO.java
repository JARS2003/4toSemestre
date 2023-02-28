package repasoDePOO.principal;

import repasoDePOO.Implementacion.FuncionesRequridas;

import java.util.Scanner;

public class pruebRepasoPOO {
    public static void main(String[] args) {
        int opcion=0;
        Scanner scanner = new Scanner(System.in);
        FuncionesRequridas funcionesRequridas = new FuncionesRequridas();
        do {
            System.out.println("""
                1) Dar de alta aviones y sus datos.
                2) Consultar aviones por tipo.
                3) Dar de alta pilotos.
                4) Dar de alta aeropuertos.
                5) Registrar vuelos de origen a destino con cierto piloto.
                6) Consultar vuelos ya sea por origen o por destino.
                7) Consultar aeropuertos por ciudad.""");

                opcion=scanner.nextInt();
                switch (opcion){
                    case 1:
                        funcionesRequridas.altaAviones();
                        break;
                    case 2:
                        funcionesRequridas.consultaTipoAvion();
                        break;
                    case 3:
                        funcionesRequridas.altaPiloto();
                        break;
                    case 4:
                        funcionesRequridas.creaAeropuerto();
                        break;
                    case 5:
                        funcionesRequridas.consultaDestinoOrigenVuelo();
                        break;
                    case 6:
                        funcionesRequridas.creaVuelo();
                        break;
                    case 7:
                        funcionesRequridas.consultaAereopuertoCiudad();
                        break;
                    default:
                        System.out.println("No existe la opcion");


                }


        }while (opcion !=7);

        }


    }

