// ************* Verifica si un array de 2 dimenciones (matriz) es simétrica
//************** Para ser simétrica debe tener el mismo alto y ancho además cuando se transpone los valores deben quedar iguales
/*
Original        Traspuesta
1   2   3       1   4   7
4   5   6       2   5   8
7   8   9       3   6   9
como la traspuesta queda diferente no es simetrica

Original        Traspuesta
1   2   3       1   2   3
2   5   0       2   5   0
3   0   5       3   0   5
como la traspuesta queda igual es simetrica
*/

public class esSimetrica{
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        System.out.println("Humano dime cuantas filas tiene tu matriz");
        int filas=entra.nextInt();
        System.out.println("Humano dime cuantas columnas tiene tu matriz");
        int columnas=entra.nextInt();
        int matrix[][]=new int[filas][columnas];
        boolean esSimetrica=true;
        for(int i=0;i<filas;i++){
            System.out.println("Humano ingresa los datos de la fila "+(i+1));
            for(int j=0;j<columnas;j++){
                matrix[i][j]=entra.nextInt();
            }
        }
        if(columnas==filas){
            for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){
                    if(matrix[i][j]!=matrix[j][i]){
                        esSimetrica=false;
                        break;
                    }
                }
                if(esSimetrica==false){
                    break;
                }
            }
        } 
        else{
            System.out.println("Tu matrix para empezar no es simetrica");
        }
        if(esSimetrica==true){
            System.out.println("Humano tu matriz si es Simetrica");
        }
        else{
            System.out.println("Tu matrix no es simetrica");
        }
        
    }
    
}
