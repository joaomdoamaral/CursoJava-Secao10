package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Ex02ListasFuncionario;

public class Ex02_Listas
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Ex02ListasFuncionario> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários deseja cadastrar?");
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++)
		{
			System.out.println("\nFuncionário #" + (i+1) + ":");
			System.out.printf("Digite o ID: ");
			int id = scanner.nextInt();
			while (idExistente(list, id)) 
			{
				System.out.printf("\nEste ID já existe. \nDigite um ID válido: ");
				id = scanner.nextInt();
			}
			System.out.printf("Digite o nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.printf("Digite o Salário: ");
			double salario = scanner.nextDouble();
			
			Ex02ListasFuncionario funcionario = new  Ex02ListasFuncionario(id, nome, salario);
			list.add(funcionario); 	
		}
		int validaId;
		do 
		{	
			System.out.printf("\nDigite o ID do funcionário que receberá aumento: ");
			int idSalario = scanner.nextInt();
		
			Ex02ListasFuncionario funcionario = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
			if (funcionario == null)
			{
				System.out.println("Este id não existe!");
				validaId = 0;
			}
			else 
			{
				System.out.printf("\nEntre com a porcentagem para aumento: ");
				double aumento = scanner.nextDouble();
				funcionario.aumentoSalario(aumento);
				validaId = 1;
			}
		} while (validaId ==0);		
		
			
		System.out.println("\nLista de funcionários:");
		for (Ex02ListasFuncionario func : list)
		{
			System.out.println(func);
		}
		
		scanner.close();
	}
	
	public static boolean idExistente (List<Ex02ListasFuncionario> list, int id)
	{
		Ex02ListasFuncionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func !=null;
	}
}