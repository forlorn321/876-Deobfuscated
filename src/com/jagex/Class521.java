/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class521 {
	public Class521 aClass521_7055;
	public Class521 aClass521_7056;

	public void method6353() {
		if (aClass521_7055 != null) {
			aClass521_7055.aClass521_7056 = aClass521_7056;
			aClass521_7056.aClass521_7055 = aClass521_7055;
			aClass521_7056 = null;
			aClass521_7055 = null;
		}
	}

	public void method6354(byte i) {
		if (aClass521_7055 != null) {
			aClass521_7055.aClass521_7056 = aClass521_7056;
			aClass521_7056.aClass521_7055 = aClass521_7055;
			aClass521_7056 = null;
			aClass521_7055 = null;
		}
	}

	public void method6355() {
		if (aClass521_7055 != null) {
			aClass521_7055.aClass521_7056 = aClass521_7056;
			aClass521_7056.aClass521_7055 = aClass521_7055;
			aClass521_7056 = null;
			aClass521_7055 = null;
		}
	}

	public void method6356() {
		if (aClass521_7055 != null) {
			aClass521_7055.aClass521_7056 = aClass521_7056;
			aClass521_7056.aClass521_7055 = aClass521_7055;
			aClass521_7056 = null;
			aClass521_7055 = null;
		}
	}

	static void method6357(Class668 class668, int i) {
		class668.anIntArray8541[class668.anInt8542 * 1867269829 - 1] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[(class668.anInt8542 * 1867269829) - 1]), (byte) 10)).anInt3038 * -805412769);
	}

	public static boolean method6358(char c, int i) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if ('\u20ac' == c || c == '\u0152' || c == '\u2014' || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	static void method6359(byte i) {
		int i_0_ = 0;
		if (null != Class710.aClass536_Sub40_8843)
			i_0_ = Class710.aClass536_Sub40_8843.aClass710_Sub33_10762.method10197(-133160808);
		if (2 == i_0_) {
			int i_1_ = (569699291 * Class500.anInt6841 > 800 ? 800 : Class500.anInt6841 * 569699291);
			int i_2_ = (160996593 * Class313.anInt3499 > 600 ? 600 : 160996593 * Class313.anInt3499);
			Class144.anInt1679 = i_1_ * -1756763355;
			client.anInt6887 = -257990163 * ((Class500.anInt6841 * 569699291 - i_1_) / 2);
			Class34_Sub6.anInt10965 = -2083311653 * i_2_;
			client.anInt6863 = 0;
		} else if (1 == i_0_) {
			int i_3_ = (Class500.anInt6841 * 569699291 > 1024 ? 1024 : 569699291 * Class500.anInt6841);
			int i_4_ = (160996593 * Class313.anInt3499 > 768 ? 768 : 160996593 * Class313.anInt3499);
			Class144.anInt1679 = -1756763355 * i_3_;
			client.anInt6887 = (569699291 * Class500.anInt6841 - i_3_) / 2 * -257990163;
			Class34_Sub6.anInt10965 = i_4_ * -2083311653;
			client.anInt6863 = 0;
		} else {
			Class144.anInt1679 = 727392167 * Class500.anInt6841;
			client.anInt6887 = 0;
			Class34_Sub6.anInt10965 = Class313.anInt3499 * -402554581;
			client.anInt6863 = 0;
		}
	}
}
