/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class224 {
	String aString2339;

	Class224(RSByteBuffer class536_sub33, boolean bool, boolean bool_0_) {
		if (bool)
			class536_sub33.readLong();
		if (bool_0_)
			aString2339 = class536_sub33.method9713(16509697);
		else
			aString2339 = null;
	}

	public String method3204(byte i) {
		return aString2339;
	}

	static final void method3205(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717 == null ? 0 : 1;
	}

	static final void method3206(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		ItemTypeDecoder class1 = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_1_, (byte) -21);
		if (i_2_ >= 1 && i_2_ <= 5 && null != class1.groundOptions[i_2_ - 1])
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class1.groundOptions[i_2_ - 1];
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}

	static final void method3207(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.brightnessSetting.method10046(-1506046098);
	}

	static final void method3208(Class668 class668, byte i) {
		class668.anInt8542 -= 1534748737;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_5_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_6_ = class668.anIntArray8541[3 + 1867269829 * class668.anInt8542];
		int i_7_ = class668.anIntArray8541[4 + 1867269829 * class668.anInt8542];
		Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2211, i_3_, i_4_, i_6_, Class188.aClass188_2133.method2788(-1679424319), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_7_, i_5_, (byte) 45);
	}

	public static void method3209(int i) {
		if (Class310.anInterface30Array3473 != null) {
			Interface30[] interface30s = Class310.anInterface30Array3473;
			for (int i_8_ = 0; i_8_ < interface30s.length; i_8_++) {
				Interface30 interface30 = interface30s[i_8_];
				interface30.method172((short) 807);
			}
		}
	}

	static boolean method3210(int i) {
		if (-708374433 * client.anInt11101 != 16)
			return false;
		if (Class344.method4487(-440129613) || Class81.method1164(65280))
			return false;
		return true;
	}

	static final void method3211(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class690.anInt8699 * -2085218777;
	}
}
