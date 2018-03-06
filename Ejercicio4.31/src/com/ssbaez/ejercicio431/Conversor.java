package com.ssbaez.ejercicio431;

import java.util.Scanner;

public class Conversor {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = 1;
		int div = 1;
		int valor = 1;
		int dec = 0;
		
		System.out.println("Convertidor de numero Binario a Decimal");
		
		System.out.print("Ingrese numero binario: ");
		int bin = input.nextInt();
		
		
		while(true) {
			
			if(a > 0) {
				a 	= bin / div;
				dec += (a % 10) * valor;
				valor *= 2;
				div *= 10;
			}
			else {
				break;
			}
				
		}//Fin while
		
		
		System.out.printf("Equivalente decimal: %d", dec);
		
	}//Fin metodo main
	
}//Fin declaracion de clase
