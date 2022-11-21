/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */

//Metodo de ordenamiento Burbuja
public class Ejercicio4 {

    public static void main(String[] args) {
       int Array[] = {4, 7, 6, 1, 32, 0};
         MostrarArreglo(Array);
        ordenarBurbuja(Array);
       
        System.out.println("");
        MostrarArreglo(Array);
    }

    public static void ordenarBurbuja(int Arreglo[]) {
        int i, j;
        for (i = 0; i < Arreglo.length; i++) {
            for (j = 0; j <= Arreglo.length - i - 2; j++) {
                if (Arreglo[j] > Arreglo[j + 1]) {
                    intercambio(j, j + 1, Arreglo);
                }
            }
        }
    }

    public static void intercambio(int posIz, int posDe, int Arreglo[]) {
        //posIz derecha
        //posDe izquierda
        int aux;

        aux = Arreglo[posDe];
        Arreglo[posDe] = Arreglo[posIz];
        Arreglo[posIz] = aux;
    }
    
    public static void MostrarArreglo(int Arreglo[]){
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i]+"-");
        }
    }
}
