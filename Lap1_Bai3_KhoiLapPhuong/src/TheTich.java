import java.util.Scanner;
public class TheTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Nhập cạnh của khối lập phương: ");
	        double canh = scanner.nextDouble();
	        
	        double TheTich = Math.pow(canh, 3);
	        
	       System.out.print("Kết quả tính thể tích " +TheTich);
	       scanner.close();
	}

}
