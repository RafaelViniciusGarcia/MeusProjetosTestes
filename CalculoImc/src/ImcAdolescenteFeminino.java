    import java.util.Locale;
	import java.util.Scanner;


public class ImcAdolescenteFeminino {
//A REFERÊNCIA DE TABELA DESTE CÁLCULO DE IMC FOI RETIRADO DO SITE DO MINISTERIO DA SAUDE BRASILEIRO https://www.saude.gov.br/component/content/article/804-imc/40510-imc-em-criancas-e-adolescentes%20Acesso%20em%2024-10-2019
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);

			System.out.println("Vamos calulcar o IMC de uma adolescente do sexo feminino que vão dos dez aos dezenove anos");
			System.out.println();
			int idade;
			System.out.println("Entre com o valor da idade:");
			idade = sc.nextInt();
			System.out.println();			
			double p;		
			System.out.println("Entre com o valor do peso: ");
			p = sc.nextDouble();
			System.out.println();
			double a;
			System.out.println("Entre com o valor da altura: ");
			a = sc.nextDouble();
			System.out.println();
			double IMC = p / (a*2);
			System.out.printf("O seu IMC é =  %.2f %n", IMC);

			//CALCULO PARA IDADE DE DEZ ANOS.
			if (idade == 10 && IMC <= 14.22){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 10 && IMC  >= 14.23 && IMC  <=20.18){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 10 && IMC  >= 20.19) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE ONZE ANOS.	
			}if (idade == 11 && IMC <= 14.59){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 11 && IMC  >= 14.60 && IMC  <=21.17){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 11 && IMC  >= 21.18) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE DOZE ANOS.	
			}if (idade == 12 && IMC <= 19.97){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 12 && IMC  >= 14.98 && IMC  <=22.16){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 12 && IMC  >= 22.17) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
		    //CALCULO PARA IDADE DE TREZE ANOS.
			}if (idade == 13 && IMC <= 15.35){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 13 && IMC  >= 15.36 && IMC  <=23.70){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 13 && IMC  >= 23.08) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE CATORZE ANOS.	
			}if (idade == 14 && IMC <= 15.66){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 14 && IMC  >= 15.67 && IMC  <=23.87){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 14 && IMC  >= 23.88) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE QUINZE ANOS.	
			}if (idade == 15 && IMC <= 16){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 15 && IMC  >= 16.01 && IMC  <=24.28){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 15 && IMC  >= 24.29) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE DEZESSEIS ANOS.	
			}if (idade == 16 && IMC <= 16.36){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 16 && IMC  >= 16.37 && IMC  <=24.73){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 16 && IMC  >= 24.74) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE DEZESSETE ANOS.	
			}if (idade == 17 && IMC <= 16.58){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 17 && IMC  >= 16.59 && IMC  <=25.22){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 17 && IMC  >= 25.23) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}
			//CALCULO PARA IDADE DE DEZOITO ANOS.	
			}if (idade == 18 && IMC <= 16.70){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 18 && IMC  >= 16.71 && IMC  <=25.55){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 18 && IMC  >= 25.56) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}	
			//CALCULO PARA IDADE DE DEZENOVE ANOS.	
			}if (idade == 19 && IMC <= 16.86){
				System.out.println("Você tem " + idade + " anos" + " e você está abaixo do peso ideal");			
			}else {
				if (idade == 19 && IMC  >= 16.87 && IMC  <=25.84){
					System.out.println("Você tem " + idade + " anos" + " e você está no peso adequado");
				}else {
					if (idade == 19 && IMC  >= 25.85) {
						System.out.println("Você tem " + idade + " anos" + " e você está com sobrepeso");
					}
				}	



			sc.close();

		}

	}
}

