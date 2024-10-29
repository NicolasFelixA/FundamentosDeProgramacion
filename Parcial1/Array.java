import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int num[] = new int [5];    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escribe los numeros");
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Este es tu array acomodado" + Arrays.toString(num));
        

        System.out.println("Dame el valor que quieras imprimir del arreglo");
        System.out.println(num[scan.nextInt()-1]);
        scan.close();
    }
}
