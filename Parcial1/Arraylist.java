import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String []args){
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int numero;     int suma = 0;
        System.out.println("Introduce números enteros (negativo para salir):");
        while (true) {
            numero = scan.nextInt(); 
            if (numero < 0) {
                break;
            }
            if (!lista.contains(numero)) {
                lista.add(numero);
                suma += numero; 
            }
            
        }
        System.out.println(lista);

    }
}
