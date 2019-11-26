package antonio.upm.profundizacion.examen;

import java.util.LinkedList;
import java.util.List;

public class ClaseExamen {
	
	public static List<Integer> primos(int n) throws EntradaInvalida{
		int valor = n;
		
		if (valor <= 1)
			throw new EntradaInvalida();
		
		int factor = 2; // Se empieza probando como posible factor primo el 2.
		LinkedList<Integer> factores=new LinkedList<Integer>(); //Lista solucion
		int factorLimite = (int)Math.sqrt(valor); //Ultimo factor que debemos probar.
		
		while (factor <= factorLimite){
			/* Mientras es divisible, se añade el factor a la lista 
			   de factores primos y se realiza la división.*/
			while (valor % factor == 0 ){
				factores.add(factor);
				valor = valor/factor;
			}
			
			// Si no es divisible, se pasa al posible siguiente factor.
			if (factor==2)
				factor++;
			else
				factor+=2;
		}
		
		/* Si no se ha logrado la descomposición total, añadimos el último valor que
		   queda a la lista. */
		if (valor!=1)
			factores.add(valor);
		
		return factores;
	}

}
