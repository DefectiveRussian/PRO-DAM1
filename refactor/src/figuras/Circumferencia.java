package figuras;

public class Circumferencia {
	private double rad;

	public double getRad() {
		return this.rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	};

	public Circumferencia(double radio) {
		this.rad = radio;
	}

	public void imprimir() {
		System.out.println("Diámetro: " + (2 * rad));
		System.out.println("Color: " + "rojo");
		double area1 = 2 * 3.1416 * rad * rad;
		double area = area1;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerarDecimales, Circumferencia otro) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
