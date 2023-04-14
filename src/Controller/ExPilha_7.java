package Controller;

import docarmo.pilhaint.pilha;

public class ExPilha_7 {

	public static void main(String[] args) {

		pilha Pa = new pilha();
		pilha Pb = new pilha();

		Pa = completapilha(Pa);
		organiza(Pa, Pb);

	}

	private static pilha completapilha(pilha Pa) {

		int vt[] = { 5, 26, 1, 17, 20, 22, 25, 11, 39, 5, 15, 38, 26, 14 };

		int tamanhovt = vt.length;

		for (int i = 0; i < tamanhovt; i++) {
			Pa.push(vt[i]);
		}
		return Pa;
	}

	private static void organiza(pilha Pa, pilha Pb) {

		pilha Paux = new pilha();
		int tamanho = Pa.size();
		int valor = 0;

		for (int i = 0; i < tamanho; i++) {
			try {
				valor = Pa.pop();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			if (valor % 2 == 0) {
				Paux.push(valor);
			} else {
				Pb.push(valor);
			}
		}
		
		tamanho = Paux.size();
		
		for (int i = 0; i < tamanho; i++) {
			try {
				valor = Paux.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Pa.push(valor);
		}
		
		mostra(Pa, Pb);
	}

	private static void mostra(pilha Pa, pilha Pb) {
		
		int tamanho;
		int valor;
		
		tamanho = Pa.size();
		
		System.out.println("Começa mostrar a pilha a");
		
		for (int i = 0; i < tamanho; i++) {
			try {
				valor = Pa.pop();
				System.out.println(valor);
			} catch (Exception e) {		
				e.printStackTrace();
			}
		}
		
		System.out.println("Termina de mostrar a pilha a");
		System.out.println("Começa mostrar a pilha b");
		tamanho = Pb.size();
		
		for (int i = 0; i < tamanho; i++) {
			try {
				valor = Pb.pop();
				System.out.println(valor);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Termina de mostrar a pilha b");
	}
}
