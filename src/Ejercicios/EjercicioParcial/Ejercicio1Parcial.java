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
        int i=0,j=0,posFila;
        int Matriz[][]= 
            {{1,2,3},
             {4,5,6},
             {7,7,9}};
        int  Fila[]= new int[Matriz[0].length];
        
        posFila=RecorrerMatriz(i,j,Matriz);
        System.out.println(posFila);
    }
    
    public static int RecorrerMatriz(int i,int j,int Matriz[][]){
        int posFila;
        posFila=-1;
        
        if(i!=Matriz.length-1 || j!=Matriz.length-1){
            
            if(j<Matriz.length){
                System.out.println(Matriz[i][j]);
                RecorrerMatriz(i,j+1,Matriz);
            }else{
                RecorrerMatriz(i+1,0,Matriz);
            }
        }else{
            System.out.println(Matriz[i][j]);
        }
        
        return posFila;
    }
   
}
