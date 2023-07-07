package estruturaDeDados;

import java.util.Arrays;

public abstract class BuscaSequencial {
	public static int buscaSequencial(int key, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * public static int buscaOrdenada(int key, int[] a) { Arrays.sort(a);
	 * 
	 * 
	 * }
	 */
}
