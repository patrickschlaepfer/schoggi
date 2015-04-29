package com.schlaepfer.schoggi;

/*
 * http://www.matheplanet.com/default3.html?call=viewtopic.php?topic=1346&ref=https%3A%2F%2Fwww.google.ch%2F
 */
public class App {

	private static final float _0_01F = 0.01f;
	private static final float END_PRICE = 7.77f;

	Float array[] = new Float[20];
	
	float ub, ub2, a, b, c, d, p;
	
	public static void main(String[] args) {
		App app = new App();
		app.calcSchoggi();
	}

	private void calcSchoggi() {

		long startMs = System.currentTimeMillis();
		
		initializeArray();

		for (int i = 0; i < 20; i++) {
			a = array[i];

			ub = END_PRICE - a;
			for (b = _0_01F; b < ub; b += _0_01F) {
				ub2 = ub - b;
				for (c = _0_01F; c < ub2; c += _0_01F) {
					d = ub2 - c;
					p = a * b * c * d;
					if (Math.abs(p - END_PRICE) <= 9.536743E-6) {
						System.out.println("a: " + a + " b:" + b + " c:" + c
								+ " d:" + d + " " + "(" + p + ") ");
					}
				}
			}
		}

		System.out.println("time used: "+(System.currentTimeMillis()-startMs));
	}

	private void initializeArray() {
		array[0] = 1.05f;
		array[1] = 1.11f;
		array[2] = 1.40f;
		array[3] = 1.48f;
		array[4] = 1.50f;
		array[5] = 1.75f;
		array[6] = 1.85f;
		array[7] = 2.10f;
		array[8] = 2.22f;
		array[9] = 2.59f;
		array[10] = 3.00f;
		array[11] = 3.50f;
		array[12] = 3.70f;
		array[13] = 4.20f;
		array[14] = 4.44f;
		array[15] = 5.18f;
		array[16] = 5.25f;
		array[17] = 5.55f;
		array[18] = 7.00f;
		array[19] = 7.40f;
	}
}
