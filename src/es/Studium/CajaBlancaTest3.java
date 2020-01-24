package es.Studium;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	class CajaBlancaTest3 {

		@Test
		void testCamino1() {
			String resultadoEsperado = "La edad debe ser un número positivo.";
			String resultadoReal= EdadPerro.edadPerro(-1);
			assertEquals(resultadoEsperado, resultadoReal);
		}
		
		@Test
		void testCamino2() {
			String resultadoEsperado = "La edad es 10.5";
			String resultadoReal= EdadPerro.edadPerro(1);
			assertEquals(resultadoEsperado, resultadoReal);
		}
		
		@Test
		void testCamino3() {
			String resultadoEsperado = "La edad es 29.0";
			String resultadoReal= EdadPerro.edadPerro(4);
			assertEquals(resultadoEsperado, resultadoReal);
		}

	}
