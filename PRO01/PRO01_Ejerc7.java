public class PRO01_Ejerc7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        int c = 0;
        int x;

        System.out.printf("The equasion is %dx + %d = %d\n", a, b, c);

        b = -b / a;
        a = a / a;
        x = b * a;
        
        System.out.printf("x equals %d\n", x);
    }
}
