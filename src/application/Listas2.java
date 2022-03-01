package application;

import java.util.ArrayList;
import java.util.List;

public class Listas2
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("Ana");
		list.add("Alberto");
		list.add("Marco");
		
		for (String x : list)
		{
			System.out.println(x);
		}
		System.out.println("--------------\n");
		list.add(2, "Alex");
		for (String x : list)
		{
			System.out.println(x);
		}
		System.out.println("--------------\n");
		list.removeIf(x -> x.charAt(0) == 'M'); //Remove por predicado 
		
		for (String x : list)
		{
			System.out.println(x);
		}
		System.out.println("\nPosição de Ana: " + list.indexOf("Ana"));
		
	}
}
