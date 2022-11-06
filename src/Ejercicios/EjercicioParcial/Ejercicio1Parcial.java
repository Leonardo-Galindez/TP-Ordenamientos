/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
public class Ejercicio1Parcial {

    public static void main(String[] args) {
        int i = 0, j = 0, posFila;
        posFila = -1;
        int Matriz[][]
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 8}};

        System.out.println(RecorrerMatriz(i, j, Matriz, posFila));
    }
        //esta bien que posFila entre por parametros
 

    public static int RecorrerMatriz(int fila, int colum, int Matriz[][], int posFila) {

        if (fila != Matriz.length - 1 || colum != Matriz[0].length - 1) {

            if (colum < Matriz.length - 1) {
                if (Matriz[fila][colum] == Matriz[fila][colum + 1]) {
                    posFila = fila;
                } else {
                    posFila = RecorrerMatriz(fila, colum + 1, Matriz, posFila);
                }
            } else {
                if (posFila == -1) {
                    posFila = RecorrerMatriz(fila + 1, 0, Matriz, posFila);
                }
            }
        }
        return posFila;
    }

}
