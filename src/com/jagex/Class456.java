/* Class456 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.EOFException;

public class Class456 {
	static Class456 aClass456_5155;
	public static Class456 aClass456_5156 = new Class456(0);
	int anInt5157;

	static {
		aClass456_5155 = new Class456(1);
	}

	Class456(int i) {
		anInt5157 = -1799398425 * i;
	}

	static final void method5482(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1873552861 * client.anInt10997 - 1037490133 * client.anInt11111;
	}

	public static Class66 method5483(int i) {
		Class6 class6 = null;
		try {
			Class66 class66;
			try {
				class6 = Class153_Sub1.method8383("3", (client.aClass670_11043.aString8573), false, 1874694687);
				byte[] is = new byte[(int) class6.method586(917143623)];
				int i_0_;
				for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
					i_0_ = class6.method587(is, i_1_, is.length - i_1_, -2073846251);
					if (-1 == i_0_)
						throw new EOFException();
				}
				class66 = new Class66(new RSByteBuffer(is));
			} catch (Exception exception) {
				Class66 class66_2_ = new Class66();
				try {
					if (class6 != null)
						class6.method585(-1411037171);
				} catch (Exception exception_3_) {
					/* empty */
				}
				return class66_2_;
			}
			try {
				if (class6 != null)
					class6.method585(-1411037171);
			} catch (Exception exception) {
				/* empty */
			}
			return class66;
		} catch (Exception object) {
			try {
				if (class6 != null)
					class6.method585(-1411037171);
			} catch (Exception exception) {
				/* empty */
			}
			throw object;
		}
	}

	static final void method5484(Class668 class668, byte i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3301(i_4_, (byte) 36).method3154((byte) -26);
	}
}
