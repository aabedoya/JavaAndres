/*   *** Solución a un reto planteado en entrevista de trabajo ***

static int[] myArray = { 1, 2, 9, 2, 5, 3, 5, 1, 5 };
static int n = 3;

Se tiene una matriz de n x n que contiene números del 1 al 9, simulando una matriz unidimensional, por ejemplo:

1 2 9
2 5 3
5 1 5

Se representaría como {1, 2, 9, 2, 5, 3, 5, 1, 5}. 
El objetivo es identificar el camino que de la menor suma al recorrer el arreglo bi-dimensional de izquierda a derecha. 
Se empieza en la columna izquierda y se mueve siempre una columna a la derecha de la misma fila o a una fila hacia arriba o hacia abajo. 
En el ejemplo, si parte de 1, puede pasar al 2 o al 5. De ahí, si pasó al 5 puede pasar al 9 al 3 o al 5. 
Por otro lado, si pasa del 1 al 2, desde el 2 de la columna del medio no podría pasar al 5 de la última fila en la columna derecha. 
El valor de n puede ser entre 1 y 4.
Es necesario encontrar el camino que produce el número más bajo al sumar los valores de cada número que visita. 
Así que para el ejemplo, la ruta con la menor suma sería 1, 2, 3.
El resultado del programa debe ser los n números por los que pasó para obtener la menor suma separados por un espacio, para el ejemplo, la salida sería exactamente así:
1 2 3

*/

public class myArray{
    static int[] myArray = { 3, 2, 9, 6, 5, 3, 5, 7, 5, 1, 2, 3, 4, 5, 6, 7};//Valores que nos entregan en el Array
    static int n = 4;//Valor de n, tener en cuenta que si n cambia, el numero de valores del myArray debe aumentar o disminuir
    
    public static void main(String[] args) {
        //boolean encontrado = true;
        int filas = n;
        //Variable filas que es igual al n que nos dan para que se comprenda mejor
        int columnas = n;
        //Variable columnas que es igual al n que nos dan para que se comprenda mejor
        int x = 0; 
        //Variable x para recorrer el myArray inicial que nos dan
        int menor = 9;
        //Variable para guardar el numero mas paqueño, se inicia en 9 que es el más alto que puede tener el Array
        int matriz[][] = new int[filas][columnas];
        //Array de 2 dimensiones que contendrá los valores de MyArray unidimensional
        int[] camino = new int[n];
        //Array que guardara los números que menos suman al pasar la matriz de izquierda a derecha 
        for(int i=0;i<filas;i++){
            for(int j=0; j<columnas;j++){
                matriz[i][j]=myArray[x];
                x=x+1;
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        int control =0;
        //Variable control que guarda la posición de la columna donde esta el menor numero 
        for(int i=0;i<columnas;i++){
            for(int j=0; j<filas;j++){
                if(matriz[j][i]<menor){
                    if(control==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }
                    else if(control+1==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }
                    else if(control-1==j){
                        menor=matriz[j][i];
                        camino[i]=menor;                      
                    }
                        
                
                }
            }
            menor = 9;
            System.out.println();
        }
        
        for(int i=0;i<camino.length;i++){
            System.out.print(camino[i]);
        }
    }
}
