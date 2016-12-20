/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class252 {
	int[] anIntArray2794;
	int[] anIntArray2795;
	int[] anIntArray2796 = null;
	int[] anIntArray2797;
	int[] anIntArray2798;
	Class241 aClass241_2799;
	int anInt2800;
	int anInt2801;

	void method4673(Class241 class241) {
		aClass241_2799 = class241;
		int i = aClass241_2799.method4402();
		aClass241_2799.method4413(16);
		anInt2801 = (aClass241_2799.method4416() != 0 ? aClass241_2799.method4413(4) + 1 : 1);
		if (aClass241_2799.method4416() != 0) {
			anInt2800 = aClass241_2799.method4413(8) + 1;
			if (anIntArray2794 == null || anIntArray2794.length != anInt2800)
				anIntArray2794 = new int[anInt2800];
			else
				method4674(anIntArray2794);
			if (anIntArray2795 == null || anIntArray2795.length != anInt2800)
				anIntArray2795 = new int[anInt2800];
			else
				method4674(anIntArray2795);
			for (int i_0_ = 0; i_0_ < anInt2800; i_0_++) {
				anIntArray2794[i_0_] = aClass241_2799.method4413(method4676(i - 1));
				anIntArray2795[i_0_] = aClass241_2799.method4413(method4676(i - 1));
			}
		} else
			anInt2800 = 0;
		aClass241_2799.method4413(2);
		if (anInt2801 > 1) {
			anIntArray2796 = new int[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++)
				anIntArray2796[i_1_] = aClass241_2799.method4413(4);
		}
		if (anIntArray2797 == null || anIntArray2797.length != anInt2801)
			anIntArray2797 = new int[anInt2801];
		else
			method4674(anIntArray2797);
		if (anIntArray2798 == null || anIntArray2798.length != anInt2801)
			anIntArray2798 = new int[anInt2801];
		else
			method4674(anIntArray2798);
		for (int i_2_ = 0; i_2_ < anInt2801; i_2_++) {
			aClass241_2799.method4413(8);
			anIntArray2797[i_2_] = aClass241_2799.method4413(8);
			anIntArray2798[i_2_] = aClass241_2799.method4413(8);
		}
	}

	void method4674(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4675(Class241 class241) {
		aClass241_2799 = class241;
		int i = aClass241_2799.method4402();
		aClass241_2799.method4413(16);
		anInt2801 = (aClass241_2799.method4416() != 0 ? aClass241_2799.method4413(4) + 1 : 1);
		if (aClass241_2799.method4416() != 0) {
			anInt2800 = aClass241_2799.method4413(8) + 1;
			if (anIntArray2794 == null || anIntArray2794.length != anInt2800)
				anIntArray2794 = new int[anInt2800];
			else
				method4674(anIntArray2794);
			if (anIntArray2795 == null || anIntArray2795.length != anInt2800)
				anIntArray2795 = new int[anInt2800];
			else
				method4674(anIntArray2795);
			for (int i_3_ = 0; i_3_ < anInt2800; i_3_++) {
				anIntArray2794[i_3_] = aClass241_2799.method4413(method4676(i - 1));
				anIntArray2795[i_3_] = aClass241_2799.method4413(method4676(i - 1));
			}
		} else
			anInt2800 = 0;
		aClass241_2799.method4413(2);
		if (anInt2801 > 1) {
			anIntArray2796 = new int[i];
			for (int i_4_ = 0; i_4_ < i; i_4_++)
				anIntArray2796[i_4_] = aClass241_2799.method4413(4);
		}
		if (anIntArray2797 == null || anIntArray2797.length != anInt2801)
			anIntArray2797 = new int[anInt2801];
		else
			method4674(anIntArray2797);
		if (anIntArray2798 == null || anIntArray2798.length != anInt2801)
			anIntArray2798 = new int[anInt2801];
		else
			method4674(anIntArray2798);
		for (int i_5_ = 0; i_5_ < anInt2801; i_5_++) {
			aClass241_2799.method4413(8);
			anIntArray2797[i_5_] = aClass241_2799.method4413(8);
			anIntArray2798[i_5_] = aClass241_2799.method4413(8);
		}
	}

	int method4676(int i) {
		int i_6_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_6_++;
		return i_6_;
	}

	void method4677(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method4678(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	Class252() {
		/* empty */
	}

	void method4679(Class241 class241) {
		aClass241_2799 = class241;
		int i = aClass241_2799.method4402();
		aClass241_2799.method4413(16);
		anInt2801 = (aClass241_2799.method4416() != 0 ? aClass241_2799.method4413(4) + 1 : 1);
		if (aClass241_2799.method4416() != 0) {
			anInt2800 = aClass241_2799.method4413(8) + 1;
			if (anIntArray2794 == null || anIntArray2794.length != anInt2800)
				anIntArray2794 = new int[anInt2800];
			else
				method4674(anIntArray2794);
			if (anIntArray2795 == null || anIntArray2795.length != anInt2800)
				anIntArray2795 = new int[anInt2800];
			else
				method4674(anIntArray2795);
			for (int i_7_ = 0; i_7_ < anInt2800; i_7_++) {
				anIntArray2794[i_7_] = aClass241_2799.method4413(method4676(i - 1));
				anIntArray2795[i_7_] = aClass241_2799.method4413(method4676(i - 1));
			}
		} else
			anInt2800 = 0;
		aClass241_2799.method4413(2);
		if (anInt2801 > 1) {
			anIntArray2796 = new int[i];
			for (int i_8_ = 0; i_8_ < i; i_8_++)
				anIntArray2796[i_8_] = aClass241_2799.method4413(4);
		}
		if (anIntArray2797 == null || anIntArray2797.length != anInt2801)
			anIntArray2797 = new int[anInt2801];
		else
			method4674(anIntArray2797);
		if (anIntArray2798 == null || anIntArray2798.length != anInt2801)
			anIntArray2798 = new int[anInt2801];
		else
			method4674(anIntArray2798);
		for (int i_9_ = 0; i_9_ < anInt2801; i_9_++) {
			aClass241_2799.method4413(8);
			anIntArray2797[i_9_] = aClass241_2799.method4413(8);
			anIntArray2798[i_9_] = aClass241_2799.method4413(8);
		}
	}

	int method4680(int i) {
		int i_10_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_10_++;
		return i_10_;
	}

	int method4681(int i) {
		int i_11_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_11_++;
		return i_11_;
	}
}
