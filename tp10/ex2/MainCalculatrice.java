package tp10.ex2;

public class MainCalculatrice
{

	public static void main(String[] args)
	{
		Calculatrice c = new Calculatrice();
		System.out.println(c.add(2, 4));
		System.out.println(c.add(2.2, 4.4));
		System.out.println(c.add(2, 4, 3));
	}

}
