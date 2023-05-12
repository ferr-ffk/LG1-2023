package javaLG2.oo.formas;

public class Retangulo extends Shape {
	private float altura, largura;

	public Retangulo(float altura, float largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getLargura() {
		return largura;
	}



	public void setLargura(float largura) {
		this.largura = largura;
	}



	@Override
	public float getArea() {
		return largura * altura;
	}

	public float getPerimetro() {
		return  4 * this.altura * this.largura;
	}

}
