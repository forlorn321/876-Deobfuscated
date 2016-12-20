/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class436 {
	static float[] aFloatArray4879 = new float[16384];
	static float[] aFloatArray4880 = new float[16384];

	Class436() throws Throwable {
		throw new Error();
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray4879[i] = (float) Math.sin((double) i * d);
			aFloatArray4880[i] = (float) Math.cos((double) i * d);
		}
	}
}
