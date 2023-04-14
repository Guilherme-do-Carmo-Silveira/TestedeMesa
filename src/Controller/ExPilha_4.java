package Controller;

import docarmo.pilhaint.pilha;

public class ExPilha_4 {

	public static void main(String[] args) {

		pilha p = new pilha();
		int[] vetor = { 100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92 };
		int tamanhoVetor = vetor.length;

		for (int i = 0; i < tamanhoVetor; i++) {
			if (p.isEmpty() == true) {
				p.push(vetor[i] - 10);
			} else if (vetor[i] % 5 == 0) {
				p.push(vetor[i] / 5);
			} else if (vetor[i] % 3 == 0) {
				p.push(vetor[i] * 3);
			} else {
				int v1;
				try {
					v1 = p.pop();
					System.out.println(v1 / 2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
