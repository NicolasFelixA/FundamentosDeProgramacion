import java.util.Scanner;
import java.lang.Math;
public class Volumen {
    static double sacarVolumen(double radio){
        double volumen=1.333*(Math.PI)*Math.pow(radio, 3);
        return volumen;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el radio de la esfera en centimetros: ");
        double radio = scan.nextDouble();
        double volumen = sacarVolumen(radio);
        System.out.printf("Este es el volumen de la esfera en centimetros: " + volumen +"cm^3");
    
    }
}
