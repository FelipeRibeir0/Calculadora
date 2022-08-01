package res;

import java.util.Scanner;

public class Continue {

	public String test = "aa";
	Scanner sc = new Scanner(System.in);
	
	public String go() {
		char[] contagem = test.toCharArray();
		for(int i=0;i < contagem.length; i++)
		
		while (i > 0) 
		{
			System.out.println("\nResposta não identificada.\nDeseja tentar novamente? {s/n}");
			test = sc.next();
			contagem = test.toCharArray();
			for(i = 0; i > contagem.length; i--);
		}
		
		while (test.charAt(0) != 'n' && test.charAt(0) != 's')
		{ 
			System.out.println("\nResposta não identificada.\nDeseja tentar novamente? {s/n}");
			test = sc.next();
		}
		return test;
	}
}
