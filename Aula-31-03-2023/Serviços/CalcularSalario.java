package Serviços;

public class CalcularSalario {
	
	public double brutoCalculado(int horasTrabalhadas , double valorHorasTrabalhadas){
		
		double soma = horasTrabalhadas * valorHorasTrabalhadas;
		return soma;
	}

		public double LiquidadoCalculado(double salarioBruto , double imposto) {
			
			double soma = salarioBruto * imposto;
			
			return soma;
			
		}
}
