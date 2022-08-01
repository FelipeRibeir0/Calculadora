package main;

import java.util.Scanner;

import res.Continue;
import res.IntOrDouble;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int escolha;
		Continue repetir;
		repetir = new Continue();
		IntOrDouble num1,num2,resp;
		num1 = new IntOrDouble();
		num2 = new IntOrDouble();
		resp = new IntOrDouble();
	    
		do 
		{
			System.out.println("Calculadora\nDigite um número\n"
					+ "0 - Sair               [<--]\n"
					+ "1 - Soma               [ + ]\n"
					+ "2 - Subtração          [ - ]\n"
					+ "3 - Multiplicação      [ x ]\n"
					+ "4 - Divisão            [ ÷ ]\n"
					+ "5 - Potenciação        [ x²]\n"
					+ "6 - Radiciação         [ √ ]\n"
					+ "7 - Porcentagem        [ % ]\n"
					+ "8 - Fatorial           [ x!]");

			escolha = sc.nextInt();
			
			switch (escolha)
			{
				case 0: 
					repetir.test = "n";
				break;
				
				case 1: do 
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite a parcela: ");
					num1.n = sc.nextDouble();
					System.out.print("Digite a 2ª parcela: ");
					num2.n = sc.nextDouble();
					resp.n = num1.n + num2.n;
					
					System.out.print(num1.check() + " + "+num2.check() + " = "+resp.check());
					System.out.println("\n");
					
				} while (num1.n != 0);
				break;

				case 2: do 
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite o minuendo: ");
					num1.n = sc.nextDouble();
					System.out.print("Digite o subtraendo: ");
					num2.n = sc.nextDouble();
					resp.n = num1.n - num2.n;
					
					System.out.print(num1.check() + " - "+num2.check() + " = "+resp.check());
					System.out.println("\n");
					
				} while (num1.n != 0);
				break;

				case 3: do 
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite o multiplicador: ");
					num1.n = sc.nextDouble();
					System.out.print("Digite o multiplicando: ");
					num2.n = sc.nextDouble();
					resp.n = num1.n * num2.n;
					System.out.print(num1.check() + " x "+num2.check() + " = "+resp.check());
					System.out.println("\n");
					
				} while (num1.n != 0);
				break;

				case 4: do 
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite o divisor: ");
					num1.n = sc.nextDouble();
					System.out.print("Digite o dividendo: ");
					num2.n = sc.nextDouble();
					resp.n = num1.n / num2.n;
					if (num2.n == 0) 
					{
						System.out.println(num1.check()+" ÷ "+num2.check()+" = error\n");
					}
					else 
					{
					System.out.println(num1.check() + " ÷ "+num2.check() + " = "+resp.check());
					resp.n = num1.n % num2.n;
					System.out.println("Resto da divisão: "+ resp.check() + "\n");
					}
					
				} while (num1.n != 0);
				break;

				case 5: do 
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite a base: ");
					num1.n = sc.nextDouble();
					System.out.print("Digite o expoente: ");
					num2.n = sc.nextDouble();
					resp.n = Math.pow(num1.n,num2.n);
					
					System.out.print(num1.check() + " com expoente "+num2.check() + " = "+resp.check());
					System.out.println("\n");
					
				} while (num1.n != 0);
				break;
				
				case 6: do 
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite a raiz quadrada: ");
					num1.n = sc.nextDouble();
					resp.n = Math.sqrt(num1.n);
					
					System.out.println("A raiz quadrada de "+num1.check()+" = "+resp.check());
					System.out.println("\n");
					
				} while (num1.n != 0);
				break;

				case 7: do
				{
					System.out.println("(0 = cancelar)");
					System.out.print("Digite a porcentagem. (? %): ");
					num1.n = sc.nextDouble();
					double perc = num1.n / 100;
					System.out.print("Digite de quantos. "+num1.check()+"% x : ");
					num2.n = sc.nextDouble();
					resp.n = perc*num2.n;

					System.out.print(num1.check() + "% de "+num2.check() + " = "+resp.check());
					System.out.println("\n");

				} while (num1.n != 0);
				break;

				case 8:
				{
					int fat;
					System.out.println(
							"1 - Fatorial simples (5!)\n"
						   +"2 - Fatorial com multiplicação (5! x 3)");
					escolha = sc.nextInt();
					switch (escolha) 
					{
						case 1: do
						{
							System.out.println("(Digite 0 para cancelar)");
							 System.out.print("Digite o fatorial: ");
					            fat = sc.nextInt();
					            resp.n  = fat;
					            for (double i = fat - 1; i >= 1; i--)
					            {	
					                resp.n *= i;
					            }
					            if (fat == 0) 
					            {
					            	resp.n = 1;
					            }
					            System.out.println("\n"+fat + "! = "+resp.check());
					            System.out.println();
	
						} while (fat != 0);
						break;
						
						case 2: do
						{
							System.out.println("(Digite 0 para cancelar)");
							 System.out.print("Digite o fatorial: ");
					            fat = sc.nextInt();
					            resp.n  = fat;
					         System.out.print("\nDigite o multiplicando: ");
					         	num2.n = sc.nextDouble();
					            for (double i = fat - 1; i >= 1; i--)
					            {	
					                resp.n = resp.n * i;
					            }
					            if (fat == 0) 
					            {
					            	resp.n = 1;
					            }
					            resp.n = resp.n * num2.n;
					            System.out.println("\n"+ fat + "! x "+num2.check()+" = "+resp.check());
					            System.out.println();
	
						} while (fat != 0);
						break;
						
						default: escolha = -1;
					}					
				}
			}
			
			
			if (escolha > 0 && escolha < 9 )
			{
			System.out.println("Deseja reiniciar? {s/n}");
			repetir.test = sc.next().toLowerCase();
			}
			
			else if (escolha < 0 && escolha > 9) 
			{
				repetir.test = "s";
			}
			
			repetir.go();

		}while (repetir.test.charAt(0) == 's');
				
		sc.close();
		
	}

}
