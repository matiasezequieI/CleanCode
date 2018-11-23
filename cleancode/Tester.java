package cleancode;

public class Tester {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.mulitplicacao(2, 3));
		
		System.out.println(calc.divisao(45, 3));
		
		System.out.println(calc.subtracao(10, 3));
		
		System.out.println(calc.soma(12, 3));
	}

}
