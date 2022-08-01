package res;

import java.text.DecimalFormat;

public class IntOrDouble {
	double aux;
	public double n;
	
	public String check() 
	{		
		aux = Math.floor(n);

		if (n > aux && n < (aux+1))
		{
			DecimalFormat f = new DecimalFormat("#,##0.00");
			return String.format(f.format(n));
		}
		else if (n == aux)
		{
			DecimalFormat f = new DecimalFormat("#,###");
			return String.format(f.format(n));
		}
		return null;
	}
}