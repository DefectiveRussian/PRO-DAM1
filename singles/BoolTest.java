public class BoolTest {
	public static void main(String[] args) {
		boolean var1 = true;
		boolean var2 = true;
		boolean var3 = false;

		if ((var1 || var3) && (var2 && !var1))
			System.out.println("se cumple");
		else
			System.out.println("no se cumple");
	}
}
