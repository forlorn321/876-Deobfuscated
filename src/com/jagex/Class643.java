/* Class643 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class643 {
	public static Class397 aClass397_8346;

	Class643() throws Throwable {
		throw new Error();
	}

	public static int method10730(byte[] is, int i, CharSequence charsequence) {
		int i_0_ = charsequence.length();
		int i_1_ = i;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = charsequence.charAt(i_2_);
			if (i_3_ <= 127)
				is[i_1_++] = (byte) i_3_;
			else if (i_3_ <= 2047) {
				is[i_1_++] = (byte) (0xc0 | i_3_ >> 6);
				is[i_1_++] = (byte) (0x80 | i_3_ & 0x3f);
			} else {
				is[i_1_++] = (byte) (0xe0 | i_3_ >> 12);
				is[i_1_++] = (byte) (0x80 | i_3_ >> 6 & 0x3f);
				is[i_1_++] = (byte) (0x80 | i_3_ & 0x3f);
			}
		}
		return i_1_ - i;
	}

	public static int method10731(byte[] is, int i, CharSequence charsequence) {
		int i_4_ = charsequence.length();
		int i_5_ = i;
		for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
			int i_7_ = charsequence.charAt(i_6_);
			if (i_7_ <= 127)
				is[i_5_++] = (byte) i_7_;
			else if (i_7_ <= 2047) {
				is[i_5_++] = (byte) (0xc0 | i_7_ >> 6);
				is[i_5_++] = (byte) (0x80 | i_7_ & 0x3f);
			} else {
				is[i_5_++] = (byte) (0xe0 | i_7_ >> 12);
				is[i_5_++] = (byte) (0x80 | i_7_ >> 6 & 0x3f);
				is[i_5_++] = (byte) (0x80 | i_7_ & 0x3f);
			}
		}
		return i_5_ - i;
	}

	public static int method10732(byte[] is, int i, CharSequence charsequence) {
		int i_8_ = charsequence.length();
		int i_9_ = i;
		for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
			int i_11_ = charsequence.charAt(i_10_);
			if (i_11_ <= 127)
				is[i_9_++] = (byte) i_11_;
			else if (i_11_ <= 2047) {
				is[i_9_++] = (byte) (0xc0 | i_11_ >> 6);
				is[i_9_++] = (byte) (0x80 | i_11_ & 0x3f);
			} else {
				is[i_9_++] = (byte) (0xe0 | i_11_ >> 12);
				is[i_9_++] = (byte) (0x80 | i_11_ >> 6 & 0x3f);
				is[i_9_++] = (byte) (0x80 | i_11_ & 0x3f);
			}
		}
		return i_9_ - i;
	}

	public static int method10733(byte[] is, int i, CharSequence charsequence) {
		int i_12_ = charsequence.length();
		int i_13_ = i;
		for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
			int i_15_ = charsequence.charAt(i_14_);
			if (i_15_ <= 127)
				is[i_13_++] = (byte) i_15_;
			else if (i_15_ <= 2047) {
				is[i_13_++] = (byte) (0xc0 | i_15_ >> 6);
				is[i_13_++] = (byte) (0x80 | i_15_ & 0x3f);
			} else {
				is[i_13_++] = (byte) (0xe0 | i_15_ >> 12);
				is[i_13_++] = (byte) (0x80 | i_15_ >> 6 & 0x3f);
				is[i_13_++] = (byte) (0x80 | i_15_ & 0x3f);
			}
		}
		return i_13_ - i;
	}

	public static int method10734(byte[] is, int i, CharSequence charsequence) {
		int i_16_ = charsequence.length();
		int i_17_ = i;
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
			int i_19_ = charsequence.charAt(i_18_);
			if (i_19_ <= 127)
				is[i_17_++] = (byte) i_19_;
			else if (i_19_ <= 2047) {
				is[i_17_++] = (byte) (0xc0 | i_19_ >> 6);
				is[i_17_++] = (byte) (0x80 | i_19_ & 0x3f);
			} else {
				is[i_17_++] = (byte) (0xe0 | i_19_ >> 12);
				is[i_17_++] = (byte) (0x80 | i_19_ >> 6 & 0x3f);
				is[i_17_++] = (byte) (0x80 | i_19_ & 0x3f);
			}
		}
		return i_17_ - i;
	}

	public static String method10735(byte[] is, int i, int i_20_) {
		char[] cs = new char[i_20_];
		int i_21_ = 0;
		int i_22_ = i;
		int i_23_ = i_20_ + i;
		while (i_22_ < i_23_) {
			int i_24_ = is[i_22_++] & 0xff;
			int i_25_;
			if (i_24_ < 128) {
				if (i_24_ == 0)
					i_25_ = 65533;
				else
					i_25_ = i_24_;
			} else if (i_24_ < 192)
				i_25_ = 65533;
			else if (i_24_ < 224) {
				if (i_22_ < i_23_ && 128 == (is[i_22_] & 0xc0)) {
					i_25_ = (i_24_ & 0x1f) << 6 | is[i_22_++] & 0x3f;
					if (i_25_ < 128)
						i_25_ = 65533;
				} else
					i_25_ = 65533;
			} else if (i_24_ < 240) {
				if (1 + i_22_ < i_23_ && (is[i_22_] & 0xc0) == 128 && 128 == (is[i_22_ + 1] & 0xc0)) {
					i_25_ = ((i_24_ & 0xf) << 12 | (is[i_22_++] & 0x3f) << 6 | is[i_22_++] & 0x3f);
					if (i_25_ < 2048)
						i_25_ = 65533;
				} else
					i_25_ = 65533;
			} else if (i_24_ < 248) {
				if (i_22_ + 2 < i_23_ && 128 == (is[i_22_] & 0xc0) && (is[i_22_ + 1] & 0xc0) == 128 && (is[i_22_ + 2] & 0xc0) == 128) {
					i_25_ = ((i_24_ & 0x7) << 18 | (is[i_22_++] & 0x3f) << 12 | (is[i_22_++] & 0x3f) << 6 | is[i_22_++] & 0x3f);
					if (i_25_ < 65536 || i_25_ > 1114111)
						i_25_ = 65533;
					else
						i_25_ = 65533;
				} else
					i_25_ = 65533;
			} else
				i_25_ = 65533;
			cs[i_21_++] = (char) i_25_;
		}
		return new String(cs, 0, i_21_);
	}

	public static void method10736(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, String string, int i_31_) {
		Class522_Sub3 class522_sub3 = new Class522_Sub3();
		class522_sub3.anInt10301 = 824317983 * i;
		class522_sub3.anInt10305 = 1130537237 * i_26_;
		class522_sub3.anInt10302 = i_27_ * -117237429;
		class522_sub3.anInt10304 = (i_29_ + client.anInt11019) * -1434678571;
		class522_sub3.anInt10303 = i_28_ * -156424213;
		class522_sub3.aString10306 = string;
		class522_sub3.anInt10300 = i_30_ * 653834739;
		client.aClass705_11182.method14322(class522_sub3, -2138046455);
	}

	public static void method10737(int i) {
		if ((9 == client.anInt11048 * -1927019389 || 10 == -1927019389 * client.anInt11048) && null != client.aClass109_11067) {
			for (;;) {
				Interface67 interface67 = (Interface67) Class570.aLinkedList7619.poll();
				if (null == interface67)
					break;
				interface67.method421(595145956);
			}
		}
	}

	static final void method10738(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		int i_32_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		i_32_--;
		if (class243.aStringArray2597 == null || i_32_ >= class243.aStringArray2597.length || null == class243.aStringArray2597[i_32_])
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.aStringArray2597[i_32_];
	}
}
