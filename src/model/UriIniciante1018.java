package model;

import java.util.Scanner;

public class UriIniciante1018 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		double valor = entrada.nextDouble();
		
		
		if (valor >= 0 && valor <= 1000000.00) {
        	int calc=0;
		
		int notas[] = { 100, 50, 20, 10, 5, 2 };

		System.out.println("NOTAS:");
		for (int i = 0; i <= notas.length - 1; i++) {

			calc = (int) valor / notas[i];

			if (calc >= 0) {

				System.out.printf("%d nota(s) de R$ %d\n",calc, notas[i]);
				valor = valor % notas[i];
				
			}
			
		}
    	float moedas[] = { 1.0F, 0.50F, 0.25F, 0.10F, 0.05F, 0.01F };

		System.out.println("MOEDAS:");

		
			for (int j = 0; j <= moedas.length - 1; j++) {

				float result =(float) valor / moedas[j];
				
				if(calc>=0) {
				System.out.printf("%d moeda(s) de R$ %.2f\n", (int)calc, moedas[j]);
				valor = valor % moedas[j];
				}
		}
	}

   }
}