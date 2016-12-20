/* Class172_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class172_Sub2 extends Class172 {
	Interface41 anInterface41_9380;
	Class180_Sub2 aClass180_Sub2_9381;

	byte[] method14811(int[] is) {
		byte[] is_0_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				for (int i_2_ = 0; i_2_ < 16; i_2_++) {
					int i_3_ = is[256 * i_1_ + 16 * i_2_ + i];
					int i_4_ = (i_2_ * 256 + i_1_ * 16 + i) * 4;
					if (aClass180_Sub2_9381.anInt9578 == 0) {
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

	public Interface41 method14812() {
		return anInterface41_9380;
	}

	byte[] method14813(int[] is) {
		byte[] is_5_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_6_ = 0; i_6_ < 16; i_6_++) {
				for (int i_7_ = 0; i_7_ < 16; i_7_++) {
					int i_8_ = is[256 * i_6_ + 16 * i_7_ + i];
					int i_9_ = (i_7_ * 256 + i_6_ * 16 + i) * 4;
					if (aClass180_Sub2_9381.anInt9578 == 0) {
						is_5_[i_9_ + 0] = (byte) (i_8_ & 0xff);
						is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
						is_5_[i_9_ + 2] = (byte) (i_8_ >> 16 & 0xff);
						is_5_[i_9_ + 3] = (byte) -1;
					} else {
						is_5_[i_9_ + 0] = (byte) (i_8_ >> 16 & 0xff);
						is_5_[i_9_ + 1] = (byte) (i_8_ >> 8 & 0xff);
						is_5_[i_9_ + 2] = (byte) (i_8_ & 0xff);
						is_5_[i_9_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_5_;
	}

	public Interface41 method14814() {
		return anInterface41_9380;
	}

	public Interface41 method14815() {
		return anInterface41_9380;
	}

	public Interface41 method14816() {
		return anInterface41_9380;
	}

	Class172_Sub2(Class180_Sub2 class180_sub2, int[] is) {
		aClass180_Sub2_9381 = class180_sub2;
		if (aClass180_Sub2_9381.aBool9587) {
			byte[] is_10_ = method14813(is);
			anInterface41_9380 = aClass180_Sub2_9381.method15179(Class157.aClass157_1723, 16, 16, 16, false, is_10_);
		} else
			anInterface41_9380 = aClass180_Sub2_9381.method14962(256, 16, false, is);
	}

	byte[] method14817(int[] is) {
		byte[] is_11_ = new byte[16384];
		for (int i = 0; i < 16; i++) {
			for (int i_12_ = 0; i_12_ < 16; i_12_++) {
				for (int i_13_ = 0; i_13_ < 16; i_13_++) {
					int i_14_ = is[256 * i_12_ + 16 * i_13_ + i];
					int i_15_ = (i_13_ * 256 + i_12_ * 16 + i) * 4;
					if (aClass180_Sub2_9381.anInt9578 == 0) {
						is_11_[i_15_ + 0] = (byte) (i_14_ & 0xff);
						is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
						is_11_[i_15_ + 2] = (byte) (i_14_ >> 16 & 0xff);
						is_11_[i_15_ + 3] = (byte) -1;
					} else {
						is_11_[i_15_ + 0] = (byte) (i_14_ >> 16 & 0xff);
						is_11_[i_15_ + 1] = (byte) (i_14_ >> 8 & 0xff);
						is_11_[i_15_ + 2] = (byte) (i_14_ & 0xff);
						is_11_[i_15_ + 3] = (byte) -1;
					}
				}
			}
		}
		return is_11_;
	}
}
