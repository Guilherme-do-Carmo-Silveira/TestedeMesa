package Controller;

import docarmo.pilhaint.pilha;

public class ExPilha_9 {

	public static void main(String[] args) {
		pilha p = new pilha();
		p.push(1);
		p.push(2);
		p.push(3);
		pilha paux = new pilha();
		pilha paux2 = new pilha();
		int valor;
		while (!p.isEmpty()) {
			try {
				valor = p.pop();
				paux.push(valor);
				System.out.println(valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("pilha aux2:");
		while (!paux.isEmpty()) {
			try {
				valor = paux.pop();
				paux2.push(valor);
				System.out.println(valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
