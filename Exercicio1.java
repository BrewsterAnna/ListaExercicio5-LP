/*1.	Faça um programa que transfira o conteúdo do vetor {10, 20, 30, 40, 50, 60, 70, 80}
para um outro vetor do mesmo tipo e tamanho, e mostre o conteúdo do novo vetor na ordem inversa
*/
package listaexercicios5;

public class Exercicio1 {
    
    public static void main(String[] args) {
        int [] vet1 = {10,20,30,40,50,60,70,80};
        int [] vet2 = new int [vet1.length];
        
        for (int i = 0; i< vet1.length; i++){
            vet2[i] = vet1[i];
        }
        for (int i = vet2.length-1; i>=0; i--) {
            System.out.print(vet2[i]+"");
        }
    }
}
