package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex00Produtos;

public class Ex00Vetores2
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Ex00Produtos[] vect = new Ex00Produtos[n];
		
		for(int i=0; i< vect.length; i++)
		{
			scanner.nextLine();
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			vect[i] = new Ex00Produtos(name, price);
		}
		double soma=0;
		for (int i=0; i<vect.length; i++)
		{
			soma += vect[i].getPrice();
		}
		double media = soma/n;
		
		System.out.printf("Media de preço: R$ %.2f", media);
		
		scanner.close();

	}

}
