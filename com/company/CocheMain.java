package com.company;

public class CocheMain {
  public static void main(String[] args) {
    Coche cocheObj = new Coche("rojo", "honda", "civic", 1430.45, 5.41);
    System.out.println(cocheObj);
    

    CocheElectrico cocheElectrico = new CocheElectrico();
    cocheElectrico.color = "Azul";
    cocheElectrico.motorElectrico = "Tesla 156W";
    System.out.println(cocheElectrico);
  }
}
