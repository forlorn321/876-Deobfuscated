/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class39 {
	static Class180 aClass180_431;
	static Class694 aClass694_432 = new Class694();
	public static Class147 aClass147_433;

	Class39() throws Throwable {
		throw new Error();
	}

	static void method1152(Class180 class180, Class243 class243) {
		boolean bool = ((Class174_Sub2.aClass24_Sub17_9120.method17407(class180, class243.anInt2572 * -437471887, -1109781355 * class243.anInt2589, 251715111 * class243.anInt2535, ~0xffffff | -413972121 * class243.anInt2621, -1036615247 * class243.anInt2558, (class243.aBool2655 ? Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183 : null), 966881501)) == null);
		if (bool) {
			aClass694_432.method14147(new Class527_Sub6(class243.anInt2572 * -437471887, class243.anInt2589 * -1109781355, 251715111 * class243.anInt2535, ~0xffffff | -413972121 * class243.anInt2621, -1036615247 * class243.anInt2558, class243.aBool2655), -1389129868);
			Class430.method6876(class243, (byte) 46);
		}
	}

	static void method1153() {
		if (aClass180_431 != null) {
			aClass180_431.method3081((byte) 23);
			aClass180_431 = null;
			Class488.aClass174_5472 = null;
		}
	}

	static void method1154() {
		if (aClass180_431 != null) {
			aClass180_431.method3081((byte) 85);
			aClass180_431 = null;
			Class488.aClass174_5472 = null;
		}
	}

	static void method1155(Class180 class180) {
		if (aClass694_432.method14087((byte) 23) != 0) {
			if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1717854897) == 0) {
				for (Class527_Sub6 class527_sub6 = ((Class527_Sub6) aClass694_432.method14081((short) -6779)); class527_sub6 != null; class527_sub6 = (Class527_Sub6) aClass694_432.method14086(-65534)) {
					Class174_Sub2.aClass24_Sub17_9120.method17410(class180, class180, class527_sub6.anInt10393 * -2009576309, class527_sub6.anInt10392 * -1087505197, 1914159393 * class527_sub6.anInt10396, -864408185 * class527_sub6.anInt10394, false, false, 1936847561 * class527_sub6.anInt10395, Class24_Sub9.aClass174_10977, (class527_sub6.aBool10391 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null), Class536.aClass615_7224, -2048824420);
					class527_sub6.method8735(-1889161967);
				}
				Class289.method5226(-501672147);
			} else {
				if (null == aClass180_431) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					aClass180_431 = Class700_Sub34.method17259(0, canvas, Class143.aClass181_1669, (Class226.anInterface24_2350), Class219.aClass386_2303, Class659.aClass391_8496, Class643.aClass397_8346, Class478.aClass459_5395, 0, (byte) 126);
					Class488.aClass174_5472 = (aClass180_431.method3170(Class483.method7953(Class272.aClass459_3136, Class49.anInt505 * 1950472807, 0, -238449641), Class165.method2655(Class338.aClass459_3656, 1950472807 * Class49.anInt505, 0), true));
				}
				for (Class527_Sub6 class527_sub6 = ((Class527_Sub6) aClass694_432.method14081((short) 5440)); null != class527_sub6; class527_sub6 = (Class527_Sub6) aClass694_432.method14086(-65534)) {
					Class174_Sub2.aClass24_Sub17_9120.method17410(aClass180_431, class180, -2009576309 * class527_sub6.anInt10393, -1087505197 * class527_sub6.anInt10392, class527_sub6.anInt10396 * 1914159393, class527_sub6.anInt10394 * -864408185, false, false, class527_sub6.anInt10395 * 1936847561, Class488.aClass174_5472, (class527_sub6.aBool10391 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null), Class536.aClass615_7224, -2059551012);
					class527_sub6.method8735(-1889161967);
				}
			}
		}
	}

	public static boolean method1156(byte i) {
		return Class290.aBool3232;
	}

	static Class562 method1157(Class640_Sub1_Sub2 class640_sub1_sub2, int i) {
		Class562 class562;
		if (null == Class562.aClass562_7567)
			class562 = new Class562();
		else {
			class562 = Class562.aClass562_7567;
			Class562.aClass562_7567 = Class562.aClass562_7567.aClass562_7565;
			class562.aClass562_7565 = null;
			Class562.anInt7566 -= -368701483;
		}
		class562.aClass640_Sub1_Sub2_7564 = class640_sub1_sub2;
		return class562;
	}

	static final void method1158(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class190.method3678(class243, class240, class665, 2099678294);
	}

	static final void method1159(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub29_10612.method17209(1148091771);
	}

	static Class527_Sub8_Sub12 method1160(RSByteBuffer class527_sub38, int i, short i_0_) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = new Class527_Sub8_Sub12(i, class527_sub38.readString(1065604365), class527_sub38.readString(1654713685), class527_sub38.readInt(), class527_sub38.readInt(), (class527_sub38.readUnsignedByte() == 1), class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedByte());
		int i_1_ = class527_sub38.readUnsignedByte();
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
			class527_sub8_sub12.aClass694_11757.method14147(new Class527_Sub37(class527_sub38.readUnsignedByte(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort(), class527_sub38.readUnsignedShort()), -1252905650);
		class527_sub8_sub12.method18311((byte) -37);
		return class527_sub8_sub12;
	}
}
