/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class453 {
	byte[] aByteArray4965;
	int anInt4966;
	int anInt4967;
	int anInt4968;

	Class453(int i, int i_0_, int i_1_, int i_2_, byte[] is) {
		anInt4966 = i * -1607181295;
		anInt4968 = 555934333 * i_0_;
		anInt4967 = 477433619 * i_1_;
		aByteArray4965 = is;
	}

	public static short method7333(int i, byte i_3_) {
		int i_4_ = i >> 10 & 0x3f;
		int i_5_ = i >> 3 & 0x70;
		int i_6_ = i & 0x7f;
		i_5_ = i_6_ <= 64 ? i_5_ * i_6_ >> 7 : (127 - i_6_) * i_5_ >> 7;
		int i_7_ = i_6_ + i_5_;
		int i_8_;
		if (0 != i_7_)
			i_8_ = (i_5_ << 8) / i_7_;
		else
			i_8_ = i_5_ << 1;
		int i_9_ = i_7_;
		return (short) (i_4_ << 10 | i_8_ >> 4 << 7 | i_9_);
	}

	static final void method7334(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class595.anInt7819 * 1270929943;
	}

	static final void method7335(Class665 class665, byte i) {
		class665.anInt8526 -= 102380841;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18534(-1951750575).method9858(1769813785);
	}

	static final int method7336(int i, int i_10_) {
		return i < 7 ? 9 : 11;
	}
}
