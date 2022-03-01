package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();  //Listas não aceita variáevel tipo primitivo, por isso INTEGER
	
		list.add("Maria");
		list.add("Alex");
		list.add(0,"Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println("Tamano da lista: " + list.size());
		for (String x : list)
		{
			System.out.println(x);
		}
		System.out.println("---------------");
	
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println("Tamano da lista: " + list.size());
		for (String x : list)
		{
			System.out.println(x);
		}
		
		System.out.println("Procurar a posição de Bob: "+ list.indexOf("Bob"));
		
		list.add("Amaral");
		list.add("Antonio");
		list.add(0,"Gerva");
		
		// filtar lista com todos que começam com A
		System.out.println("---------\nFiltrar primeira letra A: ");
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		System.out.println(result.size());
		for (String x : result)
		{
			System.out.println(x);
		}
		System.out.println("\n ---------- \nLista completa:");
		System.out.println("Tamano da lista: " + list.size());
		for (String x : list)
		{
			System.out.println(x);
		}
		System.out.println("\n--------\nEncontrar o primeiro elemento que começa com A");
		
		String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
