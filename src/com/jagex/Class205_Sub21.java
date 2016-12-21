/* Class205_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub21 extends Class205 {
	int anInt9957;
	static int anInt9958;

	public void method2943() {
		Class193.aClass190Array2179[-1297901435 * anInt9957].method2818((byte) -63);
	}

	public void method2940(int i) {
		Class193.aClass190Array2179[-1297901435 * anInt9957].method2818((byte) -88);
	}

	Class205_Sub21(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9957 = class536_sub33.readUnsignedShort() * -1525112755;
	}

	public void method2942() {
		Class193.aClass190Array2179[-1297901435 * anInt9957].method2818((byte) -46);
	}

	static final void method9095(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 92396219 * class251.anInt2547;
	}

	static void method9096(int i, int i_0_, int[] is, int[] is_1_, float[] fs, float[] fs_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = i_3_ + i_4_ * i;
		int i_11_ = i_0_ * i_6_ + i_5_;
		int i_12_ = i - i_7_;
		int i_13_ = i_0_ - i_7_;
		if (null == is) {
			for (int i_14_ = 0; i_14_ < i_8_; i_14_++) {
				int i_15_ = i_7_ + i_10_;
				while (i_10_ < i_15_)
					fs_2_[i_11_++] = fs[i_10_++];
				i_10_ += i_12_;
				i_11_ += i_13_;
			}
		} else if (fs == null) {
			for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
				int i_17_ = i_10_ + i_7_;
				while (i_10_ < i_17_)
					is_1_[i_11_++] = is[i_10_++];
				i_10_ += i_12_;
				i_11_ += i_13_;
			}
		} else {
			for (int i_18_ = 0; i_18_ < i_8_; i_18_++) {
				int i_19_ = i_10_ + i_7_;
				while (i_10_ < i_19_) {
					is_1_[i_11_] = is[i_10_];
					fs_2_[i_11_++] = fs[i_10_++];
				}
				i_10_ += i_12_;
				i_11_ += i_13_;
			}
		}
	}
}
