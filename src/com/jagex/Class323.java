/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class323 {
	static final int anInt3564 = 2;
	static final int anInt3565 = 2048;
	static int anInt3566;
	static int[] anIntArray3567 = new int[512];
	static final int anInt3568 = 11;
	static final int anInt3569 = 6;

	static {
		int i = 9;
		for (int i_0_ = i - 1; i_0_ >= 0; i_0_--) {
			int i_1_ = 1 << i - i_0_ - 1;
			int i_2_ = 1 << i - i_0_;
			for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++)
				anIntArray3567[i_3_] = (i_2_ - i_3_ << 6 >>> i - i_0_ - 1) + (i_0_ << 6);
		}
	}

	static boolean method5723(int i) {
		if (Class32.anInt274 * -1552456759 != -1)
			return Class279.method5175(-1539791909);
		return Class308.method5626(Class32.aString289, Class32.aString306, 2048339291);
	}
}
