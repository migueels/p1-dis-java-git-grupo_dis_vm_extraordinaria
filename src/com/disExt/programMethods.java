package com.disExt;

import java.io.FileNotFoundException;
import java.io.IOException;

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
}
