//Imprimir una X con letras X en una matriz donde se indica el tamaño

public class imprimeX{
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        System.out.println("Humano dime cuantas filas tiene tu matriz");
        int filas=entra.nextInt();
        System.out.println("Humano dime cuantas columnas tiene tu matriz");
        int columnas=entra.nextInt();
        String matriz[][] = new String[filas][columnas];
        for(int i=0;i<filas;i++){
            for(int j=0; j<columnas;j++){
                if(i==j){
                    matriz[i][j]="X";
                    System.out.print(matriz[i][j]);
                }
                else if(i+j==matriz.length-1){
                    //System.out.println(matriz.length);
                    matriz[i][j]="X";
                    System.out.print(matriz[i][j]);
                }
                
                else{
                    matriz[i][j]=" ";
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
