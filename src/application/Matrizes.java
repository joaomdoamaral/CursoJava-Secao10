package application;

import java.util.Scanner;

public class Matrizes
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz N x N: ");
		int n = scanner.nextInt();
		int [][] matriz = new int [n][n];
		
		for (int x=0; x<matriz.length; x++)
		{
			for (int y=0; y<matriz[x].length; y++)
			{
				System.out.printf("Digite o valor para Linha " + x + ", coluna " + y + ": ");
				matriz[x][y] = scanner.nextInt();
			}
		}
		System.out.println("\nSua Matriz " + n + " x " + n + ":\n");
		for (int x=0; x<matriz.length; x++)
		{	
			for (int y=0; y<matriz[x].length; y++)
			{
				System.out.printf(matriz[x][y] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Diagonal principal: ");
		for (int x=0; x<matriz.length; x++)
		{	
			System.out.printf(matriz[x][x] + " ");
		}
		
		System.out.println();
		int negativos=0;
		for (int x=0; x<matriz.length; x++)
		{	
			for (int y=0; y<matriz[x].length; y++)
			{
				if (matriz[x][y] < 0) 
					negativos++;
			}
		}
		System.out.println("Numeros negativivos: " + negativos);
		
		scanner.close();

	}
}
