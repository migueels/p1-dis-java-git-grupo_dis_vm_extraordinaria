package com.disExt;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import static com.disExt.lecturaCSV.leerCSV;
import static com.disExt.programMethods.*;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        // write your code here

        //comprobamos si existe el archivo csv para la aplicacion
        File archivo = new File("electronic_card_transactions.csv");
        if (!archivo.exists()) { // si no existe
            System.out.println("El archivo indicado no existe");
        } else {
            System.out.println("\nDispone del csv PERFECTO");
        }


        // Menú:

        int opcion = 0; //inicializamos la variable para elegir que opcion del menu
        Boolean salir = false; //inicializamos salir como false, para que no salga del menu

        Tarjeta[] transaccionesCSV= new Tarjeta[18025]; //nos creamos un array de un tamaño 18025 que es el tamaño del csv

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
                        leerCSV(transaccionesCSV,"electronic_card_transactions.csv"); //hacemos una llamada al metodo lecturaCSV con el array creado y el csv
                        buscarPorFecha(transaccionesCSV); //llamamos a buscar por fecha con un array con los objetos java de la lectura
                        break;
                    case 2:

                        leerCSV(transaccionesCSV,"electronic_card_transactions.csv");  //hacemos una llamada al metodo lecturaCSV con el array creado y el csv
                        getEntradas(transaccionesCSV); //llamamos a la funcion getEntrada con un array con los objetos java de la lectura
                    case 3:

                        leerCSV(transaccionesCSV,"electronic_card_transactions.csv"); //hacemos una llamada al metodo lecturaCSV con el array creado y el csv
                        exportCSV("salida.csv", transaccionesCSV); //llamamos a exportCSV con un array con los objetos java de la lectura
                        break;
                    case 4:
                        System.out.println("salida de programa con exito");
                        salir = true;
                        break;
                    default:

                        System.out.println("error");
                }
            }
        }

    }
}