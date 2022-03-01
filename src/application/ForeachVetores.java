package application;


public class ForeachVetores
{

	public static void main(String[] args)
	{
		String [] vetor = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0 ; i <  vetor.length; i++)
		{
			System.out.println(vetor[i]);
		}
		
		System.out.println("------------");
		for (String  obj : vetor) //para cada posição do vetor, apelida de obj e faça isto:
		{
			System.out.println(obj);
		}

	}

}
