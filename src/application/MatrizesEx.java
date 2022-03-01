package application;

import java.util.Scanner;

public class MatrizesEx
{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas da matriz: ");
		int m = scanner.nextInt();
		System.out.println("Digite o numero de colunas da matriz: ");
		int n = scanner.nextInt();
		
		int [][] matriz = new int [m][n];
		
		for (int x=0; x<matriz.length; x++)
		{
			for (int y=0; y<matriz[x].length; y++)
			{
				System.out.printf("Digite o valor para Linha " + x + ", coluna " + y + ": ");
				matriz[x][y] = scanner.nextInt();
			}
		}
		System.out.println("\nSua Matriz " + m + " x " + n + ":\n");
		for (int x=0; x<matriz.length; x++)
		{	
			for (int y=0; y<matriz[x].length; y++)
			{
				System.out.printf(matriz[x][y] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Digite um númere pertencente à matriz: ");
		int numero = scanner.nextInt();
		for (int x=0; x<matriz.length; x++)
		{	
			for (int y=0; y<matriz[x].length; y++)
			{
				if(matriz[x][y] == numero)
				{
					System.out.println("\n[Posição: "+ x + ',' + y + "]");
					if (y > 0) System.out.println("Direita: "+ matriz[x][y-1]);
					if (y < matriz.length) System.out.println("Esquerda: " + matriz[x][y+1]);
					if (x > 0) System.out.println("Acima: " + matriz[x-1][y]);
					if (x < matriz[x].length) System.out.println("Abaixo: " + matriz[x+1][y]);
				}
			}
		}
		System.out.println("Finish");
		scanner.close();

	}
}
