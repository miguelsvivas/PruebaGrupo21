package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {


    public static void Saludo(){
        System.out.println("Aplicacion para dar el numero de la suerte");
    }

    public static String Leernumero(){
        Scanner escaner = new Scanner(System.in);
        System.out.print("Ingrese la fecha de nacimiento DD/MM/AAAA");
        String fecha = escaner.nextLine();
        return fecha;

     

    }
    
    public static void ObtenerNumero(String fecha){

        int numerosuerte = 0;

        String [] arreglonumeros = fecha.split("/",3);

        int Datodia = Integer.parseInt(arreglonumeros[0]);
        int Datomes = Integer.parseInt(arreglonumeros[1]);
        int Datoaño = Integer.parseInt(arreglonumeros[2]);

        int sumarpartesfechas = Datoaño + Datodia + Datomes;

        String sumarpartesfechascadena = Integer.toString(sumarpartesfechas);

        for(int i = 0;i<sumarpartesfechascadena.length();i++){
            numerosuerte = numerosuerte + Character.getNumericValue(sumarpartesfechascadena.charAt(i));
        }

        

        System.out.print(numerosuerte);
    }
    
    public static void main(String[] args) {
        Saludo();

        String fecha = Leernumero();

        ObtenerNumero(fecha);
    }

}
