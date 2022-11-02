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
        int numBusca;
        boolean valorNum;
        int Array[] = {98, 45, 63, 90, 29, 34, 17};
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero a Buscar");
            numBusca = sc.nextInt();
            valorNum = BusquedaSecuencial(Array, numBusca);
            System.out.println("El numero:" + numBusca + " esta en el Arreglo?" + valorNum);
        } while (numBusca != 0);
    }
    public static boolean BusquedaSecuencial(int[] Arreglo, int numero) {
        int i = 0;
        boolean bandera;
        bandera = false;

        while (i < 7 && !bandera) {
            if (Arreglo[i] == numero) {
                bandera = true;
            }
            i++;
        }

        return bandera;
    }
}
