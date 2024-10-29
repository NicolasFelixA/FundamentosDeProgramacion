import java.util.Scanner;
public class Search{
    public static void main(String a[]){
        int [] lista = new int [5];
        for(int i = 0; i<lista.length; i++){
            lista[i] = i;
        }
        Scanner scan = new Scanner(System.in);        
        int num = scan.nextInt();
        for(int i = lista.length/2; i<lista.length;){
            if(num==i){
                System.out.println("Lo encontraste");
                break;
            }else if(num>i){
                i++;
             } else{
                i--;
            }
            
        }
    }
}