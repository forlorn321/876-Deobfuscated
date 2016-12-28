/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class62 {
	int anInt699;
	public int anInt700;
	static Class143[] aClass143Array701;

	public void method1044(int i) {
		anInt700 = 400501855 * i;
		anInt699 = 0;
	}

	public boolean method1045(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = -2075065575 * anInt699;
		if (897724319 * anInt700 == i && anInt699 * -2075065575 == 0)
			return false;
		boolean bool;
		if (-2075065575 * anInt699 == 0) {
			if (i > anInt700 * 897724319 && i <= 897724319 * anInt700 + i_0_ || (i < anInt700 * 897724319 && i >= 897724319 * anInt700 - i_0_)) {
				anInt700 = 400501855 * i;
				return false;
			}
			bool = true;
		} else if (anInt699 * -2075065575 > 0 && i > anInt700 * 897724319) {
			int i_4_ = (-2075065575 * anInt699 * (-2075065575 * anInt699) / (i_0_ * 2));
			int i_5_ = anInt700 * 897724319 + i_4_;
			if (i_5_ >= i || i_5_ < anInt700 * 897724319)
				bool = false;
			else
				bool = true;
		} else if (-2075065575 * anInt699 < 0 && i < 897724319 * anInt700) {
			int i_6_ = (-2075065575 * anInt699 * (anInt699 * -2075065575) / (2 * i_0_));
			int i_7_ = 897724319 * anInt700 - i_6_;
			if (i_7_ <= i || i_7_ > anInt700 * 897724319)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 897724319 * anInt700) {
				anInt699 += 640919849 * i_0_;
				if (0 != i_1_ && anInt699 * -2075065575 > i_1_)
					anInt699 = 640919849 * i_1_;
			} else {
				anInt699 -= i_0_ * 640919849;
				if (i_1_ != 0 && anInt699 * -2075065575 < -i_1_)
					anInt699 = 640919849 * -i_1_;
			}
			if (-2075065575 * anInt699 != i_3_) {
				int i_8_ = (anInt699 * -2075065575 * (anInt699 * -2075065575) / (i_0_ * 2));
				if (i > anInt700 * 897724319) {
					if (897724319 * anInt700 + i_8_ > i)
						anInt699 = i_3_ * 640919849;
				} else if (i < 897724319 * anInt700 && 897724319 * anInt700 - i_8_ < i)
					anInt699 = i_3_ * 640919849;
			}
		} else if (-2075065575 * anInt699 > 0) {
			anInt699 -= 640919849 * i_0_;
			if (anInt699 * -2075065575 < 0)
				anInt699 = 0;
		} else {
			anInt699 += 640919849 * i_0_;
			if (-2075065575 * anInt699 > 0)
				anInt699 = 0;
		}
		anInt700 += 400501855 * (i_3_ + anInt699 * -2075065575 >> 1);
		return bool;
	}

	public int method1046() {
		return anInt700 * 897724319 & 0x3fff;
	}

	public int method1047(byte i) {
		return anInt700 * 897724319 & 0x3fff;
	}

	public void method1048(int i) {
		anInt700 = 400501855 * i;
		anInt699 = 0;
	}

	public void method1049(byte i) {
		anInt700 = (anInt700 * 897724319 & 0x3fff) * 400501855;
	}

	public void method1050(int i, int i_9_) {
		anInt700 = 400501855 * i;
		anInt699 = 0;
	}

	public int method1051() {
		return anInt700 * 897724319 & 0x3fff;
	}

	public int method1052() {
		return anInt700 * 897724319 & 0x3fff;
	}

	static int[] method1053(Class536_Sub23 class536_sub23, int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(518);
		int[] is = new int[4];
		for (int i_10_ = 0; i_10_ < 4; i_10_++)
			is[i_10_] = (int) (Math.random() * 9.9999999E7);
		class536_sub33.writeByte(10);
		class536_sub33.writeInt(is[0]);
		class536_sub33.writeInt(is[1]);
		class536_sub33.writeInt(is[2]);
		class536_sub33.writeInt(is[3]);
		for (int i_11_ = 0; i_11_ < 10; i_11_++)
			class536_sub33.writeInt((int) (Math.random() * 9.9999999E7));
		class536_sub33.writeShort((int) (Math.random() * 9.9999999E7), -1778059594);
		class536_sub33.applyRSA(Class72.LOGIN_PUBLIC_EXPONENT, Class72.LOGIN_PUBLIC_MODULUS, -2034700978);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeBytes(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 84);
		return is;
	}

	static final void method1054(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class248.method3446(class251, class234, class668, (short) -29043);
	}

	static final void method1055(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub11_10757.method10023(1187359536);
	}
}
