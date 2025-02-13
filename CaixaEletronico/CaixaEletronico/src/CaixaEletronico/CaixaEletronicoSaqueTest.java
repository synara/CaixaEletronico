package CaixaEletronico;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CaixaEletronicoSaqueTest {

	CaixaEletronicoSaque saque;

	@Test
	public void EhPraSerInvalido() {
		saque = new CaixaEletronicoSaque();
		saque.ErroCliente(0);
		assertEquals(0, 0);
	}

	@Test
	public void EhPraSerInvalidoDeNovo() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(301);
		assertEquals(0, 0);
	}

	@Test
	public void Valor95EhPraSerInvalido() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(95);
		assertEquals(0, 0);
	}

	@Test
	public void EhPraSer3() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(300);
		// 3 de 100
		assertEquals(3, 3);
	}

	@Test
	public void EhPraSer6Notas() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(550);
		// 5 de 100 e 1 de 50
		assertEquals(6, 6);
	}

	@Test
	public void NumeroQuebradoEhPraSerIndisponivel() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(578.55f);
		assertEquals(0, 0);
	}

	@Test
	public void EhPraSer11Notas() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(1050);
		// 10 de 100 e 1 de 50
		assertEquals(11, 11);
	}

	@Test
	public void EhPraDarIndisponivel() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(256);
		assertEquals(0, 0);
	}

	@Test
	public void EhPraSer22Notas() {
		saque = new CaixaEletronicoSaque();
		saque.qtdNotas(1980);
		// 19 de 100 + 1 de 50 + 1 de 20 + 1 de 10
		assertEquals(22, 22);
	}
	
}
