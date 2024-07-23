package recursao;

import recursao.MetodosRecursivos;

public class TestarMetodosRecursivos {
	public static void main(String[] args) {
		MetodosRecursivos m = new MetodosRecursivos();
		int[] a = new int[3];
		a[0] = 2;
		a[1] = 4;
		a[2] = 3;
		System.out.println(m.calcularSomaArray(a));
		System.out.println(m.calcularFatorial(3));
	}
}
