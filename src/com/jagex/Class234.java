/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class234 {
	IComponentDefinitions[] aClass251Array2377;
	public IComponentDefinitions[] aClass251Array2378;
	public boolean aBool2379;
	static int[] anIntArray2380;
	static int anInt2381;

	public IComponentDefinitions method3337(int i, int i_0_) {
		if (i >>> 16 != -1591767037 * aClass251Array2378[0].anInt2559 >>> 16)
			throw new IllegalArgumentException();
		return aClass251Array2378[i & 0xffff];
	}

	Class234(boolean bool, IComponentDefinitions[] class251s) {
		aClass251Array2378 = class251s;
		aBool2379 = bool;
	}

	public IComponentDefinitions[] method3338(int i) {
		if (aClass251Array2377 == null) {
			int i_1_ = aClass251Array2378.length;
			aClass251Array2377 = new IComponentDefinitions[i_1_];
			System.arraycopy(aClass251Array2378, 0, aClass251Array2377, 0, aClass251Array2378.length);
		}
		return aClass251Array2377;
	}

	public IComponentDefinitions[] method3339(int i) {
		return (aClass251Array2377 == null ? aClass251Array2378 : aClass251Array2377);
	}

	static final void method3340(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub37_10791.method10226(-1404949445) == 1 ? 1 : 0;
	}

	static final void method3341(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.aClass382_8551.anIntArray4014[i_2_] = i_3_;
	}
}
