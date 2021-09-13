

//********* Encuentra el numero mas alto de un array
public class numeroMasAltoEnArray.java{
    public static void main(String[] args) {
        int[] numeros = {28,50,40,200,20,44,100,153};
        int mayor = numeros[0];
        int indiceMayor = 0;
        for(int x = 1; x < numeros.length;x++){
            if(numeros[x]>mayor){
                mayor = numeros[x];
                indiceMayor = x+1;
            }
        }
        System.out.println("Numero mayor es "+mayor+" y esta en la posición humana "+indiceMayor);
    }
}
