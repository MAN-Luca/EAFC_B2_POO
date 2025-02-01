package tp10.ex1;

public class MainAnimal
{

	public static void main(String[] args)
	{
		Chat chat = new Chat("Sherlock");
		
		chat.manger();	// On voit que le Chat possède aussi les méthodes de la classe mère Animal
		chat.miauler();
	}

}
