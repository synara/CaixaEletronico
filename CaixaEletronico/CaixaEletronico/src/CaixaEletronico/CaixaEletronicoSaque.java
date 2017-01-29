package CaixaEletronico;

public class CaixaEletronicoSaque {

	public static int qtdNotas(float x) {
		float aux = x;
		int qtd100 = 0;
		int qtd50 = 0;
		int qtd20 = 0;
		int qtd10 = 0;
		 
		
		if (aux >= 100.00f) {
			int rst = (int) x / 100;
			for (int i = 0; i < rst; i++) {
				aux = x - 100;
			}
			qtd100 = rst;
			qtdNotas(aux);
		}

		else if (aux >= 50.00f) {
			int rst = (int) x / 50;
			for (int i = 0; i < rst; i++) {
				aux = x - 50;
			}
			qtd50 = rst;
			qtdNotas(aux);
			// sempre vai ser 1, pois 50+50 = 100

		} else if (aux >= 20.00f) {
			int rst = (int) x / 20;
			for (int i = 0; i < rst; i++) {
				aux = x - 20;
			}
			qtd20 = rst;
			qtdNotas(aux);

		} else if (aux >= 10.00f) {
			int rst = (int) x / 10;
			for (int i = 0; i < rst; i++) {
				aux = x - 10;
			}
			qtd10 = rst;
			qtdNotas(aux);

		} else if (aux < 10.00f && aux > 0.00f) {
			qtd100 = qtd50 = qtd20 = qtd10 = 0;
			System.out.println("Não existe notas disponíveis!");

		}
		int qtdNotas = qtd100 + qtd50 + qtd20 + qtd10;
		return qtdNotas;
	}
		
	
	
	// caso o cliente digite só zero
	public void ErroCliente(float x) {
		if (x == 0) {
			System.out.println("Valor inválido!");
		}
	}

}