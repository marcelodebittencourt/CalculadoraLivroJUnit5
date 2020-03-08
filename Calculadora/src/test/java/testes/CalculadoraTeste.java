package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTeste {

	static Calculadora c;

	@BeforeAll
	static void configuracaoInicial() {
		c = new Calculadora();
	}

	@DisplayName("Teste de Soma com Resultado Positivo")
	@Test
	void testeSomaResultadoPositivo() {
		assertEquals(4, c.soma(1, 3), "Soma positiva com erro");
	}
	
	@DisplayName("Teste de Subtracao com Resultado Positivo")
	@Test
	void testeSubtracaoResultadoPositivo() {
		assertEquals(1, c.subtracao(5, 4), "Subtracao positiva com erro");
	}
	
	@DisplayName("Teste de Soma com números negativos")
	@Test
	void testeSomaComNumerosNegativos() {
		assertEquals(-9, c.soma(-2, -7), "Soma de números de negativos com resultado diferente do esperado");
	}
}
