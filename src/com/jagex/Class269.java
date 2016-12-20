/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class269 {
	public static Class269 aClass269_3114;
	static Class269 aClass269_3115;
	static Class269 aClass269_3116;
	int anInt3117;
	static Class269 aClass269_3118 = new Class269(0);
	public static Class269 aClass269_3119;
	public static Class269 aClass269_3120;
	static Class459 aClass459_3121;

	Class269(int i) {
		anInt3117 = -202931633 * i;
	}

	static {
		aClass269_3115 = new Class269(1);
		aClass269_3116 = new Class269(2);
		aClass269_3114 = new Class269(3);
		aClass269_3120 = new Class269(4);
		aClass269_3119 = new Class269(5);
	}

	static final void method5053(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class243.anInt2603 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * 1194982913;
	}

	static final void method5054(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		boolean bool = (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526] == 1);
		if (0 == i_0_)
			Class529_Sub1.aBool10790 = bool;
		else if (1 == i_0_)
			Class529_Sub1.aBool10792 = bool;
		else if (i_0_ == 2)
			Class529_Sub1.aBool10793 = bool;
		else
			throw new RuntimeException();
	}

	static final void method5055(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	static String method5056(int i, int i_1_, boolean bool, int i_2_) {
		if (i_1_ < 2 || i_1_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_1_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_1_);
		int i_3_ = 2;
		int i_4_ = i / i_1_;
		while (i_4_ != 0) {
			i_4_ /= i_1_;
			i_3_++;
		}
		char[] cs = new char[i_3_];
		cs[0] = '+';
		for (int i_5_ = i_3_ - 1; i_5_ > 0; i_5_--) {
			int i_6_ = i;
			i /= i_1_;
			int i_7_ = i_6_ - i * i_1_;
			if (i_7_ >= 10)
				cs[i_5_] = (char) (87 + i_7_);
			else
				cs[i_5_] = (char) (48 + i_7_);
		}
		return new String(cs);
	}

	static final void method5057(Class665 class665, int i) {
		Class585.method9773(2080248687);
	}

	static void method5058(int i, short i_8_) {
		Class527_Sub8_Sub15_Sub1.anInt12054 = -1873810741 * i;
		Class100.aClass205_1186.method3793((byte) 76);
	}
}
