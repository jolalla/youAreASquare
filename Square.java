package Pruebas;

public class Square {
	public static boolean isSquare(int n) {

		int check = (int) Math.sqrt(n);
		System.out.println(check);
		double resultado = n - Math.pow(check, 2);
		System.out.println(resultado);

		if (resultado == 0.0) {
			System.out.println(resultado);
			return true;
		}

		else {
			System.out.println(resultado);
			return false;
		}
	}

}
