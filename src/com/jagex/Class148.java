/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class148 {
	static float[] aFloatArray1697;
	static float[] aFloatArray1698 = new float[16384];

	Class148() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray1697 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray1698[i] = (float) Math.sin((double) i * d);
			aFloatArray1697[i] = (float) Math.cos((double) i * d);
		}
	}
}
