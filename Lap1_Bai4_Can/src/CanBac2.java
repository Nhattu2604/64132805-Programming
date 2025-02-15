import java.util.Scanner;

public class CanBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

       double delta = Math.pow(b,2) - 4 * a * c;
       System.out.print("\nkết quả delta: " + delta);

        scanner.close();
    }
}
