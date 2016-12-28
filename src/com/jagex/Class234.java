/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class234 {
	IComponentDefinitions[] aClass251Array2377;
	public IComponentDefinitions[] icomponentDefinitions;
	public boolean aBool2379;
	static int[] anIntArray2380;
	static int anInt2381;

	public IComponentDefinitions getIComponentDefinitions(int hash) {
		if (hash >>> 16 != -1591767037 * icomponentDefinitions[0].anInt2559 >>> 16)
			throw new IllegalArgumentException();
		return icomponentDefinitions[hash & 0xffff];
	}

	Class234(boolean bool, IComponentDefinitions[] class251s) {
		icomponentDefinitions = class251s;
		aBool2379 = bool;
	}

	public IComponentDefinitions[] method3338(int i) {
		if (aClass251Array2377 == null) {
			int i_1_ = icomponentDefinitions.length;
			aClass251Array2377 = new IComponentDefinitions[i_1_];
			System.arraycopy(icomponentDefinitions, 0, aClass251Array2377, 0, icomponentDefinitions.length);
		}
		return aClass251Array2377;
	}

	public IComponentDefinitions[] method3339(int i) {
		return (aClass251Array2377 == null ? icomponentDefinitions : aClass251Array2377);
	}

	static final void method3340(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.stereoVolumeSetting.method10226(-1404949445) == 1 ? 1 : 0;
	}

	static final void method3341(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.aClass382_8551.anIntArray4014[i_2_] = i_3_;
	}
}
