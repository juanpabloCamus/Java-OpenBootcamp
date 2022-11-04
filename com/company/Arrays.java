package com.company;

public class Arrays {
  public static void main(String[] args) {
    String nombre1 = "nombre1";
    String nombre2 = "nombre2";
    String nombre3 = "nombre3";

    //A diferencia de javascript en Java los arrays son estaticos no dinamicos, esto quiere decir que cuando los intanciamos quedan con una longitud base

    String[] nombres = new String[3];
    String[] nombres1 = new String[]{nombre1, nombre2, nombre3};

    nombres[2] = nombre3;
    nombres[0] = nombre1;
    nombres[1] = nombre2;

    for(int i = 0; nombres.length > i; i++){
      System.out.println(nombres[i]);
    }

    for(int i = 0; nombres.length > i; i++){
      System.out.println(nombres1[i]);
    }
  
  }
}
