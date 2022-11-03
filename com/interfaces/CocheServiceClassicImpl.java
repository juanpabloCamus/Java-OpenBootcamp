package com.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{
  //Las clases que implementan interfazes estan obligadas a proporcionar una implementacion a los metodos de la interfaz
  @Override
  public Coche crearCocheDemo(){
    return new CocheElectrico();
  }
}
