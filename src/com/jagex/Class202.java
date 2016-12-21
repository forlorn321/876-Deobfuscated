/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class202 {
	int[] anIntArray2223;
	int[] anIntArray2224;
	int[] anIntArray2225;
	int[] anIntArray2226;
	int[] anIntArray2227;
	int[] anIntArray2228;
	int[] anIntArray2229;

	void method2921(int i) {
		int[][] is = new int[anIntArray2229.length << 1][4];
		for (int i_0_ = 0; i_0_ < anIntArray2229.length; i_0_++) {
			is[i_0_ * 2][0] = anIntArray2229[i_0_];
			is[2 * i_0_][1] = anIntArray2224[i_0_];
			is[2 * i_0_][2] = anIntArray2228[i_0_];
			is[i_0_ * 2][3] = anIntArray2226[i_0_];
			is[1 + i_0_ * 2][0] = anIntArray2227[i_0_];
			is[2 * i_0_ + 1][1] = anIntArray2223[i_0_];
			is[1 + i_0_ * 2][2] = anIntArray2225[i_0_];
			is[1 + i_0_ * 2][3] = anIntArray2226[i_0_];
		}
		client.anIntArrayArrayArray11117[i] = is;
	}

	void method2922(int i, int i_1_) {
		int[][] is = new int[anIntArray2229.length << 1][4];
		for (int i_2_ = 0; i_2_ < anIntArray2229.length; i_2_++) {
			is[i_2_ * 2][0] = anIntArray2229[i_2_];
			is[2 * i_2_][1] = anIntArray2224[i_2_];
			is[2 * i_2_][2] = anIntArray2228[i_2_];
			is[i_2_ * 2][3] = anIntArray2226[i_2_];
			is[1 + i_2_ * 2][0] = anIntArray2227[i_2_];
			is[2 * i_2_ + 1][1] = anIntArray2223[i_2_];
			is[1 + i_2_ * 2][2] = anIntArray2225[i_2_];
			is[1 + i_2_ * 2][3] = anIntArray2226[i_2_];
		}
		client.anIntArrayArrayArray11117[i] = is;
	}

	Class202(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedSmart(1482228482);
		anIntArray2229 = new int[i];
		anIntArray2224 = new int[i];
		anIntArray2228 = new int[i];
		anIntArray2226 = new int[i];
		anIntArray2227 = new int[i];
		anIntArray2223 = new int[i];
		anIntArray2225 = new int[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			anIntArray2229[i_3_] = class536_sub33.readUnsignedShort() - 5120;
			anIntArray2228[i_3_] = class536_sub33.readUnsignedShort() - 5120;
			anIntArray2224[i_3_] = class536_sub33.readShort((byte) -50);
			anIntArray2227[i_3_] = class536_sub33.readUnsignedShort() - 5120;
			anIntArray2225[i_3_] = class536_sub33.readUnsignedShort() - 5120;
			anIntArray2223[i_3_] = class536_sub33.readShort((byte) -123);
			anIntArray2226[i_3_] = class536_sub33.readShort((byte) -86);
		}
	}

	static final void method2923(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class233.method3330(class251, class234, class668, 1391807040);
	}

	static final void method2924(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_5_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class200.method2915(i_4_, i_5_, true, (byte) 124);
	}

	public static String method2925(byte[] is, int i, int i_6_, int i_7_) {
		char[] cs = new char[i_6_];
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			int i_10_ = is[i_9_ + i] & 0xff;
			if (0 != i_10_) {
				if (i_10_ >= 128 && i_10_ < 160) {
					int i_11_ = Class667.aCharArray8534[i_10_ - 128];
					if (0 == i_11_)
						i_11_ = 63;
					i_10_ = i_11_;
				}
				cs[i_8_++] = (char) i_10_;
			}
		}
		return new String(cs, 0, i_8_);
	}

	static final void method2926(Class668 class668, byte i) {
		int i_12_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_12_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_12_ >> 16];
		Class478.method5758(class251, class234, class668, 271704767);
	}

	static final void method2927(Class668 class668, int i) {
		Class412.aClass412_4384.method5009((byte) 49);
	}
}
