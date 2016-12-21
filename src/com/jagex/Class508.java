/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class508 {
	static Interface60 anInterface60_6916;
	static int[] anIntArray6917;

	public static boolean method6173() {
		return anInterface60_6916 != null;
	}

	Class508() throws Throwable {
		throw new Error();
	}

	public static int method6174(byte i) {
		return (null == Class575.aTwitchWebcamDeviceArray7674 ? 0 : Class575.aTwitchWebcamDeviceArray7674.length);
	}

	public static String method6175(byte[] is, int i, int i_0_, int i_1_) {
		char[] cs = new char[i_0_];
		int i_2_ = 0;
		int i_3_ = i;
		int i_4_ = i + i_0_;
		while (i_3_ < i_4_) {
			int i_5_ = is[i_3_++] & 0xff;
			int i_6_;
			if (i_5_ < 128) {
				if (i_5_ == 0)
					i_6_ = 65533;
				else
					i_6_ = i_5_;
			} else if (i_5_ < 192)
				i_6_ = 65533;
			else if (i_5_ < 224) {
				if (i_3_ < i_4_ && (is[i_3_] & 0xc0) == 128) {
					i_6_ = (i_5_ & 0x1f) << 6 | is[i_3_++] & 0x3f;
					if (i_6_ < 128)
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else if (i_5_ < 240) {
				if (i_3_ + 1 < i_4_ && 128 == (is[i_3_] & 0xc0) && 128 == (is[1 + i_3_] & 0xc0)) {
					i_6_ = ((i_5_ & 0xf) << 12 | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
					if (i_6_ < 2048)
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else if (i_5_ < 248) {
				if (i_3_ + 2 < i_4_ && (is[i_3_] & 0xc0) == 128 && (is[1 + i_3_] & 0xc0) == 128 && (is[i_3_ + 2] & 0xc0) == 128) {
					i_6_ = ((i_5_ & 0x7) << 18 | (is[i_3_++] & 0x3f) << 12 | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
					if (i_6_ < 65536 || i_6_ > 1114111)
						i_6_ = 65533;
					else
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else
				i_6_ = 65533;
			cs[i_2_++] = (char) i_6_;
		}
		return new String(cs, 0, i_2_);
	}

	static final void method6176(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aBool11188 ? 1 : 0;
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = null == client.aString11186 ? "" : client.aString11186;
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = null == client.aString11185 ? "" : client.aString11185;
	}

	static boolean method6177(byte i) {
		if (Class61.anInt648 * 1234839363 != -1)
			return Class171.method2423(-1593065168);
		return Class54.method945(Class61.aString679, Class61.aString696, 1259840610);
	}

	public static int method6178(CharSequence charsequence, int i, int i_7_) {
		return Class171.method2428(charsequence, i, true, -1328631033);
	}
}
