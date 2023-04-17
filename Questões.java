import java.util.Scanner;

public class Questões {

	public static void exFibonacci() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = scn.nextInt();
		int numAnt = 0;
		int numPos = 1;
		int soma = 0;
		
		if(num == 0) {
			System.out.println("O numero digitado pertence a sequencia de fibonacci");
		}
		
		while(soma <= num) {
			soma = numPos + numAnt;
			numAnt = numPos;
			numPos = soma;
			
			if(soma == num) {
				System.out.println("O numero digitado pertence a sequencia de fibonacci");
			} 
		}
		
		scn.close();
		
	}
	
	public static void exFaturamento() {
		double faturamento[] = new double[30];
		
		faturamento[0] = 22174.1664;
		faturamento[1] = 24537.6698;
		faturamento[2] = 26139.6134;
		faturamento[3] = 0.0;
		faturamento[4] = 0.0;
		faturamento[5] = 26742.6612;
		faturamento[6] = 0.0;
		faturamento[7] = 42889.2258;
		faturamento[8] = 46251.174;
		faturamento[9] = 11191.4722;
		faturamento[10] = 0.0;
		faturamento[11] = 0.0;
		faturamento[12] = 3847.4823;
		faturamento[13] = 373.7838;
		faturamento[14] = 2659.7563;
		faturamento[15] = 48924.2448;
		faturamento[16] = 18419.2614;
		faturamento[17] = 0.0;
		faturamento[18] = 0.0;
		faturamento[19] = 35240.1826;
		faturamento[20] = 43829.1667;
		faturamento[21] = 18235.6852;
		faturamento[22] = 4355.0662;
		faturamento[23] = 13327.1025;
		faturamento[24] = 0.0;
		faturamento[25] = 0.0;
		faturamento[26] = 25681.8318;
		faturamento[27] = 1718.1221;
		faturamento[28] = 13220.495;
		faturamento[29] = 8414.61;
		
		double maior = 0;
		for(int i = 0; i < 30; i++) {
			if(faturamento[i] > maior) {
			  maior = faturamento[i];
			}
		}
		
		System.out.println("O maior faturamento do mes foi de: " + maior);
		
		double menor = maior;
		for(int i = 0; i < 30; i++) {
			if(faturamento[i] < menor) {
			  menor = faturamento[i];
			}
		}	
		
		System.out.println("O menor faturamento do mes foi de: " + menor);
		
		double soma = 0;
		double divisor = 0;
		for(int i = 0; i < 30; i++) {
			if(faturamento[i] > 0) {
				divisor++;
				soma = soma + faturamento[i];
			}
		}
		double media = soma/divisor;
		System.out.println("A media de faturamento do mes foi de: " + media);
		
		int diasAcimaMedia = 0;
		for(int i = 0; i < 30; i++) {
			if(faturamento[i] > media) {
				diasAcimaMedia++;
			}
		}
		System.out.println("Tiveram " + diasAcimaMedia + " dias com faturamento acima da media");

	}
	
	public static void exEstados() {
		double faturamento[] = new double[5];
		
		faturamento[0] = 67836.43;
		faturamento[1] = 36678.66;
		faturamento[2] = 29229.88;
		faturamento[3] = 27165.48;
		faturamento[4] = 19849.53;
		
		double soma = 0;
		double representação[] = new double[5];
		
		for(int i = 0; i < 5; i++) {
			soma = soma + faturamento[i];
		}
		for(int i = 0; i < 5; i++) {
			representação[i] = (faturamento[i]*100)/soma;
		}
		 System.out.println(" A representação do Estado São Paulo no faturamento em porcentagem é de : " + representação[0]);
		 System.out.println(" A representação do Estado Rio de Janeiro no faturamento em porcentagem é de : " + representação[1]);
		 System.out.println(" A representação do Estado Minas Gerais no faturamento em porcentagem é de : " + representação[2]);
		 System.out.println(" A representação do Estado Espírito Santo no faturamento em porcentagem é de : " + representação[3]);
		 System.out.println(" A representação dos outros Estados no faturamento em porcentagem é de : " + representação[4]);
	}
	
	public static void exString() {
		
		String str = "Pato";
		String invertida = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			invertida += str.charAt(i);
		}
		System.out.println(invertida);		
	}
}
