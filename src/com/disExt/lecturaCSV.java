package com.disExt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lecturaCSV {

    //clase creada para hacer la lectrua del csv

    //instanciamos un nuevo separador
    public static void leerCSV(Tarjeta tarjetadata[]) throws FileNotFoundException{

        BufferedReader filereader = null;
        //String linea = "";

        List<Tarjeta> data = new ArrayList<>();
        try {
            filereader = new BufferedReader(new FileReader("electronic_card_transactions.csv"));
            String linea = filereader.readLine();
            while (linea != null) {
                String[] datos = linea.split(","); //nos creamos un array separados por comas
                //Electronics elec = creararray(datos);
                //data.add(elec);
                linea = filereader.readLine();
                System.out.println(datos);



                //break; //con el break solo mostramos la cabecera, para ver si puede mostrar todo
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
