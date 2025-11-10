// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double sum = 0.0;
		double machane = 1.0;
		double sign = 1.0;
		for ( int i = 0; i < n; i++) {
			double number = sign / machane;
			sum = sum + number;
			machane = machane + 2.0;
			sign = sign * (-1.0);
		} 
		double piApprox = sum*4.0;
		System.out.println("pi, according to Java: " +Math.PI);
		System.out.println("pi, approximated: " + piAprrox);
	}
}
