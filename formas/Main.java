package javaLG2.oo.formas;

public class Main {
	public static void main(String[] args) {
		Circulo circ = new Circulo(4);
		Retangulo rect = new Retangulo(4, 2);
		System.out.println("Area circulo de raio " + circ.getRaio() + "é " + circ.getArea());
		System.out.println("Area retangulo de altura" + rect.getAltura() + "e largura " + rect.getLargura() + "é "
				+ rect.getArea());
	}
}
