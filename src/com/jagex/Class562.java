/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class562 {
	static final int anInt7545 = 7;
	public Class536_Sub19 aClass536_Sub19_7546;
	static final int anInt7547 = 2;
	static final int anInt7548 = 3;
	static final int anInt7549 = 4;
	public static final int anInt7550 = 0;
	static final int anInt7551 = 1;
	int anInt7552;
	static final int anInt7553 = 4;
	static final int anInt7554 = 5;
	static final int anInt7555 = 15;
	static final int anInt7556 = 5;
	static final int anInt7557 = 8;
	static final int anInt7558 = 16;
	static final int anInt7559 = 10;
	static final int anInt7560 = 11;
	static final int anInt7561 = 12;
	static final int anInt7562 = 13;
	boolean aBool7563;
	static final int anInt7564 = 3;
	int anInt7565 = -1154972407;
	public static final int anInt7566 = 31;
	static final int anInt7567 = 9;
	static final int anInt7568 = 14;
	boolean aBool7569;
	public int anInt7570;
	short[] aShortArray7571;
	public int anInt7572;
	int anInt7573;
	int anInt7574;
	int anInt7575;
	static final int anInt7576 = 6;
	int anInt7577;
	static final int anInt7578 = 2;

	public Class562(Class167 class167, int i, RSByteBuffer class536_sub33, int i_0_) {
		if (null == Class34_Sub22.anIntArray10982)
			Class504.method6076(-1422444650);
		anInt7570 = class536_sub33.readUnsignedByte() * 917894701;
		aBool7569 = 0 != (anInt7570 * -2071213659 & 0x8);
		aBool7563 = (-2071213659 * anInt7570 & 0x10) != 0;
		anInt7570 = (anInt7570 * -2071213659 & 0x7) * 917894701;
		int i_1_ = class536_sub33.readUnsignedShort() << i_0_;
		int i_2_ = class536_sub33.readUnsignedShort() << i_0_;
		int i_3_ = class536_sub33.readUnsignedShort() << i_0_;
		int i_4_ = class536_sub33.readUnsignedByte();
		int i_5_ = 1 + i_4_ * 2;
		aShortArray7571 = new short[i_5_];
		for (int i_6_ = 0; i_6_ < aShortArray7571.length; i_6_++) {
			int i_7_ = (short) class536_sub33.readUnsignedShort();
			int i_8_ = i_7_ >>> 8;
			int i_9_ = i_7_ & 0xff;
			if (i_8_ >= i_5_)
				i_8_ = i_5_ - 1;
			if (i_9_ > i_5_ - i_8_)
				i_9_ = i_5_ - i_8_;
			aShortArray7571[i_6_] = (short) (i_8_ << 8 | i_9_);
		}
		i_4_ = (i_4_ << i) + (1 << i >> 1);
		int i_10_ = (Class639.anIntArray8309 != null ? (Class639.anIntArray8309[class536_sub33.readUnsignedShort()]) : (Class639.anIntArray8308[Class254.method3537(class536_sub33.readUnsignedShort(), 1409175155) & 0xffff]));
		int i_11_ = class536_sub33.readUnsignedByte();
		anInt7572 = -1693577401 * (i_11_ & 0x1f);
		anInt7575 = ((i_11_ & 0xe0) << 3) * -1893390687;
		if (31 != anInt7572 * -1719604617)
			method6854(-122430139);
		anInt7565 = class536_sub33.readShort((byte) -108) * 1154972407;
		method6858(class167, i_1_, i_3_, i_2_, i_4_, i_10_, -381675850);
	}

	public void method6853(int i, int i_12_, int i_13_, int i_14_, byte i_15_) {
		anInt7573 = -1749542171 * i;
		anInt7577 = i_14_ * -2068700797;
		anInt7552 = i_13_ * -1511564569;
		anInt7574 = -94947043 * i_12_;
	}

	void method6854(int i) {
		switch (-1719604617 * anInt7572) {
		case 6:
			anInt7573 = -953659217;
			anInt7577 = 2057801472;
			anInt7552 = -1240419072;
			anInt7574 = -1178015744;
			break;
		case 14:
			anInt7573 = -1749542171;
			anInt7577 = 2057801472;
			anInt7552 = -1240419072;
			anInt7574 = -1178015744;
			break;
		case 4:
			anInt7573 = 1591765908;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 11:
			anInt7573 = -953659217;
			anInt7577 = 751374848;
			anInt7552 = -826946048;
			anInt7574 = 1938935808;
			break;
		case 9:
			anInt7573 = -953659217;
			anInt7577 = -930739200;
			anInt7552 = -1653892096;
			anInt7574 = 1938935808;
			break;
		case 12:
			anInt7573 = 795882954;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 7:
			anInt7573 = -953659217;
			anInt7577 = 2057801472;
			anInt7552 = -1240419072;
			anInt7574 = 1938935808;
			break;
		case 5:
			anInt7573 = 1591765908;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -417095680;
			break;
		case 16:
			anInt7573 = -1749542171;
			anInt7577 = -555051776;
			anInt7552 = -413473024;
			anInt7574 = -417095680;
			break;
		default:
			anInt7577 = 0;
			anInt7573 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 2:
			anInt7573 = -1749542171;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 8:
			anInt7573 = -953659217;
			anInt7577 = -930739200;
			anInt7552 = -1653892096;
			anInt7574 = -1178015744;
			break;
		case 13:
			anInt7573 = 795882954;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -417095680;
			break;
		case 15:
			anInt7573 = -1749542171;
			anInt7577 = 751374848;
			anInt7552 = -826946048;
			anInt7574 = 1938935808;
			break;
		case 10:
			anInt7573 = -953659217;
			anInt7577 = 751374848;
			anInt7552 = -826946048;
			anInt7574 = -1178015744;
			break;
		case 3:
			anInt7573 = -1749542171;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = 1938935808;
		}
	}

	void method6855(int i, boolean bool, byte i_16_) {
		int i_17_;
		if (!bool) {
			int i_18_ = (i * (-148156107 * anInt7574) / 50 + anInt7575 * 95960417 & 0x7ff);
			switch (anInt7573 * 1548686061) {
			case 4:
				i_17_ = i_18_ >> 10 << 11;
				break;
			default:
				i_17_ = 2048;
				break;
			case 1:
				i_17_ = 1024 + (Class447.anIntArray4906[i_18_ << 3] >> 4);
				break;
			case 3:
				i_17_ = Class34_Sub22.anIntArray10982[i_18_] >> 1;
				break;
			case 5:
				i_17_ = (i_18_ < 1024 ? i_18_ : 2048 - i_18_) << 1;
				break;
			case 2:
				i_17_ = i_18_;
			}
		} else
			i_17_ = 2048;
		aClass536_Sub19_7546.method9542(((float) (((1405819095 * anInt7552 * i_17_) >> 11) + -27855573 * anInt7577) / 2048.0F), -2038348);
		aClass536_Sub19_7546.method9536((byte) -1);
	}

	public void method6856(int i, int i_19_, int i_20_, int i_21_) {
		anInt7573 = -1749542171 * i;
		anInt7577 = i_21_ * -2068700797;
		anInt7552 = i_20_ * -1511564569;
		anInt7574 = -94947043 * i_19_;
	}

	void method6857() {
		switch (-1719604617 * anInt7572) {
		case 6:
			anInt7573 = -953659217;
			anInt7577 = 2057801472;
			anInt7552 = -1240419072;
			anInt7574 = -1178015744;
			break;
		case 14:
			anInt7573 = -1749542171;
			anInt7577 = 2057801472;
			anInt7552 = -1240419072;
			anInt7574 = -1178015744;
			break;
		case 4:
			anInt7573 = 1591765908;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 11:
			anInt7573 = -953659217;
			anInt7577 = 751374848;
			anInt7552 = -826946048;
			anInt7574 = 1938935808;
			break;
		case 9:
			anInt7573 = -953659217;
			anInt7577 = -930739200;
			anInt7552 = -1653892096;
			anInt7574 = 1938935808;
			break;
		case 12:
			anInt7573 = 795882954;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 7:
			anInt7573 = -953659217;
			anInt7577 = 2057801472;
			anInt7552 = -1240419072;
			anInt7574 = 1938935808;
			break;
		case 5:
			anInt7573 = 1591765908;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -417095680;
			break;
		case 16:
			anInt7573 = -1749542171;
			anInt7577 = -555051776;
			anInt7552 = -413473024;
			anInt7574 = -417095680;
			break;
		default:
			anInt7577 = 0;
			anInt7573 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 2:
			anInt7573 = -1749542171;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -1178015744;
			break;
		case 8:
			anInt7573 = -953659217;
			anInt7577 = -930739200;
			anInt7552 = -1653892096;
			anInt7574 = -1178015744;
			break;
		case 13:
			anInt7573 = 795882954;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = -417095680;
			break;
		case 15:
			anInt7573 = -1749542171;
			anInt7577 = 751374848;
			anInt7552 = -826946048;
			anInt7574 = 1938935808;
			break;
		case 10:
			anInt7573 = -953659217;
			anInt7577 = 751374848;
			anInt7552 = -826946048;
			anInt7574 = -1178015744;
			break;
		case 3:
			anInt7573 = -1749542171;
			anInt7577 = 0;
			anInt7552 = 987183104;
			anInt7574 = 1938935808;
		}
	}

	void method6858(Class167 class167, int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		aClass536_Sub19_7546 = class167.method2109(i, i_22_, i_23_, i_24_, i_25_, 1.0F);
	}

	public void method6859(int i, int i_27_, int i_28_, int i_29_) {
		anInt7573 = -1749542171 * i;
		anInt7577 = i_29_ * -2068700797;
		anInt7552 = i_28_ * -1511564569;
		anInt7574 = -94947043 * i_27_;
	}

	static void method6860() {
		Class34_Sub22.anIntArray10982 = Class536_Sub22_Sub8.method10695(2048, 35, 8, 8, 4, 0.4F, true, (short) -6741);
	}

	static void method6861() {
		Class34_Sub22.anIntArray10982 = Class536_Sub22_Sub8.method10695(2048, 35, 8, 8, 4, 0.4F, true, (short) -25185);
	}

	static final void method6862(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		method6865(class251, class234, class668, 1885282426);
	}

	static final void method6863(Class668 class668, int i) {
		int i_30_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_30_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_30_ >> 16];
		Class353.method4648(class251, class234, class668, (byte) -37);
	}

	static final void method6864(Class668 class668, byte i) {
		int i_31_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class465_Sub1.aClass96_10352.method1300(i_31_, 1930761970);
	}

	static final void method6865(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1365220561) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2702 = Class33.method796(string, class668, (short) 8636);
		class251.aBool2666 = true;
	}
}
