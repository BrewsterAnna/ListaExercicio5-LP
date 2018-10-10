package lista5.ex11;

public class Lista5Ex11 {
    public static void main(String[] args) {
        final int LINHAS = 4, COLUNAS = 5;
        String[][] matriz = new String[LINHAS][COLUNAS];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "[" + i + "," + j + "]";
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }        
    }
}
