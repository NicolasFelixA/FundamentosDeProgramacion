import java.util.Scanner;
public class OmegaUp {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int mayor = 0;
        int cont=0;
        while(N != 1){
            if(N%2==0){
                N = N/2;
            }else{
                N = (N*3)+1;
            }
            if(mayor<N){
                mayor = N;
            }
            cont++;
        }
        System.out.println(cont);
        System.out.println(mayor);
    }
}
