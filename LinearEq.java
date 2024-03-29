/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args)
	{
	double a = (double)(Integer.parseInt(args[0]));
		double b = (double)(Integer.parseInt(args[1]));
		double c = (double)(Integer.parseInt(args[2]));
		System.out.println(a+" * x + "+b+ " = " +c);
		System.out.println("x = "+((c-b)/a));
	}
}