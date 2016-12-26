/* Class671 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class671 {
	Class671() throws Throwable {
		throw new Error();
	}

	static char method8015(char c) {
		if (c == '\u00c6')
			return 'E';
		if (c == '\u00e6')
			return 'e';
		if ('\u00df' == c)
			return 's';
		if ('\u0152' == c)
			return 'E';
		if (c == '\u0153')
			return 'e';
		return '\0';
	}

	public static int method8016(CharSequence charsequence, int i, int i_0_, byte[] is, int i_1_, int i_2_) {
		int i_3_ = i_0_ - i;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			char c = charsequence.charAt(i + i_4_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_4_ + i_1_] = (byte) c;
			else if ('\u20ac' == c)
				is[i_4_ + i_1_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_1_ + i_4_] = (byte) -126;
			else if (c == '\u0192')
				is[i_1_ + i_4_] = (byte) -125;
			else if ('\u201e' == c)
				is[i_4_ + i_1_] = (byte) -124;
			else if (c == '\u2026')
				is[i_1_ + i_4_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_4_ + i_1_] = (byte) -122;
			else if (c == '\u2021')
				is[i_4_ + i_1_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_4_ + i_1_] = (byte) -120;
			else if ('\u2030' == c)
				is[i_1_ + i_4_] = (byte) -119;
			else if (c == '\u0160')
				is[i_4_ + i_1_] = (byte) -118;
			else if (c == '\u2039')
				is[i_1_ + i_4_] = (byte) -117;
			else if (c == '\u0152')
				is[i_4_ + i_1_] = (byte) -116;
			else if ('\u017d' == c)
				is[i_1_ + i_4_] = (byte) -114;
			else if (c == '\u2018')
				is[i_4_ + i_1_] = (byte) -111;
			else if (c == '\u2019')
				is[i_4_ + i_1_] = (byte) -110;
			else if (c == '\u201c')
				is[i_4_ + i_1_] = (byte) -109;
			else if (c == '\u201d')
				is[i_4_ + i_1_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_4_ + i_1_] = (byte) -107;
			else if (c == '\u2013')
				is[i_1_ + i_4_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_1_ + i_4_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_4_ + i_1_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_1_ + i_4_] = (byte) -103;
			else if (c == '\u0161')
				is[i_4_ + i_1_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_1_ + i_4_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_1_ + i_4_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_4_ + i_1_] = (byte) -98;
			else if (c == '\u0178')
				is[i_4_ + i_1_] = (byte) -97;
			else
				is[i_1_ + i_4_] = (byte) 63;
		}
		return i_3_;
	}

	public static final void method8017(Class649_Sub1 class649_sub1, int i, boolean bool, int i_5_) {
		Class79.method1160(class649_sub1, i, true, bool, 1752754976);
	}

	static void method8018(InterfaceDefinitions class251, Class244 class244, int i, int i_6_, int i_7_, int i_8_, int i_9_, long l) {
		int i_10_ = i_8_ * i_8_ + i_7_ * i_7_;
		if ((long) i_10_ <= l) {
			int i_11_;
			if (2 == Class246.anInt2474 * 155362615)
				i_11_ = ((int) ((double) Class683.aClass301_Sub1_8651.method4092((byte) 67) * 2607.5945876176133) + -2011409073 * client.anInt11096) & 0x3fff;
			else if (Class246.anInt2474 * 155362615 == 6)
				i_11_ = (int) client.aFloat11106 & 0x3fff;
			else
				i_11_ = (-2011409073 * client.anInt11096 + (int) client.aFloat11106) & 0x3fff;
			int i_12_ = Class447.anIntArray4906[i_11_];
			int i_13_ = Class447.anIntArray4921[i_11_];
			if (155362615 * Class246.anInt2474 != 6) {
				i_12_ = 256 * i_12_ / (1858649483 * client.anInt11098 + 256);
				i_13_ = i_13_ * 256 / (256 + client.anInt11098 * 1858649483);
			}
			int i_14_ = i_7_ * i_13_ + i_8_ * i_12_ >> 14;
			int i_15_ = i_8_ * i_13_ - i_12_ * i_7_ >> 14;
			Class143 class143 = Class688_Sub2_Sub1.aClass143Array11872[i_9_];
			int i_16_ = class143.method1720();
			int i_17_ = class143.method1752();
			int i_18_ = i_14_ + class251.anInt2573 * -1606950689 / 2 - i_16_ / 2;
			int i_19_ = i_16_ + i_18_;
			int i_20_ = -i_15_ + class251.anInt2574 * 223822141 / 2 - i_17_;
			int i_21_ = i_20_ + i_17_;
			boolean bool;
			if (class244 != null)
				bool = (!class244.method3407(i_18_, i_20_, (byte) 119) || !class244.method3407(i_19_, i_20_, (byte) 74) || !class244.method3407(i_18_, i_21_, (byte) 27) || !class244.method3407(i_19_, i_21_, (byte) 97));
			else {
				int i_22_ = i_17_;
				int i_23_ = i_16_ / 2;
				bool = (i_20_ <= -i_22_ || i_21_ >= 223822141 * class251.anInt2574 || i_18_ <= -i_23_ || i_19_ >= i_23_ + class251.anInt2573 * -1606950689);
			}
			if (bool) {
				double d = Math.atan2((double) i_14_, (double) i_15_);
				double d_24_ = Math.atan2((double) Math.abs(i_14_), (double) Math.abs(i_15_));
				double d_25_ = Math.atan2((double) (-1606950689 * class251.anInt2573 / 2), (double) (223822141 * class251.anInt2574 / 2));
				boolean bool_26_ = false;
				double d_27_ = 0.0;
				int i_28_;
				if (d_24_ < d_25_) {
					d_27_ = 1.5707963267948966 - d;
					i_28_ = class251.anInt2574 * 223822141 / 2;
				} else {
					d_27_ = d;
					i_28_ = class251.anInt2573 * -1606950689 / 2;
				}
				int i_29_ = Math.abs((int) -((double) i_28_ * Math.sin(1.5707963267948966) / Math.sin(d_27_)));
				Class62.aClass143Array701[i_9_].method1771(((float) (class251.anInt2573 * -1606950689) / 2.0F + (float) i + 0.0F), ((float) i_6_ + (float) (class251.anInt2574 * 223822141) / 2.0F - 0.0F), (float) Class62.aClass143Array701[i_9_].method12() / 2.0F, (float) i_29_, 4096, (int) (-d / 6.283185307179586 * 65535.0));
			} else if (null != class244)
				class143.method1730(i_18_ + i, i_20_ + i_6_, class244.aClass161_2463, i, i_6_);
			else
				class143.method1728(i_18_ + i, i_20_ + i_6_);
		}
	}

	public static Class234 method8019(int i, int[] is, Class234 class234, boolean bool, byte i_30_) {
		if (!Class452.aClass461_4953.method5560(i, 706825872))
			return null;
		int i_31_ = Class452.aClass461_4953.method5566(i, -371222524);
		InterfaceDefinitions[] class251s;
		if (i_31_ == 0)
			class251s = new InterfaceDefinitions[0];
		else if (class234 == null)
			class251s = new InterfaceDefinitions[i_31_];
		else
			class251s = class234.aClass251Array2378;
		if (null == class234)
			class234 = new Class234(bool, class251s);
		else {
			class234.aClass251Array2378 = class251s;
			class234.aBool2379 = bool;
		}
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
			if (null == class234.aClass251Array2378[i_32_]) {
				byte[] is_33_ = Class452.aClass461_4953.method5557(i, i_32_, is, 591884610);
				if (null != is_33_) {
					InterfaceDefinitions class251 = class234.aClass251Array2378[i_32_] = new InterfaceDefinitions();
					class251.anInt2559 = 1002674859 * ((i << 16) + i_32_);
					class251.method3466(new RSByteBuffer(is_33_), (byte) -88);
				}
			}
		}
		return class234;
	}

	public static void method8020(int i, int i_34_) {
		Class526.anInt7100 = 780789987 * i;
	}

	public static void method8021(int i, int i_35_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(7, (long) i);
		class536_sub18_sub5.method10669(1293304205);
	}

	static final void method8022(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		Class184_Sub2.aClass211_9442.method3010(class668.anIntArray8541[1867269829 * class668.anInt8542], class668.anIntArray8541[1867269829 * class668.anInt8542 + 2], 84322204);
	}
}
