/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int numBusca, rta;
        boolean valorNum;
        int Array[] = {98, 45, 63, 90, 29, 34, 17};
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero a Buscar");
            numBusca = sc.nextInt();
            /*System.out.println("Ingrese Tipo de recorrido en la busqueda");
            System.out.println("Busqueda Principio a Fin----1");
            System.out.println("Busqueda Fin a Principio----2");
            rta = sc.nextInt();
            Menu(rta,Array,numBusca);*/
            System.out.println("El numero:" + numBusca + " esta en el Arreglo?" +BusquedaPrincipioFin(Array, numBusca));
        } while (numBusca != 0);
    }

    public static void Menu(int respuesta, int Array[], int numBusca) {
        switch (respuesta) {
            case 1:
                System.out.println("El numero:" + numBusca + " esta en el Arreglo?" +BusquedaPrincipioFin(Array, numBusca));
                break;
            case 2:
                System.out.println("El numero:" + numBusca + " esta en el Arreglo?" +BusquedaFinPrincipio(Array, numBusca));
                break;
        }
    }

    public static boolean BusquedaPrincipioFin(int[] Arreglo, int numero) {
        int i = 0;
        boolean bandera;//nuestra variable de corte 
        bandera = false;

        while (i < Arreglo.length && !bandera) {
            if (Arreglo[i] == numero) {//nuemro el numero que se desea buscar
                bandera = true;
            }
            i++;
        }

        return bandera;//retornamos si se encontro el numero
    }

    public static boolean BusquedaFinPrincipio(int[] Arreglo, int numero) {
        int i = 6;
        boolean bandera;//nuestra variable de corte 
        bandera = false;

        while (i>= 0 && !bandera) {
            if (Arreglo[i] == numero) {//nuemro el numero que se desea buscar
                bandera = true;
            }
            i--;
        }

        return bandera;//retornamos si se encontro el numero
    }
}
