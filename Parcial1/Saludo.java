import java.util.Scanner;
public class Saludo {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido, Cual es tu nombre? ");
        String nombre = scan.next();
        System.out.println("Bienvenido " + nombre);
    }
}
