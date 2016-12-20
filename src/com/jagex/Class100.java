/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class100 {
	public int anInt1176;
	int anInt1177;
	public int anInt1178;
	int anInt1179;
	public int anInt1180;
	int anInt1181;
	public int anInt1182;
	public int anInt1183 = -1266211353;
	public int anInt1184;
	int anInt1185;
	static Class205 aClass205_1186 = new Class205(4);
	static int anInt1187;

	static void method1767() {
		aClass205_1186.method3820(1811165690);
	}

	public static Class176 method1768(Class180 class180, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		long l = (long) i_3_;
		Class176 class176 = (Class176) aClass205_1186.method3787(l);
		int i_4_ = 2055;
		if (null == class176) {
			Class175 class175 = Class175.method2814(Class208_Sub12.aClass459_9930, i_3_, 0);
			if (class175 == null)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_4_, (Class527_Sub8_Sub15_Sub1.anInt12054 * 1722329827), 64, 768);
			aClass205_1186.method3790(class176, l);
		}
		class176 = class176.method2862((byte) 6, i_4_, true);
		if (0 != i)
			class176.method2911(i);
		if (0 != i_0_)
			class176.method2868(i_0_);
		if (i_1_ != 0)
			class176.method2869(i_1_);
		if (0 != i_2_)
			class176.method3015(0, i_2_, 0);
		return class176;
	}

	static void method1769(int i) {
		Class527_Sub8_Sub15_Sub1.anInt12054 = -1873810741 * i;
		aClass205_1186.method3793((byte) 50);
	}

	static void method1770(int i) {
		aClass205_1186.method3792(i, (byte) -40);
	}

	Class100() {
		/* empty */
	}

	static void method1771(Class180 class180, int i) {
		if (Class35.aClass427_362 != null) {
			class180.method3183(Class35.aClass427_362);
			class180.method3180(Class35.aClass432_355);
			class180.method3132(Class35.anInt333 * 1078888103, -2006477931 * Class35.anInt359, (Class35.anInt333 * 1078888103 + Class35.anInt360 * -434019135), (-2006477931 * Class35.anInt359 + -652091803 * Class35.anInt377));
			class180.method3128(1078888103 * Class35.anInt333, Class35.anInt359 * -2006477931, Class35.anInt360 * -434019135, -652091803 * Class35.anInt377);
		}
	}

	static final void method1772(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class324.method5729(class243, class240, class665, -2141122447);
	}

	static final void method1773(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1028182427 * Class32.anInt295;
	}

	static final void method1774(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method1775(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_6_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_5_ > i_6_ ? i_5_ : i_6_;
	}

	static final void method1776(Class665 class665, byte i) {
		if (2 == -349191067 * Class30.anInt265)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(-189712231) * 2607.5945876176133) >> 3;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (int) client.aFloat11112 >> 3;
	}
}
