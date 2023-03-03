package one.digitalinnovation.poo;

public class Calculadora implements OperacaoMatematica {
	
	@Override
	public void soma(double operador1, double operador2) {
		System.out.println("Soma: " + operador1 + operador2);
	}
	  
	@Override
	public void subtracao(double operador1, double operador2) {
		System.out.println("subtracao: " + (operador1 - operador2));
	}
	
	@Override
	public void multiplicacao(double operador1, double operador2) {
		System.out.println("multiplicacao: " + (operador1 * operador2));
	}
	
	@Override
	public void divisao(double operador1, double operador2) {
		System.out.println("divisao: " + (operador1 /  operador2));
	}
	

}
