/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class435 {
	static float[] aFloatArray4846 = new float[16384];
	static float[] aFloatArray4847 = new float[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray4846[i] = (float) Math.sin((double) i * d);
			aFloatArray4847[i] = (float) Math.cos((double) i * d);
		}
	}

	Class435() throws Throwable {
		throw new Error();
	}
}
