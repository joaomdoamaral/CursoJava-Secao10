package application;

import java.util.Scanner;

import entities.Ex01Quartos;

public class Ex01AluguelQuartos
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		Ex01Quartos[] vetor = new Ex01Quartos[10];
				
		System.out.println("Quantos deseja cadastrar: ");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			System.out.printf("Digite o nome: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.printf("Digite o e-mail: ");
			
			String email = scanner.nextLine();
			System.out.printf("Digite o número do quarto a ser alugado: ");
			int quarto = scanner.nextInt();
			vetor[quarto-1] = new Ex01Quartos(name, email);
			System.out.println("\n");
		}
		for (int i=0; i<10; i++)
		{
			if (vetor[i] != null)
				System.out.printf(i+1 + ": " + vetor[i].getName() 
				+ ", " + vetor[i].getEmail()+ "\n");
			}
		
		scanner.close();	
	}
		
		
			
}

