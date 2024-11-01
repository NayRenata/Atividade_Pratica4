/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, 
onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: 
“Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
*/
package atividade_pratica4;

import java.util.Scanner;
import java.util.Arrays;

public class Lista1Ex1 {
public static void main(String [] args){
Scanner leia = new Scanner(System.in); 

int cont, id;
boolean encontrado = false;

int vetorNum [] = {2,5,1,3,4,9,7,8,10,6};


System.out.println("Digite o numero que voce deseja encontrar:");
id  = leia.nextInt();

for(cont=0;cont <vetorNum.length;cont++){
if(vetorNum[cont]== id){
System.out.println("O numero "+id+" esta localizado na posicao:" +cont);
encontrado = true;
break;
}
}if(!encontrado)
{System.out.println("Nao foi encontrado!");}


leia.close();

}
}