/* Class683 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class683 {
	int anInt8650;
	Class592 aClass592_8651;

	public Class683(Class592 class592, int i) {
		aClass592_8651 = class592;
		anInt8650 = -517188511 * i;
	}

	public Class640_Sub1_Sub5_Sub1 method13910(byte i) {
		Class527_Sub12 class527_sub12 = ((Class527_Sub12) (client.aClass14_11253.method709((long) (aClass592_8651.anInt7797 * -342654447 << 28 | -2029646807 * aClass592_8651.anInt7799 << 14 | aClass592_8651.anInt7798 * 153371143))));
		if (null == class527_sub12)
			return null;
		Class592 class592 = client.aClass509_11072.method8283((short) 6033);
		int i_0_ = (aClass592_8651.anInt7798 * 153371143 - class592.anInt7798 * 153371143);
		int i_1_ = (-2029646807 * aClass592_8651.anInt7799 - class592.anInt7799 * -2029646807);
		if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass509_11072.method8284((byte) 20) && i_1_ < client.aClass509_11072.method8285(1264980865) && client.aClass509_11072.method8314(923837142) != null) {
			for (Class527_Sub22 class527_sub22 = (Class527_Sub22) class527_sub12.aClass694_10444.method14081((short) -2229); class527_sub22 != null; class527_sub22 = ((Class527_Sub22) class527_sub12.aClass694_10444.method14086(-65534))) {
				if (class527_sub22.anInt10494 * -875637783 == anInt8650 * 1563774881)
					return ((Class640_Sub1_Sub5_Sub1) (client.aClass509_11072.method8314(871952168).method9346(-342654447 * aClass592_8651.anInt7797, i_0_, i_1_, -1858290524)));
			}
		}
		return null;
	}

	public static String method13911(long l, int i, boolean bool, Class671 class671, int i_2_) {
		char c = ',';
		char c_3_ = '.';
		if (Class671.aClass671_8572 == class671) {
			c = '.';
			c_3_ = ',';
		}
		if (Class671.aClass671_8573 == class671)
			c_3_ = '\u00a0';
		boolean bool_4_ = false;
		if (l < 0L) {
			bool_4_ = true;
			l = -l;
		}
		StringBuilder stringbuilder = new StringBuilder(26);
		if (i > 0) {
			for (int i_5_ = 0; i_5_ < i; i_5_++) {
				int i_6_ = (int) l;
				l /= 10L;
				stringbuilder.append((char) (48 + i_6_ - (int) l * 10));
			}
			stringbuilder.append(c);
		}
		int i_7_ = 0;
		for (;;) {
			int i_8_ = (int) l;
			l /= 10L;
			stringbuilder.append((char) (i_8_ + 48 - (int) l * 10));
			if (l == 0L)
				break;
			if (bool) {
				i_7_++;
				if (0 == i_7_ % 3)
					stringbuilder.append(c_3_);
			}
		}
		if (bool_4_)
			stringbuilder.append('-');
		return stringbuilder.reverse().toString();
	}

	static final void method13912(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Integer.toString(i_9_);
	}

	static final void method13913(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		Class100.method1771(Class402.aClass180_4150, -932491425);
		Class234.method4351(i, i_10_, i_11_, i_12_, 256, 256, 677473655);
		Class455.method7345(i, i_10_, i_11_, i_12_, 256, 256, 825511047);
		Class194.method3702(i, i_10_, i_11_, i_12_, 256, 256, 1146987905);
		Class430.method6873(i, i_10_, i_11_, i_12_, 16777215);
	}

	static final void method13914(Class665 class665, int i) {
		int i_14_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class671.aClass97_8584.method1743(i_14_, -692090432);
	}
}
