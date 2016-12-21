/* Class161_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class161_Sub1 extends Class161 {
	Interface36 anInterface36_9385;

	Class161_Sub1(Class167_Sub3 class167_sub3, int i, int i_0_, int[] is) {
		anInterface36_9385 = class167_sub3.method8771(i, i_0_, false, is);
		anInterface36_9385.method222(false, false);
	}

	Class161_Sub1(Class167_Sub3 class167_sub3, int i, int i_1_, byte[] is) {
		anInterface36_9385 = class167_sub3.method8740(Class155.aClass155_1729, i, i_1_, false, is);
		anInterface36_9385.method222(false, false);
	}

	static Class161_Sub1 method8638(Class167_Sub3 class167_sub3, int i, int i_2_, int[] is, int[] is_3_) {
		if (class167_sub3.method8769(Class155.aClass155_1729, Class171.aClass171_1905)) {
			byte[] is_4_ = new byte[i * i_2_];
			for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
				int i_6_ = i_5_ * i + is[i_5_];
				for (int i_7_ = 0; i_7_ < is_3_[i_5_]; i_7_++)
					is_4_[i_6_++] = (byte) -1;
			}
			return new Class161_Sub1(class167_sub3, i, i_2_, is_4_);
		}
		int[] is_8_ = new int[i * i_2_];
		for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
			int i_10_ = i_9_ * i + is[i_9_];
			for (int i_11_ = 0; i_11_ < is_3_[i_9_]; i_11_++)
				is_8_[i_10_++] = -16777216;
		}
		return new Class161_Sub1(class167_sub3, i, i_2_, is_8_);
	}
}
