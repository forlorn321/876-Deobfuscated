/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class254 implements Interface26 {
	Class214 this$0;
	Class215 aClass215_2806;
	static Class459 aClass459_2807;
	public static int anInt2808;

	Class254(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		boolean bool = class527_sub38.readUnsignedByte() != 255;
		if (bool)
			class527_sub38.anInt10689 -= 1474750881;
		aClass215_2806 = new Class215(class527_sub38, bool, true, class214.anInterface28_2263);
	}

	public void method150(Class219 class219, int i) {
		class219.method4010(aClass215_2806, (byte) 10);
	}

	public void method151(Class219 class219) {
		class219.method4010(aClass215_2806, (byte) -123);
	}

	public static Class604_Sub1 method4698(int i, int i_0_) {
		if (!Class605.aBool7971 || i < Class605.anInt7972 * 451447095 || i > Class638.anInt8321 * 1671964397)
			return null;
		return (Class605.aClass604_Sub1Array7968[i - Class605.anInt7972 * 451447095]);
	}

	public static void method4699(Class579 class579, int i, int i_1_, Class683 class683, Class640_Sub1_Sub5_Sub1 class640_sub1_sub5_sub1, int i_2_) {
		Class665 class665 = Class383.method6409((byte) -5);
		class665.aClass640_Sub1_Sub5_Sub1_8540 = class640_sub1_sub5_sub1;
		Class261.method4926(class579, i, i_1_, class665, 152600150);
		class665.aClass640_Sub1_Sub5_Sub1_8540 = null;
	}

	static final void method4700(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (!string.equals(class243.aString2578)) {
			class243.aString2578 = string;
			Class430.method6876(class243, (byte) 48);
		}
		if (class243.anInt2675 * -927924265 == -1 && !class240.aBool2394)
			Class700_Sub5.method16887(-254728301 * class243.anInt2504, -1125277757);
	}

	static final void method4701(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class73.method1511(i_3_, i_4_, false, -1762174262);
	}

	public static String method4702(Class527_Sub8_Sub7 class527_sub8_sub7, int i) {
		if (Class35.aBool338 || class527_sub8_sub7 == null)
			return "";
		if ((null == class527_sub8_sub7.aString11650 || class527_sub8_sub7.aString11650.length() == 0) && null != class527_sub8_sub7.aString11653 && class527_sub8_sub7.aString11653.length() > 0)
			return class527_sub8_sub7.aString11653;
		return class527_sub8_sub7.aString11650;
	}

	public static int method4703(int i, int i_5_, boolean bool, boolean bool_6_, int i_7_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool_6_, (byte) 23);
		if (class527_sub1 == null)
			return 0;
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < class527_sub1.anIntArray10332.length; i_9_++) {
			if (class527_sub1.anIntArray10332[i_9_] >= 0 && (class527_sub1.anIntArray10332[i_9_] < (Class174_Sub2.aClass24_Sub17_9120.anInt230 * -1588728841))) {
				Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class527_sub1.anIntArray10332[i_9_], -1135979998)));
				int i_10_ = class9.method620(i_5_, (((Class80) Class679.aClass24_Sub21_8628.method81(i_5_, -1788070583)).anInt804) * 780718929, (byte) 0);
				if (bool)
					i_8_ += i_10_ * class527_sub1.anIntArray10330[i_9_];
				else
					i_8_ += i_10_;
			}
		}
		return i_8_;
	}
}
