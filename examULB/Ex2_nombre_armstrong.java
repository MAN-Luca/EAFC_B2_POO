package examULB;

import java.util.Scanner;

public class Ex2_nombre_armstrong
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Veuillez entrer un nombre : ");
		int x = input.nextInt();
		
		System.out.println(est_armstrong(x));
		
        input.close();
	}
	
	public static String est_armstrong(int n)
	{
		boolean is_arm = true;
		String n_str = "" + n;
		int len = n_str.length();
		int sum = 0;
		String res = "";
		
		for (int i = 0; i < len; i++)
		{
			char current = n_str.charAt(i);
			sum += Math.pow(Character.getNumericValue(current), len);
			
			if (i == 0) {
				res += current + "^" + len;
			} else {
				res += " + " + current + "^" + len;
			}
		}
		
		if (sum != n) is_arm = false;
		
		String intercalaire = is_arm ? " = " : " != ";
		return "" + n + intercalaire + res;
	}

}
