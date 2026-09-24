package Ejercicio1;
public class PRO01_Ejerc1 {
    public enum Choice {M, F};
    public static void main(String[] args) {
        
        final int MAX_NUMBER = 5000; // final int crea un valor entero inmutable
        boolean driversLicense = true; // boolean nos ofrece la simplitud de dar resultado verdadero (1) o falso (0)
        String fullName = "Deniel Khamidullin Barabanshchikov"; // String nos permite guardar una linea de characteres
        Choice sex = Choice.M; // he usado un enum para guardar los únicos 2 valores que pueden ser eligidos
        float earthToJupiter = 5.2f; // he usado float para demostrar un número decimal

        System.out.println("Unmodifiable Max Value: " + MAX_NUMBER);

            if (driversLicense == true)
                System.out.println("Has a drivers license");
            else
                System.out.println("Does not have a drivers license");

        System.out.println("Full Name: " + fullName);
        System.out.println("Sex: " + sex);
        System.out.printf("Approx. distance from Earth to Jupiter: %f AU\n", earthToJupiter);
    }
}
