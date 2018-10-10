package lista5.ex13;

public class Lista5Ex13 {
    public static void main(String[] args) {
        int[][] notas = {{5,7,4}, {5,6,7}, {3,5,2}, {4,5,6}, {8,9,7}, {2,6,4}};
        String[] nomes = {"Luiz", "Paulo", "Maria", "Luiza", "Felipe", "Fabiana"};
        int soma;
        double media, mediaGeral = 0;
        double melhorMedia = Integer.MIN_VALUE;
        String melhorAluno = "";
        
        System.out.println("Média dos alunos");
        for (int i = 0; i < notas.length; i++) {
            soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma = soma + notas[i][j];
            }
            media = (double) soma / notas[i].length;
            System.out.printf(nomes[i] + " = %.1f\n", media);
            if (media > melhorMedia) {
                melhorMedia = media;
                melhorAluno = nomes[i];
            }
            mediaGeral = mediaGeral + media;
        }
        mediaGeral = mediaGeral / notas.length;
        System.out.printf("Média geral = %.1f\n", mediaGeral);
        System.out.printf("Melhor aluno " + melhorAluno + " = %.1f\n", melhorMedia);
    }
}
