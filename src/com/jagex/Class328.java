/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class328 implements Interface6 {
	Class459 aClass459_3601;

	public Interface14 method52(int i, Interface13 interface13) {
		return new Class322(i, aClass459_3601);
	}

	public Interface14 method58(int i, Interface13 interface13, int i_0_) {
		return new Class322(i, aClass459_3601);
	}

	public Interface14 method56(int i, Interface13 interface13) {
		return new Class322(i, aClass459_3601);
	}

	public Class method57() {
		return com.jagex.Class322.class;
	}

	public Interface14 method54(int i, Interface13 interface13) {
		return new Class322(i, aClass459_3601);
	}

	Class328(Class459 class459) {
		aClass459_3601 = class459;
	}

	public Class method53(byte i) {
		return com.jagex.Class322.class;
	}

	public Class method55() {
		return com.jagex.Class322.class;
	}

	public Class method59() {
		return com.jagex.Class322.class;
	}

	static void method5804(int[] is, float[] fs, float[] fs_1_, int i, int i_2_, int i_3_) {
		if (i < i_2_) {
			int i_4_ = (i_2_ + i) / 2;
			int i_5_ = i;
			int i_6_ = is[i_4_];
			is[i_4_] = is[i_2_];
			is[i_2_] = i_6_;
			float f = fs[i_4_];
			fs[i_4_] = fs[i_2_];
			fs[i_2_] = f;
			float f_7_ = fs_1_[i_4_];
			fs_1_[i_4_] = fs_1_[i_2_];
			fs_1_[i_2_] = f_7_;
			int i_8_ = 9223372036854775807L == (long) i_6_ ? 0 : 1;
			for (int i_9_ = i; i_9_ < i_2_; i_9_++) {
				if (is[i_9_] < i_6_ + (i_9_ & i_8_)) {
					int i_10_ = is[i_9_];
					is[i_9_] = is[i_5_];
					is[i_5_] = i_10_;
					float f_11_ = fs[i_9_];
					fs[i_9_] = fs[i_5_];
					fs[i_5_] = f_11_;
					float f_12_ = fs_1_[i_9_];
					fs_1_[i_9_] = fs_1_[i_5_];
					fs_1_[i_5_] = f_12_;
					i_5_++;
				}
			}
			is[i_2_] = is[i_5_];
			is[i_5_] = i_6_;
			fs[i_2_] = fs[i_5_];
			fs[i_5_] = f;
			fs_1_[i_2_] = fs_1_[i_5_];
			fs_1_[i_5_] = f_7_;
			method5804(is, fs, fs_1_, i, i_5_ - 1, 1915316040);
			method5804(is, fs, fs_1_, 1 + i_5_, i_2_, 1996409981);
		}
	}

	static final void method5805(Class665 class665, int i) {
		int i_13_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_13_, 656288844);
		Class509.method8422(class243, class665, (byte) 42);
	}

	static final void method5806(Class665 class665, int i) throws Exception_Sub6 {
		class665.anInt8526 -= 307142523;
		Class208_Sub10.aClass296_Sub1_9923.method5498((float) class665.anIntArray8525[1769813785 * class665.anInt8526], (float) (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]), (float) (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2]), 1380045437);
	}

	static final void method5807(Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		int i_14_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_15_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_16_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2];
		int i_17_ = class665.anIntArray8525[3 + 1769813785 * class665.anInt8526];
		i_14_ += i_15_ << 14;
		i_14_ += i_16_ << 28;
		i_14_ += i_17_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_14_;
	}

	static int method5808(byte i) {
		return (Class264.anInt2872 += -1198047041) * -2028196033 - 1;
	}
}
