/*2.	Faça um programa que some dois vetores {1, 2, 3, 4, 5, 6, 7, 8} e {10, 20, 30, 40, 50, 60, 70, 80}
e mostre o resultado da soma em um terceiro vetor do mesmo tamanho e tipo.
*/
package listaexercicios5;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vet1 = {1,2,3,4,5,6,7,8};
        int[] vet2 = {10,20,30,40,50,60,70,80};
        int[] vet3 = new int [vet1.length];
        
        for(int i = 0; i < vet1.length; i++){
            vet3[i] = vet1[i] +vet2[i];
        }
        for (int i = 0; i < vet1.length; i++){
            System.out.print(vet3[i]+" ");
        }
    }
    
}
