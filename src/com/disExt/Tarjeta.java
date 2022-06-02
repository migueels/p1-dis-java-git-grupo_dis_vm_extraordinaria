package com.disExt;

import java.util.Date;

public class Tarjeta {

    //clase con los atributos de de las transacciones de tarjeta

    public String serie;
    public Date periodo;
    public float value;
    public char status;
    public String units;
    public String subject;
    public String group;
    public String titles1;
    public String titles2;

    //constructor vacio
    public Tarjeta(){

    }

    //constuctor
    public Tarjeta(String serie, float value,  char status, String units,String titles1, String titles2, String subject, String group){

        this.serie = serie;
        this.group = group;
        this.status = status;
        // this.periodo = periodo;
        this.subject = subject;
        this.titles1 = titles1;
        this.titles2 = titles2;

        this.units = units;
        this.value = value;

    }

    //getters y setters

    public String getTitles2() {
        return titles2;
    }

    public void setTitles2(String titles2) {
        this.titles2 = titles2;
    }

    public String getTitles1() {
        return titles1;
    }

    public void setTitles1(String titles1) {
        this.titles1 = titles1;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "CardDatos{" +
                "serie='" + serie + '\'' +
                ", periodo=" + periodo +
                ", value=" + value +
                ", status=" + status +
                ", units='" + units + '\'' +
                ", subject='" + subject + '\'' +
                ", group='" + group + '\'' +
                ", titles1='" + titles1 + '\'' +
                ", titles2='" + titles2 + '\'' +
                '}';
    }
}
