import java.util.Scanner;

public class Main {

	/**
	 * это мой мейн метод - точка входа в программу.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int x = myScanner.nextInt();
		int y = myScanner.nextInt();
		double result = Main.mod(x,y);
		System.out.println(result);
	}

	private static int add(int firstArgument, int secondArgument){
		return firstArgument + secondArgument;
	}

	private static int subtract(int firstArgument, int secondArgument){
		return firstArgument - secondArgument;
	}

	private static int multiply(int firstArgument, int secondArgument){
		return firstArgument * secondArgument;
	}
	private static double divide(double firstArgument, double secondArgument){
		return firstArgument / secondArgument;
	}
	private static double power(double firstArgument, double secondArgument){
		return Math.pow(firstArgument, secondArgument);//
	}
	private static int mod(int firstArgument, int secondArgument){
		return firstArgument % secondArgument;
	}

	//oneOverX
}