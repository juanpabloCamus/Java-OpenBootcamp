package ejercicios;

public class tema1 {
  public static void main(String[] args) {
    
    //enteros
    byte number1 = 1; //1 byte
    short number2 = 2;//2 bytes
    int number3 = 3;//3 bytes
    long number4 = 4;//8 bytes

    //punto flotante
    float decimal1 = 4.9f;
    double decimal2 = 9.99d; //mas capacidad

    //caracter
    char caracter1 = 'a';

    //boolean
    boolean verdadero = true;
    boolean falso = false;

    //Todos estos de arriba son primitivos esto quiere decir que ni pueden ser nulos

    //cadenas de texto
    String nombre = "Alan";
    String apellido = "Sastre";

    //tipos envoltorio
    Integer numero = null; //permiten valores nulos, a diferencia de int

    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number4);
    System.out.println(decimal1);
    System.out.println(decimal2);
    System.out.println(caracter1);
    System.out.println(verdadero);
    System.out.println(falso);
    System.out.println(nombre);
    System.out.println(apellido);
    System.out.println(numero);
  }
}
