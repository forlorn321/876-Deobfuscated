/* Class142_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class142_Sub3 extends Class142 {
	Class118_Sub3_Sub1 aClass118_Sub3_Sub1_9382;

	static Class142_Sub3 method14818(Class180_Sub3 class180_sub3, int i, int i_0_, int[] is, int[] is_1_) {
		byte[] is_2_ = new byte[i * i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = i_3_ * i + is[i_3_];
			for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
				is_2_[i_4_++] = (byte) -1;
		}
		return new Class142_Sub3(class180_sub3, i, i_0_, is_2_);
	}

	static Class142_Sub3 method14819(Class180_Sub3 class180_sub3, int i, int i_6_, int[] is, int[] is_7_) {
		byte[] is_8_ = new byte[i * i_6_];
		for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			int i_10_ = i_9_ * i + is[i_9_];
			for (int i_11_ = 0; i_11_ < is_7_[i_9_]; i_11_++)
				is_8_[i_10_++] = (byte) -1;
		}
		return new Class142_Sub3(class180_sub3, i, i_6_, is_8_);
	}

	Class142_Sub3(Class180_Sub3 class180_sub3, int i, int i_12_, byte[] is) {
		aClass118_Sub3_Sub1_9382 = Class118_Sub3_Sub1.method17946(class180_sub3, Class157.aClass157_1724, Class184.aClass184_2104, i, i_12_, false, is, Class157.aClass157_1724);
		aClass118_Sub3_Sub1_9382.method14450(false, false);
	}
}
