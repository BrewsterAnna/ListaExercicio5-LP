package lista5.ex10;

public class Lista5Ex10 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1,2}, {3,4}};
        int[][] matriz2 = {{5,6}, {7,8}};
        int[][] soma = new int[matriz1.length][matriz1[0].length];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }    
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                System.out.printf("%3d", soma[i][j]);
            }
            System.out.println("");
        }        
    }
}
