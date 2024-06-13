package Teste1;

public class Exercicio1 {
	public double RaizCubica(double n) {
		return Math.cbrt(n);
	}
	public int CalculaFatorial(int numFat){
        int sub=1;
       for(int i=1;i<=numFat;i++){
           sub*=i;
       }
       return sub;
	}  
	public int SomaInf(int somaInfinita){
        int soma=0;
        if(somaInfinita>=0){
            for(int i=0;i<=somaInfinita;i++){
            soma+=i;
            }
            return soma;
        }
        return 404;
    }
}
