import java.util.Scanner;
public class GradosCtoF {
    static double CtoF(double gradosC){
        double gradosF= 32 +(9*gradosC/5);
        return gradosF;
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Ingresa grados centigrados: ");
        double gradosC = scan.nextDouble();
        double gradosF = CtoF(gradosC);
        System.out.println(gradosC + " en Celsius grados Farenheit son: " + gradosF + " grados");
    }
}
