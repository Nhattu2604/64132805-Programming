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
       System.out.println("\nkết quả delta: " + delta);
       if(delta >=0){
    	   double Candelta =Math.sqrt(delta);
    	   System.out.println("căn delta =" + Candelta);
       }
       else {
    	   System.out.println("Không thể tính căn delta vì delta < 0");
    	   }
        scanner.close();
    }
}
