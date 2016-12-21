/* Class541 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class541 {
	short[] aShortArray7162;
	Class540 this$1;

	void method6522(int i) {
		Class263.method3666(aShortArray7162, (byte) -52);
	}

	Class541(Class540 class540) {
		this$1 = class540;
		aShortArray7162 = new short[768];
	}

	byte method6523(Class332 class332, byte i, int i_0_) throws IOException {
		int i_1_ = 1;
		do {
			int i_2_ = i >> 7 & 0x1;
			i <<= 1;
			int i_3_ = class332.method4333(aShortArray7162, i_1_ + (i_2_ + 1 << 8), -1027620292);
			i_1_ = i_1_ << 1 | i_3_;
			if (i_3_ != i_2_) {
				for (/**/; i_1_ < 256; i_1_ = i_1_ << 1 | class332.method4333(aShortArray7162, i_1_, 541096676)) {
					/* empty */
				}
				break;
			}
		} while (i_1_ < 256);
		return (byte) i_1_;
	}

	void method6524() {
		Class263.method3666(aShortArray7162, (byte) -75);
	}

	void method6525() {
		Class263.method3666(aShortArray7162, (byte) -44);
	}

	byte method6526(Class332 class332, int i) throws IOException {
		int i_4_ = 1;
		do
			i_4_ = i_4_ << 1 | class332.method4333(aShortArray7162, i_4_, -2010873379);
		while (i_4_ < 256);
		return (byte) i_4_;
	}

	static final void method6527(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.anIntArray8537[class668.anInt8564 * -1640738851];
	}

	static final void method6528(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_5_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_5_ >> 16];
		Class512.method6218(class251, class234, class668, (short) -2147);
	}

	static final void method6529(Class668 class668, int i) {
		Class486.method5860(711647330);
	}

	static Class method6530(String string, int i) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	public static void method6531(int i) {
		Class536_Sub8.aClass143_10432 = null;
		Class101.anInt1201 = 1861762603;
	}
}
