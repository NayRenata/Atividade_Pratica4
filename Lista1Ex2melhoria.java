package atividade_pratica4;

import java.util.Scanner;
import java.util.Arrays;

public class Lista1Ex2melhoria {
public static void main(String [] args){


int vetor[] = {2,5,1,3,4,9,7,8,10,6};
float soma = 0;

System.out.println("Elementos nos indices ímpares");

 for(int cont = 0; cont< vetor.length;cont++){
 
   if (cont % 2 != 0){
   System.out.println(vetor[cont]);
   }   
 
 }
 System.out.println("Elementos pares");
 for(int cont = 0;cont < vetor.length;cont++){
 
    if(vetor[cont] % 2 == 0){
    System.out.println(vetor[cont]);
 }
   soma += vetor[cont];
 }
 
 System.out.println("Soma de todos os elementos: " +soma);
 System.out.println("Media: "+ soma / 4);
 
 
 }
 }
