package Teste1;

public class Exercicio2 {
	public String CalculaImc(double peso, double altura) {
		//double alturaReal=altura*100;
		double imc= peso/ (altura*altura);
		//double imc= peso/ Math.pow(altura, altura)*100;//(alturaReal*alturaReal);
		System.out.println(imc);
		if(imc<=19) {
			return "Abaixo do peso";
		} else if(imc >=20 && imc <=24) {
			return "Peso normal";
		}else if(imc >=25 && imc <=30) {
			return "Sobre peso";
		}else if(imc >=30 && imc <=40) {
			return "Obeso";
		}else if(imc >40) {
			return "Obeso Mórbido";
		}
		return null;
	}
}
