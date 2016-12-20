/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.LinkedList;

public class Class289 {
	public static Class289 aClass289_3220;
	public static Class289 aClass289_3221 = new Class289(0);
	int anInt3222;
	public static int anInt3223;

	public static Class289 method5219(int i) {
		if (i == aClass289_3221.anInt3222 * -1696939565)
			return aClass289_3221;
		if (i == -1696939565 * aClass289_3220.anInt3222)
			return aClass289_3220;
		return null;
	}

	static {
		aClass289_3220 = new Class289(1);
	}

	Class289(int i) {
		anInt3222 = i * 100941403;
	}

	public static Class289 method5220(int i) {
		if (i == aClass289_3221.anInt3222 * -1696939565)
			return aClass289_3221;
		if (i == -1696939565 * aClass289_3220.anInt3222)
			return aClass289_3220;
		return null;
	}

	static void method5221(int[] is, LinkedList linkedlist, int i, int i_0_, float f, int i_1_) {
		if (!linkedlist.isEmpty()) {
			for (int i_2_ = 0; i_2_ < linkedlist.size(); i_2_++) {
				Class568 class568 = (Class568) linkedlist.get(i_2_);
				int i_3_ = i + (int) ((float) (class568.anInt7611 * 2105301417) * f);
				int i_4_ = i_0_ + (int) (f * (float) (691962005 * class568.anInt7612));
				int i_5_ = (int) (f * (float) (302324901 * class568.anInt7610));
				int i_6_ = (int) (f * (float) (-997086075 * class568.anInt7613));
				if (i_3_ < -127594503 * Class700_Sub20.anInt10872 && i_4_ < -909192181 * Class174_Sub1.anInt9112) {
					if (i_3_ + i_5_ > Class700_Sub20.anInt10872 * -127594503)
						i_5_ = Class700_Sub20.anInt10872 * -127594503 - i_3_;
					if (i_4_ + i_6_ > -909192181 * Class174_Sub1.anInt9112)
						i_6_ = Class174_Sub1.anInt9112 * -909192181 - i_4_;
					for (int i_7_ = i_4_; i_7_ < i_4_ + i_6_; i_7_++) {
						int i_8_ = i_3_ + i_7_ * (Class700_Sub20.anInt10872 * -127594503);
						Arrays.fill(is, i_8_, i_8_ + i_5_, -16777216);
					}
				}
			}
		}
	}

	static final void method5222(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class529.method8818(i_9_ >> 14 & 0x3fff, i_9_ & 0x3fff);
		if (class527_sub8_sub12 == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class527_sub8_sub12.anInt11765 * 911503199;
	}

	static final void method5223(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub34_10599.method17250((byte) -47) ? 1 : 0;
	}

	static final void method5224(Class665 class665, int i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class665.aClass640_Sub1_Sub2_Sub1_8522);
		int i_11_ = class640_sub1_sub2_sub1_sub1.method18839(i_10_, -2085558748);
		int i_12_ = class640_sub1_sub2_sub1_sub1.method18840(i_10_, -1591342482);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_11_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_12_;
	}

	static void method5225(Class180 class180, Class243 class243, int i) {
		boolean bool = ((Class174_Sub2.aClass24_Sub17_9120.method17407(class180, class243.anInt2572 * -437471887, -1109781355 * class243.anInt2589, 251715111 * class243.anInt2535, ~0xffffff | -413972121 * class243.anInt2621, -1036615247 * class243.anInt2558, (class243.aBool2655 ? Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183 : null), 966881501)) == null);
		if (bool) {
			Class39.aClass694_432.method14147(new Class527_Sub6(class243.anInt2572 * -437471887, class243.anInt2589 * -1109781355, 251715111 * class243.anInt2535, ~0xffffff | -413972121 * class243.anInt2621, -1036615247 * class243.anInt2558, class243.aBool2655), 1866035);
			Class430.method6876(class243, (byte) 59);
		}
	}

	static void method5226(int i) {
		for (int i_13_ = 0; i_13_ < 102; i_13_++)
			client.aBoolArray11310[i_13_] = true;
	}

	public static void method5227(int i) {
		Class465_Sub3.method15987(true, 1754825401);
	}

	public static int method5228(int i, int i_14_, int i_15_, int i_16_) {
		i_15_ &= 0x3;
		if (i_15_ == 0)
			return i_14_;
		if (1 == i_15_)
			return 7 - i;
		if (i_15_ == 2)
			return 7 - i_14_;
		return i;
	}

	static final void method5229(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -880780557) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2632 = Class103.method1800(string, class665, (byte) -71);
		class243.aBool2606 = true;
	}
}
