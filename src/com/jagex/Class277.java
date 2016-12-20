/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class277 implements Interface76 {
	int anInt3162;
	public static Class277 aClass277_3163;
	static Class277 aClass277_3164;
	public int anInt3165;
	public static Class277 aClass277_3166 = new Class277(0, 0);

	static Class277[] method5149() {
		return (new Class277[] { aClass277_3166, aClass277_3163, aClass277_3164 });
	}

	public int method87() {
		return anInt3162 * -621425251;
	}

	static Class277[] method5150() {
		return (new Class277[] { aClass277_3166, aClass277_3163, aClass277_3164 });
	}

	public int method42() {
		return anInt3162 * -621425251;
	}

	Class277(int i, int i_0_) {
		anInt3165 = -1734726973 * i;
		anInt3162 = 166338741 * i_0_;
	}

	static {
		aClass277_3163 = new Class277(1, 1);
		aClass277_3164 = new Class277(2, 2);
	}

	public int method91() {
		return anInt3162 * -621425251;
	}

	static Class277[] method5151() {
		return (new Class277[] { aClass277_3166, aClass277_3163, aClass277_3164 });
	}

	public static int method5152(String string, int i) {
		return Class585.aTwitchTV7698.SetStreamTitle(string, client.aClass678_11259.aString8618);
	}

	static final void method5153(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_1_ % i_2_;
	}

	static final void method5154(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_3_ >= 1 && i_3_ <= 2)
			Class188.method3663(i_3_, -1, -1, false, (byte) 14);
	}

	public static void method5155(int i) {
		if (Class3.aBool43) {
			if (865836043 * Class3.anInt35 < Class605.anInt7972 * 451447095)
				Class3.anInt35 = 1073518341 * Class605.anInt7972;
			while (Class3.anInt35 * 865836043 < 1671964397 * Class638.anInt8321) {
				Class604_Sub1 class604_sub1 = Class254.method4698(865836043 * Class3.anInt35, -1154305347);
				if (null == class604_sub1 || -1 != class604_sub1.anInt10576 * 741395911)
					Class3.anInt35 += 1454706595;
				else {
					if (Class3.aClass638_42 == null)
						Class3.aClass638_42 = (client.aClass654_11071.method10904(class604_sub1.aString10577, -1460763393));
					int i_4_ = Class3.aClass638_42.anInt8320 * 1047194135;
					if (-1 == i_4_)
						break;
					class604_sub1.anInt10576 = -1107368969 * i_4_;
					Class3.anInt35 += 1454706595;
					Class3.aClass638_42 = null;
				}
			}
		}
	}

	static final void method5156(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class702.method14298(class243, class240, class665, 1681516458);
	}
}
