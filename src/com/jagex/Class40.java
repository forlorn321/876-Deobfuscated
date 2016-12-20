/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class40 {
	public static int[] anIntArray434;
	public static int anInt435;
	public static int[] anIntArray436;
	static int anInt437;
	static final int anInt438 = 12;
	static Class458 aClass458_439 = new Class458(16, Class454.aClass454_4970);

	public static void method1161(int i, int i_0_) {
		if (i != anInt435 * 2089128527) {
			anIntArray436 = new int[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++)
				anIntArray436[i_1_] = (i_1_ << 12) / i;
			anInt435 = -336837457 * i;
		}
		if (i_0_ != 1513752403 * anInt437) {
			if (anInt435 * 2089128527 != i_0_) {
				anIntArray434 = new int[i_0_];
				for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
					anIntArray434[i_2_] = (i_2_ << 12) / i_0_;
			} else
				anIntArray434 = anIntArray436;
			anInt437 = 1378473179 * i_0_;
		}
	}

	public static void method1162(int i, int i_3_, int i_4_) {
		if (i != anInt435 * 2089128527) {
			anIntArray436 = new int[i];
			for (int i_5_ = 0; i_5_ < i; i_5_++)
				anIntArray436[i_5_] = (i_5_ << 12) / i;
			anInt435 = -336837457 * i;
		}
		if (i_3_ != 1513752403 * anInt437) {
			if (anInt435 * 2089128527 != i_3_) {
				anIntArray434 = new int[i_3_];
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
					anIntArray434[i_6_] = (i_6_ << 12) / i_3_;
			} else
				anIntArray434 = anIntArray436;
			anInt437 = 1378473179 * i_3_;
		}
	}

	Class40() throws Throwable {
		throw new Error();
	}

	public static void method1163(int i, int i_7_) {
		if (i != anInt435 * 2089128527) {
			anIntArray436 = new int[i];
			for (int i_8_ = 0; i_8_ < i; i_8_++)
				anIntArray436[i_8_] = (i_8_ << 12) / i;
			anInt435 = -336837457 * i;
		}
		if (i_7_ != 1513752403 * anInt437) {
			if (anInt435 * 2089128527 != i_7_) {
				anIntArray434 = new int[i_7_];
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
					anIntArray434[i_9_] = (i_9_ << 12) / i_7_;
			} else
				anIntArray434 = anIntArray436;
			anInt437 = 1378473179 * i_7_;
		}
	}

	public static byte[] method1164(int i, int i_10_) {
		byte[] is = (byte[]) aClass458_439.method7450(Integer.valueOf(i), (byte) 25);
		if (null == is) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_11_ = 0; i_11_ < 255; i_11_++)
				is[i_11_] = (byte) i_11_;
			for (int i_12_ = 0; i_12_ < 255; i_12_++) {
				int i_13_ = 255 - i_12_;
				int i_14_ = Class24_Sub10.method17391(random, i_13_, -1421032308);
				byte i_15_ = is[i_14_];
				is[i_14_] = is[i_13_];
				is[i_13_] = is[511 - i_12_] = i_15_;
			}
			aClass458_439.method7460(Integer.valueOf(i), is, (byte) 23);
		}
		return is;
	}

	public static byte[] method1165(int i) {
		byte[] is = (byte[]) aClass458_439.method7450(Integer.valueOf(i), (byte) 11);
		if (null == is) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_16_ = 0; i_16_ < 255; i_16_++)
				is[i_16_] = (byte) i_16_;
			for (int i_17_ = 0; i_17_ < 255; i_17_++) {
				int i_18_ = 255 - i_17_;
				int i_19_ = Class24_Sub10.method17391(random, i_18_, -401009507);
				byte i_20_ = is[i_19_];
				is[i_19_] = is[i_18_];
				is[i_18_] = is[511 - i_17_] = i_20_;
			}
			aClass458_439.method7460(Integer.valueOf(i), is, (byte) 79);
		}
		return is;
	}

	static boolean method1166(boolean bool, boolean bool_21_, String string, String string_22_, long l) {
		Class32.aBool273 = bool;
		if (!bool_21_)
			Class32.anInt274 = 1833818503;
		Class32.aBool269 = bool_21_;
		Class32.aString289 = string;
		Class32.aString306 = string_22_;
		Class32.aLong321 = l * 2730100241404364287L;
		if (!Class32.aBool269 && (Class32.aString289.equals("") || Class32.aString306.equals(""))) {
			Class95.method1727(3, (byte) -44);
			Class387.method6437(-286706955);
			return false;
		}
		if (120 != -626035783 * Class32.anInt286) {
			Class32.anInt316 = 0;
			Class32.anInt315 = -1716310515;
			Class32.anInt317 = 157279991;
		}
		Class32.aClass109_270.aBool1378 = false;
		Class95.method1727(-3, (byte) 32);
		Class32.loginStage = 496299902;
		Class32.anInt309 = 0;
		Class32.anInt310 = 0;
		return true;
	}

	public static int method1167(int i) {
		return Class585.aTwitchTV7698.GetWebcamState();
	}

	static final void method1168(Class665 class665, byte i) {
		int i_23_ = Class232.anInt2361 * -397936919;
		int i_24_ = -1718907591 * Class319.anInt3537;
		int i_25_ = -1;
		if (Class707.aBool8841) {
			Class704[] class704s = Class64.method1453(-1925941873);
			for (int i_26_ = 0; i_26_ < class704s.length; i_26_++) {
				Class704 class704 = class704s[i_26_];
				if (i_23_ == -798340951 * class704.anInt8829 && i_24_ == -1159802239 * class704.anInt8827) {
					i_25_ = i_26_;
					break;
				}
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_25_;
	}

	static void method1169(int i, String string, int i_27_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(3, (long) i);
		class527_sub8_sub9.method18187(72591918);
		class527_sub8_sub9.aString11669 = string;
	}
}
