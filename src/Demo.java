import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
			System.out.print("Enter age for entering club: ");
			int age=new Scanner(System.in).nextInt();
			if(age<0) {
				throw new InvalidAgeException();
			}
			if(age<18) {
				throw new InvalidAdultAgeException();
			}
			System.out.println("You can enter the club.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
