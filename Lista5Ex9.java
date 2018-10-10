package lista5.ex9;

public class Lista5Ex9 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int[][] transp = new int[matriz[0].length][matriz.length];
        // int[][] transp = new int[4][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transp[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i < transp.length; i++) {
            for (int j = 0; j < transp[i].length; j++) {
                System.out.printf("%3d", transp[i][j]);
            }
            System.out.println("");
        }
    }
}
