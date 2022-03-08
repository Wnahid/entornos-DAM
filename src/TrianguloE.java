

public class TrianguloE {

	private double lado;
	private double altura;

	public TrianguloE(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	double calcularArea() {
		double area = 0;
		if (altura == 0) {
			throw new ArithmeticException("No es posible que la altura sea cero");
		} else {
			area = (lado * altura) / 2;
			System.out.println("TESTEO DE GIT");
			System.out.println("TESTEO 2");
		}
		return area;
	}

	double calcularPerimetro() {
		double perimetro = lado * 3;
		return perimetro;
	}

}
