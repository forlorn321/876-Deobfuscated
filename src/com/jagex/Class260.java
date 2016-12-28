/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class260 {
	int[] anIntArray2839;
	static Class2 aClass2_2840;

	public Class260(int[] is) {
		int i;
		for (i = 1; i <= (is.length >> 1) + is.length; i <<= 1) {
			/* empty */
		}
		anIntArray2839 = new int[i + i];
		for (int i_0_ = 0; i_0_ < i + i; i_0_++)
			anIntArray2839[i_0_] = -1;
		for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
			int i_2_;
			for (i_2_ = is[i_1_] & i - 1; anIntArray2839[1 + (i_2_ + i_2_)] != -1; i_2_ = i_2_ + 1 & i - 1) {
				/* empty */
			}
			anIntArray2839[i_2_ + i_2_] = is[i_1_];
			anIntArray2839[1 + (i_2_ + i_2_)] = i_1_;
		}
	}

	public int method3610(int i, int i_3_) {
		int i_4_ = (anIntArray2839.length >> 1) - 1;
		int i_5_ = i & i_4_;
		for (;;) {
			int i_6_ = anIntArray2839[1 + (i_5_ + i_5_)];
			if (i_6_ == -1)
				return -1;
			if (anIntArray2839[i_5_ + i_5_] == i)
				return i_6_;
			i_5_ = 1 + i_5_ & i_4_;
		}
	}

	public int method3611(int i) {
		int i_7_ = (anIntArray2839.length >> 1) - 1;
		int i_8_ = i & i_7_;
		for (;;) {
			int i_9_ = anIntArray2839[1 + (i_8_ + i_8_)];
			if (i_9_ == -1)
				return -1;
			if (anIntArray2839[i_8_ + i_8_] == i)
				return i_9_;
			i_8_ = 1 + i_8_ & i_7_;
		}
	}

	public int method3612(int i) {
		int i_10_ = (anIntArray2839.length >> 1) - 1;
		int i_11_ = i & i_10_;
		for (;;) {
			int i_12_ = anIntArray2839[1 + (i_11_ + i_11_)];
			if (i_12_ == -1)
				return -1;
			if (anIntArray2839[i_11_ + i_11_] == i)
				return i_12_;
			i_11_ = 1 + i_11_ & i_10_;
		}
	}

	public int method3613(int i) {
		int i_13_ = (anIntArray2839.length >> 1) - 1;
		int i_14_ = i & i_13_;
		for (;;) {
			int i_15_ = anIntArray2839[1 + (i_14_ + i_14_)];
			if (i_15_ == -1)
				return -1;
			if (anIntArray2839[i_14_ + i_14_] == i)
				return i_15_;
			i_14_ = 1 + i_14_ & i_13_;
		}
	}

	public static Class177 method3614(Class167 class167, int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		long l = (long) i_19_;
		Class177 class177 = (Class177) Class103.aClass199_1231.method2886(l);
		int i_21_ = 2055;
		if (null == class177) {
			Class180 class180 = Class180.method2708(Class602.aClass461_7857, i_19_, 0);
			if (null == class180)
				return null;
			if (class180.anInt1949 < 13)
				class180.method2707(2);
			class177 = class167.method2093(class180, i_21_, Class223.anInt2335 * -1536067173, 64, 768);
			Class103.aClass199_1231.method2881(class177, l);
		}
		class177 = class177.method2623((byte) 6, i_21_, true);
		if (0 != i)
			class177.method2541(i);
		if (i_16_ != 0)
			class177.method2457(i_16_);
		if (i_17_ != 0)
			class177.method2529(i_17_);
		if (i_18_ != 0)
			class177.method2472(0, i_18_, 0);
		return class177;
	}

	public static void method3615(int i) {
		Class659.aClass637_Sub2_8502.method7626(-2075569651);
		Class659.aClass637_Sub1_8503.method7626(-763016550);
		Class659.aLong8501 = -8021461918566662789L;
		Class659.aBool8504 = true;
	}

	static final void method3616(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		int i_22_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		i_22_--;
		if (null == class251.op || i_22_ >= class251.op.length || class251.op[i_22_] == null)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class251.op[i_22_];
	}

	static final void method3617(Class668 class668, byte i) {
		int i_23_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class639.anIntArray8308[i_23_ & 0xffff];
	}

	static final void method3618(Class668 class668, int i) {
		int i_24_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub15_10766.method8348(i_24_, -1102005131);
	}

	static final void method3619(Class668 class668, byte i) {
		if (2 == Class246.anInt2474 * 155362615)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) 72) * 2607.5945876176133) >> 3;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) client.aFloat11106 >> 3;
	}

	static final void method3620(Class668 class668, int i) {
		class668.anInt8544 -= 1543270475;
		class668.anInt8542 -= 1472892954;
		Class615.method7332((String) (class668.anObjectArray8543[class668.anInt8544 * 366709801]), (String) (class668.anObjectArray8543[366709801 * class668.anInt8544 + 1]), (class668.anIntArray8541[1867269829 * class668.anInt8542]), (class668.anIntArray8541[1867269829 * class668.anInt8542 + 1]) == 1, (String) (class668.anObjectArray8543[2 + 366709801 * class668.anInt8544]), 1900016000);
	}
}
