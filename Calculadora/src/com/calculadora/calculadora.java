package com.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
     int a, b, result;
      
     System.out.println("Digite o Primeiro Número");
     a = scanner.nextInt();
     System.out.println("Digite o segundo Número");
     b = scanner.nextInt();
     int soma = soma(a,b);
     int subtracao = subtracao(a,b);
     int multiplicacao = multiplicacao(a,b);
     float divisao = divisao(a,b);
     
     System.out.println("Soma =  "  +   soma);
     System.out.println("Subtraçao =  "  +   subtracao);
     System.out.println("Multiplicação =  "  +   multiplicacao);
     System.out.println("Divisão =  " +   divisao);
     System.out.println("Resultado foi exibido?? DIGITE 1 SIM OU 2 NÃO");
     result = scanner.nextInt();
     if(result == 1) {System.out.println("Ok");}
     if(result == 2) {System.out.println("Deu merda!!");}
     
     

     
	}
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static float divisao(int a, float b) {
		return a / b;
	}
	
	
	}


