package javaLG2.oo.formas;

public class Circulo extends Shape {
	private float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	@Override
	public float getArea() {
		return (float) (Math.PI * Math.pow(raio, 2));
	}

}
