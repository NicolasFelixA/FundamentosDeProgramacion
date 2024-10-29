import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args){
        int intentos=10;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numRandom = random.nextInt(100);            
        System.out.println("Ingresa un numero");
        for(int i=0; i<10; i++){
            int numGuess = scanner.nextInt();
            if(numGuess<numRandom){
                System.out.println("Estas por debajo del numero");
                System.out.println("Te quedan " + intentos + " intentos");
            }else if(numGuess>numRandom){
                System.out.println("Estas por arriba del numero");
                System.out.println("Te quedan " + intentos + " intentos");
            }else{
                System.out.println("Adivinaste en " + i + " intentos");
            }
            intentos--;
            if(intentos==0){
                System.out.println("Perdiste el numero era " + numRandom);
            }
        }
    }
}
