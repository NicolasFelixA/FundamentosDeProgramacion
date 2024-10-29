public class Bidimensional {
    public static void main(String a[]){
        int [][] arreglo = new int[40][40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                arreglo[i][j] = (i+1) * (j+1);
            }
        }
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++) {
                System.out.printf("%5d", arreglo[i][j]);            
            }
            System.out.println("");
        }
    }
}
