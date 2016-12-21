/* Class168_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class168_Sub2 extends Class168 {
	Class167_Sub3 aClass167_Sub3_9716;
	Interface40 anInterface40_9717;

	byte[] method8985(int[] is) {
		byte[] is_0_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
					int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
					if (aClass167_Sub3_9716.anInt9689 == 0) {
						is_0_[i_4_ + 0] = (byte) (i_3_ & 0xff);
						is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
						is_0_[i_4_ + 2] = (byte) (i_3_ >> 16 & 0xff);
						is_0_[i_4_ + 3] = (byte) -1;
					} else {
						is_0_[i_4_ + 0] = (byte) (i_3_ >> 16 & 0xff);
						is_0_[i_4_ + 1] = (byte) (i_3_ >> 8 & 0xff);
						is_0_[i_4_ + 2] = (byte) (i_3_ & 0xff);
						is_0_[i_4_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_0_;
	}

	Class168_Sub2(Class167_Sub3 class167_sub3, int[] is) {
		aClass167_Sub3_9716 = class167_sub3;
		if (aClass167_Sub3_9716.aBool9697) {
			byte[] is_5_ = method8985(is);
			anInterface40_9717 = aClass167_Sub3_9716.method8870(Class155.aClass155_1722, 16, 16, 16, false, is_5_);
		} else
			anInterface40_9717 = aClass167_Sub3_9716.method8771(256, 16, false, is);
	}

	public Interface40 method8986() {
		return anInterface40_9717;
	}
}
