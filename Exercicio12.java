package lista5.ex12;

public class Lista5Ex12 {
    public static void main(String[] args) {
        int[][] notas = {{5,7,4}, {5,6,7}, {3,5,2}, {4,5,6}, {8,9,7}, {2,6,4}};
        int soma;
        double media, mediaGeral = 0;
        
        for (int i = 0; i < notas.length; i++) {
            soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma = soma + notas[i][j];
            }
            media = (double) soma / notas[i].length;
            System.out.printf("Aluno " + (i+1) + " média = %.1f\n", media);
            mediaGeral = mediaGeral + media;
        }
        mediaGeral = mediaGeral / notas.length;
        System.out.printf("Média geral = %.1f\n", mediaGeral);
    }
}
