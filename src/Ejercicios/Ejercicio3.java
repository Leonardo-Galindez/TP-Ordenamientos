/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author galin
 */
public class Ejercicio3 {
    //Ordenamiento con el metodo de seleccion
    public static void main(String[] args) {
        int Array[] = {7, 6, 11, 17, 3, 15, 5, 19, 30, 14};
        
        MostrarArreglo(Array);//Arreglo no ordenado
        ordenarSeleccion(Array);
        MostrarArreglo(Array);//Arreglo ordenado

    }
    
    public static void CargarArreglo(){
        
    }

    public static void MostrarArreglo(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
        }
    }
    //Modulo que se encargar de las pasadas
    public static void ordenarSeleccion(int Array[]) {
        int i, posMenor;
        for (i = 0; i < Array.length; i++) {
            posMenor = buscarMenor(i, Array);
            Intercambiar(Array, i, posMenor);
        }
    }

    //Modulo que intercambia pos 2 es la posicion del menor numero del arreglo pos1 es i que va iterando en ordenSeleccion
    //ordena los valores de la pos 1 y pos 2 
    public static void Intercambiar(int Array[], int pos1, int pos2) {
        int aux;
        aux = Array[pos1];
        Array[pos1] = Array[pos2];
        Array[pos2] = aux;

    }

    //Modulo que buscar el menor numero del arreglo y retorna la posicion
    //pos es i del modulo ordenarSeleccion
    public static int buscarMenor(int pos, int Array[]) {
        int i, menor, posMenor;
        posMenor = pos;
        menor = Array[pos];

        for (i = pos; i < Array.length; i++) {
            if (menor < Array[i]) {
                posMenor = i;
                menor = Array[i];
            }
        }
        return posMenor;
    }
}
