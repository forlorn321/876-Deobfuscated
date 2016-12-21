/* Class161_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class161_Sub3 extends Class161 {
	Class124_Sub1_Sub1 aClass124_Sub1_Sub1_9525;

	Class161_Sub3(Class167_Sub2 class167_sub2, int i, int i_0_, byte[] is) {
		aClass124_Sub1_Sub1_9525 = Class124_Sub1_Sub1.method10528(class167_sub2, Class155.aClass155_1729, Class171.aClass171_1905, i, i_0_, false, is, Class155.aClass155_1729);
		aClass124_Sub1_Sub1_9525.method8394(false, false);
	}

	static Class161_Sub3 method8706(Class167_Sub2 class167_sub2, int i, int i_1_, int[] is, int[] is_2_) {
		byte[] is_3_ = new byte[i * i_1_];
		for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
			int i_5_ = i_4_ * i + is[i_4_];
			for (int i_6_ = 0; i_6_ < is_2_[i_4_]; i_6_++)
				is_3_[i_5_++] = (byte) -1;
		}
		return new Class161_Sub3(class167_sub2, i, i_1_, is_3_);
	}
}
