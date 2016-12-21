/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class238 {
	int[] anIntArray2423;
	int anInt2424;
	int anInt2425;
	Class258 aClass258_2426;
	int[] anIntArray2427;
	int[] anIntArray2428 = null;
	int[] anIntArray2429;
	int[] anIntArray2430;

	void method3356(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	int method3357(int i) {
		int i_0_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_0_++;
		return i_0_;
	}

	Class238() {
		/* empty */
	}

	void method3358(int[] is) {
		if (is != null) {
			for (int i = 0; i < is.length; i++)
				is[i] = 0;
		}
	}

	void method3359(Class258 class258) {
		aClass258_2426 = class258;
		int i = aClass258_2426.method3549();
		aClass258_2426.method3563(16);
		anInt2425 = (aClass258_2426.method3590() != 0 ? aClass258_2426.method3563(4) + 1 : 1);
		if (aClass258_2426.method3590() != 0) {
			anInt2424 = aClass258_2426.method3563(8) + 1;
			if (anIntArray2430 == null || anIntArray2430.length != anInt2424)
				anIntArray2430 = new int[anInt2424];
			else
				method3356(anIntArray2430);
			if (anIntArray2423 == null || anIntArray2423.length != anInt2424)
				anIntArray2423 = new int[anInt2424];
			else
				method3356(anIntArray2423);
			for (int i_1_ = 0; i_1_ < anInt2424; i_1_++) {
				anIntArray2430[i_1_] = aClass258_2426.method3563(method3357(i - 1));
				anIntArray2423[i_1_] = aClass258_2426.method3563(method3357(i - 1));
			}
		} else
			anInt2424 = 0;
		aClass258_2426.method3563(2);
		if (anInt2425 > 1) {
			anIntArray2428 = new int[i];
			for (int i_2_ = 0; i_2_ < i; i_2_++)
				anIntArray2428[i_2_] = aClass258_2426.method3563(4);
		}
		if (anIntArray2429 == null || anIntArray2429.length != anInt2425)
			anIntArray2429 = new int[anInt2425];
		else
			method3356(anIntArray2429);
		if (anIntArray2427 == null || anIntArray2427.length != anInt2425)
			anIntArray2427 = new int[anInt2425];
		else
			method3356(anIntArray2427);
		for (int i_3_ = 0; i_3_ < anInt2425; i_3_++) {
			aClass258_2426.method3563(8);
			anIntArray2429[i_3_] = aClass258_2426.method3563(8);
			anIntArray2427[i_3_] = aClass258_2426.method3563(8);
		}
	}

	int method3360(int i) {
		int i_4_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_4_++;
		return i_4_;
	}

	int method3361(int i) {
		int i_5_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_5_++;
		return i_5_;
	}
}
