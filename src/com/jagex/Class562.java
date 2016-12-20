/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class562 {
	public Class640_Sub1_Sub2 aClass640_Sub1_Sub2_7564;
	public Class562 aClass562_7565;
	static int anInt7566 = 0;
	static Class562 aClass562_7567;

	static Class562 method9452(Class640_Sub1_Sub2 class640_sub1_sub2) {
		Class562 class562;
		if (null == aClass562_7567)
			class562 = new Class562();
		else {
			class562 = aClass562_7567;
			aClass562_7567 = aClass562_7567.aClass562_7565;
			class562.aClass562_7565 = null;
			anInt7566 -= -368701483;
		}
		class562.aClass640_Sub1_Sub2_7564 = class640_sub1_sub2;
		return class562;
	}

	void method9453(int i) {
		if (95990141 * anInt7566 < 500) {
			aClass640_Sub1_Sub2_7564 = null;
			aClass562_7565 = aClass562_7567;
			aClass562_7567 = this;
			anInt7566 += -368701483;
		}
	}

	Class562() {
		/* empty */
	}

	static Class562 method9454(Class640_Sub1_Sub2 class640_sub1_sub2) {
		Class562 class562;
		if (null == aClass562_7567)
			class562 = new Class562();
		else {
			class562 = aClass562_7567;
			aClass562_7567 = aClass562_7567.aClass562_7565;
			class562.aClass562_7565 = null;
			anInt7566 -= -368701483;
		}
		class562.aClass640_Sub1_Sub2_7564 = class640_sub1_sub2;
		return class562;
	}

	static Class562 method9455(Class640_Sub1_Sub2 class640_sub1_sub2) {
		Class562 class562;
		if (null == aClass562_7567)
			class562 = new Class562();
		else {
			class562 = aClass562_7567;
			aClass562_7567 = aClass562_7567.aClass562_7565;
			class562.aClass562_7565 = null;
			anInt7566 -= -368701483;
		}
		class562.aClass640_Sub1_Sub2_7564 = class640_sub1_sub2;
		return class562;
	}

	static Class562 method9456(Class640_Sub1_Sub2 class640_sub1_sub2) {
		Class562 class562;
		if (null == aClass562_7567)
			class562 = new Class562();
		else {
			class562 = aClass562_7567;
			aClass562_7567 = aClass562_7567.aClass562_7565;
			class562.aClass562_7565 = null;
			anInt7566 -= -368701483;
		}
		class562.aClass640_Sub1_Sub2_7564 = class640_sub1_sub2;
		return class562;
	}

	static Class562 method9457(Class640_Sub1_Sub2 class640_sub1_sub2) {
		Class562 class562;
		if (null == aClass562_7567)
			class562 = new Class562();
		else {
			class562 = aClass562_7567;
			aClass562_7567 = aClass562_7567.aClass562_7565;
			class562.aClass562_7565 = null;
			anInt7566 -= -368701483;
		}
		class562.aClass640_Sub1_Sub2_7564 = class640_sub1_sub2;
		return class562;
	}

	void method9458() {
		if (95990141 * anInt7566 < 500) {
			aClass640_Sub1_Sub2_7564 = null;
			aClass562_7565 = aClass562_7567;
			aClass562_7567 = this;
			anInt7566 += -368701483;
		}
	}

	static final void method9459(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class319.method5689(985742414);
	}

	static final void method9460(Class665 class665, short i) {
		Class700.method14291(-204845597);
	}

	static void method9461(Class665 class665, int i) {
		Class259 class259 = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]), 1857297380));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (null == class259.anIntArray2845 ? 0 : class259.anIntArray2845.length);
	}

	public static final void method9462(String string, String string_0_, int i) {
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4441, class109.aClass2_1367, (byte) 93);
		if (string_0_.length() > 30)
			string_0_ = string_0_.substring(0, 30);
		class527_sub15.buffer.writeByte((Class208_Sub18.method15632(string, (byte) -58) + Class208_Sub18.method15632(string_0_, (byte) -52)), -843283821);
		class527_sub15.buffer.writeString(string_0_, 2005521988);
		class527_sub15.buffer.writeString(string, 1425604966);
		class109.method1969(class527_sub15, (byte) 1);
	}

	static final void method9463(Class665 class665, int i) {
		Class245.aClass226_2698.method4299((class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]), 1495716825);
	}

	static int method9464(byte[][] is, byte[][] is_1_, int[] is_2_, byte[] is_3_, int[] is_4_, int i, int i_5_, int i_6_) {
		int i_7_ = is_2_[i];
		int i_8_ = is_4_[i] + i_7_;
		int i_9_ = is_2_[i_5_];
		int i_10_ = i_9_ + is_4_[i_5_];
		int i_11_ = i_7_;
		if (i_9_ > i_7_)
			i_11_ = i_9_;
		int i_12_ = i_8_;
		if (i_10_ < i_8_)
			i_12_ = i_10_;
		int i_13_ = is_3_[i] & 0xff;
		if ((is_3_[i_5_] & 0xff) < i_13_)
			i_13_ = is_3_[i_5_] & 0xff;
		byte[] is_14_ = is_1_[i];
		byte[] is_15_ = is[i_5_];
		int i_16_ = i_11_ - i_7_;
		int i_17_ = i_11_ - i_9_;
		for (int i_18_ = i_11_; i_18_ < i_12_; i_18_++) {
			int i_19_ = is_14_[i_16_++] + is_15_[i_17_++];
			if (i_19_ < i_13_)
				i_13_ = i_19_;
		}
		return -i_13_;
	}
}
