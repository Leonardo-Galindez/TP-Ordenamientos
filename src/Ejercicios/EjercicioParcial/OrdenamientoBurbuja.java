/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int arr[] = {4, 7, 6, 1, 32, 0};
        MostrarArreglo(arr);
        burbujar(arr);
        System.out.println("");
        MostrarArreglo(arr);
    }

    public static void burbujar(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    intercambio(arr, j, j + 1);
                }
                
            }
        }
    }

    public static void intercambio(int arr[], int izquierda, int derecha) {
        int aux;

        aux = arr[derecha];
        arr[derecha] = arr[izquierda];
        arr[izquierda] = aux;
    }

    public static void MostrarArreglo(int Arreglo[]) {
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i] + "-");
        }
    }
}
