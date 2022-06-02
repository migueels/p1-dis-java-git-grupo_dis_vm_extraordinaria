package com.disExt;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Menú:


        int opcion = 0; //inicializamos la variable para elegir que opcion del menu
        Boolean salir = false; //inicializamos salir como false, para que no salga del menu

        try(Scanner scanner = new Scanner(System.in)){
            while (salir == false){
                System.out.println("\n\n       MENU OPCIONES INICIAL     ");
                System.out.println("\n 1- BUSCAR POR FECHA  ");
                System.out.println("\n 2- MOSTRAR ENTRADAS 1000<x<10000");
                System.out.println("\n 3- EXPORTAR NUEVO PDF ");
                System.out.println("\n 4  SALIR");
                opcion = scanner.nextInt();

                switch (opcion){
                    case 1:

                    case 2:

                    case 3:

                    case 4:
                        System.out.println("salida de programa con exito");
                        salir = true;
                        break;
                    default:

                        System.out.println("error");
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
}
