package com.disExt;


public class Main {

    public static void main(String[] args) {
	// write your code here

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
    }
}
