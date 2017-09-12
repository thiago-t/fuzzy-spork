package s2b.tst.sum;

public class Sum {

	public static double sum(double d, double e) {
		if (d < 0) {
			throw new IllegalArgumentException("O primeiro número não deve ser negativo!");
		}
		if (e < 0) {
			throw new IllegalArgumentException("O segundo número não deve ser negativo!");
		}
		return d + e;
	}

}
