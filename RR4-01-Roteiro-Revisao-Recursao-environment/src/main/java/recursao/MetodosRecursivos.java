package recursao;
import java.util.Arrays;

public class MetodosRecursivos {

	MetodosRecursivos() {
	}


	public int calcularSomaArray(int[] array){
		int result = 0;
		
		if ((array.length - 1) == 0) {
			result += array[0];
		} else {
			result += array[0] + calcularSomaArray(Arrays.copyOfRange(array, 1, array.length));
		}
		return result;
	}



	public long calcularFatorial(int n) {
		long result = 1;
		if (n == 0 || n == 1) {
			return result;
		} else {
			result = result *  n * calcularFatorial(n-1);
		}
		System.out.println(n + "! = " + result);
		return result;
	}

	public int calcularFibonacci(int n) {
		int result = 1;
		if (n == 0) return 0;
		else if( n == 1) return 1;
		else result = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		return result;
	}

	public int countNotNull(Object[] array) {
		int result = 0;
		if (array.length == 1) {
			if (array[0] != null) return 1;
		} else {
			if (array[0] != null) result++;
			result += countNotNull(Arrays.copyOfRange(array, 1, array.length));
		}
		return result;
	}

	public long potenciaDe2(int expoente) {
		int result = 1;
		if (expoente == 0) return 1;
		else result = (int) (result * 2 * potenciaDe2(expoente-1));
		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = termoInicial;
		if (n == 0) return 0;
		else result += razao + progressaoAritmetica(0, razao, n-1);
		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = termoInicial;
		if (n == 0) return 1;
		else result = result * razao * (progressaoGeometrica(1, razao, n-1));
		return result;
	}
}