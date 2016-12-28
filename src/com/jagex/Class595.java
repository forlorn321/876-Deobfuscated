/* Class595 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class595 implements Interface75 {
	int anInt7817;
	public static Class595 aClass595_7818;
	public static Class595 aClass595_7819;
	public static Class595 aClass595_7820 = new Class595(0);

	public int method78() {
		return 193985401 * anInt7817;
	}

	Class595(int i) {
		anInt7817 = -971079991 * i;
	}

	public int method12() {
		return 193985401 * anInt7817;
	}

	public int method73() {
		return 193985401 * anInt7817;
	}

	static {
		aClass595_7818 = new Class595(1);
		aClass595_7819 = new Class595(2);
	}

	static final void method7130(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class475.method5743(class251, class668, (byte) 63);
	}

	static final void method7131(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class545.method6608(class251, class234, class668, (short) 3418);
	}

	static final void method7132(Class668 class668, int i) {
		Class603_Sub1 class603_sub1 = Class205_Sub19.method9091(798381809);
		if (null != class603_sub1) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1812485199 * class603_sub1.anInt10557;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1176655995 * class603_sub1.worldFlags;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.worldActivity;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class603_sub1.method9615((byte) 120);
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.method9616((byte) -28);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1880579507 * class603_sub1.online;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2023817915 * class603_sub1.anInt10558;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.worldIp;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		}
	}

	static int method7133(int i, int i_1_) {
		IntParam class536_sub26 = (IntParam) Class626.aClass4_8158.method556((long) i);
		if (null == class536_sub26) {
			Class393 class393 = Class532.anInterface46_7121.method333(i, 2116268337);
			if (class393 == null || 2 != class393.anInt4087 * -1267717877)
				return -1;
			class536_sub26 = new IntParam(Class626.anInt8164 * -1289969367);
			Class626.aClass4_8158.method560(class536_sub26, (long) i);
			Class626.aClass393Array8163[(Class626.anInt8164 += 1216056089) * -1289969367 - 1] = class393;
		}
		return class536_sub26.value * 2083602213;
	}

	static void method7134(byte i) {
		Class465_Sub1.method9387(-931943004);
		Class542_Sub1.aClass536_Sub18_Sub14_7202 = null;
		Class593.aClass536_Sub18_Sub14_7812 = null;
		Class542_Sub1.aClass4_10720.method561(-2117553523);
		Class542_Sub1.aClass4_10699.method561(-2117553523);
		for (int i_2_ = 0; i_2_ < 3; i_2_++) {
			for (int i_3_ = 0; i_3_ < 5; i_3_++) {
				Class542_Sub1.aClass184ArrayArray10712[i_2_][i_3_] = null;
				Class542_Sub1.aClass2ArrayArray10723[i_2_][i_3_] = null;
			}
		}
	}

	static void method7135(Class668 class668, int i) {
		class668.anIntArray8541[class668.anInt8542 * 1867269829 - 2] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((1867269829 * class668.anInt8542) - 2)]), (byte) -61)).method3748(Class465_Sub1.aClass96_10352, class668.anIntArray8541[1867269829 * class668.anInt8542 - 1], (byte) 7)) ? 1 : 0;
		class668.anInt8542 -= -1411037171;
	}
}
