/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio5 {
    //Ordenamiento por Insercion
    public static void main(String[] args) {
        int[] Array = {89, 45, 68, 90, 29, 34, 17};
        MostrarArreglo(Array);
        
        for (int i = 1; i < Array.length; i++) {
            reubicar(Array, i);
        }
        System.out.println("");
        MostrarArreglo(Array);
    }
    //Modulo para realizar los cambios y corrimientos
    public static void reubicar(int Arreglo[], int ultPos) {//ultPos es la posicion a trabajar

        int j, aux;
        aux = Arreglo[ultPos];//en aux se guarda temporalmente el numeor a cambiar
        j = ultPos - 1;

        while (j >= 0 && Arreglo[j] > aux) { // cambio j > 0 sino no lo ordenaba bien 
            //corrimiento
            Arreglo[j+1] = Arreglo[j];// cambio del documento Arreglo[j] = Arreglo[j-1];
            j--;
        }
        Arreglo[j + 1] = aux;
    }
    
    public static void MostrarArreglo(int Arreglo[]){
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i]+"-");
        }
    }
}
