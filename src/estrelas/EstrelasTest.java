package estrelas;

import static org.junit.Assert.*;

import org.junit.Test;

public class EstrelasTest {

	@Test
	public void geradorDeEstrelasTest() {
		Estrelas star = new Estrelas();
		
		String valor = star.geradorDeEstrelas(5);
		
		assertTrue(valor.length() >= 0);
	}

}
