/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class448 {
	public static int method7262(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (1 == (i_4_ & 0x1)) {
			int i_5_ = i_2_;
			i_2_ = i_3_;
			i_3_ = i_5_;
		}
		i_1_ &= 0x3;
		if (0 == i_1_)
			return i_0_;
		if (1 == i_1_)
			return 7 - i - (i_2_ - 1);
		if (2 == i_1_)
			return 7 - i_0_ - (i_3_ - 1);
		return i;
	}

	public static int method7263(int i, int i_6_, int i_7_) {
		i_7_ &= 0x3;
		if (i_7_ == 0)
			return i_6_;
		if (1 == i_7_)
			return 7 - i;
		if (i_7_ == 2)
			return 7 - i_6_;
		return i;
	}

	public static int method7264(int i, int i_8_, int i_9_) {
		i_9_ &= 0x3;
		if (i_9_ == 0)
			return i_8_;
		if (1 == i_9_)
			return 7 - i;
		if (i_9_ == 2)
			return 7 - i_8_;
		return i;
	}

	Class448() throws Throwable {
		throw new Error();
	}

	public static int method7265(int i, int i_10_, int i_11_) {
		i_11_ &= 0x3;
		if (0 == i_11_)
			return i_10_;
		if (i_11_ == 1)
			return 4095 - i;
		if (2 == i_11_)
			return 4095 - i_10_;
		return i;
	}

	public static int method7266(int i, int i_12_, int i_13_) {
		i_13_ &= 0x3;
		if (i_13_ == 0)
			return i_12_;
		if (1 == i_13_)
			return 7 - i;
		if (i_13_ == 2)
			return 7 - i_12_;
		return i;
	}

	public static int method7267(int i, int i_14_, int i_15_) {
		i_15_ &= 0x3;
		if (0 == i_15_)
			return i_14_;
		if (i_15_ == 1)
			return 4095 - i;
		if (2 == i_15_)
			return 4095 - i_14_;
		return i;
	}

	public static int method7268(int i, int i_16_, int i_17_) {
		i_17_ &= 0x3;
		if (0 == i_17_)
			return i;
		if (1 == i_17_)
			return i_16_;
		if (2 == i_17_)
			return 4095 - i;
		return 4095 - i_16_;
	}

	public static int method7269(int i, int i_18_, int i_19_) {
		i_19_ &= 0x3;
		if (0 == i_19_)
			return i_18_;
		if (i_19_ == 1)
			return 4095 - i;
		if (2 == i_19_)
			return 4095 - i_18_;
		return i;
	}

	public static int method7270(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		if ((i_24_ & 0x1) == 1) {
			int i_25_ = i_22_;
			i_22_ = i_23_;
			i_23_ = i_25_;
		}
		i_21_ &= 0x3;
		if (i_21_ == 0)
			return i;
		if (i_21_ == 1)
			return i_20_;
		if (i_21_ == 2)
			return 7 - i - (i_22_ - 1);
		return 7 - i_20_ - (i_23_ - 1);
	}

	public static int method7271(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		if ((i_30_ & 0x1) == 1) {
			int i_31_ = i_28_;
			i_28_ = i_29_;
			i_29_ = i_31_;
		}
		i_27_ &= 0x3;
		if (i_27_ == 0)
			return i;
		if (i_27_ == 1)
			return i_26_;
		if (i_27_ == 2)
			return 7 - i - (i_28_ - 1);
		return 7 - i_26_ - (i_29_ - 1);
	}

	public static int method7272(int i, int i_32_, int i_33_) {
		i_33_ &= 0x3;
		if (0 == i_33_)
			return i;
		if (1 == i_33_)
			return i_32_;
		if (2 == i_33_)
			return 4095 - i;
		return 4095 - i_32_;
	}

	public static int method7273(int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_) {
		if (1 == (i_38_ & 0x1)) {
			int i_39_ = i_36_;
			i_36_ = i_37_;
			i_37_ = i_39_;
		}
		i_35_ &= 0x3;
		if (0 == i_35_)
			return i_34_;
		if (1 == i_35_)
			return 7 - i - (i_36_ - 1);
		if (2 == i_35_)
			return 7 - i_34_ - (i_37_ - 1);
		return i;
	}

	public static int method7274(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_) {
		if (1 == (i_44_ & 0x1)) {
			int i_45_ = i_42_;
			i_42_ = i_43_;
			i_43_ = i_45_;
		}
		i_41_ &= 0x3;
		if (0 == i_41_)
			return i_40_;
		if (1 == i_41_)
			return 7 - i - (i_42_ - 1);
		if (2 == i_41_)
			return 7 - i_40_ - (i_43_ - 1);
		return i;
	}

	static final void method7275(Class665 class665, int i) {
		if (null != Class386.aClass346_3964) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
			class665.aClass346_8532 = Class386.aClass346_3964;
			class665.aMap8523.put(Class465.aClass465_5308, Class187.method3659(class665.aClass346_8532, (byte) -52));
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method7276(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	static int method7277(Interface18 interface18, Interface13 interface13, int i) {
		int i_46_ = 0;
		for (int i_47_ = 0; i_47_ < interface13.method77(-1952835215); i_47_++) {
			Class259 class259 = (Class259) interface13.method81(i_47_, 685555840);
			if (class259.method4777(interface18, (byte) -125))
				i_46_ += -1997826637 * class259.anInt2831;
		}
		return i_46_;
	}
}
