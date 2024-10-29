import java.util.Scanner;
public class flechas {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*"); 
            }
            System.out.println("");
        }
        for(int i=n; i>=1; i--){
            for(int j=i; j>0; j--){
                System.out.print("*"); 
            }
            System.out.println("");
        }
    }
}
