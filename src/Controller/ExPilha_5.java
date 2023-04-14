package Controller;

import docarmo.pilhaint.pilha;

public class ExPilha_5 {

	public static void main(String[] args) {
		
		pilha p = new pilha();
		int resultado = 1;
		int multiplica;
		
		int valor = (int) (Math.random() * 10);
		
		System.out.print("O fatorial de " + valor + " eh: ");
		
		while(valor >= 1) {
			if(valor == 0) {
				System.out.println("O fatorial de 0 eh: " + resultado);
			}
			p.push(valor);
			valor --;
		}
		
		int tamanho = p.size();
		
		for(int i = 0; i < tamanho; i++) {
			try {
				multiplica = p.pop();
				resultado = resultado * multiplica;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.print(resultado);
	}

}
