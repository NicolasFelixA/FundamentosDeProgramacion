import java.util.Scanner;
public class ImprimiendoPorParidad {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa cuantos numeros querras ingresar en el array");
        int n = scan.nextInt();
        int[] numeros = new int[n];
        System.out.println("Ingresa los "+ n + " numeros");
        for(int i=0; i<n; i++){
            numeros[i]= scan.nextInt();
        }
        System.out.println("Ingresa que numeros quieres imprimir:  Par=0 || Impar=1");
        int Paridad= scan.nextInt();
        System.out.println("Aqui estan los numeros que pediste: ");
        if(Paridad==0){
            for(int i=0; i<n; i++ ){
                if(numeros[i]%2==0){
                    System.out.println(numeros[i]);
                }
            }
        }else{
            for(int i=0; i<n; i++ ){
                if(numeros[i]%2==1){
                    System.out.println(numeros[i]);
                }
            }
        }
    }
}
