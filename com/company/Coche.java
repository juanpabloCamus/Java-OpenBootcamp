package com.company;

public class Coche {
//abstract => las clases abstratctas son clases que no pueden ser instanciadas, solo pueden serlo a travez de sus hijos

  //atributos
  //Caracteristicas que varian en este caso de un auto, ej color;
  String color;
  String fabricante;
  String modelo;
  Double peso;
  Double largo;
  Integer velocidad = 0;

  //constructores
  //Metodos que nos permiten crear objetos de esta clase
  //Empieza por mayuscula y lleva el mismo nombre de la clase, asi se sabe que es el constructor

  public Coche(){}

  public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
    this.color = color;
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.peso = peso;
    this.largo = largo;
  }

  //metodos
  public void acelerar(Integer canitdad){
    if(canitdad > 0 && canitdad <= 120) this.velocidad += canitdad; 
  }

  @Override
  public String toString() {
    return "{" +
      " color='" + this.color + "'" +
      ", fabricante='" + this.fabricante + "'" +
      ", modelo='" + this.modelo + "'" +
      ", peso='" + this.peso + "'" +
      ", largo='" + this.largo + "'" +
      ", velocidad='" + this.velocidad + "'" +
      "}";
  }

}
