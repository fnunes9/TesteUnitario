package Teste1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
	
public class TesteExercicio2 {
	Exercicio2 teste;
	@Before
	public void setUp() throws Exception {
		teste= new Exercicio2();
	}

	@Test
	public void testCalculaImc() {
		assertEquals("Caso1: ", "Abaixo do peso",teste.CalculaImc(75.0, 1.90));
		assertEquals("Caso2: ", "Peso normal",teste.CalculaImc(65, 1.65));
		assertEquals("Caso3: ", "Sobre peso",teste.CalculaImc(75.0, 1.65));
		assertEquals("Caso4: ", "Obeso",teste.CalculaImc(75.0, 1.55));
		assertEquals("Caso5: ", "Obeso Mórbido",teste.CalculaImc(75.0, 1.45));
	}

}
