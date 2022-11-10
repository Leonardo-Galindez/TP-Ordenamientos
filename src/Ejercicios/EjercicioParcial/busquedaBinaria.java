/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EjercicioParcial;

/**
 *
 * @author galin
 */
public class busquedaBinaria {

    public static void main(String[] args) {
        int pos, num;
        int Array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        num = 20;
        pos = busquedaBinaria(Array, num);
        System.out.println("El numero esta en la posicion:" + pos);
    }

    public static int busquedaBinaria(int arr[], int num) {
        int inicio, fin, medio, i = 0,pos=-1;
        boolean encontrado=false;
        inicio = 0;
        fin = arr.length - 1;

        while (!encontrado && fin>=inicio) {
            medio = (fin + inicio) / 2;
            if(num<arr[medio]){
                fin=medio-1;
            }else{
                if(num==arr[medio]){
                    encontrado=true;
                    pos=medio;
                    
                }else{
                    inicio=medio+1;
                }
            }
        }
        
        return pos;
    }

}
