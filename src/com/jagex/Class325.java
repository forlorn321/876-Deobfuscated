/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;

public class Class325 {
	static final int anInt3570 = 5;
	InputStream anInputStream3571;
	static final int anInt3572 = 2048;
	static final int anInt3573 = 11;
	int anInt3574;
	int anInt3575;
	static final int anInt3576 = -16777216;

	public final void method5730(InputStream inputstream) {
		anInputStream3571 = inputstream;
	}

	public final void method5731(InputStream inputstream, int i) {
		anInputStream3571 = inputstream;
	}

	public final void method5732(InputStream inputstream) {
		anInputStream3571 = inputstream;
	}

	public final void method5733(int i) throws IOException {
		anInt3575 = 0;
		anInt3574 = -63857179;
		for (int i_0_ = 0; i_0_ < 5; i_0_++)
			anInt3575 = (-2141405859 * anInt3575 << 8 | anInputStream3571.read()) * -561545483;
	}

	public final int method5734(int i, int i_1_) throws IOException {
		int i_2_ = 0;
		for (int i_3_ = i; i_3_ != 0; i_3_--) {
			anInt3574 = (-759715821 * anInt3574 >>> 1) * 63857179;
			int i_4_ = anInt3575 * -2141405859 - anInt3574 * -759715821 >>> 31;
			anInt3575 -= -561545483 * (anInt3574 * -759715821 & i_4_ - 1);
			i_2_ = i_2_ << 1 | 1 - i_4_;
			if (0 == (-759715821 * anInt3574 & ~0xffffff)) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = 63857179 * (anInt3574 * -759715821 << 8);
			}
		}
		return i_2_;
	}

	public int method5735(short[] is, int i, int i_5_) throws IOException {
		int i_6_ = is[i];
		int i_7_ = (-759715821 * anInt3574 >>> 11) * i_6_;
		if ((anInt3575 * -2141405859 ^ ~0x7fffffff) < (i_7_ ^ ~0x7fffffff)) {
			anInt3574 = 63857179 * i_7_;
			is[i] = (short) ((2048 - i_6_ >>> 5) + i_6_);
			if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = (-759715821 * anInt3574 << 8) * 63857179;
			}
			return 0;
		}
		anInt3574 -= i_7_ * 63857179;
		anInt3575 -= i_7_ * -561545483;
		is[i] = (short) (i_6_ - (i_6_ >>> 5));
		if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
			anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
			anInt3574 = (anInt3574 * -759715821 << 8) * 63857179;
		}
		return 1;
	}

	public final int method5736(int i) throws IOException {
		int i_8_ = 0;
		for (int i_9_ = i; i_9_ != 0; i_9_--) {
			anInt3574 = (-759715821 * anInt3574 >>> 1) * 63857179;
			int i_10_ = anInt3575 * -2141405859 - anInt3574 * -759715821 >>> 31;
			anInt3575 -= -561545483 * (anInt3574 * -759715821 & i_10_ - 1);
			i_8_ = i_8_ << 1 | 1 - i_10_;
			if (0 == (-759715821 * anInt3574 & ~0xffffff)) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = 63857179 * (anInt3574 * -759715821 << 8);
			}
		}
		return i_8_;
	}

	public final int method5737(int i) throws IOException {
		int i_11_ = 0;
		for (int i_12_ = i; i_12_ != 0; i_12_--) {
			anInt3574 = (-759715821 * anInt3574 >>> 1) * 63857179;
			int i_13_ = anInt3575 * -2141405859 - anInt3574 * -759715821 >>> 31;
			anInt3575 -= -561545483 * (anInt3574 * -759715821 & i_13_ - 1);
			i_11_ = i_11_ << 1 | 1 - i_13_;
			if (0 == (-759715821 * anInt3574 & ~0xffffff)) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = 63857179 * (anInt3574 * -759715821 << 8);
			}
		}
		return i_11_;
	}

	public final int method5738(int i) throws IOException {
		int i_14_ = 0;
		for (int i_15_ = i; i_15_ != 0; i_15_--) {
			anInt3574 = (-759715821 * anInt3574 >>> 1) * 63857179;
			int i_16_ = anInt3575 * -2141405859 - anInt3574 * -759715821 >>> 31;
			anInt3575 -= -561545483 * (anInt3574 * -759715821 & i_16_ - 1);
			i_14_ = i_14_ << 1 | 1 - i_16_;
			if (0 == (-759715821 * anInt3574 & ~0xffffff)) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = 63857179 * (anInt3574 * -759715821 << 8);
			}
		}
		return i_14_;
	}

	public int method5739(short[] is, int i) throws IOException {
		int i_17_ = is[i];
		int i_18_ = (-759715821 * anInt3574 >>> 11) * i_17_;
		if ((anInt3575 * -2141405859 ^ ~0x7fffffff) < (i_18_ ^ ~0x7fffffff)) {
			anInt3574 = 63857179 * i_18_;
			is[i] = (short) ((2048 - i_17_ >>> 5) + i_17_);
			if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = (-759715821 * anInt3574 << 8) * 63857179;
			}
			return 0;
		}
		anInt3574 -= i_18_ * 63857179;
		anInt3575 -= i_18_ * -561545483;
		is[i] = (short) (i_17_ - (i_17_ >>> 5));
		if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
			anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
			anInt3574 = (anInt3574 * -759715821 << 8) * 63857179;
		}
		return 1;
	}

	public final void method5740(int i) {
		anInputStream3571 = null;
	}

	public final int method5741(int i) throws IOException {
		int i_19_ = 0;
		for (int i_20_ = i; i_20_ != 0; i_20_--) {
			anInt3574 = (-759715821 * anInt3574 >>> 1) * 63857179;
			int i_21_ = anInt3575 * -2141405859 - anInt3574 * -759715821 >>> 31;
			anInt3575 -= -561545483 * (anInt3574 * -759715821 & i_21_ - 1);
			i_19_ = i_19_ << 1 | 1 - i_21_;
			if (0 == (-759715821 * anInt3574 & ~0xffffff)) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = 63857179 * (anInt3574 * -759715821 << 8);
			}
		}
		return i_19_;
	}

	public final int method5742(int i) throws IOException {
		int i_22_ = 0;
		for (int i_23_ = i; i_23_ != 0; i_23_--) {
			anInt3574 = (-759715821 * anInt3574 >>> 1) * 63857179;
			int i_24_ = anInt3575 * -2141405859 - anInt3574 * -759715821 >>> 31;
			anInt3575 -= -561545483 * (anInt3574 * -759715821 & i_24_ - 1);
			i_22_ = i_22_ << 1 | 1 - i_24_;
			if (0 == (-759715821 * anInt3574 & ~0xffffff)) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = 63857179 * (anInt3574 * -759715821 << 8);
			}
		}
		return i_22_;
	}

	public final void method5743() throws IOException {
		anInt3575 = 0;
		anInt3574 = -63857179;
		for (int i = 0; i < 5; i++)
			anInt3575 = (-2141405859 * anInt3575 << 8 | anInputStream3571.read()) * -561545483;
	}

	public final void method5744(InputStream inputstream) {
		anInputStream3571 = inputstream;
	}

	public int method5745(short[] is, int i) throws IOException {
		int i_25_ = is[i];
		int i_26_ = (-759715821 * anInt3574 >>> 11) * i_25_;
		if ((anInt3575 * -2141405859 ^ ~0x7fffffff) < (i_26_ ^ ~0x7fffffff)) {
			anInt3574 = 63857179 * i_26_;
			is[i] = (short) ((2048 - i_25_ >>> 5) + i_25_);
			if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = (-759715821 * anInt3574 << 8) * 63857179;
			}
			return 0;
		}
		anInt3574 -= i_26_ * 63857179;
		anInt3575 -= i_26_ * -561545483;
		is[i] = (short) (i_25_ - (i_25_ >>> 5));
		if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
			anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
			anInt3574 = (anInt3574 * -759715821 << 8) * 63857179;
		}
		return 1;
	}

	public int method5746(short[] is, int i) throws IOException {
		int i_27_ = is[i];
		int i_28_ = (-759715821 * anInt3574 >>> 11) * i_27_;
		if ((anInt3575 * -2141405859 ^ ~0x7fffffff) < (i_28_ ^ ~0x7fffffff)) {
			anInt3574 = 63857179 * i_28_;
			is[i] = (short) ((2048 - i_27_ >>> 5) + i_27_);
			if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = (-759715821 * anInt3574 << 8) * 63857179;
			}
			return 0;
		}
		anInt3574 -= i_28_ * 63857179;
		anInt3575 -= i_28_ * -561545483;
		is[i] = (short) (i_27_ - (i_27_ >>> 5));
		if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
			anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
			anInt3574 = (anInt3574 * -759715821 << 8) * 63857179;
		}
		return 1;
	}

	public int method5747(short[] is, int i) throws IOException {
		int i_29_ = is[i];
		int i_30_ = (-759715821 * anInt3574 >>> 11) * i_29_;
		if ((anInt3575 * -2141405859 ^ ~0x7fffffff) < (i_30_ ^ ~0x7fffffff)) {
			anInt3574 = 63857179 * i_30_;
			is[i] = (short) ((2048 - i_29_ >>> 5) + i_29_);
			if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
				anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
				anInt3574 = (-759715821 * anInt3574 << 8) * 63857179;
			}
			return 0;
		}
		anInt3574 -= i_30_ * 63857179;
		anInt3575 -= i_30_ * -561545483;
		is[i] = (short) (i_29_ - (i_29_ >>> 5));
		if ((-759715821 * anInt3574 & ~0xffffff) == 0) {
			anInt3575 = (anInt3575 * -2141405859 << 8 | anInputStream3571.read()) * -561545483;
			anInt3574 = (anInt3574 * -759715821 << 8) * 63857179;
		}
		return 1;
	}

	public static void method5748(short[] is) {
		for (int i = 0; i < is.length; i++)
			is[i] = (short) 1024;
	}

	public static void method5749(short[] is) {
		for (int i = 0; i < is.length; i++)
			is[i] = (short) 1024;
	}

	public static void method5750(int i, String string, boolean bool, int i_31_) {
		if (Class144.method2386(-215172206)) {
			if (i != -1552456759 * Class32.anInt274)
				Class32.aLong321 = -2730100241404364287L;
			Class32.anInt274 = -1833818503 * i;
			Class32.aString318 = string;
			Class32.aBool271 = bool;
			Class78.method1560(3, (byte) 0);
		}
	}

	static final void method5751(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class468.method7689(class243, class240, class665, (byte) 67);
	}

	public static void method5752(String[] strings, int[] is, int i) {
		Class532.method8924(strings, is, 0, strings.length - 1, -711640158);
	}

	public static String method5753(byte[] is, int i, int i_32_, byte i_33_) {
		char[] cs = new char[i_32_];
		int i_34_ = 0;
		int i_35_ = i;
		int i_36_ = i_32_ + i;
		while (i_35_ < i_36_) {
			int i_37_ = is[i_35_++] & 0xff;
			int i_38_;
			if (i_37_ < 128) {
				if (i_37_ == 0)
					i_38_ = 65533;
				else
					i_38_ = i_37_;
			} else if (i_37_ < 192)
				i_38_ = 65533;
			else if (i_37_ < 224) {
				if (i_35_ < i_36_ && 128 == (is[i_35_] & 0xc0)) {
					i_38_ = (i_37_ & 0x1f) << 6 | is[i_35_++] & 0x3f;
					if (i_38_ < 128)
						i_38_ = 65533;
				} else
					i_38_ = 65533;
			} else if (i_37_ < 240) {
				if (1 + i_35_ < i_36_ && (is[i_35_] & 0xc0) == 128 && 128 == (is[i_35_ + 1] & 0xc0)) {
					i_38_ = ((i_37_ & 0xf) << 12 | (is[i_35_++] & 0x3f) << 6 | is[i_35_++] & 0x3f);
					if (i_38_ < 2048)
						i_38_ = 65533;
				} else
					i_38_ = 65533;
			} else if (i_37_ < 248) {
				if (i_35_ + 2 < i_36_ && 128 == (is[i_35_] & 0xc0) && (is[i_35_ + 1] & 0xc0) == 128 && (is[i_35_ + 2] & 0xc0) == 128) {
					i_38_ = ((i_37_ & 0x7) << 18 | (is[i_35_++] & 0x3f) << 12 | (is[i_35_++] & 0x3f) << 6 | is[i_35_++] & 0x3f);
					if (i_38_ < 65536 || i_38_ > 1114111)
						i_38_ = 65533;
					else
						i_38_ = 65533;
				} else
					i_38_ = 65533;
			} else
				i_38_ = 65533;
			cs[i_34_++] = (char) i_38_;
		}
		return new String(cs, 0, i_34_);
	}
}
