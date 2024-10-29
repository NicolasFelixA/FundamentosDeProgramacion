public class Arreglos{
    public static void main(String []args){
        int [] arreglo = new int[100];
        for(int i = 0; i <= arreglo.length; i++){
            arreglo[i] = 1000 + i;
            System.out.println(arreglo[i]);
        }
    }
}