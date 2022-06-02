package com.disExt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class lecturaCSV {

    //clase creada para hacer la lectrua del csv


    //instanciamos un nuevo separador
    public static final String Separador = ",";

    public static void leerCSV(Tarjeta tarjetadata[], String path) throws IOException {


        //nos creamos el bufferedReader
        BufferedReader br = null;
        int objetocsv = 0;
        for(int i = 0; i < tarjetadata.length; i++){
            tarjetadata[i] = new Tarjeta();

        }

        try{
            br = new BufferedReader(new FileReader(path));
            String linea = br.readLine();

            while (linea != null){
                String arreglo[] = linea.split(Separador);
                if(objetocsv != 0){
                    tarjetadata[objetocsv].setSerie(arreglo[0]);
                    tarjetadata[objetocsv].setPeriodo(new SimpleDateFormat("yyyy.mm").parse(arreglo[1]));
                    //omito el atributo date para probar
                    try {
                        tarjetadata[objetocsv].setValue(Float.parseFloat(arreglo[2]));
                    }catch (Exception ex1){
                        tarjetadata[objetocsv].setValue(0);
                    }
                    tarjetadata[objetocsv].setStatus(arreglo[4].charAt(0));
                    tarjetadata[objetocsv].setUnits(arreglo[5]);
                    tarjetadata[objetocsv].setSubject(arreglo[6]);
                    tarjetadata[objetocsv].setGroup(arreglo[7]);
                    tarjetadata[objetocsv].setTitles1(arreglo[8]);
                    tarjetadata[objetocsv].setTitles2(arreglo[10]);



                }

                objetocsv++;
                linea = br.readLine();
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }finally {
            if(null != br){
                br.close();
            }
        }
    }
}
