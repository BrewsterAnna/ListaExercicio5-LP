package lista5.ex5;

import java.util.Scanner;

public class Lista5Ex5 {
    public static void main(String[] args) {
        final int TAM = 20;
        int[] vetCont = new int[TAM];
        
        processaNumeros(vetCont);
        mostraResultado(vetCont);
    }
    
    public static void mostraResultado(int[] vetCont) {
        
        for (int i = 0; i < vetCont.length; i++) {
            System.out.println((i+1) + " apareceu " + vetCont[i] + "x");
        }
    }
    
    public static void processaNumeros(int[] vetCont) {
        final int FLAG = 0;
        int num;

        num = leNumero();
        while (num != FLAG) {
            vetCont[num-1]++;
            num = leNumero();
        }
    }
    
    public static int leNumero() {
        Scanner entrada = new Scanner(System.in);
        int num;
            
        do {
            System.out.print("Entre com um número: ");
            num = entrada.nextInt();
            if (num == 0) {
                break;
            }
            if ((num < 1) || (num > 20)) {
                System.out.println("Erro: número inválido");
            }
        } while ((num < 1) || (num > 20));
        return num;
    }
}
