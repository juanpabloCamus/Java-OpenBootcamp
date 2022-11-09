package ejercicios;

public class tema2 {
  public static void main(String[] args) {
    calcularIva(965);

  }

  static int calcularIva(int precio){
    int iva = precio * 21 / 100;
    return precio + iva;
  }
}
