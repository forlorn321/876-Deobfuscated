/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class272 {
	static final int anInt3129 = 2;
	Class275[] aClass275Array3130;
	static final int anInt3131 = 256;
	Class275[] aClass275Array3132;
	String aString3133;
	Class287[] aClass287Array3134;
	static final int anInt3135 = 4;
	public static Class459 aClass459_3136;

	void method5079(byte[] is, int i) throws Exception_Sub3 {
		Class278 class278 = new Class278(is);
		int i_0_ = class278.method5158((byte) 82);
		if (4 != i_0_)
			throw new Exception_Sub3(this, i_0_, 4);
		aString3133 = class278.method5157(-123882494);
		aClass275Array3132 = new Class275[class278.method5158((byte) 95)];
		aClass275Array3130 = new Class275[class278.method5158((byte) 122)];
		aClass287Array3134 = new Class287[class278.method5158((byte) 73)];
		for (int i_1_ = 0; i_1_ < aClass275Array3132.length; i_1_++) {
			aClass275Array3132[i_1_] = new Class275();
			aClass275Array3132[i_1_].method5135(class278, -1310474230);
		}
		for (int i_2_ = 0; i_2_ < aClass275Array3130.length; i_2_++) {
			aClass275Array3130[i_2_] = new Class275();
			aClass275Array3130[i_2_].method5135(class278, -1634744140);
		}
		for (int i_3_ = 0; i_3_ < aClass287Array3134.length; i_3_++) {
			aClass287Array3134[i_3_] = new Class287();
			aClass287Array3134[i_3_].method5214(class278, 102380841);
		}
	}

	public Class272(byte[] is) throws Exception_Sub3 {
		method5079(is, -380424163);
	}

	void method5080(byte[] is) throws Exception_Sub3 {
		Class278 class278 = new Class278(is);
		int i = class278.method5158((byte) 65);
		if (4 != i)
			throw new Exception_Sub3(this, i, 4);
		aString3133 = class278.method5157(-123882494);
		aClass275Array3132 = new Class275[class278.method5158((byte) 23)];
		aClass275Array3130 = new Class275[class278.method5158((byte) 26)];
		aClass287Array3134 = new Class287[class278.method5158((byte) 99)];
		for (int i_4_ = 0; i_4_ < aClass275Array3132.length; i_4_++) {
			aClass275Array3132[i_4_] = new Class275();
			aClass275Array3132[i_4_].method5135(class278, -1667940616);
		}
		for (int i_5_ = 0; i_5_ < aClass275Array3130.length; i_5_++) {
			aClass275Array3130[i_5_] = new Class275();
			aClass275Array3130[i_5_].method5135(class278, -2120162050);
		}
		for (int i_6_ = 0; i_6_ < aClass287Array3134.length; i_6_++) {
			aClass287Array3134[i_6_] = new Class287();
			aClass287Array3134[i_6_].method5214(class278, 102380841);
		}
	}

	void method5081(byte[] is) throws Exception_Sub3 {
		Class278 class278 = new Class278(is);
		int i = class278.method5158((byte) 44);
		if (4 != i)
			throw new Exception_Sub3(this, i, 4);
		aString3133 = class278.method5157(-123882494);
		aClass275Array3132 = new Class275[class278.method5158((byte) 18)];
		aClass275Array3130 = new Class275[class278.method5158((byte) 71)];
		aClass287Array3134 = new Class287[class278.method5158((byte) 93)];
		for (int i_7_ = 0; i_7_ < aClass275Array3132.length; i_7_++) {
			aClass275Array3132[i_7_] = new Class275();
			aClass275Array3132[i_7_].method5135(class278, -1984090121);
		}
		for (int i_8_ = 0; i_8_ < aClass275Array3130.length; i_8_++) {
			aClass275Array3130[i_8_] = new Class275();
			aClass275Array3130[i_8_].method5135(class278, -1931375967);
		}
		for (int i_9_ = 0; i_9_ < aClass287Array3134.length; i_9_++) {
			aClass287Array3134[i_9_] = new Class287();
			aClass287Array3134[i_9_].method5214(class278, 102380841);
		}
	}

	static final void method5082(Class665 class665, int i) {
		Class704.method14312(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)], 908346846);
	}

	public static int method5083(byte i) {
		return Class585.aTwitchTV7698.GetStreamState();
	}

	public static Class701 method5084(byte i) {
		if (null == Class497.aClass701_5581)
			return Class701.aClass701_8795;
		return Class497.aClass701_5581;
	}
}
