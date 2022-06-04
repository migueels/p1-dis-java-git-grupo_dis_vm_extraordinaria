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
        for(int i = 0; i< tarjetadata.length; i++){ //recorremos el array que le pasamos por parametro con los objetos java
            if(tarjetadata[i].getValue() >= 1000 && tarjetadata[i].getValue() <= 10000){ //con if comprobamos aquellos cuyo valor este entre 1000 - 10000
                //para aquellos que cumplen esa confidion if, println con los datos de la transaccion
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


        for(int i = 0; i < tarjetadata.length; i++){ //recorremos el array de entrada on los objetos java
            if(date.equals(tarjetadata[i].getPeriodo())){ //comprobamos si la fecha que hemos introducido es igual a la fecha Periodo del csv
                System.out.println("El importe de la transaccion  " + tarjetadata[i].getSerie() + "  a fecha  " + fechaformato + "  es de:  " + tarjetadata[i].getValue());
                importeTotal = (long) (importeTotal + tarjetadata[i].getValue()); //calculamos el importe total de las transacciones
            }
        }

        System.out.println("\n\nCon un importe total de:  " + importeTotal);

    }

    //funcion exportar un nuevo CSV
    public static void exportCSV(String filename,Tarjeta tarjetadata[]) throws IOException{
        //CardDatos[] cardDatos = new CardDatos[18025];
        String[] data = new String[tarjetadata.length]; //nos cremos un rray del mismo tamaño que el de entrada
        int i= 0;
        //String csv = "salida.csv";
        String[] headers = {"Tittles 2"}; //establecemos la cabecera del csv
        CSVWriter newCsv = new CSVWriter(new FileWriter(filename), '\n');
        //CSVWriter newCsv = new CSVWriter(new FileWriter(filename));

        newCsv.writeNext(headers); //implementamos la cabecera


        for(int j = 0; j < tarjetadata.length; j++){ //recorremos el array de entrada con los objetos java
            //comprobamos si el titles 2 es igual a credit
            if("credit".equalsIgnoreCase(tarjetadata[j].getTitles2())){  //usamos equalignorecase para que no tome mayusculas ni minusculas
                data[i] = String.valueOf(tarjetadata[j].getValue()); //intertamos en el array data la info recogida de la comprobacion
                i++; //incrementamos para i cogiendo la siguiente
            }
        }

        newCsv.writeNext(data); //escribimos los datos del array data en el csv nuevo
        newCsv.close();

        File archivo = new File("salida.csv");
        if (!archivo.exists()) { // si no existe //comprobamos si efectivamente se ha creado el nuevo csv
            System.out.println("El archivo indicado no existe");
        } else {
            System.out.println("\nSe creo el archivo salida.csv correctamente");
        }

    }

}
