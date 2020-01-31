package es.Studium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlanca3For {

	@Test
	void testCamino1() {
		String resultadoEsperado = "";
		String resultadoReal= Ejercicio3For.trianguloFilas(0);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testCamino3() {
		String resultadoEsperado = "1\n";
		String resultadoReal= Ejercicio3For.trianguloFilas(1);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}
