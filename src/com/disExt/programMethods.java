package com.disExt;


import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programMethods {

    //en esta clase implementamos los metodo usados para el menu

    //metodo para devolver las transacciones de la opcion 1
    public static void getEntradas(Tarjeta tarjetadata[]) throws FileNotFoundException, IOException {
        for(int i = 0; i< tarjetadata.length; i++){
            if(tarjetadata[i].getValue() >= 1000 && tarjetadata[i].getValue() <= 10000){
                System.out.println("la transaccion: " + tarjetadata[i].getSerie() + " tiene un importe de: " + tarjetadata[i].getValue() + "$");
            }
        }
    }

    //metodo para devolver valores por las fechas
    public static void buscarPorFecha(Tarjeta tarjetadata[]) throws IOException, ParseException {
        //establecemos el formato en el que recibimos la fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("mm/yyyy");
        SimpleDateFormat formatoExcel = new SimpleDateFormat("yyyy.mm");

        //declaramos la variable fecha que mete el usuario como string
        String fecha;

        do{
            //solicitamos al usuario que introduzca la fecha en el formato pedido y lo ponemos en dicho formato
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor introduzca una fecha con el formato  mm/yyyy");
            fecha = sc.nextLine();


        }while (fecha.length() != 7);
        //parseamos el formato de la fecha introducida
        Date date = formatoFecha.parse(fecha);
        String fechaformato = formatoExcel.format(date);

        //una vez parseado comprobamos si se encuentra en el excel
        long importeTotal = 0;


        for(int i = 0; i < tarjetadata.length; i++){
            if(date.equals(tarjetadata[i].getPeriodo())){
                System.out.println("El importe de la transaccion  " + tarjetadata[i].getSerie() + "  a fecha  " + fechaformato + "  es de:  " + tarjetadata[i].getValue());
                importeTotal = (long) (importeTotal + tarjetadata[i].getValue());
            }
        }

        System.out.println("\n\nCon un importe total de:  " + importeTotal);

    }

    //funcion exportar un nuevo CSV
    public static void exportCSV(String filename,Tarjeta tarjetadata[]) throws IOException{
        //CardDatos[] cardDatos = new CardDatos[18025];
        String[] data = new String[tarjetadata.length];
        int i= 0;
        //String csv = "salida.csv";
        String[] headers = {"Tittles 2"};
        CSVWriter newCsv = new CSVWriter(new FileWriter(filename), '\n');
        //CSVWriter newCsv = new CSVWriter(new FileWriter(filename));

        newCsv.writeNext(headers);


        for(int j = 0; j < tarjetadata.length; j++){
            if("credit".equalsIgnoreCase(tarjetadata[j].getTitles2())){

                data[i] = String.valueOf(tarjetadata[j].getValue());
                i++;
            }
        }

        newCsv.writeNext(data);
        newCsv.close();

        File archivo = new File("salida.csv");
        if (!archivo.exists()) { // si no existe
            System.out.println("El archivo indicado no existe");
        } else {
            System.out.println("\nSe creo el archivo salida.csv correctamente");
        }

    }

}
