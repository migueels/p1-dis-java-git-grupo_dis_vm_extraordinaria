package com.disExt;

<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import static com.disExt.lecturaCSV.leerCSV;
import static com.disExt.programMethods.buscarPorFecha;
import static com.disExt.programMethods.getEntradas;
=======
>>>>>>> a091be4cc42e45889e28e2ef57557b9d283c4e4a

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
	// write your code here

<<<<<<< HEAD
        File archivo = new File("electronic_card_transactions.csv");
        if (!archivo.exists()) { // si no existe
            System.out.println("El archivo indicado no existe");
        } else {
            System.out.println("\nDispone del csv PERFECTO");
        }


        // Menú:

        int opcion = 0; //inicializamos la variable para elegir que opcion del menu
        Boolean salir = false; //inicializamos salir como false, para que no salga del menu

        Tarjeta[] transaccionesCSV= new Tarjeta[18025];

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
                        leerCSV(transaccionesCSV,"electronic_card_transactions.csv");
                        buscarPorFecha(transaccionesCSV);
                        break;
                    case 2:

                        leerCSV(transaccionesCSV,"electronic_card_transactions.csv");
                        getEntradas(transaccionesCSV);
                    case 3:

                    case 4:
                        System.out.println("salida de programa con exito");
                        salir = true;
                        break;
                    default:

                        System.out.println("error");
                }
            }
        }

=======
        // Menú interactivo:

        int opcion = 0;           // Inicializamos la variable para elegir la opción del menú deseada
        Boolean salir = false;   // Inicializamos salir como false, para que no salga del menú

        while (salir == false){
            System.out.println("\n\n       MENÚ OPCIONES INICIAL     ");
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
                    System.out.println("Salida de programa con éxito");
                    salir = true;
                    break;
                default:

                    System.out.println("ERROR");
            }
>>>>>>> a091be4cc42e45889e28e2ef57557b9d283c4e4a
    }
}
