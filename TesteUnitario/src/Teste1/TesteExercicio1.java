package Teste1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteExercicio1 {
	Exercicio1 op;
	@Before
	public void setUp() throws Exception {
		op=new Exercicio1();
	}

	@Test
	public void testRaizCubica() { // double sempre tem delta
		assertEquals("Caso raiz cubica 1: ", 3.0 , op.RaizCubica(27.0), 0);
		assertEquals("Caso raiz cubica 2: ", 2.71 , op.RaizCubica(20.0), 0.01);
	}
	@Test
	public void testCalculaFatorial() {
		assertEquals("Caso fatorial 1:", 120, op.CalculaFatorial(5));
		assertEquals("Caso fatorial 2:", 1, op.CalculaFatorial(1));
	}
	@Test
	public void testSomaInf() {
		assertEquals("Caso Soma Inf 1:", 15, op.SomaInf(5));
		assertEquals("Caso Soma Inf 2:", 0, op.SomaInf(0));
	}
	

}
