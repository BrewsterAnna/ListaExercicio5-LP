/* 4.	Faça um programa que leia uma sequência de números terminada pelo número
zero e mostre apenas os números que forem maiores ou iguais a média dos elementos 
lidos. A sequência pode ter no máximo 20 números.
 */
package listaexercicios5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        final int FIM = 0;
        final int TAM = 20;
        float media;
        int soma = 0;
        int num;
        int pos = -1;
        int[] vet = new int [TAM];
        
        num = leNumero();
        while (num !=FIM){
         pos++;
         vet[pos] = num;
         soma+= num;
         num = leNumero();
        }
        if(pos!= -1){
            media = calculaMedia(soma, pos+1);
            mostraNumeros(vet,pos,media);
        }
        else{
            System.out.println("Não há dados a serem processados!");
        }
    }
    public static void mostraNumeros(int vet[], int tam, float media){
        
        for (int i = 0; i <= tam; i++){
            if (vet[i] >= media){
                System.out.println(vet[i]);
            }
        }
    }
    
    public static float calculaMedia(int soma, int quantidade){
        float media;
        
        media = (float) soma / quantidade;
        return media;
    }
    
    public static int leNumero(){
        int num;
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Entre com um número: ");
         num = ler.nextInt();
         return num;
    }
}
