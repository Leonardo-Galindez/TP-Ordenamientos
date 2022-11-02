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

public class Ejercicio2 {

    public static void main(String[] args) {
        int numBusca, posNumero;

        Scanner sc = new Scanner(System.in);
        int Array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        do {
            System.out.println("Ingrese numero a Buscar");
            numBusca = sc.nextInt();
            posNumero = BusquedaBinaria(Array, numBusca);
            if (posNumero != -1) {

                System.out.println("El numero:" + numBusca + " esta en la posicion:" + posNumero);
            } else {
                System.out.println("El numero:" + numBusca + " no esta en el arreglo");
            }
        } while (numBusca != 0);
    }

    public static int BusquedaBinaria(int Arreglo[], int numero) {
        boolean encontrado;//variable bandera para el corte de la busqueda
        int inicio, fin, posicion, medio;
        encontrado = false;
        inicio = 0;
        fin = Arreglo.length - 1;
        posicion = -1;//-1 porque es lo que retorna si el numero no esta en el arreglo

        while (!encontrado && inicio <= fin) {
            medio = (inicio + fin) / 2;//division entera
            if (numero < Arreglo[medio]) {

                fin = medio - 1;

            } else {
                if (numero == Arreglo[medio]) {
                    encontrado = true;
                    posicion = medio;
                } else {
                    inicio = medio + 1;
                }
            }
        }

        return posicion;
    }
}
