/* Class179_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class179_Sub2_Sub1 extends Class179_Sub2 {
	int anInt11516;
	Class180_Sub2 aClass180_Sub2_11517;
	static int[][] anIntArrayArray11518 = new int[6][];
	Interface39 anInterface39_11519;

	Class179_Sub2_Sub1(Class180_Sub2 class180_sub2, int i) {
		aClass180_Sub2_11517 = class180_sub2;
		anInt11516 = i;
	}

	Interface39 method15585() {
		if (anInterface39_11519 == null) {
			Interface24 interface24 = aClass180_Sub2_11517.anInterface24_2085;
			Class163 class163 = aClass180_Sub2_11517.aClass181_2059.method3544(anInt11516, (byte) -103);
			if (class163 == null)
				return null;
			if (!class163.aBool1779)
				return null;
			if (!interface24.method134(Class609.aClass609_7997, anInt11516, Class591.aClass591_7795, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, 117313657))
				return null;
			int[] is = interface24.method132(Class609.aClass609_7997, anInt11516, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, (byte) -13);
			int i = (class163.anInt1780 * 1039262975 * (class163.anInt1780 * 1039262975));
			if (is == null)
				return null;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				anIntArrayArray11518[i_0_] = new int[i];
				System.arraycopy(is, i * i_0_, anIntArrayArray11518[i_0_], 0, i);
			}
			anInterface39_11519 = aClass180_Sub2_11517.method14968((class163.anInt1780 * 1039262975), class163.aByte1804 != 0, anIntArrayArray11518);
		}
		return anInterface39_11519;
	}

	Interface39 method15587() {
		if (anInterface39_11519 == null) {
			Interface24 interface24 = aClass180_Sub2_11517.anInterface24_2085;
			Class163 class163 = aClass180_Sub2_11517.aClass181_2059.method3544(anInt11516, (byte) -26);
			if (class163 == null)
				return null;
			if (!class163.aBool1779)
				return null;
			if (!interface24.method134(Class609.aClass609_7997, anInt11516, Class591.aClass591_7795, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, -1595163375))
				return null;
			int[] is = interface24.method132(Class609.aClass609_7997, anInt11516, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, (byte) 37);
			int i = (class163.anInt1780 * 1039262975 * (class163.anInt1780 * 1039262975));
			if (is == null)
				return null;
			for (int i_1_ = 0; i_1_ < 6; i_1_++) {
				anIntArrayArray11518[i_1_] = new int[i];
				System.arraycopy(is, i * i_1_, anIntArrayArray11518[i_1_], 0, i);
			}
			anInterface39_11519 = aClass180_Sub2_11517.method14968((class163.anInt1780 * 1039262975), class163.aByte1804 != 0, anIntArrayArray11518);
		}
		return anInterface39_11519;
	}

	Interface39 method15586() {
		if (anInterface39_11519 == null) {
			Interface24 interface24 = aClass180_Sub2_11517.anInterface24_2085;
			Class163 class163 = aClass180_Sub2_11517.aClass181_2059.method3544(anInt11516, (byte) -86);
			if (class163 == null)
				return null;
			if (!class163.aBool1779)
				return null;
			if (!interface24.method134(Class609.aClass609_7997, anInt11516, Class591.aClass591_7795, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, -1744227235))
				return null;
			int[] is = interface24.method132(Class609.aClass609_7997, anInt11516, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, (byte) -3);
			int i = (class163.anInt1780 * 1039262975 * (class163.anInt1780 * 1039262975));
			if (is == null)
				return null;
			for (int i_2_ = 0; i_2_ < 6; i_2_++) {
				anIntArrayArray11518[i_2_] = new int[i];
				System.arraycopy(is, i * i_2_, anIntArrayArray11518[i_2_], 0, i);
			}
			anInterface39_11519 = aClass180_Sub2_11517.method14968((class163.anInt1780 * 1039262975), class163.aByte1804 != 0, anIntArrayArray11518);
		}
		return anInterface39_11519;
	}
}
