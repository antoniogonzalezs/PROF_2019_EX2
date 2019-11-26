package antonio.upm.profundizacion.examen;


import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamenTest {
	final static int NUMERO6 = 6;
	final static int NUMERO13 = 13;
	final static int NUMERO25 = 25;
	final static int NUMERO_INVALIDO = -1;
	
	@Test
	/**
	 * Prueba la descomposicion para el numero 6.
	 * Resultado esperado -> {2,3}
	 */
	public void descomposicion_num6() {
		List<Integer> resultado_descomposicion_num6 = new ArrayList<Integer>();
		resultado_descomposicion_num6.add(2);
		resultado_descomposicion_num6.add(3);
		
		try {
			assertEquals(resultado_descomposicion_num6,ClaseExamen.primos(NUMERO6));
		} catch (EntradaInvalida e) {
			e.printStackTrace();
		}
	}
	
	@Test
	/**
	 * Prueba la descomposicion para el numero 13.
	 * Resultado esperado -> {13}
	 */
	public void descomposicion_num13() {
		List<Integer> resultado_descomposicion_num13 = new ArrayList<Integer>();
		resultado_descomposicion_num13.add(13);
	
		try {
			assertEquals(resultado_descomposicion_num13,ClaseExamen.primos(NUMERO13));
		} catch (EntradaInvalida e) { 
			e.printStackTrace();
		}
	}

	@Test
	/**
	 * Prueba la descomposicion para el numero 25.
	 * Resultado esperado -> {5}
	 */
	public void descomposicion_num25() {
		List<Integer> resultado_descomposicion_num25 = new ArrayList<Integer>();
		resultado_descomposicion_num25.add(5);
		resultado_descomposicion_num25.add(5);
	
		try {
			assertEquals(resultado_descomposicion_num25,ClaseExamen.primos(NUMERO25));
		} catch (EntradaInvalida e) { 
			e.printStackTrace();
		}
	}
	
	@Test(expected = EntradaInvalida.class)
	/**
	 * Prueba la descomposicion para un numero invalido
	 * Resultado esperado -> EXCEPCION de tipo EntradaInvalida
	 */
	public void descomposicion_numInvalido() throws EntradaInvalida {	
		ClaseExamen.primos(NUMERO_INVALIDO);
	}

}
