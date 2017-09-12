package s2b.tst.sum;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner num;

	public static void main( String[] args )
    {
		Scanner input = new Scanner(System.in);
		num = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		System.out.printf("Enter A value:\n");
		double a = num.nextDouble();
		System.out.printf("Enter B value:\n");
		double b = num.nextDouble();
		input.close();
		double r = Sum.sum(a, b);
		System.out.printf("A= %f\n", a);
		System.out.printf("B= %f\n", b);
		System.out.println(deci.format(r));
    }
}
