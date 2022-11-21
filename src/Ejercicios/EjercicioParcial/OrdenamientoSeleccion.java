/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        int arr[] = {5, 6, 36, 5, 33};
        MostrarArreglo(arr);
        OrdenamientoSeleccion(arr);
        System.out.println("");
        MostrarArreglo(arr);
    }

    public static void OrdenamientoSeleccion(int arr[]) {
        int posMenor;

        for (int i = 0; i < arr.length; i++) {

            posMenor = BuscarMenor(arr, i);
            cambiar(arr, i, posMenor);
        }

    }

    public static void MostrarArreglo(int Arreglo[]) {
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i] + "-");
        }
    }

    public static void cambiar(int arr[], int i, int posMenor) {
        int aux;
        aux = arr[i];
        arr[i] = arr[posMenor];
        arr[posMenor] = aux;
    }

    public static int BuscarMenor(int arr[], int pos) {
        int posMenor, menor = arr[pos];
        posMenor = pos;

        for (int i=pos; i < arr.length; i++) {
            if (menor > arr[i]) {
                menor = arr[i];
                posMenor = i;
            }
        }
        return posMenor;
    }
}
