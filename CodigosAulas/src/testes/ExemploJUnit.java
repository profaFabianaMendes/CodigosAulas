package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * As classes de teste devem fica em uma pasta que contem
 * apenas apenas esse tipo de classe. Nao as coloque
 * dentro do pacote controle
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExemploJUnit {

	@Test
	void testCheckCPF() {
		String valorCPFErrado = "123.456.789-00";
		String valorCPFCorreto = "12345678900";
		assertTrue(ControleInformacoesPessoais.checkCPF(
				valorCPFCorreto));
		assertFalse(ControleInformacoesPessoais.checkCPF(
				valorCPFErrado));
	}

	@Test
	void testCheckTel() {
		String valorTelErrado = "(61) 9 9999-9999";
		String valorTelCorreto = "61999999999";
		assertTrue(ControleInformacoesPessoais.checkTel(
				valorTelCorreto));
		assertFalse(ControleInformacoesPessoais.checkTel(
				valorTelErrado));
	}
}
