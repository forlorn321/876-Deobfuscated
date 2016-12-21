/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

class Class477 implements Interface45 {
	Class492 this$0;
	static int anInt5382;

	public void method332(byte i) {
		this$0.method5902(true, -822288670);
	}

	Class477(Class492 class492) {
		this$0 = class492;
	}

	public void method296() {
		this$0.method5902(true, -822288670);
	}

	static final void method5750(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (-792902757 * client.aClass485ArrayArray11266[i_1_][i_0_].anInt5442);
	}

	public static void method5751(byte i) {
		if (Class223.aFrame2336 == null) {
			int i_2_ = 1509041125 * client.anInt6887;
			int i_3_ = -1413419225 * client.anInt6863;
			int i_4_ = (Class500.anInt6841 * 569699291 - -1804846931 * Class144.anInt1679 - i_2_);
			int i_5_ = (160996593 * Class313.anInt3499 - Class34_Sub6.anInt10965 * 589116499 - i_3_);
			if (i_2_ > 0 || i_4_ > 0 || i_3_ > 0 || i_5_ > 0) {
				try {
					Container container = Class300.method4022((byte) 0);
					int i_6_ = 0;
					int i_7_ = 0;
					if (Class145.aFrame1692 == container) {
						Insets insets = Class145.aFrame1692.getInsets();
						i_6_ = insets.left;
						i_7_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_2_ > 0)
						graphics.fillRect(i_6_, i_7_, i_2_, Class313.anInt3499 * 160996593);
					if (i_3_ > 0)
						graphics.fillRect(i_6_, i_7_, 569699291 * Class500.anInt6841, i_3_);
					if (i_4_ > 0)
						graphics.fillRect((Class500.anInt6841 * 569699291 + i_6_ - i_4_), i_7_, i_4_, Class313.anInt3499 * 160996593);
					if (i_5_ > 0)
						graphics.fillRect(i_6_, (i_7_ + 160996593 * Class313.anInt3499 - i_5_), Class500.anInt6841 * 569699291, i_5_);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}

	static Class67_Sub1 method5752(int i) {
		Class67_Sub1 class67_sub1 = new Class67_Sub1();
		boolean bool = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		if (Class241.aString2456.startsWith("win")) {
			bool_8_ = true;
			bool = true;
			bool_9_ = true;
		} else {
			bool = true;
			bool_9_ = true;
		}
		if (Class111.aBool1387) {
			class67_sub1.method9792(16, -533486546);
			bool = false;
		}
		if (Class111.aBool1389) {
			class67_sub1.method9792(32, -1350800136);
			bool_8_ = false;
		}
		if (Class111.aBool1388) {
			class67_sub1.method9792(16384, 277852119);
			bool_9_ = false;
		}
		if (!bool && !bool_8_) {
			Class144.method1796(class67_sub1, (byte) -1);
			return class67_sub1;
		}
		int i_10_ = -1;
		int i_11_ = -1;
		int i_12_ = -1;
		if (bool_8_) {
			try {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 3, (byte) 1);
				Class27.method763(2085981023);
				i_11_ = Class458_Sub1.method9334(3, 1000, (byte) -123);
				if (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(681372852) == 3) {
					class67_sub1.method9792(4, -631431786);
					Class145 class145 = Class677.aClass167_8609.method2001();
					long l = (class145.aLong1688 * -1138482170592229701L & 0xffffffffffffL);
					switch (-808026883 * class145.anInt1687) {
					case 4318: {
						boolean bool_13_ = l >= 64425238954L;
						bool &= bool_13_;
						if (!bool_13_)
							class67_sub1.method9792(256, 533048652);
						break;
					}
					case 4098: {
						boolean bool_14_ = l >= 60129613779L;
						bool &= bool_14_;
						if (!bool_14_)
							class67_sub1.method9792(512, -1322180715);
						break;
					}
					}
				}
			} catch (Exception exception) {
				class67_sub1.method9792(4096, -473655768);
			}
		}
		if (bool_9_) {
			try {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 5, (byte) 1);
				Class27.method763(2104119533);
				i_12_ = Class458_Sub1.method9334(5, 1000, (byte) -28);
				if (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(723920365) == 5)
					class67_sub1.method9792(8192, -542846325);
			} catch (Exception exception) {
				class67_sub1.method9792(32768, 596303013);
			}
		}
		if (bool) {
			try {
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 4, (byte) 1);
				Class27.method763(2027114927);
				i_10_ = Class458_Sub1.method9334(1, 1000, (byte) -96);
				if (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(1455330871) == 1)
					class67_sub1.method9792(2, 807774330);
			} catch (Exception exception) {
				class67_sub1.method9792(2048, 250319035);
			}
		}
		Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 0, (byte) 1);
		if (i_10_ == -1 && -1 == i_11_) {
			Class144.method1796(class67_sub1, (byte) -1);
			return class67_sub1;
		}
		class67_sub1.method9795(3, i_11_, (byte) 82);
		class67_sub1.method9795(1, i_10_, (byte) 59);
		class67_sub1.method9795(5, i_12_, (byte) 114);
		i_11_ *= 1.3F;
		if (i_11_ > 100000 && i_10_ > 100000 || i_11_ > i_10_)
			Class645.method7806(class67_sub1, 3, -1 == i_10_ ? i_11_ : i_10_, 907347924);
		else
			Class645.method7806(class67_sub1, 1, -1 == i_11_ ? i_10_ : i_11_, 1333859779);
		return class67_sub1;
	}
}
