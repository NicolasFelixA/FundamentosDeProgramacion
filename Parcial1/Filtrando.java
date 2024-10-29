import java.util.Scanner;
public class Filtrando {
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]= Sc.nextInt();
        }
        int K = Sc.nextInt();
        for(int i=0; i<n; i++){
            if(array[i]%K==0){
                System.out.println(array[i]);
            }else{
                System.out.println("X");
            }
        }
    }
}
