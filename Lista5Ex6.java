package lista5.ex6;

import java.util.Scanner;

public class Lista5Ex6 {
    public static void main(String[] args) {
        int num;
        boolean achou;
        int[] vetor = {10,20,30,40,50,60,70,80,90,100};
        
        num  = leNumero();
        achou = pesquisa(num, vetor);
        if (achou) {
            System.out.println("Achou");
        }
        else {
            System.out.println("Não achou");
        }
    }
    
    public static boolean pesquisa(int num, int[] vetor) {
        boolean achou = false;
        
        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]) {
                achou = true;
                break;
            }
        }
        return achou;
    }
    
    public static int leNumero() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        int num = teclado.nextInt();
        return num;
    }
}
