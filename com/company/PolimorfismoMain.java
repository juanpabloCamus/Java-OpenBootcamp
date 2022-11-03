package com.company;

public class PolimorfismoMain {
  public static void main(String[] args) {
    
    Coche coche1 = new Coche();
    CocheElectrico coche2 = new CocheElectrico();

    //polimorfismo
    //Se emplea la clase superior con el objetivo de tratarlos a todos por igual
    Coche coche3 = new CocheElectrico();

  }
}
