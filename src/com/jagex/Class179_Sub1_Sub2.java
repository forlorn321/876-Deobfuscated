/* Class179_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class179_Sub1_Sub2 extends Class179_Sub1 {
	int anInt11413;
	Class118_Sub2 aClass118_Sub2_11414;
	Class180_Sub3 aClass180_Sub3_11415;
	static int[][] anIntArrayArray11416 = new int[6][];

	Class118_Sub2 method14723() {
		if (aClass118_Sub2_11414 == null) {
			Interface24 interface24 = aClass180_Sub3_11415.anInterface24_2085;
			Class163 class163 = aClass180_Sub3_11415.aClass181_2059.method3544(anInt11413, (byte) -15);
			if (class163 == null)
				return null;
			if (!class163.aBool1779)
				return null;
			if (!interface24.method134(Class609.aClass609_7997, anInt11413, Class591.aClass591_7795, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, -1858220815))
				return null;
			int[] is = interface24.method132(Class609.aClass609_7997, anInt11413, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, (byte) -85);
			int i = (class163.anInt1780 * 1039262975 * (class163.anInt1780 * 1039262975));
			if (is == null)
				return null;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				anIntArrayArray11416[i_0_] = new int[i];
				System.arraycopy(is, i * i_0_, anIntArrayArray11416[i_0_], 0, i);
			}
			aClass118_Sub2_11414 = new Class118_Sub2(aClass180_Sub3_11415, Class157.aClass157_1728, Class184.aClass184_2104, class163.anInt1780 * 1039262975, class163.aByte1804 != 0, anIntArrayArray11416);
		}
		return aClass118_Sub2_11414;
	}

	Class118_Sub2 method14724() {
		if (aClass118_Sub2_11414 == null) {
			Interface24 interface24 = aClass180_Sub3_11415.anInterface24_2085;
			Class163 class163 = aClass180_Sub3_11415.aClass181_2059.method3544(anInt11413, (byte) -6);
			if (class163 == null)
				return null;
			if (!class163.aBool1779)
				return null;
			if (!interface24.method134(Class609.aClass609_7997, anInt11413, Class591.aClass591_7795, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, -1821630820))
				return null;
			int[] is = interface24.method132(Class609.aClass609_7997, anInt11413, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, (byte) 79);
			int i = (class163.anInt1780 * 1039262975 * (class163.anInt1780 * 1039262975));
			if (is == null)
				return null;
			for (int i_1_ = 0; i_1_ < 6; i_1_++) {
				anIntArrayArray11416[i_1_] = new int[i];
				System.arraycopy(is, i * i_1_, anIntArrayArray11416[i_1_], 0, i);
			}
			aClass118_Sub2_11414 = new Class118_Sub2(aClass180_Sub3_11415, Class157.aClass157_1728, Class184.aClass184_2104, class163.anInt1780 * 1039262975, class163.aByte1804 != 0, anIntArrayArray11416);
		}
		return aClass118_Sub2_11414;
	}

	Class179_Sub1_Sub2(Class180_Sub3 class180_sub3, int i) {
		aClass180_Sub3_11415 = class180_sub3;
		anInt11413 = i;
	}

	Class118_Sub2 method14725() {
		if (aClass118_Sub2_11414 == null) {
			Interface24 interface24 = aClass180_Sub3_11415.anInterface24_2085;
			Class163 class163 = aClass180_Sub3_11415.aClass181_2059.method3544(anInt11413, (byte) -54);
			if (class163 == null)
				return null;
			if (!class163.aBool1779)
				return null;
			if (!interface24.method134(Class609.aClass609_7997, anInt11413, Class591.aClass591_7795, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, 127864234))
				return null;
			int[] is = interface24.method132(Class609.aClass609_7997, anInt11413, 1.0F, class163.anInt1780 * 1039262975, class163.anInt1780 * 1039262975, false, (byte) -88);
			int i = (class163.anInt1780 * 1039262975 * (class163.anInt1780 * 1039262975));
			if (is == null)
				return null;
			for (int i_2_ = 0; i_2_ < 6; i_2_++) {
				anIntArrayArray11416[i_2_] = new int[i];
				System.arraycopy(is, i * i_2_, anIntArrayArray11416[i_2_], 0, i);
			}
			aClass118_Sub2_11414 = new Class118_Sub2(aClass180_Sub3_11415, Class157.aClass157_1728, Class184.aClass184_2104, class163.anInt1780 * 1039262975, class163.aByte1804 != 0, anIntArrayArray11416);
		}
		return aClass118_Sub2_11414;
	}
}
