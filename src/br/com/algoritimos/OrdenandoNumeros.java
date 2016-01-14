package br.com.algoritimos;

import java.util.Scanner;

public class OrdenandoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Programa de Ordenação de 20 números inteiro");
		int i;
		int[] v;
		v = new int[20];
		for (i = 0; i < v.length; i++) {
			System.out.printf("Digite o %dº numero: ", i + 1);
			v[i] = num.nextInt();
		}
		v = bubble(v);
		for (i = 0; i < v.length; i++) 
		{ 
			System.out.println(v[i]);
		}

	}

	private static int[] bubble(int v[]) {
		int x, i, j;
		for (i = 0; i < v.length; i++) {
			for (j = i + 1; j < v.length; j++) {
				if (i != j) {
					if (v[i] > v[j]) {
						x = v[i];
						v[i] = v[j];
						v[j] = x;
					}
				}
			}

		}
		return v;
	}

}
