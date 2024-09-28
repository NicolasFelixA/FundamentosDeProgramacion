import java.util.Scanner;
public class Mayor {
    public static void main(String []args){
        Scanner Scan = new Scanner(System.in);
        int A= Scan.nextInt(); int B= Scan.nextInt(); int C= Scan.nextInt();
        if(A>B){
            if(A>C){
                System.out.println("El mayor es: " + A);
            }else{
                System.out.println("El mayor es: " + C);
            }
        }else{
            if(B>C){
                System.out.println("El mayor es: "+ B);
            }else{
                System.out.println("El mayor es: " +C);
            }
        }
    }
}
