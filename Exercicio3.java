/*
 3.	Faça um programa que leia uma sequência de números terminada pelo número
zero e mostre os números na ordem invertida. A sequência pode ter no máximo 20 números.
 */
package listaexercicios5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        final int TAM = 5;
        final int FIM = 0;
        int[]vet = new int[TAM];
        int num;
        int pos = -1;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        num = ler.nextInt();
        while (num !=FIM){
           pos++;
           vet[pos] = num;
           if (pos == vet.length-1){
               System.out.println("Fim do vetor");
               break;
           }
            System.out.print("Entre com um numero: ");
            num = ler.nextInt();
        }
        for(int i = pos; i >=0; i--){
            System.out.print(vet[i]+" ");
        }
    }
}
