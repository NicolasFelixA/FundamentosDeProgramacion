import java.util.Random;
public class Acomodar {
    public static void main(String []args){
        int [] Nums = new int[100];
        Random aleatorio = new Random();
        for(int i = 0; i < Nums.length; i++){
            Nums[i] = (500+ aleatorio.nextInt(500));
            System.out.println(Nums[i]);
        }
        System.out.println("-------------------------------------------------");
        for(int i = 1; i< Nums.length; i++){
            for(int j = 1; j< Nums.length; j++){
                if(Nums[j] < Nums[j-1]){ 
                    int temp = Nums[j-1]; 
                    Nums[j-1] = Nums[j];
                    Nums[j] = temp;
                }
            }
        }
        for(int i = 0; i< Nums.length; i++){
            System.out.println(Nums[i]);
        }
    }
}
