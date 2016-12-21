/* Class168_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class168_Sub1 extends Class168 {
	Class124 aClass124_9446;
	Class167_Sub2 aClass167_Sub2_9447;

	byte[] method8672(int[] is) {
		byte[] is_0_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
					int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
					is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
					is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
					is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
					is_0_[i_4_ + 3] = (byte) -1;
				}
			}
		}
		return is_0_;
	}

	Class124 method8673() {
		return aClass124_9446;
	}

	Class168_Sub1(Class167_Sub2 class167_sub2, int[] is) {
		aClass167_Sub2_9447 = class167_sub2;
		if (aClass167_Sub2_9447.aBool9230) {
			byte[] is_5_ = method8672(is);
			aClass124_9446 = new Class124_Sub2(aClass167_Sub2_9447, Class155.aClass155_1722, Class171.aClass171_1905, 16, 16, 16, is_5_, Class155.aClass155_1722);
		} else
			aClass124_9446 = new Class124_Sub1(aClass167_Sub2_9447, 3553, 256, 16, false, is, 256, 0, false);
	}
}
