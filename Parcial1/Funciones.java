import java.util.Scanner;
public class Funciones {
    static int funcion1(int x, int y){
        if(x<y){
            return y;
        }else{
            return x;
        }
    }
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        int x= scan1.nextInt();
        int y= scan1.nextInt();
        int max = funcion1(x, y);
        System.out.println(max);
    }
}
