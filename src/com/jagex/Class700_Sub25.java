/* Class700_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class700_Sub25 extends Class700 {
	static final int anInt10885 = 3;
	static final int anInt10886 = 1;
	static final int anInt10887 = -1;
	static final int anInt10888 = 0;

	public Class700_Sub25(Class527_Sub31 class527_sub31) {
		super(class527_sub31);
	}

	public int method17141() {
		return -420933067 * anInt8785;
	}

	public void method17142(int i) {
		if (aClass527_Sub31_8784.method16334(1018646057).method14366(-167464760)) {
			if (-420933067 * anInt8785 < -1 || -420933067 * anInt8785 > 3)
				anInt8785 = method14279((byte) -46) * -380424163;
		} else
			anInt8785 = method14279((byte) 0) * -380424163;
	}

	int method14279(byte i) {
		if (aClass527_Sub31_8784.method16334(1018646057).method14366(-167464760))
			return 0;
		return 1;
	}

	int method14289(int i, int i_0_) {
		return 3;
	}

	void method14287(int i) {
		anInt8785 = -380424163 * i;
	}

	int method14285(int i) {
		return 3;
	}

	public int method17143(byte i) {
		return -420933067 * anInt8785;
	}

	int method14286(int i) {
		return 3;
	}

	public Class700_Sub25(int i, Class527_Sub31 class527_sub31) {
		super(i, class527_sub31);
	}

	void method14281(int i) {
		anInt8785 = -380424163 * i;
	}

	int method14288() {
		if (aClass527_Sub31_8784.method16334(1018646057).method14366(-167464760))
			return 0;
		return 1;
	}

	public void method17144() {
		if (aClass527_Sub31_8784.method16334(1018646057).method14366(-167464760)) {
			if (-420933067 * anInt8785 < -1 || -420933067 * anInt8785 > 3)
				anInt8785 = method14279((byte) -54) * -380424163;
		} else
			anInt8785 = method14279((byte) 40) * -380424163;
	}

	public void method17145() {
		if (aClass527_Sub31_8784.method16334(1018646057).method14366(-167464760)) {
			if (-420933067 * anInt8785 < -1 || -420933067 * anInt8785 > 3)
				anInt8785 = method14279((byte) -30) * -380424163;
		} else
			anInt8785 = method14279((byte) 1) * -380424163;
	}

	public void method17146() {
		if (aClass527_Sub31_8784.method16334(1018646057).method14366(-167464760)) {
			if (-420933067 * anInt8785 < -1 || -420933067 * anInt8785 > 3)
				anInt8785 = method14279((byte) -3) * -380424163;
		} else
			anInt8785 = method14279((byte) 11) * -380424163;
	}

	public int method17147() {
		return -420933067 * anInt8785;
	}

	public int method17148() {
		return -420933067 * anInt8785;
	}

	void method14284(int i, int i_1_) {
		anInt8785 = -380424163 * i;
	}

	static void method17149(int i, int i_2_, int[] is, int[] is_3_, float[] fs, float[] fs_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		int i_12_ = i * i_6_ + i_5_;
		int i_13_ = i_8_ * i_2_ + i_7_;
		int i_14_ = i - i_9_;
		int i_15_ = i_2_ - i_9_;
		if (is == null) {
			for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
				int i_17_ = i_12_ + i_9_;
				while (i_12_ < i_17_)
					fs_4_[i_13_++] = fs[i_12_++];
				i_12_ += i_14_;
				i_13_ += i_15_;
			}
		} else if (fs == null) {
			for (int i_18_ = 0; i_18_ < i_10_; i_18_++) {
				int i_19_ = i_9_ + i_12_;
				while (i_12_ < i_19_)
					is_3_[i_13_++] = is[i_12_++];
				i_12_ += i_14_;
				i_13_ += i_15_;
			}
		} else {
			for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
				int i_21_ = i_9_ + i_12_;
				while (i_12_ < i_21_) {
					is_3_[i_13_] = is[i_12_];
					fs_4_[i_13_++] = fs[i_12_++];
				}
				i_12_ += i_14_;
				i_13_ += i_15_;
			}
		}
	}
}
