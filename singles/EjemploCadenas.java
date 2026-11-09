public class EjemploCadenas {
	public static void main(String[] args) {
		String cad1 = "TWO TRUCKS";
		String cad2 = "two trucks";

		System.out.printf("La cadena cad1 es: %s y cad2 es: %s\n", cad1, cad2);

		System.out.printf("Longitud de cad1: %d\n", cad1.length());

		System.out.printf("Concatenación: %s\n", cad1.concat(cad2));

		System.out.printf("cad1.equals(cad2) es %b\n", cad1.equals(cad2));
		System.out.printf("cad1.equalsIgnoreCase(cad2) es %b\n", cad1.equalsIgnoreCase(cad2));
		System.out.printf("cad1.compareTo(cad2) es %d\n", cad1.compareTo(cad2));

		System.out.printf("cad1.substring(0,3) es %s\n", cad1.substring(0,3));

		System.out.printf("cad1.toLowerCase() es %s\n", cad1.toLowerCase());
	}
}
