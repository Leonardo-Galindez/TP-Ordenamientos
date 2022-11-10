/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
public class OrdenamientoInsercion {

    public static void main(String[] args) {
        int arr[] = {5, 6, 36, 5, 33};
        MostrarArreglo(arr);
        insercion(arr);
        System.out.println("");
        MostrarArreglo(arr);
    }

    public static void insercion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            reubicar(arr, i);
        }
    }

    public static void reubicar(int arr[], int i) {
        int aux, j;
        aux = arr[i];
        j = i - 1;
        while (j > 0 && arr[j] > aux) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j + 1] = aux;

    }

    public static void MostrarArreglo(int Arreglo[]) {
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i] + "-");
        }
    }
}
