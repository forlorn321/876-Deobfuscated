/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;

public class Class332 {
	InputStream anInputStream3612;
	static final int anInt3613 = 11;
	static final int anInt3614 = 2048;
	static final int anInt3615 = 5;
	int anInt3616;
	int anInt3617;
	static final int anInt3618 = -16777216;
	static long aLong3619;

	public final int method4329(int i) throws IOException {
		int i_0_ = 0;
		for (int i_1_ = i; i_1_ != 0; i_1_--) {
			anInt3616 = 846243487 * (-1178274465 * anInt3616 >>> 1);
			int i_2_ = anInt3617 * 1488955855 - -1178274465 * anInt3616 >>> 31;
			anInt3617 -= -890323665 * (-1178274465 * anInt3616 & i_2_ - 1);
			i_0_ = i_0_ << 1 | 1 - i_2_;
			if ((anInt3616 * -1178274465 & ~0xffffff) == 0) {
				anInt3617 = (anInt3617 * 1488955855 << 8 | anInputStream3612.read()) * -890323665;
				anInt3616 = 846243487 * (anInt3616 * -1178274465 << 8);
			}
		}
		return i_0_;
	}

	public final void method4330(int i) {
		anInputStream3612 = null;
	}

	public final void method4331(int i) throws IOException {
		anInt3617 = 0;
		anInt3616 = -846243487;
		for (int i_3_ = 0; i_3_ < 5; i_3_++)
			anInt3617 = (1488955855 * anInt3617 << 8 | anInputStream3612.read()) * -890323665;
	}

	public final int method4332(int i, byte i_4_) throws IOException {
		int i_5_ = 0;
		for (int i_6_ = i; i_6_ != 0; i_6_--) {
			anInt3616 = 846243487 * (-1178274465 * anInt3616 >>> 1);
			int i_7_ = anInt3617 * 1488955855 - -1178274465 * anInt3616 >>> 31;
			anInt3617 -= -890323665 * (-1178274465 * anInt3616 & i_7_ - 1);
			i_5_ = i_5_ << 1 | 1 - i_7_;
			if ((anInt3616 * -1178274465 & ~0xffffff) == 0) {
				anInt3617 = (anInt3617 * 1488955855 << 8 | anInputStream3612.read()) * -890323665;
				anInt3616 = 846243487 * (anInt3616 * -1178274465 << 8);
			}
		}
		return i_5_;
	}

	public int method4333(short[] is, int i, int i_8_) throws IOException {
		int i_9_ = is[i];
		int i_10_ = i_9_ * (-1178274465 * anInt3616 >>> 11);
		if ((1488955855 * anInt3617 ^ ~0x7fffffff) < (i_10_ ^ ~0x7fffffff)) {
			anInt3616 = i_10_ * 846243487;
			is[i] = (short) (i_9_ + (2048 - i_9_ >>> 5));
			if (0 == (anInt3616 * -1178274465 & ~0xffffff)) {
				anInt3617 = (anInt3617 * 1488955855 << 8 | anInputStream3612.read()) * -890323665;
				anInt3616 = (anInt3616 * -1178274465 << 8) * 846243487;
			}
			return 0;
		}
		anInt3616 -= i_10_ * 846243487;
		anInt3617 -= -890323665 * i_10_;
		is[i] = (short) (i_9_ - (i_9_ >>> 5));
		if (0 == (anInt3616 * -1178274465 & ~0xffffff)) {
			anInt3617 = (anInt3617 * 1488955855 << 8 | anInputStream3612.read()) * -890323665;
			anInt3616 = (-1178274465 * anInt3616 << 8) * 846243487;
		}
		return 1;
	}

	public final void method4334() {
		anInputStream3612 = null;
	}

	public final void method4335() {
		anInputStream3612 = null;
	}

	public final void method4336() throws IOException {
		anInt3617 = 0;
		anInt3616 = -846243487;
		for (int i = 0; i < 5; i++)
			anInt3617 = (1488955855 * anInt3617 << 8 | anInputStream3612.read()) * -890323665;
	}

	public final void method4337() throws IOException {
		anInt3617 = 0;
		anInt3616 = -846243487;
		for (int i = 0; i < 5; i++)
			anInt3617 = (1488955855 * anInt3617 << 8 | anInputStream3612.read()) * -890323665;
	}

	public final void method4338(InputStream inputstream, int i) {
		anInputStream3612 = inputstream;
	}

	static final void method4339(Class251 class251, Class234 class234, Class668 class668, byte i) {
		class251.anInt2660 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) * 726833675;
	}
}
