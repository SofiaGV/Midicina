package com.uabc.edu.mx.pruebaspring.Modelo;

import lombok.Data;
import lombok.Generated;

@Data
public class mModelo {

    private int id;
    private  String nomD;
    private  String nomP;
    private  String fecha;
    private  String hora;
    private  String Asun;

    public mModelo() {
        nomP="";
        nomD = "";
        fecha = "";
        hora="";
        Asun="";
    }

    public mModelo(String nomD,String nomP, String fecha, String hora,  String Asun) {
        this.nomD = nomD;
        this.nomP=nomP;
        this.fecha = fecha;
        this.hora=hora;
        this.Asun=Asun;
    }

}
