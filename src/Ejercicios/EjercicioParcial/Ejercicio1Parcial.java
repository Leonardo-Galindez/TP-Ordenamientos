/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
import java.util.Scanner;

public class Ejercicio1Parcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, posFila, fila, colum;
        posFila = -1;
        System.out.println("ingrese fila");
        fila = sc.nextInt();
        System.out.println("ingrese colum");
        colum = sc.nextInt();
        int Matriz[][] = new int[fila][colum];
        CargarMatriz(Matriz,fila,colum,i,j);
        System.out.println(RecorrerMatriz(i, j, Matriz, posFila));
    }
    //esta bien que posFila entre por parametros

    public static void CargarMatriz(int Matriz[][], int Cantfila, int Cantcolum,int i,int j) {
        int num;
       
        Scanner sc = new Scanner(System.in);
        if (i != Cantfila - 1 || j != Cantcolum - 1) {
            if (j < Cantcolum) {
                System.out.println("Ingrese numero");
                num = sc.nextInt();
                Matriz[i][j] = num;
                CargarMatriz(Matriz, Cantfila, Cantcolum,i,j+1);
            } else {
                CargarMatriz(Matriz, Cantfila,Cantcolum,i+1,0);
            }
        } else {
            System.out.println("Ingrese numero");
            num = sc.nextInt();
            Matriz[i][j] = num;
        }
    }

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
