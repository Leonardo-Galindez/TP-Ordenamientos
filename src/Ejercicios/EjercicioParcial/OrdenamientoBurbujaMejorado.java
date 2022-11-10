/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
public class OrdenamientoBurbujaMejorado {

    public static void main(String[] args) {
        int[] Array = {89, 45, 68, 90, 29, 34, 17};
        MostrarArreglo(Array);
        ordenarBurbujaMejorado(Array);

        System.out.println("");
        MostrarArreglo(Array);
    }

    public static void ordenarBurbujaMejorado(int arr[]) {
        boolean ordenado = false;
        int i = 0;
        while (i < arr.length && !ordenado) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                ordenado = true;
                if (arr[j] > arr[j + 1]) {
                    ordenado = false;
                    intercambio(j, j + 1, arr);

                }

            }
            i++;
        }
    }

    public static void intercambio(int pos, int posMenor, int Arreglo[]) {
        //posMenor es la posicion del menor
        //pos por la que intercambia
        int aux;

        aux = Arreglo[posMenor];
        Arreglo[posMenor] = Arreglo[pos];
        Arreglo[pos] = aux;
    }

    public static void MostrarArreglo(int Arreglo[]) {
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i] + "-");
        }
    }
}
