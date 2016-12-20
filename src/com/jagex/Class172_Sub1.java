/* Class172_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class172_Sub1 extends Class172 {
	Class118 aClass118_9248;
	Class180_Sub3 aClass180_Sub3_9249;

	Class118 method14719() {
		return aClass118_9248;
	}

	Class172_Sub1(Class180_Sub3 class180_sub3, int[] is) {
		aClass180_Sub3_9249 = class180_sub3;
		if (aClass180_Sub3_9249.aBool9826) {
			byte[] is_0_ = method14721(is);
			aClass118_9248 = new Class118_Sub4(aClass180_Sub3_9249, Class157.aClass157_1723, Class184.aClass184_2104, 16, 16, 16, is_0_, Class157.aClass157_1723);
		} else
			aClass118_9248 = new Class118_Sub3(aClass180_Sub3_9249, 3553, 256, 16, false, is, 256, 0, false);
	}

	Class118 method14720() {
		return aClass118_9248;
	}

	byte[] method14721(int[] is) {
		byte[] is_1_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_2_ = 0; i_2_ < 16; i_2_++) {
				for (int i_3_ = 0; i_3_ < 16; i_3_++) {
					int i_4_ = is[256 * i_2_ + 16 * i_3_ + i];
					int i_5_ = (i_3_ * 256 + i_2_ * 16 + i) * 4;
					is_1_[i_5_ + 0] = (byte) (i_4_ >> 16 & 0xff);
					is_1_[i_5_ + 1] = (byte) (i_4_ >> 8 & 0xff);
					is_1_[i_5_ + 2] = (byte) (i_4_ & 0xff);
					is_1_[i_5_ + 3] = (byte) -1;
				}
			}
		}
		return is_1_;
	}

	Class118 method14722() {
		return aClass118_9248;
	}
}
