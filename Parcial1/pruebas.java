import java.util.Scanner;
public class pruebas {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        for(int i=0; i<n; i++){
            vector[i]=scan.nextInt();
        }
        for(int i=0; i<n; i++){
            vector2[i]=scan.nextInt();
        }
        boolean Respuesta=true;
        for(int i=0; i<n; i++){
            if(vector[i]<=vector2[i]){
                Respuesta=false;
                break;
           }
        }
        

        System.out.println(Respuesta);
    }
}
