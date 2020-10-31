package labassign4;
import java.util.Scanner;
public class Question5 {
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)) {
			System.out.println("Please enter a number");
			int num = sc.nextInt();
			try {
				if(num > 100) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("Number cannot be greater than 100");
			}
		}
	}
}

