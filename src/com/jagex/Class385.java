/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class385 implements Interface47 {
	Class461 aClass461_4019;
	Class199 aClass199_4020 = new Class199(64);

	public Class400 method335(int i, byte i_0_) {
		Class400 class400 = (Class400) aClass199_4020.method2886((long) i);
		if (class400 != null)
			return class400;
		byte[] is = aClass461_4019.method5556(0, i, (byte) 1);
		class400 = new Class400();
		if (null != is)
			class400.method4916(new RSByteBuffer(is), i, (byte) -80);
		aClass199_4020.method2881(class400, (long) i);
		return class400;
	}

	public Class400 method336(int i) {
		Class400 class400 = (Class400) aClass199_4020.method2886((long) i);
		if (class400 != null)
			return class400;
		byte[] is = aClass461_4019.method5556(0, i, (byte) 1);
		class400 = new Class400();
		if (null != is)
			class400.method4916(new RSByteBuffer(is), i, (byte) -71);
		aClass199_4020.method2881(class400, (long) i);
		return class400;
	}

	public Class385(Class461 class461) {
		aClass461_4019 = class461;
	}

	public Class400 method337(int i) {
		Class400 class400 = (Class400) aClass199_4020.method2886((long) i);
		if (class400 != null)
			return class400;
		byte[] is = aClass461_4019.method5556(0, i, (byte) 1);
		class400 = new Class400();
		if (null != is)
			class400.method4916(new RSByteBuffer(is), i, (byte) -20);
		aClass199_4020.method2881(class400, (long) i);
		return class400;
	}

	static final void method4838(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11158 * 2005749395;
	}

	static final void method4839(Class668 class668, int i) {
		class668.anInt8542 -= -1349181388;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		int i_3_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 3];
		i_1_ += i_2_ << 14;
		i_1_ += i_3_ << 28;
		i_1_ += i_4_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_1_;
	}

	static final void method4840(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class648.method7829(class251, class234, class668, -755057139);
	}

	public static Class697[] method4841(byte i) {
		if (Class590.aClass697Array7790 == null) {
			Class697[] class697s = Class250.method3461(Class464.aClass691_5228, (byte) 0);
			Class697[] class697s_5_ = new Class697[class697s.length];
			int i_6_ = 0;
			int i_7_ = ClientSetting.aClass536_Sub40_8843.aClass710_Sub33_10762.method10197(-1284917305);
			while_62_: for (int i_8_ = 0; i_8_ < class697s.length; i_8_++) {
				Class697 class697 = class697s[i_8_];
				if ((class697.anInt8745 * 1117205975 <= 0 || 1117205975 * class697.anInt8745 >= 24) && class697.anInt8744 * -1090373425 >= 800 && 832859273 * class697.anInt8743 >= 600 && (2 != i_7_ || (-1090373425 * class697.anInt8744 <= 800 && class697.anInt8743 * 832859273 <= 600)) && (i_7_ != 1 || (-1090373425 * class697.anInt8744 <= 1024 && class697.anInt8743 * 832859273 <= 768))) {
					for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
						Class697 class697_10_ = class697s_5_[i_9_];
						if ((class697.anInt8744 * -1090373425 == class697_10_.anInt8744 * -1090373425) && (class697.anInt8743 * 832859273 == class697_10_.anInt8743 * 832859273)) {
							if (class697.anInt8745 * 1117205975 > class697_10_.anInt8745 * 1117205975)
								class697s_5_[i_9_] = class697;
							continue while_62_;
						}
					}
					class697s_5_[i_6_] = class697;
					i_6_++;
				}
			}
			Class590.aClass697Array7790 = new Class697[i_6_];
			System.arraycopy(class697s_5_, 0, Class590.aClass697Array7790, 0, i_6_);
			int[] is = new int[Class590.aClass697Array7790.length];
			for (int i_11_ = 0; i_11_ < Class590.aClass697Array7790.length; i_11_++) {
				Class697 class697 = Class590.aClass697Array7790[i_11_];
				is[i_11_] = -1090373425 * class697.anInt8744 * (class697.anInt8743 * 832859273);
			}
			Class532.method6446(is, Class590.aClass697Array7790, (short) -31388);
		}
		return Class590.aClass697Array7790;
	}

	static final void method4842(Class668 class668, short i) {
		class668.anInt8542 -= -1411037171;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10881((byte) -41).method7145((byte) -35);
	}
}
