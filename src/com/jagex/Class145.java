/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class145 {
	static float[] aFloatArray1671;
	static float[] aFloatArray1672 = new float[16384];

	static {
		aFloatArray1671 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray1672[i] = (float) Math.sin((double) i * d);
			aFloatArray1671[i] = (float) Math.cos((double) i * d);
		}
	}

	Class145() throws Throwable {
		throw new Error();
	}
}
