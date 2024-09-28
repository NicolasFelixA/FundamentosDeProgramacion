import java.util.Scanner;
public class Length {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int numero= scan.nextInt();
        int Cifras = String.valueOf(numero).length();
        System.out.println("Tu numero tiene " + Cifras + " Cifras");
    }
}
