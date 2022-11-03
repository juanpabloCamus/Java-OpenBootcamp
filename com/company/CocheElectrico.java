package com.company;

public class CocheElectrico extends Coche{
  String motorElectrico;

  public CocheElectrico(){
  };

  public CocheElectrico(String motorElectrico){
    this.motorElectrico = motorElectrico;
  }

  public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,String motorElectrico ){
    //El metodo super nos permite invocar al constructor de la clase superior
    super(color, fabricante, modelo, peso, largo);
    this.motorElectrico = motorElectrico;
  }

  @Override
  public void acelerar(Integer canitdad) {
    Integer cantidadAjustada = canitdad * 2;
    super.acelerar(cantidadAjustada);
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
      ", velocidad='" + this.motorElectrico + "'" +
      "}";
  }

}
