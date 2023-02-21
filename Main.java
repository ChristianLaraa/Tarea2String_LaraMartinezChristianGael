/*
* Lara Martinez Christian Gael
* Tarea 2
* 21/02/23
*/

import java.util.Scanner;  //Importar Scanner

public class Main{   //Clase

    public static void main(String[] args) {

        /*Scanner e impresion de instrucciones*/
 Scanner Nombre = new Scanner(System.in); //Definimos nombre del Scanner
        System.out.println("Holaaa!");
        System.out.println("Introduce tu nombre, profesion y nacionalidad :)"); //Imprimimos instrucciones al usuario

      /*Propiedades y funciones de Cadenas*/
      String cadena = Nombre.nextLine();
      String[] linea = cadena.split(" ");

      /*Como se acomodan las cadenas y su salto de linea correspondiente*/
        String nombre = linea[0];
        String profesion = linea[1];
        String nacionalidad = linea[2];

        /*Impresion de resultados*/
            System.out.println("Nombre: " +nombre);
            System.out.println("Profesion: " +profesion);
            System.out.println("Nacionalidad: " +nacionalidad);


    }
}